package com.vtiger.objectRepositories;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class CreatenewOpportunitiespage {
	@FindBy(xpath = "//input[@name='potentialname']")private WebElement Opptxt;
	@FindBy(xpath = "//select[@name='related_to_type']")private WebElement selectlnk;
	@FindBy(xpath = "(//img[@title='Select'])[1]")private WebElement OpimgBtn;

}
