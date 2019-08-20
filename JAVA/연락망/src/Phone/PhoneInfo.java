package Phone;

import java.util.Scanner;

class PhoneInfo
{
	String name;
	String phoneNumber;
	String ip;
	
	public PhoneInfo(String name, String num,String ip)
	{
		this.name=name;
		phoneNumber=num;
		this.ip = ip;
	}
	
	public void showPhoneInfo()
	{
	seaSGUI.name = name;
	seaSGUI.Phone = phoneNumber;
	seaSGUI.IP = ip;
	
	}
}

class PhoneUnivInfo extends PhoneInfo
{
	String major;
	int year;	
	
	public PhoneUnivInfo(String name, String num, String major, int years,String ip)
	{
		super(name, num,ip);
		this.major=major;
		year=years;
	}
	
	public void showPhoneInfo()
	{
		super.showPhoneInfo();
		seaSGUI.major = major;
		seaSGUI.year = year;
	}
}

class PhoneCompanyInfo extends PhoneInfo
{
	String company;
	
	public PhoneCompanyInfo(String name, String num, String company, String ip)
	{
		super(name, num,ip);
		this.company=company;
	}
	
	public void showPhoneInfo()
	{
		super.showPhoneInfo();
		seaSGUI.comp = company;
	}
}
