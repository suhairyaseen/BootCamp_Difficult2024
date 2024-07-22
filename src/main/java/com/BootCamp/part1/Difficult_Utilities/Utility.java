package com.BootCamp.part1.Difficult_Utilities;

import java.util.Date;

public class Utility {
	
public static String emailStampTime() {
	Date date = new Date();
	System.out.println(date);
	String timeStamp = date.toString().replace(" " , "_").replace(":","_");
	System.out.println(timeStamp);
	return "sosocat" + timeStamp + "@gmail.com";
	
}
	
	public static final int ImplicitWaitTime = 10;
	public static final int PageLoadTimeWait = 10;
	public static final int ScriptTimeWait = 10;
	

}
