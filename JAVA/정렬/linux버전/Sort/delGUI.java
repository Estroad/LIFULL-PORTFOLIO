package Sort;

import java.awt.*;
import java.awt.event.*;
import java.io.IOException;

import javax.swing.*;

class delGUI extends JFrame {
	private JLabel label1;
	private JTextField text1;
	private JButton submit;
	public delGUI(){
		setSize(300,450);
		//setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setTitle("SORT NAME");
		
		JPanel addPanel = new JPanel();
		text1 = new JTextField(20);
		label1 = new JLabel("Name");
		submit = new JButton("Delete");
		
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
			String SN = text1.getText();
			int SNU = SortManager.searchA(SN);			

			if(SNU<0){
				dispose();
			}
			else{
				for(int i= SNU; i <(SortManager.curCnt-1);i++){
				SortManager.infoStorage[i] = SortManager.infoStorage[i+1];
				}
				SortManager.curCnt--;
			}

			dispose();	
			
		}
	}

	
}
}
