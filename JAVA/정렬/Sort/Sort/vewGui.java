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
		//setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setTitle("PHONE");
		
		JPanel viewPanel = new JPanel();
		viewPanel.setLayout(new GridLayout(0, 1));
		//viewPanel.setAlignmentY(viewPanel,CENTER_ALIGNMENT);
		//viewPanel.setComponentOrientation(BOTTOM_ALIGNMENT,30);
//		viewPanel.setLayout(null);


		//JLabel.setAlignmentY(JComponent.CENTER_ALIGNMENT);

		label = new JButton[100];
//		no = new JLabel("내용이 없습니다.");
	
		back = new JButton("돌아가기");
//
//		int x1 = 5;
//		int x2 = 75;
//		int x3 = 145;
//		int y = 5;
//

		for(int i=0; i<SortManager.curCnt ; i++){
			String n = SortManager.infoStorage[i].getname();
			int nu = SortManager.infoStorage[i].getnum();
			label[i] = new JButton("번	호 : " + (i+1) + "  이	름 : " + n + "  학	번 : " + nu);
			//label[1][i] = ( i+1 );
			//label[i] = new JButton("이	름 : " + n);
			//label[2][i] = new JButton("학	번 : "  + nu);
	
			viewPanel.add(label[i]);
			//viewPanel.add(label[1][i]);
			//viewPanel.add(label[2][i]);
		
		//	label[0][i].setAlignmentY(viewPanel,CENTER_ALIGNMENT);
		//	label[1][i].setAlignmentY(viewPanel,CENTER_ALIGNMENT);
		//	label[2][i].setAlignmentY(viewPanel,CENTER_ALIGNMENT);

		//	label[0][i].setBounds(x1,y,50,40);
		//	label[1][i].setBounds(x2,y,50,40);
		//	label[2][i].setBounds(x3,y,50,40);
		
			//y += 50;
			
		} 
		
		
	//	if(pot == 0 || SortManager.curCnt == 0) {
	//		viewPanel.add(no);
	//	}
			
		
		back.addActionListener(new backListener());
			
		viewPanel.add(back);
		//back.setBounds(x1,(y+50),145,50);
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



	