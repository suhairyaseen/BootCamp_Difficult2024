package com.BootCamp.part1.Difficult_Pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class RegisterPageQ63 {

	public WebDriver driver;
	
@FindBy(xpath = "//input[@id = 'input-firstname']")	
private WebElement firstNameFieldText;
	
@FindBy(xpath = "//input[@id = 'input-lastname']")
private WebElement lastNameFieldText;

 @FindBy(xpath = "//input[@id = 'input-email']")
 private WebElement emailFieldText;
 
 @FindBy(xpath ="//input[@id = 'input-telephone']")
 private WebElement telephoneFieldText;
 
 @FindBy(xpath = "//input[@name = 'password']")
 private WebElement passwordFieldText;
 
 
 @FindBy(xpath = "//input[@name = 'confirm']")
	private WebElement confirmPasswordFieldText;
 
 @FindBy(xpath = "//input[@name = 'newsletter'][@value = '1']")
 private WebElement newsletterOption;
 
 @FindBy(xpath = "//input[@name = 'agree']")
 private WebElement policyOption;
 
 @FindBy(xpath = "//input[@class = 'btn btn-primary']")
 private WebElement continueButton;
 
	public RegisterPageQ63(WebDriver driver) {
		this.driver = driver;
		PageFactory.initElements(driver,this);
	}
public void enterFirstNameInFieldText(String Firstname) {
	firstNameFieldText.sendKeys(Firstname);
	
}
public void enterLastNameFieldText(String Lastname) {
	 lastNameFieldText.sendKeys(Lastname);
}
public void enterEmaliFieldText(String emailaddress) {
	emailFieldText.sendKeys(emailaddress);	
}
public void entertelephoneFieldText(String telephone) {
	telephoneFieldText.sendKeys(telephone);
}
public void enterpasswordFieldText(String Password) {
	passwordFieldText.sendKeys(Password);
}
public void enterconfirmPasswordFieldText(String confirmPassword) {
	confirmPasswordFieldText.sendKeys(confirmPassword);
}
public void clickOnnewsletterOption() {
	newsletterOption.click();
}
public void clickpolicyOption() {
	policyOption.click();
}
public MyAccountPageQ30 clickcontinueButton() {
	continueButton.click();
	return new MyAccountPageQ30(driver);
}
}
