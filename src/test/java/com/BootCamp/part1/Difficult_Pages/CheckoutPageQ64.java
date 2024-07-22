package com.BootCamp.part1.Difficult_Pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class CheckoutPageQ64 {
public WebDriver driver;
	
@FindBy(xpath = "//td[@class = 'text-center']/following::img")
private WebElement imageOfTheProduct;

@FindBy(xpath = "//a[text() = 'Checkout']")
private WebElement checkOutButton;
	
	public CheckoutPageQ64(WebDriver driver) {
		this.driver = driver;
		PageFactory.initElements(driver, this);
	}
	public boolean DisplayimageOfTheProduct() {
		boolean imageofproduct =  imageOfTheProduct.isDisplayed();
		return imageofproduct;
	}
	public void ClickOnCheckOutButton() {
		checkOutButton.click();
	}
	
	}

