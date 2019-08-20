#include <ESP8266.h>
#include <SPI.h>
#include <MFRC522.h>
#include<SoftwareSerial.h>

const int DIRA = 4;                   // Motor A Direction (A 회전방향)
const int PWMA = 5;                  // Motor A PWM (A 속도)
const int DIRB = 7;                   // Motor B Direction  (B 회전방향)
const int PWMB = 6;                  // Motor B PWM (B 속도)
const int buzzer= 8;

#define SS_PIN 10
#define RST_PIN 9

#define SSID        "hello"          //WIFI 이름
#define PASSWORD    "111111asd"       //WIFI 비밀번호
#define HOST_NAME   "192.168.0.20"    //HOST 컴퓨터 IP 주소
#define HOST_PORT   (2080)            //포트 번호

MFRC522 rfid(SS_PIN, RST_PIN); // Instance of the class

MFRC522::MIFARE_Key key;

SoftwareSerial mySerial(2,3); 
ESP8266 wifi(mySerial);

byte nuidPICC[4];
int getnum[12];
uint8_t getnum2[12];

int tmp;

void setup() {
  pinMode(buzzer,OUTPUT);    //부저
  motor_setup();// 왼쪽 바퀴 초기화
  Serial.begin(9600);
 
  SPI.begin(); // Init SPI bus
  rfid.PCD_Init(); // Init MFRC522

  for (byte i = 0; i < 6; i++) {
    key.keyByte[i] = 0xFF;
  }

  Serial.println(F("This code scan the MIFARE Classsic NUID."));
  Serial.println(F("Using the following key:"));
  printHex(key.keyByte, MFRC522::MF_KEY_SIZE);

  Serial.print("FW Version:");
  Serial.println(wifi.getVersion().c_str()); 

  if (wifi.setOprToStationSoftAP()) {
        Serial.print("to station + softap ok\r\n");
    } else {
        err();
    } 
    if (wifi.joinAP(SSID, PASSWORD)) {
        Serial.print("Join AP success\r\n");
        Serial.print("IP:");
        Serial.println( wifi.getLocalIP().c_str());       
    } else {
        err();
    }
    
    if (wifi.disableMUX()) {
        Serial.print("single ok\r\n");
    } else {
        Serial.print("single err\r\n");
    }

      if (wifi.createTCP("192.168.43.253",2080)) {
      Serial.println("TCP CONNECT");
      tone(buzzer,1000);
      delay(1000);
      noTone(buzzer);
    }
    else{
        Serial.print("err");
        err();
    }
    Serial.print("setup end\r\n");
  
  
 }
unsigned long echo_duration = 0;

void loop() {

  if ( ! rfid.PICC_IsNewCardPresent())
    return;

  if ( ! rfid.PICC_ReadCardSerial())
    return;

  Serial.print(F("PICC type: "));
  MFRC522::PICC_Type piccType = rfid.PICC_GetType(rfid.uid.sak);
  Serial.println(rfid.PICC_GetTypeName(piccType));

  if (piccType != MFRC522::PICC_TYPE_MIFARE_MINI &&  
    piccType != MFRC522::PICC_TYPE_MIFARE_1K &&
    piccType != MFRC522::PICC_TYPE_MIFARE_4K) {
    Serial.println(F("Your tag is not of type MIFARE Classic."));
    err();
    return;
  }

    printDec(rfid.uid.uidByte, rfid.uid.size);
    Serial.println();
    
  sendme();
 

     uint8_t buffer[4] = {0};
     
  uint32_t len = wifi.recv(buffer, sizeof(buffer), 5000);
    if (len > 0) {
        Serial.print("Received:[");
        for(uint32_t i = 0; i < len; i++) {
            Serial.print((char)buffer[i]);
        }
    }
  char range = buffer[0];


  /*
   * 결과값에 따른 명령 처리
   */
    switch(range){      
    case 'A':
    GO();
    STOP();
    break;    
    case 'B':
    L_GO();
    STOP();
    break;
    case 'C':
    R_GO();
    STOP();
    break;
    case 'S':
    STOP();
    break;
    }
}

void GO(){
  digitalWrite(DIRA, HIGH);  
  analogWrite(PWMA, 200);
  digitalWrite(DIRB, HIGH);  
  analogWrite(PWMB, 200);
  delay(2000);
  }
void L_GO(){
  digitalWrite(DIRA, LOW);  
  analogWrite(PWMA, 130);
  digitalWrite(DIRB, HIGH);  
  analogWrite(PWMB, 130); 
  delay(2000);
  }
void R_GO(){
  digitalWrite(DIRA, HIGH);  
  analogWrite(PWMA, 130);
  digitalWrite(DIRB, LOW);  
  analogWrite(PWMB, 130);
  delay(2000);
  }
void STOP(){
  digitalWrite(DIRA, LOW); 
  analogWrite(PWMA, 0);
  digitalWrite(DIRB, LOW); 
  analogWrite(PWMB, 0);
  delay(2000);
  }

void motor_setup() {

  pinMode(DIRA, OUTPUT);
  digitalWrite(DIRA, LOW);
  analogWrite(PWMA, 0);

  pinMode(DIRB, OUTPUT);
  digitalWrite(DIRB, LOW);
  analogWrite(PWMB, 0); 
}

void printHex(byte *buffer, byte bufferSize) {
  for (byte i = 0; i < bufferSize; i++) {
    Serial.print(buffer[i] < 0x10 ? " 0" : " ");
    Serial.print(buffer[i], HEX);
  }
}

void printDec(byte *buffer, byte bufferSize) {
  tone(buzzer,800);
   noTone(buzzer);
  delay(300);
  tone(buzzer,1200);
   noTone(buzzer);
  delay(300);
  tone(buzzer,800);
   noTone(buzzer);
  
  int lot=0;
  for (byte i = 0; i < bufferSize; i++) {
    Serial.print(buffer[i] < 0x10 ? " 0" : " ");
    Serial.print(buffer[i], DEC);
    tmp = buffer[i];

   
    if((tmp/100) != 0){
    getnum[lot]= tmp/100;
    getnum[lot+1] = (tmp/10)-((tmp/100)*10);
    getnum[lot+2] = tmp%10;
    }
    else{
      getnum[lot] = 0;
       getnum[lot+1] = (tmp/10);
       getnum[lot+2] = tmp%10;
    }
   lot +=3; 
   
  }


}

void err(){
        tone(buzzer,100);
        delay(1000);
        noTone(buzzer);
}



/*
 * 컴퓨터쪽으로 데이터를 전송하는 함수
 */
void sendme(){
      for(int i = 0; i<=11;i++){
       uint8_t a1[]="1";
       uint8_t a2[]="2";
       uint8_t a3[]="3";
       uint8_t a4[]="4";
       uint8_t a5[]="5";
       uint8_t a6[]="6";
       uint8_t a7[]="7";
       uint8_t a8[]="8";
       uint8_t a9[]="9";
       uint8_t a0[]="0";
       
      switch(getnum[i]){
          case 1:
          wifi.send(a1,1);
          break;
          case 2:
          wifi.send(a2,1);
          break;
          case 3:
          wifi.send(a3,1);
          break;
          case 4:
          wifi.send(a4,1);
          break;
          case 5:
          wifi.send(a5,1);
          break;
          case 6:
          wifi.send(a6,1);
          break;
          case 7:
          wifi.send(a7,1);
          break;
          case 8:
          wifi.send(a8,1);
          break;
          case 9:
          wifi.send(a9,1);
          break;
          default:
          wifi.send(a0,1);
          break;
              
        }
        
      }
        uint8_t finish[] ="\n";
        wifi.send(finish,2);
         tone(buzzer,600);
         delay(300);
        noTone(buzzer);

        tone(buzzer,1200);
         delay(300);
        noTone(buzzer);

        tone(buzzer,1800);
         delay(300);
        noTone(buzzer);
      
} 
