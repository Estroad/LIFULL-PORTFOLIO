package Sort;

import java.awt.*;
import java.awt.event.*;
import java.io.IOException;

import javax.swing.*;

class delGUI2 extends JFrame {
	private JButton NUM, NAM, EXT;
	public delGUI2(){
		setSize(300,450);
		//setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setTitle("SORT del");
		
		JPanel addPanel1 = new JPanel();
		NUM = new JButton("학번검색");
		NAM = new JButton("이름검색");
		EXT = new JButton("취    소");

		NUM.addActionListener(new NUMListener());
		NAM.addActionListener(new NAMListener());
		EXT.addActionListener(new EXTListener());
		
		
		addPanel1.add(NUM);
		addPanel1.add(NAM);
		addPanel1.add(EXT);
		add(addPanel1);
		setVisible(true);
		pack();
	}
	
	private class NUMListener implements ActionListener {
		public void actionPerformed(ActionEvent e) {
			if(e.getSource() == NUM){
			
			delGUI1 a = new delGUI1();
			dispose();	
			
		}
	}

	
}

	private class NAMListener implements ActionListener {
		public void actionPerformed(ActionEvent e) {
			if(e.getSource() == NAM){
			
			delGUI a = new delGUI();
			dispose();	
			
		}
	}

	
}

	private class EXTListener implements ActionListener {
		public void actionPerformed(ActionEvent e) {
			if(e.getSource() == EXT){
			
			//SortGui a = new SortGui();
			dispose();	
			
		}
	}

	
}
}
