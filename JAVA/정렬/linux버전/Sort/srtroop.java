package Sort;


import java.awt.*;
import java.awt.event.*;
import java.io.IOException;

import javax.swing.*;

class srtroop extends JFrame{
	
	private JButton nownum;
	private JButton[] list;
	private JButton next;
	private int idx;
	public srtroop(int idx){
		this.idx = idx;
		//srtGui.stop = 0;
	setSize(300,450);
		//setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setTitle("SORTING");
		
		JPanel sortPanel = new JPanel();
		sortPanel.setLayout(new GridLayout(0, 1));
		
		list = new JButton[100];

		nownum = new JButton("----"+idx+"phase----");
		
		sortPanel.add(nownum);	

		for(int i=0; i<SortManager.curCnt; i++){
			String Na = SortManager.infoStorage[i].getname();
			int Nu = SortManager.infoStorage[i].getnum();

			list[i] = new JButton("Index : " + (i+1) + " Name : " + Na + " Number : " + Nu);
			sortPanel.add(list[i]);
		}
		
		next = new JButton("Next");
		sortPanel.add(next);

		next.addActionListener(new nextListener());
	
		add(sortPanel);
		pack();
		
		setVisible(true);
	}
		private class nextListener implements ActionListener {
		public void actionPerformed(ActionEvent e) {
			if(e.getSource() == next){
				//rtGui.stop = -1;
				setVisible(false);
			
		}
			
		}
	}
}
