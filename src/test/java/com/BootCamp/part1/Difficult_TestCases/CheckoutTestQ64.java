package com.BootCamp.part1.Difficult_TestCases;

import java.io.IOException;

import org.openqa.selenium.WebDriver;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import com.BootCamp.part1.Difficult_Pages.CheckoutPageQ64;
import com.BootCamp.part1.Difficult_Pages.HomePage;
import com.BootCamp.part1.Difficult_TestBase.TestBase;

public class CheckoutTestQ64 extends TestBase {

	public CheckoutTestQ64() throws IOException {
		super();
	}
    public WebDriver driver;
    public CheckoutPageQ64 checkoutpage;
    public HomePage homepage;

@BeforeMethod
    public void setup() {
	driver = initalizBrowserToStartApplication(prop.getProperty("browser"));
}
@Test
    public void validateCorrectProductPurchased() {
	homepage = new HomePage(driver);
	homepage.clickonaddtocartProduct();
	homepage.clickOnShoppingCart();
	checkoutpage = homepage.clickOnShoppingCart();
	Assert.assertTrue(checkoutpage.DisplayimageOfTheProduct());
	checkoutpage = new CheckoutPageQ64(driver);
	checkoutpage.ClickOnCheckOutButton();
}
/*
@AfterMethod
    public void tearDown() {
	driver.quit();
	
}
*/
}