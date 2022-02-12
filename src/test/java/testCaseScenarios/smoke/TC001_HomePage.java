package testCaseScenarios.smoke;

import org.testng.Assert;
import org.testng.annotations.Test;

import defaultClasses.BaseClass;
import webPages.HomePage;

public class TC001_HomePage extends BaseClass{

	@Test(priority=0)
	public void checkParentContainer() {
	
		HomePage hp = new HomePage(driver);
		
		try {
	        Thread.sleep(2*1000);
	    } catch (InterruptedException e) {
	        e.printStackTrace();
	    }
		
		Assert.assertTrue(hp.parentcontainer.isDisplayed());
		
		try {
	        Thread.sleep(2*1000);
	    } catch (InterruptedException e) {
	        e.printStackTrace();
	    }
		
		Assert.assertTrue(hp.storemenu.isDisplayed());
		
		try {
	        Thread.sleep(2*1000);
	    } catch (InterruptedException e) {
	        e.printStackTrace();
	    }
		
		Assert.assertTrue(hp.commonhome.isDisplayed());
		
		try {
	        Thread.sleep(2*1000);
	    } catch (InterruptedException e) {
	        e.printStackTrace();
	    }
		
	}
	
}
