package Atcual.vtigerTC;

import org.testng.Assert;
import org.testng.annotations.Test;

import com.vtiger.genericUtilities.Baseclass;
import com.vtiger.objectRepositories.Contactlookuppage;
import com.vtiger.objectRepositories.Contactsheader;
import com.vtiger.objectRepositories.Createcontactpage;
import com.vtiger.objectRepositories.Creatingneworgpage;
import com.vtiger.objectRepositories.Homepage;
import com.vtiger.objectRepositories.Organizationpage;
import com.vtiger.objectRepositories.Orginformationpage;

public class Createcontact extends Baseclass {
	@Test
	public void createcont() {
		Homepage hp=new Homepage(driver);
		hp.clickcon();
		Contactlookuppage cpp=new Contactlookuppage(driver);
		cpp.clickplus();
		Createcontactpage cc=new Createcontactpage(driver);
		cc.sendname("Raju"+ju.Randomclass());
		Contactsheader ch=new Contactsheader(driver);
		String Headn = ch.Getheader();
		Assert.assertTrue(Headn.contains("Raju"));
		System.out.println("Raju is passed");
		
		
	}

}

