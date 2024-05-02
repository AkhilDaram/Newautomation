package com.vtiger.objectRepositories;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Contactsheader {
	@FindBy(xpath = "//span[@class='dvHeaderText']")private WebElement Headertxt;
	public Contactsheader(WebDriver driver) {
		PageFactory.initElements(driver,this);
	}
	public String Getheader() {
		return Headertxt.getText();
	}

}
