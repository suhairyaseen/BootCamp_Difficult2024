package com.BootCamp.part1.Difficult_Pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class ProductPageQ32 {
	public WebDriver driver;
	
@FindBy(xpath = "//a[text()='HP LP3065']")
	private WebElement webElementlink;

	@FindBy(xpath = "//div[@class = 'button-group']/child::button[1]")
	private WebElement addToCartButton;
	
   @FindBy(xpath = "//button[@id = 'button-cart']")
    private WebElement confirmAddToCartButton;
 
   @FindBy(xpath = "//a[text() = 'Apple']")
   private WebElement brandandLink;
   
public ProductPageQ32(WebDriver driver) {
	this.driver = driver;
	PageFactory.initElements(driver,this);
}
	public void clickOnAddToCartButton() {
		addToCartButton.click();
	}
	public void clickOnConfirmAddTocartButton() {
		confirmAddToCartButton.click();	
	}
	public boolean checkTheWebElementShowUp() {
	boolean webelement = webElementlink.isDisplayed();
	return webelement; 
	}
	public void clickOnWebElementLink() {
		webElementlink.click();
	}
	public boolean checkIfDisplayedConfirmBandLink() {
		boolean brand = brandandLink.isDisplayed();
		return brand;
	}
	public void clickOnbrandandLink() {
		brandandLink.click();
	}
}
