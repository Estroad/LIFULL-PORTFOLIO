package Sort;

import java.awt.*;
import java.awt.event.*;
import java.io.IOException;

import javax.swing.*;


class addGUI extends JFrame{
	private JLabel label1, label2;
	private JTextField text1, text2;
	private JButton submit, reset;
	public addGUI(){
		setSize(300,450);
		//setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setTitle("SORT ADD");
		
		JPanel addPanel = new JPanel();
		text1 = new JTextField(20);
		text2 = new JTextField(20);

		label1 = new JLabel("Name");
		label2 = new JLabel("Number");
		
		
		submit = new JButton("Submit");
		reset = new JButton("Reset");
		
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
			String Snum=text2.getText();

			int Hnum = Integer.parseInt(Snum);
			
			data info = new data(name, Hnum);
			SortManager.infoStorage[SortManager.curCnt++]=info;
			
			//SortGui a = new SortGui();
			dispose();
		}
			
		}
	}
	
	private class resListener implements ActionListener {
		public void actionPerformed(ActionEvent e) {
			if(e.getSource() == reset){
				//SortGui a = new SortGui();
				dispose();
		}
			
		}
	}
	
}
