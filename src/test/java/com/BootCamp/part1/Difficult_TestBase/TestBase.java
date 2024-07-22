package com.BootCamp.part1.Difficult_TestBase;

import java.io.FileInputStream;
import java.io.IOException;
import java.time.Duration;
import java.util.Properties;

import org.openqa.selenium.PageLoadStrategy;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import com.BootCamp.part1.Difficult_Utilities.Utility;

public class TestBase {
	
	public WebDriver driver;
	public  Properties prop;
	public FileInputStream ip;
	public ChromeOptions option;
	public Properties dataprop;
	public FileInputStream ip1;
	
	public TestBase() throws IOException {
		 prop = new Properties();
		 ip = new FileInputStream(System.getProperty("user.dir")+ "\\src\\main\\java\\com\\BootCamp\\part1\\Difficult_Config\\confog.properties");
		 prop.load(ip);
		
		 dataprop = new Properties();
		 ip1 = new FileInputStream("C:\\Users\\hussa\\eclipse-workspace\\Maven_2024_BootCamp\\src\\test\\java\\com\\BootCamp\\part1\\Difficult_TestData\\DataFile.properties");
		 dataprop.load(ip1);
		
	}
	
	
 public WebDriver initalizBrowserToStartApplication(String browsername) {
	 if(browsername.equals("chrome")) {
	  option = new ChromeOptions();
	  option.setPageLoadStrategy(PageLoadStrategy.NORMAL);
	  option.addArguments("--start-maximized");
	  driver = new ChromeDriver(option);
	 }
	 else {
		 System.out.println("There is not browsername match");
	 }
	 driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(Utility.ImplicitWaitTime));
	 driver.manage().timeouts().pageLoadTimeout(Duration.ofSeconds( Utility.PageLoadTimeWait));
	 driver.manage().timeouts().scriptTimeout(Duration.ofSeconds( Utility.ScriptTimeWait));
	 driver.get(prop.getProperty("url"));
	 return driver;
 }
}
