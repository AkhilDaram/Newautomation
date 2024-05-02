package com.vtiger.objectRepositories;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Creatingneworgpage {
	@FindBy(xpath = "//input[@name='accountname']")private WebElement orgnameedt;
	@FindBy(xpath = "//input[@title='Save [Alt+S]']")private WebElement savelnk;
	
	public Creatingneworgpage(WebDriver driver) {
		PageFactory.initElements(driver,this);
		
	}
	public WebElement getOrgnameedt() {
		return orgnameedt;
	}
	public WebElement getSavelnk() {
		return savelnk;
	}
	public void sendorgname(String Orgname) {
		orgnameedt.sendKeys(Orgname);
		savelnk.click();
	}
}
