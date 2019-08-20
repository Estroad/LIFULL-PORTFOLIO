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
		add = new JButton("1.addContents");
		del = new JButton("2.delContents");
		srt = new JButton("3.SortContents");
		vew = new JButton("4.ViewContents");
		ext = new JButton("5.Close");


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
			//dispose();
		}
			
		}
	}



private class delListener implements ActionListener {
	public void actionPerformed(ActionEvent e) {
		if(e.getSource() == del){
		delGUI2 ab = new delGUI2();
		//dispose();
		}
		
	}
}

private class srtListener implements ActionListener {
	public void actionPerformed(ActionEvent e) {
		if(e.getSource() == srt){
		srtGui a = new srtGui();
		//a.setVisible(false);//dispose();
	}
		
	}
}

private class vewListener implements ActionListener {
	public void actionPerformed(ActionEvent e) {
		if(e.getSource() == vew){
			vewGui abc = new vewGui();
			//dispose();
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
