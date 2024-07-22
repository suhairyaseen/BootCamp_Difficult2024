package com.BootCamp.part1.Difficult_TestCases;

import java.io.IOException;

import org.openqa.selenium.WebDriver;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import com.BootCamp.part1.Difficult_Pages.HomePage;
import com.BootCamp.part1.Difficult_Pages.MyAccountPageQ30;
import com.BootCamp.part1.Difficult_Pages.RegisterPageQ63;
import com.BootCamp.part1.Difficult_TestBase.TestBase;
import com.BootCamp.part1.Difficult_Utilities.Utility;

public class RegisterTestQ63 extends TestBase{
	
	
public RegisterTestQ63() throws IOException {
		super();
	}

public WebDriver driver;
public HomePage homepage;
public RegisterPageQ63 registerpage;
public MyAccountPageQ30 myaccountpage;


@BeforeMethod
public void setUp() {
	driver = initalizBrowserToStartApplication(prop.getProperty("browser"));
	homepage = new HomePage(driver);
	homepage.clickOnAccountDropdown();
	registerpage =homepage.clickOnRegisterDropdown();
}
@Test
public void validRegisterCredentials() {
	registerpage = new RegisterPageQ63(driver);
	registerpage.enterFirstNameInFieldText(dataprop.getProperty("firstname"));
	registerpage.enterLastNameFieldText(dataprop.getProperty("lastname"));
	registerpage.enterEmaliFieldText(Utility.emailStampTime());
	registerpage.entertelephoneFieldText(dataprop.getProperty("tele"));
	registerpage.enterpasswordFieldText(dataprop.getProperty("password"));
	registerpage.enterconfirmPasswordFieldText(dataprop.getProperty("conpassword"));
	registerpage.clickOnnewsletterOption();
	registerpage.clickpolicyOption();
	myaccountpage = new MyAccountPageQ30(driver);
	myaccountpage = registerpage.clickcontinueButton();
	myaccountpage = new MyAccountPageQ30(driver);
	Assert.assertTrue(myaccountpage.displaysuccessfullMessageForRegisteration());
}

@AfterMethod
public void tearDown() {
	driver.quit();
}


}
