package testCaseScenarios.smoke;

import org.testng.annotations.Test;

import defaultClasses.BaseClass;
import webPages.ShoppingCartPage;

public class TC004_EmptytheCart extends BaseClass{

	@Test(priority=3)
	public void clickEmptyCart() {
	
		ShoppingCartPage app = new ShoppingCartPage(driver);
		
		try {
	        Thread.sleep(2*1000);
	    } catch (InterruptedException e) {
	        e.printStackTrace();
	    }
		
		app.clickShoppingCart();
		
		try {
	        Thread.sleep(2*1000);
	    } catch (InterruptedException e) {
	        e.printStackTrace();
	    }
		
		app.clearEntries();
		
		try {
	        Thread.sleep(2*1000);
	    } catch (InterruptedException e) {
	        e.printStackTrace();
	    }
		
		app.clickQuantities("0", "0", "0", "0", "0", "0");
		
		try {
	        Thread.sleep(2*1000);
	    } catch (InterruptedException e) {
	        e.printStackTrace();
	    }
		
		app.clickRefreshCart();
		
		try {
	        Thread.sleep(5*1000);
	    } catch (InterruptedException e) {
	        e.printStackTrace();
	    }
		
		app.doContinue();
		
		try {
	        Thread.sleep(5*1000);
	    } catch (InterruptedException e) {
	        e.printStackTrace();
	    }
	}	
}
