package Atcual.vtigerTC;

import org.testng.Assert;
import org.testng.annotations.Test;

import com.vtiger.genericUtilities.Baseclass;
import com.vtiger.objectRepositories.Creatingneworgpage;
import com.vtiger.objectRepositories.Homepage;
import com.vtiger.objectRepositories.Organizationpage;
import com.vtiger.objectRepositories.Orginformationpage;

public class Createneworganizations extends Baseclass{
	@Test
	public void creatorg() {
		Homepage hp=new Homepage(driver);
		hp.clickorg();
		Organizationpage op=new Organizationpage(driver);
		op.clickimglnk();
		Creatingneworgpage cp=new Creatingneworgpage(driver);
		cp.sendorgname("TCS"+ju.Randomclass());
		Orginformationpage oop=new Orginformationpage(driver);
		String Head = oop.gethead();
		Assert.assertTrue(Head.contains("TCS"));
		System.out.println("organization is passed");
	}

}
