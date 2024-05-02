package com.vtiger.objectRepositories;

import org.openqa.selenium.SearchContext;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.vtiger.genericUtilities.Webdriverutility;

public class Createcontactpage {
	@FindBy(xpath = "//input[@name='lastname']")private WebElement nameedt;
	@FindBy(xpath = "//input[@title='Save [Alt+S]']")private WebElement saveBtn;
	
	public Createcontactpage(WebDriver driver) {
		PageFactory.initElements(driver,this);
	}

	public WebElement getNameedt() {
		return nameedt;
	}

	public WebElement getSaveBtn() {
		return saveBtn;
	}
	public void sendname(String NAME) {
		nameedt.sendKeys(NAME);
		saveBtn.click();
	}

}
