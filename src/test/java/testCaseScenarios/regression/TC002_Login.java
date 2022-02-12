package testCaseScenarios.regression;

import org.testng.annotations.Test;

import defaultClasses.BaseClass;
import webPages.LoginPage;

public class TC002_Login extends BaseClass{

	@Test(priority=6)
	public void clickLogin() {
	
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
		
		lp.doLogin();
		
		try {
	        Thread.sleep(2*1000);
	    } catch (InterruptedException e) {
	        e.printStackTrace();
	    }
		
		lp.doAccess("remali4314@plexfirm.com","tester");
		
		try {
	        Thread.sleep(2*1000);
	    } catch (InterruptedException e) {
	        e.printStackTrace();
	    }
		
	}
	
}
