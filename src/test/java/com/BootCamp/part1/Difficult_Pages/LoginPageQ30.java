package com.BootCamp.part1.Difficult_Pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LoginPageQ30 {
	
	public WebDriver driver;
	
	
	@FindBy(id = "input-email" )
	private WebElement emailTextField;
	
	@FindBy(id = "input-password")
	private WebElement passwordTextField;
	
	@FindBy(xpath = "//input[@class = 'btn btn-primary']")
	private WebElement loginButton;
	
	public LoginPageQ30 (WebDriver driver) {
		this.driver = driver;
		PageFactory.initElements(driver,this);
	}
	public void enterEmailinTextField(String emailtext) {
		emailTextField.sendKeys(emailtext);
	}
	
	public void enterPasswordTextField(String passwordtext) {
		 passwordTextField.sendKeys(passwordtext);
	}
	public MyAccountPageQ30 clickOnLoginButton() {
		loginButton.click();
		return new MyAccountPageQ30(driver);		
	}
	
}
