package com.vtiger.objectRepositories;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Contactlookuppage {
	@FindBy(xpath = "//img[@title='Create Contact...']")private WebElement pluslnk;
	public Contactlookuppage(WebDriver driver) {
		PageFactory.initElements(driver,this);
	}
	public WebElement getPluslnk() {
		return pluslnk;
	}
	public void clickplus() {
		pluslnk.click();
	}

}
