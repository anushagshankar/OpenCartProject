package testCaseScenarios.regression;

import org.testng.Assert;
import org.testng.annotations.Test;

import defaultClasses.BaseClass;
import webPages.HomePage;
public class TC001_Register extends BaseClass{

	@Test(priority=4)
	public void clickRegister() {
	
		HomePage hp = new HomePage(driver);
		
		try {
	        Thread.sleep(2*1000);
	    } catch (InterruptedException e) {
	        e.printStackTrace();
	    }
		
		hp.doMyAccount();
		
		try {
	        Thread.sleep(2*1000);
	    } catch (InterruptedException e) {
	        e.printStackTrace();
	    }
		
		hp.doRegister();
		
		try {
	        Thread.sleep(2*1000);
	    } catch (InterruptedException e) {
	        e.printStackTrace();
	    }
		
		hp.doRegisterAccount("Adams","Burkley","remali4314@plexfirm.com","9999999999","tester","tester");
		
		try {
	        Thread.sleep(2*1000);
	    } catch (InterruptedException e) {
	        e.printStackTrace();
	    }
		
		String actual = hp.expected.getText();
		String expected = "Your Account Has Been Created!";
		
		Assert.assertEquals(actual, expected);
		
		hp.doContinue();
		
		try {
	        Thread.sleep(2*1000);
	    } catch (InterruptedException e) {
	        e.printStackTrace();
	    }
	}
}
