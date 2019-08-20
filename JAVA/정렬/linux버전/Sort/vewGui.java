package Sort;


import java.awt.*;
import java.awt.event.*;
import java.io.IOException;

import javax.swing.*;

class vewGui extends JFrame{

private JButton back;
private JButton[] label;
//static int pot = SortManager.curCnt;
//private JLabel no;
public vewGui(){

	setSize(300,450);
		setTitle("SORT");
		
		JPanel viewPanel = new JPanel();
		viewPanel.setLayout(new GridLayout(0, 1));

		label = new JButton[100];
//
		back = new JButton("Return");
//
//

		for(int i=0; i<SortManager.curCnt ; i++){
			String n = SortManager.infoStorage[i].getname();
			int nu = SortManager.infoStorage[i].getnum();
			label[i] = new JButton("Index : " + (i+1) + "  Name : " + n + " Number : " + nu);
			
			viewPanel.add(label[i]);
		
		} 
		
		
		
		
		back.addActionListener(new backListener());
			
		viewPanel.add(back);
		add(viewPanel);
		setVisible(true);
			pack();
	}
	private class backListener implements ActionListener {
		public void actionPerformed(ActionEvent e) {
			if(e.getSource() == back){
				//SortGui a = new SortGui();
				dispose();
		}
			
		}
	}

}



	
