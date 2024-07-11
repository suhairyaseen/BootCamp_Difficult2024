package com.BootCamp.part1.Difficult_TestCases;

import java.io.IOException;

import org.openqa.selenium.WebDriver;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import com.BootCamp.part1.Difficult_Pages.HomePage;
import com.BootCamp.part1.Difficult_Pages.LoginPage;
import com.BootCamp.part1.Difficult_Pages.MyAccountPage;
import com.BootCamp.part1.Difficult_TestBase.TestBase;

public class LoginTest extends TestBase {
	
	public LoginTest() throws IOException {
		super();
	}
	public HomePage homepage;
	public LoginPage loginpage;
	public WebDriver driver;
	public MyAccountPage myaccountpage;
	@BeforeMethod
	public void setUpThePage() {
		driver = initalizBrowserToStartApplication(prop.getProperty("browser"));
	     homepage = new HomePage(driver);
	     homepage.clickOnAccountDropdown();	
	    loginpage =homepage.clickonSignInDropdown();
	}
@Test
public void loginWithValidCredentials() {
	loginpage = new LoginPage(driver);
	loginpage.enterEmailinTextField(prop.getProperty("validEmail"));
	loginpage. enterPasswordTextField(prop.getProperty("validPassword"));
	loginpage.clickOnLoginButton() ;
	myaccountpage = new MyAccountPage(driver);
	Assert.assertTrue( myaccountpage.varifyWishListIfDisplayed());
}

@AfterMethod
public void tearDown() {
	driver.quit();
}

}
