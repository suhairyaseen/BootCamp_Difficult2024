package com.BootCamp.part1.Difficult_TestCases;

import java.io.IOException;

import org.openqa.selenium.WebDriver;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import com.BootCamp.part1.Difficult_Pages.AddToCartPageQ31;
import com.BootCamp.part1.Difficult_Pages.HomePage;
import com.BootCamp.part1.Difficult_Pages.ProductPageQ32;
import com.BootCamp.part1.Difficult_TestBase.TestBase;

public class ShopingCartTestQ31 extends TestBase {

	public ShopingCartTestQ31() throws IOException {
		super();
	}
public WebDriver driver;
public HomePage homepage;
public ProductPageQ32 productpage;
public AddToCartPageQ31 addtocartpage;

@BeforeMethod
	public void setupPage() {
		driver = initalizBrowserToStartApplication(prop.getProperty("browser"));	
}
@Test
	public void validateProductInShoppingCart() {
		homepage = new HomePage(driver);
		homepage.enterInSearchTextField(prop.getProperty("product"));
		homepage.clickOnSearchButton();
		productpage = new ProductPageQ32(driver);
		productpage.clickOnAddToCartButton();
		productpage.clickOnConfirmAddTocartButton();
		addtocartpage= new AddToCartPageQ31(driver);
		Assert.assertTrue(addtocartpage.retriveSuccessfulMessage().contains(prop.getProperty("messageSuccess")));
	}
@AfterMethod
public void tearDown() {
	driver.quit();
}
}
