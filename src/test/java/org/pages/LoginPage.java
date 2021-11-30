package org.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.test.baseclass.BaseClass;

public class LoginPage extends BaseClass {

	public LoginPage() {
		PageFactory.initElements(driver, this);
	}

	@FindBy(xpath = "//input[@id='twotabsearchtextbox']")
	private WebElement search;

	@FindBy(xpath = "//img[@class='s-image']")
	private WebElement iphone;

	public WebElement getSearch() {
		return search;
	}

	public WebElement getIphone() {
		return iphone;
	}

	public WebElement getAddtocart() {
		return addtocart;
	}

	@FindBy(xpath = "//input[@id='add-to-cart-button']")
	private WebElement addtocart;

}

//// input[@name='field-keywords']
// @FindBy(id="email")
// private WebElement textUsername;
//
// @FindBy(id="pass")
// private WebElement textPassword;
//
// @FindBy(name="login")
// private WebElement btnLogin;
//
// public WebElement getTextUsername() {
// return textUsername;
// }
//
// public WebElement getTextPassword() {
// return textPassword;
// }
//
// public WebElement getBtnLogin() {
// return btnLogin;
// }
//
