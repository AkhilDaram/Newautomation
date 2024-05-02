package com.vtiger.objectRepositories;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Loginpage {
	@FindBy(xpath = "//input[@name='user_name']")private WebElement ustext;
	@FindBy(xpath = "//input[@name='user_password']")private WebElement pstext;
	@FindBy(xpath = "//input[@id='submitButton']")private WebElement loginBtn;
	
	public Loginpage(WebDriver driver) {
		PageFactory.initElements(driver,this);;
	}
	public WebElement getUstext() {
		return ustext;
	}
	public WebElement getPstext() {
		return pstext;
	}
	public WebElement getLoginBtn() {
		return loginBtn;
	}
	public void logintoapp(String UN,String PWD) {
		ustext.sendKeys(UN);
		pstext.sendKeys(PWD);
		loginBtn.click();
	}

}
