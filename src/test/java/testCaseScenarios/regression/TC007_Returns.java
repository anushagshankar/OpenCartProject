package testCaseScenarios.regression;

import org.testng.annotations.Test;

import defaultClasses.BaseClass;
import webPages.ReturnsPage;

public class TC007_Returns extends BaseClass{

	@Test(priority=11)
	public void clickReturns() {
	
		ReturnsPage returnproduct = new ReturnsPage(driver);
		
		returnproduct.clickReturnsLink();
		
		try {
	        Thread.sleep(2*1000);
	    } catch (InterruptedException e) {
	        e.printStackTrace();
	    }
		
		returnproduct.clearEntries();
		
		try {
	        Thread.sleep(2*1000);
	    } catch (InterruptedException e) {
	        e.printStackTrace();
	    }
		
		returnproduct.clickReturnsDetails("tester","trust","tester_trust@gmail.com","8763452343","777","2022-01-01","Monitor","007","1","Received wrong product hence returning the product");
		returnproduct.clickReason();
		
		try {
	        Thread.sleep(2*1000);
	    } catch (InterruptedException e) {
	        e.printStackTrace();
	    }
		
		returnproduct.doSubmit();
		
		try {
	        Thread.sleep(2*1000);
	    } catch (InterruptedException e) {
	        e.printStackTrace();
	    }
		
		returnproduct.doContinue();
		
		try {
	        Thread.sleep(5*1000);
	    } catch (InterruptedException e) {
	        e.printStackTrace();
	    }
	}
}
