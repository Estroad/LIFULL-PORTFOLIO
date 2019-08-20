import Phone.PhoneBookManager;
import Phone.PhoneGUI;

import java.io.IOException;
import java.util.Scanner;


class MenuViewer
{

	public static void showMenu()
	{
		System.out.println("선택하세요...");
		System.out.println("1. 데이터 입력");
		System.out.println("2. 데이터 검색");
		System.out.println("3. 데이터 삭제");
		System.out.println("4. 메신져 송신");
		System.out.println("5. 메신져 발신");
		System.out.println("6. 프로그램 종료");
		System.out.print("선택: ");
	}
}

class PhoneBookVer
{	
	public static void main(String[] args) throws IOException
	{
		PhoneBookManager manager=new PhoneBookManager();
		PhoneGUI G = new PhoneGUI();
		
	}
}