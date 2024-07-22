package com.BootCamp.part1.Difficult_Pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class MyAccountPageQ30 {

	public WebDriver driver;
	
	@FindBy(xpath = "//a[text() ='Wish List'][@class ='list-group-item']")
	private WebElement wishlist;
	
	@FindBy(xpath = "//p[text() = 'Congratulations! Your new account has been successfully created!']")
	private WebElement successfullMessageForRegisteration;
	
	public MyAccountPageQ30(WebDriver driver) {
		this.driver = driver;
		PageFactory.initElements(driver,this);
	}
	public boolean varifyWishListIfDisplayed() {
		boolean displaywishlist =  wishlist.isDisplayed();
		return displaywishlist;
	}
	public boolean displaysuccessfullMessageForRegisteration() {
		boolean SucessMessage = successfullMessageForRegisteration.isDisplayed();
		return SucessMessage;
	}
}
