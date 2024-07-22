package com.BootCamp.part1.Difficult_TestCases;

import java.io.IOException;

import org.openqa.selenium.WebDriver;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import com.BootCamp.part1.Difficult_Pages.HomePage;
import com.BootCamp.part1.Difficult_Pages.ProductPageQ32;
import com.BootCamp.part1.Difficult_TestBase.TestBase;

public class CheckTheElementTestQ65 extends TestBase {

	
	public CheckTheElementTestQ65() throws IOException {
		super();
	}
	public WebDriver driver;
	public HomePage homepage;
	public  ProductPageQ32 productpage;
	
	@BeforeMethod
	public void setUp() {
	driver = initalizBrowserToStartApplication(prop.getProperty("browser"));
}
	@Test 
	public void navigateWebElementBrand() {
		homepage = new HomePage(driver);
		Assert.assertTrue(homepage.varifyBrandLinkElement());
		homepage.clickOnBrandLinkElement();
		productpage=homepage.clickOnBrandLinkElement();
		ProductPageQ32 productpage = new  ProductPageQ32(driver);
		Assert.assertTrue(productpage.checkIfDisplayedConfirmBandLink());
		productpage.clickOnbrandandLink();
	}
	@AfterMethod
	public void tearDown() {
		driver.quit();
	}
		
	}
	

