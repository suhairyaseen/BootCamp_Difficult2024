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

public class ProductTestQ32 extends TestBase {
	public ProductTestQ32() throws IOException {
		super();
	}

	public WebDriver driver;
	public HomePage homepage;
	public ProductPageQ32 productpage;
	
	@BeforeMethod
public void setUpBrowser() {
	driver =  initalizBrowserToStartApplication(prop.getProperty("browser"));
	}
	
	@Test
	public void validatesearchProduct() {
		homepage = new HomePage(driver);
		homepage.enterInSearchTextField(prop.getProperty("product"));
		homepage.clickOnSearchButton();
		productpage = new ProductPageQ32(driver);
		Assert.assertTrue(productpage.checkTheWebElementShowUp());
		productpage.clickOnWebElementLink();
	}
	@AfterMethod
	public void tearDown() {
		driver.quit();
	}
}
