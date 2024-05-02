package com.vtiger.objectRepositories;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.vtiger.genericUtilities.Webdriverutility;

public class Homepage extends Webdriverutility {

	@FindBy(linkText = "Organizations")private WebElement OrganizationsLnk;

	@FindBy(linkText = "Contacts")private WebElement ContactsLnk;
	
	@FindBy(linkText = "Opportunities")private WebElement Opportunitieslnk;

	@FindBy(xpath = "//img[@src='themes/softed/images/user.PNG']")private WebElement AdministratorImg;

	@FindBy(linkText = "Sign Out")private WebElement SignOutLnk;

	public Homepage(WebDriver driver) {
		PageFactory.initElements(driver,this);
	}

	public WebElement getOrganizationsLnk() {
		return OrganizationsLnk;
	}
	public WebElement getContactsLnk() {
		return ContactsLnk;
	}
	
	
	public WebElement getOpportunitieslnk() {
		return Opportunitieslnk;
	}

	public WebElement getAdministratorImg() {
		return AdministratorImg;
	}
	public WebElement getSignOutLnk() {
		return SignOutLnk;
	}
	
	public void clickorg() {
		OrganizationsLnk.click();
		
	}
	public void clickcon() {
		ContactsLnk.click();
	}
	public void clickOOP() {
		Opportunitieslnk.click();
	}
	public void logoutapp(WebDriver driver) {
		mouseoverAction(driver,AdministratorImg);
		SignOutLnk.click();
	}
	
}