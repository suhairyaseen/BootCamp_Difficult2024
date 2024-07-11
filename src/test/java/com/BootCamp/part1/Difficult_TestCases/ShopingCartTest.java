package com.BootCamp.part1.Difficult_TestCases;

import java.io.IOException;

import org.openqa.selenium.WebDriver;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import com.BootCamp.part1.Difficult_Pages.AddToCartPage;
import com.BootCamp.part1.Difficult_Pages.HomePage;
import com.BootCamp.part1.Difficult_Pages.ProductPage;
import com.BootCamp.part1.Difficult_TestBase.TestBase;

public class ShopingCartTest extends TestBase {

	public ShopingCartTest() throws IOException {
		super();
	}
public WebDriver driver;
public HomePage homepage;
public ProductPage productpage;
public AddToCartPage addtocartpage;

@BeforeMethod
	public void setupPage() {
		driver = initalizBrowserToStartApplication(prop.getProperty("browser"));	
}
@Test
	public void validateProductInShoppingCart() {
		homepage = new HomePage(driver);
		homepage.enterInSearchTextField(prop.getProperty("product"));
		homepage.clickOnSearchButton();
		productpage = new ProductPage(driver);
		productpage.clickOnAddToCartButton();
		productpage.clickOnConfirmAddTocartButton();
		addtocartpage= new AddToCartPage(driver);
		Assert.assertTrue(addtocartpage.retriveSuccessfulMessage().contains(prop.getProperty("messageSuccess")));
	}
@AfterMethod
public void tearDown() {
	driver.quit();
}
}
