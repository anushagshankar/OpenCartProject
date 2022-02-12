package testCaseScenarios.regression;

import org.testng.annotations.Test;

import defaultClasses.BaseClass;
import webPages.LoginPage;

public class TC009_Logout extends BaseClass{

	@Test(priority=5)
	public void clickLogout() {
	
		LoginPage lp = new LoginPage(driver);
		
		try {
	        Thread.sleep(2*1000);
	    } catch (InterruptedException e) {
	        e.printStackTrace();
	    }
		
		lp.doMyAccount();
		
		try {
	        Thread.sleep(2*1000);
	    } catch (InterruptedException e) {
	        e.printStackTrace();
	    }
		
		lp.doLogout();
		
		try {
	        Thread.sleep(2*1000);
	    } catch (InterruptedException e) {
	        e.printStackTrace();
	    }
		
		lp.doCont();
		
		try {
	        Thread.sleep(2*1000);
	    } catch (InterruptedException e) {
	        e.printStackTrace();
	    }
		
	}
	
}
