package com.vtiger.objectRepositories;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Orginformationpage {
@FindBy(xpath = "//span[@class='dvHeaderText']")private WebElement Orgheadtext;

public Orginformationpage(WebDriver driver) {
	PageFactory.initElements(driver,this);
}
public WebElement getOrgheadtext() {
	return Orgheadtext;
}
public String gethead() {
	return Orgheadtext.getText();
}


	
}
