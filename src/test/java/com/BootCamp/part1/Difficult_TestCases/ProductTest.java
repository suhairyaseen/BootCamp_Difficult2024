package com.BootCamp.part1.Difficult_TestCases;

import java.io.IOException;
import org.openqa.selenium.WebDriver;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import com.BootCamp.part1.Difficult_Pages.HomePage;
import com.BootCamp.part1.Difficult_Pages.ProductPage;
import com.BootCamp.part1.Difficult_TestBase.TestBase;

public class ProductTest extends TestBase {
	public ProductTest() throws IOException {
		super();
	}

	public WebDriver driver;
	public HomePage homepage;
	public ProductPage productpage;
	
	@BeforeMethod
public void setUpBrowser() {
	driver =  initalizBrowserToStartApplication(prop.getProperty("browser"));
	}
	
	@Test
	public void validatesearchProduct() {
		homepage = new HomePage(driver);
		homepage.enterInSearchTextField(prop.getProperty("product"));
		homepage.clickOnSearchButton();
		productpage = new ProductPage(driver);
		Assert.assertTrue(productpage.checkTheWebElementShowUp());
		productpage.clickOnWebElementLink();
	}
	@AfterMethod
	public void tearDown() {
		driver.quit();
	}
}
