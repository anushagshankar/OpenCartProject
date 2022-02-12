package testCaseScenarios.regression;

import org.testng.annotations.Test;

import defaultClasses.BaseClass;
import webPages.ShoppingCartPage;

public class TC006_ContactUs extends BaseClass{

	@Test(priority=10)
	public void clickContactUs() {
	
		ShoppingCartPage app = new ShoppingCartPage(driver);
		
		try {
	        Thread.sleep(2*1000);
	    } catch (InterruptedException e) {
	        e.printStackTrace();
	    }
		
		app.doContactUs();
		
		try {
	        Thread.sleep(2*1000);
	    } catch (InterruptedException e) {
	        e.printStackTrace();
	    }
		
		app.clearContactus();
		
		try {
	        Thread.sleep(2*1000);
	    } catch (InterruptedException e) {
	        e.printStackTrace();
	    }
		
		app.contactUsDetails("test person", "testperson@gmail.com", "This is a test case by a test person");
		
		try {
	        Thread.sleep(2*1000);
	    } catch (InterruptedException e) {
	        e.printStackTrace();
	    }
		
		app.doContactForm();
		
		try {
	        Thread.sleep(2*1000);
	    } catch (InterruptedException e) {
	        e.printStackTrace();
	    }
		
		app.doContinue();
		
		try {
	        Thread.sleep(2*1000);
	    } catch (InterruptedException e) {
	        e.printStackTrace();
	    }
	}
}
