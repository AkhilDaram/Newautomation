package com.vtiger.objectRepositories;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class OPPPlusimagepage {
	@FindBy(xpath = "//img[@title='Create Opportunity...']")private WebElement PlusBtn;
	public OPPPlusimagepage(WebDriver driver) {
		PageFactory.initElements(driver,this);
	}
	public WebElement getPlusBtn() {
		return PlusBtn;
	}
	public void clickPlusimgOp() {
		PlusBtn.click();
	}

}
