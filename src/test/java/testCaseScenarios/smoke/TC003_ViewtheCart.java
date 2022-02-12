package testCaseScenarios.smoke;

import org.testng.annotations.Test;

import defaultClasses.BaseClass;
import webPages.ShoppingCartPage;

public class TC003_ViewtheCart extends BaseClass{

	@Test(priority=2)
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
