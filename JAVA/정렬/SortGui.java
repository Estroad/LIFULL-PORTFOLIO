package Sort;

import java.awt.*;
import java.awt.event.*;
import java.io.IOException;

import javax.swing.*;




public class SortGui extends JFrame{
	
	private JButton add;
	private JButton del;
	private JButton srt;
	private JButton vew;
	private JButton ext;

	public SortGui() {
		setSize(700,200);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setTitle("S	O	R	T");

		
		
		JPanel mainpanel = new JPanel();
		setLayout(new FlowLayout());
		add = new JButton("1.내용 추가");
		del = new JButton("2.내용 삭제");
		srt = new JButton("3.내용 정렬");
		vew = new JButton("4.내용 보기");
		ext = new JButton("5.종	    료");


		add.addActionListener(new addListener());
		del.addActionListener(new delListener());
		srt.addActionListener(new srtListener());
		vew.addActionListener(new vewListener());
		ext.addActionListener(new extListener());

		mainpanel.add(add);
		mainpanel.add(del);
		mainpanel.add(srt);
		mainpanel.add(vew);
		mainpanel.add(ext);
		
		
		add(mainpanel);
		pack();
		
		setVisible(true);
	}
private class addListener implements ActionListener {
		public void actionPerformed(ActionEvent e) {
			if(e.getSource() == add){
			addGUI a = new addGUI();
			dispose();
		}
			
		}
	}



private class delListener implements ActionListener {
	public void actionPerformed(ActionEvent e) {
		if(e.getSource() == del){
		//delGUI a = new delGUI();
		dispose();
		}
		
	}
}

private class srtListener implements ActionListener {
	public void actionPerformed(ActionEvent e) {
		if(e.getSource() == srt){
		//srtGUI a = new srtGUI();
	}
		
	}
}

private class vewListener implements ActionListener {
	public void actionPerformed(ActionEvent e) {
		if(e.getSource() == vew){
//vewGUI a = new vewGUI();
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
class addGUI extends JFrame{
	private JLabel label1, label2;
	private JTextField text1, text2;
	private JButton submit, reset;
	public addGUI(){
		setSize(300,450);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setTitle("SORT ADD");
		
		JPanel addPanel = new JPanel();
		text1 = new JTextField(20);
		text2 = new JTextField(20);

		label1 = new JLabel("이　　름");
		label2 = new JLabel("학    번");
		
		
		submit = new JButton("등　　록");
		reset = new JButton("취　　소");
		
		submit.addActionListener(new subListener());
		reset.addActionListener(new resListener());
		
		addPanel.add(label1);
		addPanel.add(text1);
		addPanel.add(label2);
		addPanel.add(text2);
		
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
			String Hnum=text2.getText();
			
			//PhoneInfo info = new PhoneInfo(name, Phone,IPaddress);
			//PhoneBookManager.infoStorage[PhoneBookManager.curCnt++]=info;
			
			SortGui a = new SortGui();
			dispose();
		}
			
		}
	}
	
	private class resListener implements ActionListener {
		public void actionPerformed(ActionEvent e) {
			if(e.getSource() == reset){
				SortGui a = new SortGui();
				dispose();
		}
			
		}
	}
	
}
