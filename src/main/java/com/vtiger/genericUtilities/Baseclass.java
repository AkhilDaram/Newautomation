package com.vtiger.genericUtilities;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;

import com.vtiger.objectRepositories.Homepage;
import com.vtiger.objectRepositories.Loginpage;

public class Baseclass {
public Propertyfileutility pu=new Propertyfileutility();
public Javautility ju=new Javautility();
public Webdriverutility wu=new Webdriverutility();
public Excelutility eu=new Excelutility();
public WebDriver driver=null;

@BeforeSuite
public void bsconfig() {
	System.out.println("==DB CONNECTED==");
}
@AfterSuite
public void baconfig() {
	System.out.println("==DB IS DISCONNECTED==");
}
@BeforeClass
public void bcconfig() throws Throwable {
	String BROWSER = pu.readDataFromPropertyfile("browser");
	String URL = pu.readDataFromPropertyfile("url");
	if(BROWSER.equalsIgnoreCase("edge")) {
		driver =new EdgeDriver();
		System.out.println("==Edge id launched==");
	}
	else if(BROWSER.equalsIgnoreCase("chrome")){
		driver =new ChromeDriver();
		System.out.println("==Chrome is launched==");
		
	}
	else {
		System.out.println("Invalid browser name");
	}
	wu.maximizeWindow(driver);
	wu.waitForPageLoad(driver);
	driver.get(URL);
}
@AfterClass
public void teardown() {
	//driver.quit();
}
@BeforeMethod
public void bm() throws Throwable {
	
	String UN = pu.readDataFromPropertyfile("un");
	
	String PWD = pu.readDataFromPropertyfile("pwd");
	Loginpage lp=new Loginpage(driver);
	lp.logintoapp(UN, PWD);
	
}
@AfterMethod
public void amconfig(){
	Homepage hp=new Homepage(driver);
	hp.logoutapp(driver);
	System.out.println("==logout from app==");
}

}

