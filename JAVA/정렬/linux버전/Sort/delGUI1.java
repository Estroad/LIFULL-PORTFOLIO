package Sort;

import java.awt.*;
import java.awt.event.*;
import java.io.IOException;

import javax.swing.*;

class delGUI1 extends JFrame {
	private JLabel label1;
	private JTextField text1;
	private JButton submit;
	public delGUI1(){
		setSize(300,450);
		//setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setTitle("SORT NUM");
		
		JPanel addPanel = new JPanel();
		text1 = new JTextField(20);
		label1 = new JLabel("Number");
		submit = new JButton("Delete");
		
		submit.addActionListener(new subListener1());
		
		
		addPanel.add(label1);
		addPanel.add(text1);
		addPanel.add(submit);
		add(addPanel);
		setVisible(true);
		pack();
	}
	
	private class subListener1 implements ActionListener {
		public void actionPerformed(ActionEvent e) {
			if(e.getSource() == submit){
			
			String SN = text1.getText();

			int Hnum = Integer.parseInt(SN);
						

			int SNU = SortManager.searchU(Hnum);			

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
