package testCaseScenarios.regression;

import org.testng.annotations.Test;

import defaultClasses.BaseClass;
import webPages.ShoppingCartPage;

public class TC004_ViewCart extends BaseClass{

	@Test(priority=8)
	public void clickShoppingCart() {
	
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
	}	
}
