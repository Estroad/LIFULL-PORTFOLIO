package Phone;

import java.awt.*;
import java.awt.event.*;
import java.io.IOException;

import javax.swing.*;


public class PhoneGUI extends JFrame{
	
	private JButton add;
	private JButton sea;
	private JButton del;
	private JButton Mre;
	private JButton Mse;
	private JButton ext;
	
	
	public PhoneGUI() {
		setSize(700,200);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setTitle("PHONE");
	
		JPanel mainpanel = new JPanel();
		setLayout(new FlowLayout());
		add = new JButton("1.연락처 추가");
		sea = new JButton("2.연락처 검색");
		del = new JButton("3.연락처 삭제");
		Mre = new JButton("4.메신저 수신");
		Mse = new JButton("5.메신저 발신");
		ext = new JButton("6.종　　 　료");
		
		add.addActionListener(new addListener());
		sea.addActionListener(new seaListener());
		del.addActionListener(new delListener());
		Mre.addActionListener(new MreListener());
		Mse.addActionListener(new MseListener());
		ext.addActionListener(new extListener());
		
		mainpanel.add(add);
		mainpanel.add(sea);
		mainpanel.add(del);
		mainpanel.add(Mre);
		mainpanel.add(Mse);
		mainpanel.add(ext);
		
		
		add(mainpanel);
		pack();
		
		setVisible(true);
	}
private class addListener implements ActionListener {
		public void actionPerformed(ActionEvent e) {
			if(e.getSource() == add){
			addFGUI a = new addFGUI();
			dispose();
		}
			
		}
	}

private class seaListener implements ActionListener {
	public void actionPerformed(ActionEvent e) {
		if(e.getSource() == sea){
		seaGUI a = new seaGUI();
		dispose();
	}
		
	}
}

private class delListener implements ActionListener {
	public void actionPerformed(ActionEvent e) {
		if(e.getSource() == del){
		delGUI a = new delGUI();
		dispose();
		}
		
	}
}

private class MreListener implements ActionListener {
	public void actionPerformed(ActionEvent e) {
		if(e.getSource() == Mre){
		MreGUI a = new MreGUI();
	}
		
	}
}

private class MseListener implements ActionListener {
	public void actionPerformed(ActionEvent e) {
		if(e.getSource() == Mse){
		MseGUI a = new MseGUI();
	}
		
	}
}
private class extListener implements ActionListener {
	public void actionPerformed(ActionEvent e) {
		if(e.getSource() == ext){
		System.exit(0);
	}
		
	}
}

}


class addFGUI extends JFrame{
	private JButton norm, univ, comp;

	public addFGUI(){
		setSize(300,450);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setTitle("PHONE");
		
		JPanel aP = new JPanel();
		
		norm = new JButton("1.일　반");
		univ = new JButton("2.대　학");
		comp = new JButton("3.회　사");
		
		norm.addActionListener(new normListener());
		univ.addActionListener(new univListener());
		comp.addActionListener(new compListener());
		
		aP.add(norm);
		aP.add(univ);
		aP.add(comp);
		
		add(aP);
		setVisible(true);
		pack();
		
	}
	
	private class normListener implements ActionListener {
		public void actionPerformed(ActionEvent e) {
			if(e.getSource() == norm){
				addNGUI a = new addNGUI();
				dispose();
		}
		}
	}
	private class univListener implements ActionListener {
		public void actionPerformed(ActionEvent e) {
			if(e.getSource() == univ){
				addUGUI a = new addUGUI();
				dispose();
		}
		}
	}
	private class compListener implements ActionListener {
		public void actionPerformed(ActionEvent e) {
			if(e.getSource() == comp){
				addCGUI a = new addCGUI();
				dispose();
		}
		}
	}
}
	
class addNGUI extends JFrame{
	private JLabel label1, label2, label3;
	private JTextField text1, text2, text3;
	private JButton submit, reset;
	public addNGUI(){
		setSize(300,450);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setTitle("PHONE");
		
		JPanel addPanel = new JPanel();
		text1 = new JTextField(20);
		text2 = new JTextField(20);
		text3 = new JTextField(20);

		label1 = new JLabel("이　　름");
		label2 = new JLabel("전화번호");
		label3 = new JLabel("I　　P");
		
		
		submit = new JButton("등　　록");
		reset = new JButton("취　　소");
		
		submit.addActionListener(new subListener());
		reset.addActionListener(new resListener());
		
		addPanel.add(label1);
		addPanel.add(text1);
		addPanel.add(label2);
		addPanel.add(text2);
		addPanel.add(label3);
		addPanel.add(text3);
		
		addPanel.add(submit);
		addPanel.add(reset);
		
		add(addPanel);
		setVisible(true);
		pack();
	}
	
	private class subListener implements ActionListener {
		public void actionPerformed(ActionEvent e) {
			if(e.getSource() == submit){
			String name=text1.getText();
			String Phone=text2.getText();
			String IPaddress=text3.getText();
			
			PhoneInfo info = new PhoneInfo(name, Phone,IPaddress);
			PhoneBookManager.infoStorage[PhoneBookManager.curCnt++]=info;
			
			PhoneGUI a = new PhoneGUI();
			dispose();
		}
			
		}
	}
	
	private class resListener implements ActionListener {
		public void actionPerformed(ActionEvent e) {
			if(e.getSource() == reset){
				PhoneGUI a = new PhoneGUI();
				dispose();
		}
			
		}
	}
	
}

class addUGUI extends JFrame{
	private JLabel label1, label2, label3, label4, label5,label6;
	private JTextField text1, text2, text3,text4;
	private JButton submit, reset, up, down;
	private int count =0;
	public addUGUI(){
		setSize(300,450);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setTitle("PHONE");
		
		JPanel addPanel = new JPanel();
		text1 = new JTextField(20);
		text2 = new JTextField(20);
		text3 = new JTextField(20);
		text4 = new JTextField(20);
	
		label1 = new JLabel("이　　름");
		label2 = new JLabel("전화번호");
		label3 = new JLabel("전　　공");
		label4 = new JLabel("학　　년");
		label5 = new JLabel("I　　P");
		label6 = new JLabel("  "+count+"  ");
		
		submit = new JButton("등　　록");
		reset = new JButton("취　　소");
		up = new JButton("증　　가");
		down = new JButton("감　　소");
		
		
		
		submit.addActionListener(new subListener());
		reset.addActionListener(new resListener());
		
		up.addActionListener(new upListener());
		down.addActionListener(new downListener());
		
		
		addPanel.add(label1);
		addPanel.add(text1);
		addPanel.add(label2);
		addPanel.add(text2);
		addPanel.add(label3);
		addPanel.add(text3);
		addPanel.add(up);
		addPanel.add(label4);
		addPanel.add(label6);
		addPanel.add(down);
		addPanel.add(label5);
		addPanel.add(text4);
		
		
		addPanel.add(submit);
		addPanel.add(reset);
		
		add(addPanel);
		setVisible(true);
		pack();
	}
	
	private class subListener implements ActionListener {
		public void actionPerformed(ActionEvent e) {
			if(e.getSource() == submit){
		
			PhoneInfo info = new PhoneUnivInfo(text1.getText(), text2.getText(),text3.getText(),count,text4.getText());
			PhoneBookManager.infoStorage[PhoneBookManager.curCnt++]=info;
			
			PhoneGUI a = new PhoneGUI();
			dispose();
		}
			
		}
	}
	private class upListener implements ActionListener {
		public void actionPerformed(ActionEvent e) {
			if(e.getSource() == up){
				count++;
				label6.setText("  "+ count +"  ");
		}
			
		}
	}
	private class downListener implements ActionListener {
		public void actionPerformed(ActionEvent e) {
			if(e.getSource() == down){
					count--;
					label6.setText("  "+ count +"  ");
		}
			
		}
	}
	
	

	
	private class resListener implements ActionListener {
		public void actionPerformed(ActionEvent e) {
			if(e.getSource() == reset){
				PhoneGUI a = new PhoneGUI();
				dispose();
		}
			
		}
	}
	
	
}

class addCGUI extends JFrame{
	private JLabel label1, label2, label3, label4;
	private JTextField text1, text2, text3,text4;
	private JButton submit, reset;
	public addCGUI(){
		setSize(300,450);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setTitle("PHONE");
		
		JPanel addPanel = new JPanel();
		text1 = new JTextField(20);
		text2 = new JTextField(20);
		text3 = new JTextField(20);
		text4 = new JTextField(20);

		label1 = new JLabel("이　　름");
		label2 = new JLabel("전화번호");
		label3 = new JLabel("회　　사");
		label4 = new JLabel("I　　P");
		
		
		submit = new JButton("등　　록");
		reset = new JButton("취　　소");
		
		submit.addActionListener(new subListener());
		reset.addActionListener(new resListener());
		
		addPanel.add(label1);
		addPanel.add(text1);
		addPanel.add(label2);
		addPanel.add(text2);
		addPanel.add(label3);
		addPanel.add(text3);
		addPanel.add(label4);
		addPanel.add(text4);
		
		addPanel.add(submit);
		addPanel.add(reset);
		
		add(addPanel);
		setVisible(true);
		pack();
	}
	
	private class subListener implements ActionListener {
		public void actionPerformed(ActionEvent e) {
			if(e.getSource() == submit){
			String name=text1.getText();
			String Phone=text2.getText();
			String Company=text3.getText();
			String IPaddress=text4.getText();
			
			PhoneInfo info = new PhoneCompanyInfo(name, Phone,Company,IPaddress);
			PhoneBookManager.infoStorage[PhoneBookManager.curCnt++]=info;
			
			PhoneGUI a = new PhoneGUI();
			dispose();
		}
			
		}
	}
	
	private class resListener implements ActionListener {
		public void actionPerformed(ActionEvent e) {
			if(e.getSource() == reset){
				PhoneGUI a = new PhoneGUI();
				dispose();
		}
			
		}
	}
	
}


class seaGUI extends JFrame {
	private JLabel label1;
	private JTextField text1;
	private JButton submit;
	public seaGUI(){
		
		setSize(300,450);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setTitle("PHONE");
		
		JPanel addPanel = new JPanel();
		text1 = new JTextField(20);
		label1 = new JLabel("찾으실 분의 이름을 적어주세요");
		submit = new JButton("찾　　기");
		
		submit.addActionListener(new subListener());
		
		
		addPanel.add(label1);
		addPanel.add(text1);
		addPanel.add(submit);
		add(addPanel);
		setVisible(true);
		pack();
	}
	
	private class subListener implements ActionListener {
		public void actionPerformed(ActionEvent e) {
			if(e.getSource() == submit){
				seaSGUI a = new seaSGUI(text1.getText());
				dispose();
		}
			
		}
	}
	
}

class seaSGUI extends JFrame {
		static public String name,Phone,IP,comp,major;
		static public int year;
		private JLabel label1, label2, label3, label4, label5;
		private JButton back;
		public seaSGUI(String name)
		{Phone=comp=major=null;
		year =0;
		
			
			setSize(300,450);
			setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
			setTitle("PHONE");
			
		
			int dataidx=PhoneBookManager.search(name);
			if(dataidx<0)
			{
			a a = new a();
			}
			else
			{
				PhoneBookManager.infoStorage[dataidx].showPhoneInfo();
			
		if(major == null&&comp == null)
		{
		b a = new b(name,Phone,IP);
		}
		else if(major == null)
		{
			d a = new d(name,Phone,comp,IP);
		}
		else
		{
			c a = new c(name,Phone,major,IP,year);
		}
			}
		back = new JButton("돌아가기");
		
		back.addActionListener(new backListener());
		
		
	
	
		pack();
		}
		private class backListener implements ActionListener {
			public void actionPerformed(ActionEvent e) {
				if(e.getSource() == back){
					PhoneGUI a = new PhoneGUI();
					dispose();
			}
				
			}
		}
	
	
}


class a extends JFrame{
	private JButton back;
	
	public a()
	{
		setSize(300,450);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setTitle("PHONE");
		
		JPanel addPanel = new JPanel();
		
			JLabel label1 = new JLabel("데이터가 존재하지않습니다.");
			back = new JButton("돌아가기");
			addPanel.add(label1);
			addPanel.add(back);
			add(addPanel);
			back.addActionListener(new backListener());
			
			setVisible(true);
			pack();
	}
	private class backListener implements ActionListener {
		public void actionPerformed(ActionEvent e) {
			if(e.getSource() == back){
				PhoneGUI a = new PhoneGUI();
				dispose();
		}
			
		}
	}

}
class b extends JFrame{
	private JLabel label1, label2, label3;
	
	private JButton back;
	public b(String name, String Phone,String IP)
	{
		setSize(300,450);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setTitle("PHONE");
		
		JPanel addPanel = new JPanel();
		
		label1 = new JLabel("이　　름:"+name);
		label2 = new JLabel("전화번호:"+Phone);
		label3 = new JLabel("I　　P:"+IP);
		
		addPanel.add(label1);
		addPanel.add(label2);
		addPanel.add(label3);
		back = new JButton("돌아가기");
			
			addPanel.add(back);
			add(addPanel);
			back.addActionListener(new backListener());
			
			setVisible(true);
			pack();
	}
	private class backListener implements ActionListener {
		public void actionPerformed(ActionEvent e) {
			if(e.getSource() == back){
				PhoneGUI a = new PhoneGUI();
				dispose();
		}
			
		}
	}

}
class d extends JFrame{
	private JLabel label1, label2, label3,label4;
	
	private JButton back;
	public d (String name, String Phone,String IP,String Comp)
	{
		setSize(300,450);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setTitle("PHONE");
		
		JPanel addPanel = new JPanel();
		
		label1 = new JLabel("이　　름:"+name);
		label2 = new JLabel("전화번호:"+Phone);
		label3 = new JLabel("회　　시:"+Comp);
		label4 = new JLabel("I　　P:"+IP);
		
		addPanel.add(label1);
		addPanel.add(label2);
		addPanel.add(label3);
		addPanel.add(label4);
		
		back = new JButton("돌아가기");
			
			addPanel.add(back);
			add(addPanel);
			back.addActionListener(new backListener());
			
			setVisible(true);
			pack();
	}
	private class backListener implements ActionListener {
		public void actionPerformed(ActionEvent e) {
			if(e.getSource() == back){
				PhoneGUI a = new PhoneGUI();
				dispose();
		}
			
		}
	}

}
class c extends JFrame{
	private JLabel label1, label2, label3, label4, label5;
	private JButton back;
	public c(String name, String Phone,String IP,String major,int year)
	{
		setSize(300,450);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setTitle("PHONE");
		
		JPanel addPanel = new JPanel();
		
		label1 = new JLabel("이　　름:"+name);
		label2 = new JLabel("전화번호:"+Phone);
		label3 = new JLabel("전　　공:"+major);
		label4 = new JLabel("학　　년:"+year);
		label5 = new JLabel("I　　P:"+IP);
		
		addPanel.add(label1);
		addPanel.add(label2);
		addPanel.add(label3);
		addPanel.add(label4);
		addPanel.add(label5);back = new JButton("돌아가기");
			addPanel.add(label1);
			addPanel.add(back);
			add(addPanel);
			back.addActionListener(new backListener());
			
			setVisible(true);
			pack();
	}
	private class backListener implements ActionListener {
		public void actionPerformed(ActionEvent e) {
			if(e.getSource() == back){
				PhoneGUI a = new PhoneGUI();
				dispose();
		}
			
		}
	}

}

class delGUI extends JFrame {
	private JLabel label1;
	private JTextField text1;
	private JButton submit;
	public delGUI(){
		setSize(300,450);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setTitle("PHONE");
		
		JPanel addPanel = new JPanel();
		text1 = new JTextField(20);
		label1 = new JLabel("지우실 분의 이름을 적어주세요");
		submit = new JButton("찾　　기");
		
		submit.addActionListener(new subListener());
		
		
		addPanel.add(label1);
		addPanel.add(text1);
		addPanel.add(submit);
		add(addPanel);
		setVisible(true);
		pack();
	}
	
	private class subListener implements ActionListener {
		public void actionPerformed(ActionEvent e) {
			if(e.getSource() == submit){
				int dataIdx=PhoneBookManager.search(text1.getText());
				if(dataIdx<0)
				{
				aGUI a = new aGUI();
				dispose();
				
				
				}
				else
				{
					for(int idx=dataIdx; idx<(PhoneBookManager.curCnt-1); idx++)
						PhoneBookManager.infoStorage[idx]=PhoneBookManager.infoStorage[idx+1];
				
					PhoneBookManager.curCnt--;
					
			bGUI b = new bGUI();
			dispose();
		}
			
		}
	}

	
}
class aGUI extends JFrame{
	private JButton back;
	public aGUI(){
		setSize(300,450);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setTitle("PHONE");
		JLabel label1 = new JLabel("데이터가 없습니다.");
		JPanel panel = new JPanel();
		back = new JButton("돌아가기");
		panel.add(label1);
		panel.add(back);
		back.addActionListener(new backListener());
		
		add(panel);
		setVisible(true);
		pack();
	}
	private class backListener implements ActionListener {
		public void actionPerformed(ActionEvent e) {
			if(e.getSource() == back){
				PhoneGUI a = new PhoneGUI();
				dispose();
		}
			
		}
	}

}
}
class bGUI extends JFrame{
	private JButton back;
	public bGUI(){
		setSize(300,450);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setTitle("PHONE");
		JLabel label1 = new JLabel("삭제가 완료되었습니다.");
		JPanel panel = new JPanel();
		back = new JButton("돌아가기");
		panel.add(label1);
		panel.add(back);
		back.addActionListener(new backListener());
		
		add(panel);
		setVisible(true);
	}
	private class backListener implements ActionListener {
		public void actionPerformed(ActionEvent e) {
			if(e.getSource() == back){
				PhoneGUI a = new PhoneGUI();dispose();
		}
			
		}
	}

}

class MreGUI extends JFrame{
	private JLabel label1;
	private JTextField text1;
	private JButton submit;
	public MreGUI(){
		setSize(300,450);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setTitle("PHONE");
		
		JPanel addPanel = new JPanel();
		text1 = new JTextField(20);
		label1 = new JLabel("연결하실 분의 IP을 적어주세요");
		submit = new JButton("찾　　기");
		
		submit.addActionListener(new subListener());
		
		
		addPanel.add(label1);
		addPanel.add(text1);
		addPanel.add(submit);
		add(addPanel);
		setVisible(true);
		pack();
	}
	private class subListener implements ActionListener {
		public void actionPerformed(ActionEvent e) {
			if(e.getSource() == submit){
				try {
					Messenger a = new Messenger(text1.getText());
				} catch (IOException e1) {
					// TODO Auto-generated catch block
					e1.printStackTrace();
				}
		}
			
		}
	}
}
class MseGUI extends JFrame{
	private JLabel label1;
	private JTextField text1;
	private JButton submit;
	public MseGUI(){
		setSize(300,450);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setTitle("PHONE");
		
		JPanel addPanel = new JPanel();
		text1 = new JTextField(20);
		label1 = new JLabel("연결하실 분의 IP을 적어주세요");
		submit = new JButton("찾　　기");
		
		submit.addActionListener(new subListener());
		
		
		addPanel.add(label1);
		addPanel.add(text1);
		addPanel.add(submit);
		add(addPanel);
		setVisible(true);
		pack();
	}
	private class subListener implements ActionListener {
		public void actionPerformed(ActionEvent e) {
			if(e.getSource() == submit){
				try {
					Messenger2 a = new Messenger2(text1.getText());
				} catch (IOException e1) {
					// TODO Auto-generated catch block
					e1.printStackTrace();
				}
		}
			
		}
	}
}


