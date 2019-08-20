package Phone;


import java.util.Scanner;

import Phone.PhoneInfo;
import java.io.*;
import java.net.*;

import java.awt.*;
import java.awt.event.*;
import javax.swing.*;




public class PhoneBookManager
{
	public static Scanner keyboard=new Scanner(System.in);

	
	final static int MAX_CNT=100;
	 static PhoneInfo[] infoStorage=new PhoneInfo[MAX_CNT];
	 static int curCnt=0;
	
	
	
	
	public static int search(String name)
	{
		for(int idx=0; idx<curCnt; idx++)
		{
			PhoneInfo curInfo=infoStorage[idx];
			if(name.compareTo(curInfo.name)==0)
				return idx;
		}
		return -1;
	}
}
