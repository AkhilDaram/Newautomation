package com.vtiger.objectRepositories;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Organizationpage {
@FindBy(xpath = "//img[@title='Create Organization...']")private WebElement imglnk;


public Organizationpage(WebDriver driver) {
	PageFactory.initElements(driver,this);
	
}
public WebElement getImglnk() {
	return imglnk;
}
public void clickimglnk() {
	imglnk.click();
}
}
