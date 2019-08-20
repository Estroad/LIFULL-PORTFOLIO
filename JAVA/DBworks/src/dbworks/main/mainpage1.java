package dbworks.main;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.Vector;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.ListModel;

import dbworks.insert.*;
import dbworks.update.*;
import dbworks.view.*;
/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author ghdud
 */
public class mainpage1 extends javax.swing.JFrame {

    /**
     * Creates new form doctorall
     */
    public mainpage1() {
        initComponents();
         combodoc();
         combonur();
         combopat();
         combotrt();
         combochar();
         
    }
    public void start(){
        initComponents();
        combotrt();
    }
 public void combotrt(){
          Connection con = null;
        String doc="SELECT treat_ID FROM treatment";
        System.out.println(doc);
        String url = "jdbc:oracle:thin:@localhost:1521:orcl";
        /* 11g express edition은 orcl 대신 XE를 입력한다. */
        String userid = "U_HOSPITAL";
        String pwd = "password";

        try {
            /* 드라이버를 찾는 과정 */
            Class.forName("oracle.jdbc.driver.OracleDriver");
            System.out.println("드라이버 로드 성공");
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        }

        try {
            /* 데이터베이스를 연결하는 과정 */
            System.out.println("데이터베이스 연결 준비 ...");
            con = DriverManager.getConnection(url, userid, pwd);
            System.out.println("데이터베이스 연결 성공");
        } catch (SQLException e) {
            e.printStackTrace();
        }
        //3. Statement 얻기 => Connection 통해서
        Statement stmt = null;
         ResultSet rs=null;
          Vector<String> list = null;
           list = new Vector<String>();
            
          System.out.println(list.size());
        try {
            
            stmt = con.createStatement();
            stmt = con.prepareStatement(doc);
          rs=stmt.executeQuery(doc);
        
           while(rs.next()) {
               
             
               list.add(rs.getString(1));
	
		   }
           
        } catch (SQLException ex) {
            Logger.getLogger(mainpage1.class.getName()).log(Level.SEVERE, null, ex);
        }
        System.out.println(list.size());
          jList4.setListData(list);
                        
        //4. SQL문 작성 => INSERT문 작성
        //System.out.println(sql);
       

        try {
            //6. DB 자원 반납
            stmt.close();
        } catch (SQLException ex) {
            Logger.getLogger(mainpage1.class.getName()).log(Level.SEVERE, null, ex);
        }
        try {
            con.close();
        } catch (SQLException ex) {
            Logger.getLogger(mainpage1.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
 public void combodoc(){
          Connection con = null;
        String doc="SELECT doc_ID FROM doctors";
        System.out.println(doc);
        String url = "jdbc:oracle:thin:@localhost:1521:orcl";
        /* 11g express edition은 orcl 대신 XE를 입력한다. */
        String userid = "U_HOSPITAL";
        String pwd = "password";

        try {
            /* 드라이버를 찾는 과정 */
            Class.forName("oracle.jdbc.driver.OracleDriver");
            System.out.println("드라이버 로드 성공");
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        }

        try {
            /* 데이터베이스를 연결하는 과정 */
            System.out.println("데이터베이스 연결 준비 ...");
            con = DriverManager.getConnection(url, userid, pwd);
            System.out.println("데이터베이스 연결 성공");
        } catch (SQLException e) {
            e.printStackTrace();
        }
        //3. Statement 얻기 => Connection 통해서
        Statement stmt = null;
         ResultSet rs=null;
          Vector<String> list = null;
           list = new Vector<String>();
            
          System.out.println(list.size());
        try {
            
            stmt = con.createStatement();
            stmt = con.prepareStatement(doc);
          rs=stmt.executeQuery(doc);
        
           while(rs.next()) {
             list.add(rs.getString(1));
	   }
           
        } catch (SQLException ex) {
            Logger.getLogger(mainpage1.class.getName()).log(Level.SEVERE, null, ex);
        }
        System.out.println(list.size());
          jList1.setListData(list);
                        
        //4. SQL문 작성 => INSERT문 작성
        //System.out.println(sql);
       

        try {
            //6. DB 자원 반납
            stmt.close();
        } catch (SQLException ex) {
            Logger.getLogger(mainpage1.class.getName()).log(Level.SEVERE, null, ex);
        }
        try {
            con.close();
        } catch (SQLException ex) {
            Logger.getLogger(mainpage1.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
 public void combonur(){
          Connection con = null;
        String doc="SELECT nur_ID FROM nurses";
        System.out.println(doc);
        String url = "jdbc:oracle:thin:@localhost:1521:orcl";
        /* 11g express edition은 orcl 대신 XE를 입력한다. */
        String userid = "U_HOSPITAL";
        String pwd = "password";

        try {
            /* 드라이버를 찾는 과정 */
            Class.forName("oracle.jdbc.driver.OracleDriver");
            System.out.println("드라이버 로드 성공");
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        }

        try {
            /* 데이터베이스를 연결하는 과정 */
            System.out.println("데이터베이스 연결 준비 ...");
            con = DriverManager.getConnection(url, userid, pwd);
            System.out.println("데이터베이스 연결 성공");
        } catch (SQLException e) {
            e.printStackTrace();
        }
        //3. Statement 얻기 => Connection 통해서
        Statement stmt = null;
         ResultSet rs=null;
          Vector<String> list = null;
           list = new Vector<String>();
            
          System.out.println(list.size());
        try {
            
            stmt = con.createStatement();
            stmt = con.prepareStatement(doc);
          rs=stmt.executeQuery(doc);
        
           while(rs.next()) {
               
             
               list.add(rs.getString(1));
		//	  String a = rs.getString(1);
              
                         // jList1.add(a, jList1);
                        // jList1.add(this, a);
                      
		   }
           
        } catch (SQLException ex) {
            Logger.getLogger(mainpage1.class.getName()).log(Level.SEVERE, null, ex);
        }
        System.out.println(list.size());
          jList2.setListData(list);
                        
        //4. SQL문 작성 => INSERT문 작성
        //System.out.println(sql);
       

        try {
            //6. DB 자원 반납
            stmt.close();
        } catch (SQLException ex) {
            Logger.getLogger(mainpage1.class.getName()).log(Level.SEVERE, null, ex);
        }
        try {
            con.close();
        } catch (SQLException ex) {
            Logger.getLogger(mainpage1.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
 public void combopat(){
          Connection con = null;
        String doc="SELECT pat_ID FROM patients";
        System.out.println(doc);
        String url = "jdbc:oracle:thin:@localhost:1521:orcl";
        /* 11g express edition은 orcl 대신 XE를 입력한다. */
        String userid = "U_HOSPITAL";
        String pwd = "password";

        try {
            /* 드라이버를 찾는 과정 */
            Class.forName("oracle.jdbc.driver.OracleDriver");
            System.out.println("드라이버 로드 성공");
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        }

        try {
            /* 데이터베이스를 연결하는 과정 */
            System.out.println("데이터베이스 연결 준비 ...");
            con = DriverManager.getConnection(url, userid, pwd);
            System.out.println("데이터베이스 연결 성공");
        } catch (SQLException e) {
            e.printStackTrace();
        }
        //3. Statement 얻기 => Connection 통해서
        Statement stmt = null;
         ResultSet rs=null;
          Vector<String> list = null;
           list = new Vector<String>();
            
          System.out.println(list.size());
        try {
            
            stmt = con.createStatement();
            stmt = con.prepareStatement(doc);
          rs=stmt.executeQuery(doc);
        
           while(rs.next()) {
               
             
               list.add(rs.getString(1));
		//	  String a = rs.getString(1);
              
                         // jList1.add(a, jList1);
                        // jList1.add(this, a);
                      
		   }
           
        } catch (SQLException ex) {
            Logger.getLogger(mainpage1.class.getName()).log(Level.SEVERE, null, ex);
        }
        System.out.println(list.size());
          jList3.setListData(list);
                        
        //4. SQL문 작성 => INSERT문 작성
        //System.out.println(sql);
       

        try {
            //6. DB 자원 반납
            stmt.close();
        } catch (SQLException ex) {
            Logger.getLogger(mainpage1.class.getName()).log(Level.SEVERE, null, ex);
        }
        try {
            con.close();
        } catch (SQLException ex) {
            Logger.getLogger(mainpage1.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
 public void combochar(){
          Connection con = null;
        String doc="SELECT chart_ID FROM charts";
        System.out.println(doc);
        String url = "jdbc:oracle:thin:@localhost:1521:orcl";
        /* 11g express edition은 orcl 대신 XE를 입력한다. */
        String userid = "U_HOSPITAL";
        String pwd = "password";

        try {
            /* 드라이버를 찾는 과정 */
            Class.forName("oracle.jdbc.driver.OracleDriver");
            System.out.println("드라이버 로드 성공");
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        }

        try {
            /* 데이터베이스를 연결하는 과정 */
            System.out.println("데이터베이스 연결 준비 ...");
            con = DriverManager.getConnection(url, userid, pwd);
            System.out.println("데이터베이스 연결 성공");
        } catch (SQLException e) {
            e.printStackTrace();
        }
        //3. Statement 얻기 => Connection 통해서
        Statement stmt = null;
         ResultSet rs=null;
          Vector<String> list = null;
           list = new Vector<String>();
            
          System.out.println(list.size());
        try {
            
            stmt = con.createStatement();
            stmt = con.prepareStatement(doc);
          rs=stmt.executeQuery(doc);
        
           while(rs.next()) {
               
             
               list.add(rs.getString(1));
		//	  String a = rs.getString(1);
              
                         // jList1.add(a, jList1);
                        // jList1.add(this, a);
                      
		   }
           
        } catch (SQLException ex) {
            Logger.getLogger(mainpage1.class.getName()).log(Level.SEVERE, null, ex);
        }
        System.out.println(list.size());
          jList5.setListData(list);
                        
        //4. SQL문 작성 => INSERT문 작성
        //System.out.println(sql);
       

        try {
            //6. DB 자원 반납
            stmt.close();
        } catch (SQLException ex) {
            Logger.getLogger(mainpage1.class.getName()).log(Level.SEVERE, null, ex);
        }
        try {
            con.close();
        } catch (SQLException ex) {
            Logger.getLogger(mainpage1.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jScrollPane1 = new javax.swing.JScrollPane();
        jList1 = new javax.swing.JList<>();
        jScrollPane2 = new javax.swing.JScrollPane();
        jList2 = new javax.swing.JList<>();
        jScrollPane3 = new javax.swing.JScrollPane();
        jList3 = new javax.swing.JList<>();
        jScrollPane4 = new javax.swing.JScrollPane();
        jList4 = new javax.swing.JList<>();
        jScrollPane5 = new javax.swing.JScrollPane();
        jList5 = new javax.swing.JList<>();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jButton1 = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();
        jButton3 = new javax.swing.JButton();
        jButton4 = new javax.swing.JButton();
        jButton5 = new javax.swing.JButton();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jScrollPane1.setViewportView(jList1);

        jScrollPane2.setViewportView(jList2);

        jScrollPane3.setViewportView(jList3);

        jScrollPane4.setViewportView(jList4);

        jScrollPane5.setViewportView(jList5);

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/markcoins/차트완성.png"))); // NOI18N
        jLabel1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel1MouseClicked(evt);
            }
        });

        jLabel2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/markcoins/의사완성.png"))); // NOI18N
        jLabel2.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel2MouseClicked(evt);
            }
        });

        jLabel3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/markcoins/간호사완성.png"))); // NOI18N
        jLabel3.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel3MouseClicked(evt);
            }
        });

        jLabel4.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/markcoins/환자완성.png"))); // NOI18N
        jLabel4.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel4MouseClicked(evt);
            }
        });

        jLabel5.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/markcoins/진료기록완성.png"))); // NOI18N
        jLabel5.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel5MouseClicked(evt);
            }
        });

        jButton1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/bicons/새로고침.png"))); // NOI18N
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        jButton2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/bicons/새로고침.png"))); // NOI18N
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });

        jButton3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/bicons/새로고침.png"))); // NOI18N
        jButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton3ActionPerformed(evt);
            }
        });

        jButton4.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/bicons/새로고침.png"))); // NOI18N
        jButton4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton4ActionPerformed(evt);
            }
        });

        jButton5.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/bicons/새로고침.png"))); // NOI18N
        jButton5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton5ActionPerformed(evt);
            }
        });

        jLabel6.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/markcoins/선.png"))); // NOI18N

        jLabel7.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/markcoins/선.png"))); // NOI18N

        jLabel8.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/markcoins/선.png"))); // NOI18N

        jLabel9.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/markcoins/선.png"))); // NOI18N

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(172, 172, 172)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 210, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 210, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(15, 15, 15))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jLabel2)
                        .addGap(28, 28, 28)))
                .addComponent(jLabel7)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(149, 149, 149)
                        .addComponent(jLabel3))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(133, 133, 133)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(jButton2, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE)
                            .addComponent(jScrollPane2, javax.swing.GroupLayout.DEFAULT_SIZE, 210, Short.MAX_VALUE))))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED, 20, Short.MAX_VALUE)
                .addComponent(jLabel6)
                .addGap(147, 147, 147)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jScrollPane3, javax.swing.GroupLayout.PREFERRED_SIZE, 210, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(17, 17, 17)
                        .addComponent(jLabel4))
                    .addComponent(jButton3, javax.swing.GroupLayout.PREFERRED_SIZE, 210, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jLabel8)
                .addGap(151, 151, 151)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jScrollPane4, javax.swing.GroupLayout.PREFERRED_SIZE, 210, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(16, 16, 16)
                                .addComponent(jLabel5)))
                        .addGap(21, 21, 21)
                        .addComponent(jLabel9)
                        .addGap(147, 147, 147)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jScrollPane5, javax.swing.GroupLayout.PREFERRED_SIZE, 210, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 193, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jButton4, javax.swing.GroupLayout.PREFERRED_SIZE, 210, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jButton5, javax.swing.GroupLayout.PREFERRED_SIZE, 210, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(31, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(137, 137, 137)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel7, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jLabel9, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(0, 0, Short.MAX_VALUE)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addComponent(jLabel1)
                                    .addComponent(jLabel4)
                                    .addComponent(jLabel5)))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jLabel2)
                                .addGap(0, 0, Short.MAX_VALUE)))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 439, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 75, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addComponent(jScrollPane3, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.PREFERRED_SIZE, 439, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jScrollPane4, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.PREFERRED_SIZE, 439, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jScrollPane5, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.PREFERRED_SIZE, 439, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                    .addComponent(jButton4, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(jButton5, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(jButton3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))))
                    .addComponent(jLabel8, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jLabel6, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabel3)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 439, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jButton2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    public void updatelist(int a){
        switch(a){
            case 1:
                jList1.removeAll();
                combodoc();
                jList1.updateUI();
                break;
            
       case 2:
                jList2.removeAll();
                combonur();
                jList2.updateUI();
                break;
                case 3:
                jList3.removeAll();
                combopat();
                jList3.updateUI();
                break;
                case 4:
                jList4.removeAll();
                combotrt();
                jList4.updateUI();
                break;
                case 5:
                jList5.removeAll();
                combochar();
                jList5.updateUI();
                break;
                 }
    }
    
    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        // TODO add your handling code here:
       updatelist(1);
            
    }//GEN-LAST:event_jButton1ActionPerformed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        // TODO add your handling code here:
        updatelist(2);
    }//GEN-LAST:event_jButton2ActionPerformed

    private void jButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton3ActionPerformed
        // TODO add your handling code here:
        updatelist(3);
    }//GEN-LAST:event_jButton3ActionPerformed

    private void jButton4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton4ActionPerformed
        // TODO add your handling code here:
        updatelist(4);
        
    }//GEN-LAST:event_jButton4ActionPerformed

    private void jButton5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton5ActionPerformed
        // TODO add your handling code here:
        updatelist(5);
    }//GEN-LAST:event_jButton5ActionPerformed

    private void jLabel2MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel2MouseClicked
        // TODO add your handling code here:
        docview i = new docview();
         Connection con = null;
        
       String url="jdbc:oracle:thin:@localhost:1521:orcl"; 
        /* 11g express edition? orcl ???XE瑜??낅젰?쒕떎. */
	   String userid="u_hospital";
	   String pwd="password";
            System.out.println ("1");

	   try { /* ?쒕씪?대쾭瑜?李얜뒗 怨쇱젙 */
	     Class.forName("oracle.jdbc.driver.OracleDriver");
	     System.out.println ("2");
	   } catch(ClassNotFoundException e) {
		e.printStackTrace();
	     }

	   try { /* ?곗씠?곕쿋?댁뒪瑜??곌껐?섎뒗 怨쇱젙 */
	     System.out.println ("3");
	     con=DriverManager.getConnection(url, userid, pwd);
	     System.out.println ("4");
	     } catch(SQLException e) {
	         e.printStackTrace();
		}
	   
        String docid = (String) jList1.getSelectedValue();
        String sql = "SELECT * FROM DOCTORS WHERE doc_id = "+docid;
         System.out.println ("5");
         Statement stmt = null;
        try {
            stmt = con.createStatement();
             System.out.println ("6");
        } catch (SQLException ex) {
            Logger.getLogger(mainpage1.class.getName()).log(Level.SEVERE, null, ex);
        }
        try {
            ResultSet rs=stmt.executeQuery(sql);
             System.out.println ("7");
            while(rs.next()) {
                 System.out.println ("8");
			   String rid = rs.getString(1);
			   String rmaj = rs.getString(2);
			   String rname = rs.getString(3);
			   String rgen = rs.getString(4);
			   String rphon = rs.getString(5);
			   String rmail = rs.getString(6);
			   String rpos = rs.getString(7);
                            System.out.println ("9");
                              i.start();
			 i.setlabels(10,rid);
                         i.setlabels(11,rmaj);
                         i.setlabels(12,rname);
                         i.setlabels(13,rgen);
                         i.setlabels(14,rphon);
                         i.setlabels(15,rmail);
                         i.setlabels(16,rpos);
                          System.out.println ("10");
                           i.setVisible(true);
      
      
		   }
            con.close();
        } catch (SQLException ex) {
            Logger.getLogger(mainpage1.class.getName()).log(Level.SEVERE, null, ex);
        }
        
      
    }//GEN-LAST:event_jLabel2MouseClicked

    private void jLabel3MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel3MouseClicked
        // TODO add your handling code here:
         nurview i = new nurview();
        Connection con = null;
        
       String url="jdbc:oracle:thin:@localhost:1521:orcl"; 
        /* 11g express edition? orcl ???XE瑜??낅젰?쒕떎. */
	   String userid="u_hospital";
	   String pwd="password";
            System.out.println ("1");

	   try { /* ?쒕씪?대쾭瑜?李얜뒗 怨쇱젙 */
	     Class.forName("oracle.jdbc.driver.OracleDriver");
	     System.out.println ("2");
	   } catch(ClassNotFoundException e) {
		e.printStackTrace();
	     }

	   try { /* ?곗씠?곕쿋?댁뒪瑜??곌껐?섎뒗 怨쇱젙 */
	     System.out.println ("3");
	     con=DriverManager.getConnection(url, userid, pwd);
	     System.out.println ("4");
	     } catch(SQLException e) {
	         e.printStackTrace();
		}
	   
        String docid = (String) jList2.getSelectedValue();
        String sql = "SELECT * FROM NURSES WHERE nur_id = "+docid;
         System.out.println (sql);
         Statement stmt = null;
        try {
            stmt = con.createStatement();
             System.out.println ("6");
        } catch (SQLException ex) {
            Logger.getLogger(mainpage1.class.getName()).log(Level.SEVERE, null, ex);
        }
        try {
            ResultSet rs=stmt.executeQuery(sql);
             System.out.println ("7");
            while(rs.next()) {
                 System.out.println ("8");
			   String rid = rs.getString(1);
			   String rmaj = rs.getString(2);
			   String rname = rs.getString(3);
			   String rgen = rs.getString(4);
			   String rphon = rs.getString(5);
			   String rmail = rs.getString(6);
			   String rpos = rs.getString(7);
                            System.out.println ("9");
                              i.start();
			 i.setlabels(10,rid);
                         i.setlabels(11,rmaj);
                         i.setlabels(12,rname);
                         i.setlabels(13,rgen);
                         i.setlabels(14,rphon);
                         i.setlabels(15,rmail);
                         i.setlabels(16,rpos);
                          System.out.println ("10");
                           i.setVisible(true);
      
   
		   }
            con.close();
        } catch (SQLException ex) {
            Logger.getLogger(mainpage1.class.getName()).log(Level.SEVERE, null, ex);
        }
        
      
    }//GEN-LAST:event_jLabel3MouseClicked

    private void jLabel4MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel4MouseClicked
        // TODO add your handling code here:
        patview i = new patview();
        Connection con = null;
        
       String url="jdbc:oracle:thin:@localhost:1521:orcl"; 
        /* 11g express edition? orcl ???XE瑜??낅젰?쒕떎. */
	   String userid="u_hospital";
	   String pwd="password";
            System.out.println ("1");

	   try { /* ?쒕씪?대쾭瑜?李얜뒗 怨쇱젙 */
	     Class.forName("oracle.jdbc.driver.OracleDriver");
	     System.out.println ("2");
	   } catch(ClassNotFoundException e) {
		e.printStackTrace();
	     }

	   try { /* ?곗씠?곕쿋?댁뒪瑜??곌껐?섎뒗 怨쇱젙 */
	     System.out.println ("3");
	     con=DriverManager.getConnection(url, userid, pwd);
	     System.out.println ("4");
	     } catch(SQLException e) {
	         e.printStackTrace();
		}
	   
        String docid = (String) jList3.getSelectedValue();
        String sql = "SELECT * FROM patients WHERE pat_id = "+docid;
         System.out.println ("5");
         Statement stmt = null;
        try {
            stmt = con.createStatement();
             System.out.println ("6");
        } catch (SQLException ex) {
            Logger.getLogger(mainpage1.class.getName()).log(Level.SEVERE, null, ex);
        }
        try {
            ResultSet rs=stmt.executeQuery(sql);
             System.out.println ("7");
            while(rs.next()) {
                 System.out.println ("8");
			   String rid = rs.getString(1);
			   String rname = rs.getString(2);
			   String rgen = rs.getString(3);
			   String rjimin = rs.getString(4);
			   String raddr = rs.getString(5);
			   String rphone = rs.getString(6);
			   String remail = rs.getString(7);
                           String rjob = rs.getString(8);
                           String rdid = rs.getString(9);
                           String rnid = rs.getString(10);
                            System.out.println ("9");
                              i.start();
			 i.setlabels(10,rid);
                         i.setlabels(11,rname);
                         i.setlabels(12,rgen);
                         i.setlabels(13,rjimin);
                         i.setlabels(14,raddr);
                         i.setlabels(15,rphone);
                         i.setlabels(16,remail);
                         i.setlabels(19,rjob);
                         i.setlabels(21,rdid);
                         i.setlabels(23,rnid);
                         
                          System.out.println ("10");
                           i.setVisible(true);
      
    
		   }
            con.close();
        } catch (SQLException ex) {
            Logger.getLogger(mainpage1.class.getName()).log(Level.SEVERE, null, ex);
        }
        
    }//GEN-LAST:event_jLabel4MouseClicked

    private void jLabel5MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel5MouseClicked
        // TODO add your handling code here:
         trtview i = new trtview();
        
        Connection con = null;
        
       String url="jdbc:oracle:thin:@localhost:1521:orcl"; 
        /* 11g express edition? orcl ???XE瑜??낅젰?쒕떎. */
	   String userid="u_hospital";
	   String pwd="password";
            System.out.println ("1");

	   try { /* ?쒕씪?대쾭瑜?李얜뒗 怨쇱젙 */
	     Class.forName("oracle.jdbc.driver.OracleDriver");
	     System.out.println ("2");
	   } catch(ClassNotFoundException e) {
		e.printStackTrace();
	     }

	   try { /* ?곗씠?곕쿋?댁뒪瑜??곌껐?섎뒗 怨쇱젙 */
	     System.out.println ("3");
	     con=DriverManager.getConnection(url, userid, pwd);
	     System.out.println ("4");
	     } catch(SQLException e) {
	         e.printStackTrace();
		}
	   
        String docid = (String) jList4.getSelectedValue();
        String sql = "SELECT * FROM treatment WHERE treat_id = "+docid;
         System.out.println ("5");
         Statement stmt = null;
        try {
            stmt = con.createStatement();
             System.out.println ("6");
        } catch (SQLException ex) {
            Logger.getLogger(mainpage1.class.getName()).log(Level.SEVERE, null, ex);
        }
        try {
            ResultSet rs=stmt.executeQuery(sql);
             System.out.println ("7");
            while(rs.next()) {
                 System.out.println ("8");
			   String rid = rs.getString(1);
			   String rcontent = rs.getString(2);
			   String rdate = rs.getString(3);
			   String rdid = rs.getString(4);
			   String rpid = rs.getString(5);
			  System.out.println ("9");
                              i.start();
			 i.setlabels(10,rid);
                         i.setlabels(11,rdate);
                         i.setlabels(12,rcontent);
                         i.setlabels(13,rdid);
                         i.setlabels(14,rpid);
                          System.out.println ("10");
                           i.setVisible(true);
      
      
		   }
            con.close();
        } catch (SQLException ex) {
            Logger.getLogger(mainpage1.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_jLabel5MouseClicked

    private void jLabel1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel1MouseClicked
        // TODO add your handling code here:
          charview  i = new charview();
        Connection con = null;
        
       String url="jdbc:oracle:thin:@localhost:1521:orcl"; 
        /* 11g express edition? orcl ???XE瑜??낅젰?쒕떎. */
	   String userid="u_hospital";
	   String pwd="password";
            System.out.println ("1");

	   try { /* ?쒕씪?대쾭瑜?李얜뒗 怨쇱젙 */
	     Class.forName("oracle.jdbc.driver.OracleDriver");
	     System.out.println ("2");
	   } catch(ClassNotFoundException e) {
		e.printStackTrace();
	     }

	   try { /* ?곗씠?곕쿋?댁뒪瑜??곌껐?섎뒗 怨쇱젙 */
	     System.out.println ("3");
	     con=DriverManager.getConnection(url, userid, pwd);
	     System.out.println ("4");
	     } catch(SQLException e) {
	         e.printStackTrace();
		}
	   
        String docid = (String) jList5.getSelectedValue();
        String sql = "SELECT * FROM charts WHERE chart_id = "+docid;
         System.out.println ("5");
         Statement stmt = null;
        try {
            stmt = con.createStatement();
             System.out.println ("6");
        } catch (SQLException ex) {
            Logger.getLogger(mainpage1.class.getName()).log(Level.SEVERE, null, ex);
        }
        try {
            ResultSet rs=stmt.executeQuery(sql);
             System.out.println ("7");
            while(rs.next()) {
                 System.out.println ("8");
			   String rid = rs.getString(1);
			   String rcontent= rs.getString(2);
			   String rtid = rs.getString(3);
			   String rdid = rs.getString(4);
			   String rpid = rs.getString(5);
			   String rnid= rs.getString(6);
			
                            System.out.println ("9");
                              i.start();
			 i.setlabels(10,rid);
                         i.setlabels(11,rcontent);
                         i.setlabels(12,rtid);
                         i.setlabels(13,rdid);
                         i.setlabels(14,rpid);
                         i.setlabels(15,rnid);
                        
                         
                          System.out.println ("10");
                           i.setVisible(true);
      
      
		   }
            con.close();
        } catch (SQLException ex) {
            Logger.getLogger(mainpage1.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_jLabel1MouseClicked

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(mainpage1.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(mainpage1.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(mainpage1.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(mainpage1.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new mainpage1().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton3;
    private javax.swing.JButton jButton4;
    private javax.swing.JButton jButton5;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JList<String> jList1;
    private javax.swing.JList<String> jList2;
    private javax.swing.JList<String> jList3;
    private javax.swing.JList<String> jList4;
    private javax.swing.JList<String> jList5;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JScrollPane jScrollPane4;
    private javax.swing.JScrollPane jScrollPane5;
    // End of variables declaration//GEN-END:variables
}
