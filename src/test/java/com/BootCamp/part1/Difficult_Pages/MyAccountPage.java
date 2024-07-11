package com.BootCamp.part1.Difficult_Pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class MyAccountPage {

	public WebDriver driver;
	
	@FindBy(xpath = "//a[text() ='Wish List'][@class ='list-group-item']")
	private WebElement wishlist;
	
	public MyAccountPage(WebDriver driver) {
		this.driver = driver;
		PageFactory.initElements(driver,this);
	}
	public Boolean varifyWishListIfDisplayed() {
		boolean displaywishlist =  wishlist.isDisplayed();
		return displaywishlist;
	}
}
