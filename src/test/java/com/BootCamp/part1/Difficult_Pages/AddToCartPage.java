package com.BootCamp.part1.Difficult_Pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class AddToCartPage {
	public WebDriver driver;
	

	
	@FindBy(xpath ="//div[@class = 'alert alert-success alert-dismissible']")
	private WebElement successfullMessage;
	
	public  AddToCartPage(WebDriver driver) {
		this.driver = driver;
		PageFactory.initElements(driver,this);
	}
	
public String retriveSuccessfulMessage() {
	String message =  successfullMessage.getText();
	return message;
}
}
