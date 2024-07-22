package com.BootCamp.part1.Difficult_TestCases;

import java.io.IOException;

import org.openqa.selenium.WebDriver;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import com.BootCamp.part1.Difficult_Pages.HomePage;
import com.BootCamp.part1.Difficult_Pages.LoginPageQ30;
import com.BootCamp.part1.Difficult_Pages.MyAccountPageQ30;
import com.BootCamp.part1.Difficult_TestBase.TestBase;

public class LoginTestQ30 extends TestBase {
	
	public LoginTestQ30() throws IOException {
		super();
	}
	public HomePage homepage;
	public LoginPageQ30 loginpage;
	public WebDriver driver;
	public MyAccountPageQ30 myaccountpage;
	
	@BeforeMethod
	public void setUpThePage() {
		 driver = initalizBrowserToStartApplication(prop.getProperty("browser"));
	     homepage = new HomePage(driver);
	     homepage.clickOnAccountDropdown();	
	     loginpage =homepage.clickonSignInDropdown();
	}
@Test
    public void loginWithValidCredentials() {
	loginpage = new LoginPageQ30(driver);
	loginpage.enterEmailinTextField(prop.getProperty("validEmail"));
	loginpage. enterPasswordTextField(prop.getProperty("validPassword"));
	myaccountpage = new MyAccountPageQ30(driver);
	myaccountpage = loginpage.clickOnLoginButton() ;
	myaccountpage = new MyAccountPageQ30(driver);
	Assert.assertTrue( myaccountpage.varifyWishListIfDisplayed());
}

@AfterMethod
    public void tearDown() {
	driver.quit();
}

}
