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
	
	@FindBy(xpath = "//a[text() = 'Register']")
     private WebElement registerDropdown;
	
	@FindBy(xpath = "//p[@class = 'price'][contains(text() , '$602.00 ')]/following::button[1]")
	private WebElement addtocartProduct;
	
	@FindBy(linkText = "Shopping Cart")
	private WebElement shoppingCart;
	
	@FindBy(xpath = "//a[text() ='Brands']")
	private WebElement brandLinkElement;
	
	public HomePage(WebDriver driver) {
		this.driver = driver;
		PageFactory.initElements(driver,this);
	}

	public void clickOnAccountDropdown() {
		AccountDropdown.click();
	}
	public LoginPageQ30 clickonSignInDropdown() {
		signInDrodown.click();
		return new LoginPageQ30(driver);
	}
	public void enterInSearchTextField(String SearchBox) {
		 searchTextField.sendKeys(SearchBox);
	}
	public ProductPageQ32 clickOnSearchButton() {
		searchbutton.click();
		return new ProductPageQ32 (driver);
	}
	public RegisterPageQ63 clickOnRegisterDropdown() {
		registerDropdown.click();
		return new RegisterPageQ63(driver);
	}
	public void clickonaddtocartProduct() {
		addtocartProduct.click();
		
	}
	public CheckoutPageQ64 clickOnShoppingCart() {
		shoppingCart.click();
		return new CheckoutPageQ64(driver);
	}
		public boolean varifyBrandLinkElement() {
			boolean linkelement = brandLinkElement.isDisplayed();
			return linkelement;
		
	}
	public ProductPageQ32 clickOnBrandLinkElement() {
		brandLinkElement.click();
		return new  ProductPageQ32(driver);
	}	
	
}
