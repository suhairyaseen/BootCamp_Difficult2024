package com.BootCamp.part1.Difficult_Pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class HomePage {
	public WebDriver driver;
	
	@FindBy(linkText ="My Account")
	private WebElement AccountDropdown;
	
	@FindBy(linkText = "Login")
	private WebElement signInDrodown;
	
	@FindBy(name = "search")
	private WebElement searchTextField;
	
	@FindBy(xpath = "//button[@class = 'btn btn-default btn-lg']")
	private WebElement searchbutton;
	
	public HomePage(WebDriver driver) {
		this.driver = driver;
		PageFactory.initElements(driver,this);
	}

	public void clickOnAccountDropdown() {
		AccountDropdown.click();
	}
	public LoginPage clickonSignInDropdown() {
		signInDrodown.click();
		return new LoginPage(driver);
	}
	public void enterInSearchTextField(String SearchBox) {
		 searchTextField.sendKeys(SearchBox);
	}
	public ProductPage clickOnSearchButton() {
		searchbutton.click();
		return new ProductPage (driver);
	}
}
