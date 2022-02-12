package webPages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import defaultClasses.BasePage;

public class ShoppingCartPage extends BasePage{

	public ShoppingCartPage(WebDriver driver) {
		super(driver);
		// TODO Auto-generated constructor stub
	}
	
	@FindBy(xpath="//span[contains(text(),'Shopping Cart')]")
	public WebElement shoppingcart;
	
	@FindBy(xpath="//tbody/tr[1]/td[4]/div[1]/input[1]")
	public WebElement quantity1;
	
	@FindBy(xpath="//tbody/tr[2]/td[4]/div[1]/input[1]")
	public WebElement quantity2;
	
	@FindBy(xpath="//tbody/tr[3]/td[4]/div[1]/input[1]")
	public WebElement quantity3;
	
	@FindBy(xpath="//tbody/tr[4]/td[4]/div[1]/input[1]")
	public WebElement quantity4;
	
	@FindBy(xpath="//tbody/tr[5]/td[4]/div[1]/input[1]")
	public WebElement quantity5;
	
	@FindBy(xpath="//tbody/tr[6]/td[4]/div[1]/input[1]")
	public WebElement quantity6;
	
	@FindBy(xpath="//a[contains(text(),'Continue')]")
	public WebElement cont;
	
	@FindBy(xpath="//a[contains(text(),'Contact Us')]")
	public WebElement contactus;
	
	@FindBy(xpath="//input[@id='input-name']")
	public WebElement name;
	
	@FindBy(xpath="//input[@id='input-email']")
	public WebElement email;
	
	@FindBy(xpath="//textarea[@id='input-enquiry']")
	public WebElement enquiry;
	
	@FindBy(xpath="//body/div[@id='information-contact']/div[1]/div[1]/form[1]/div[1]/div[1]/input[1]")
	public WebElement submit;
	
	public void clickShoppingCart() {
		shoppingcart.click();
	}
	
	@FindBy(xpath="//tbody/tr[1]/td[4]/div[1]/span[1]/button[1]")
	public WebElement refreshcart;
	
	public void clickRefreshCart() {
		refreshcart.click();
	}
	
	public void clearEntries() {
		quantity1.clear();
		quantity2.clear();
		quantity3.clear();
		quantity4.clear();
		quantity5.clear();
		quantity6.clear();
	}
	
	public void clickQuantities(String num1, String num2, String num3, String num4, String num5, String num6) {
		quantity1.sendKeys(num1);
		quantity2.sendKeys(num2);
		quantity3.sendKeys(num3);
		quantity4.sendKeys(num4);
		quantity5.sendKeys(num5);
		quantity6.sendKeys(num6);
	}
	
	public void doContinue() {
		cont.click();
	}
	
	public void doContactUs() {
		contactus.click();
	}
	
	public void clearContactus() {
		name.clear();
		email.clear();
		enquiry.clear();
	}
	
	public void contactUsDetails(String yourname, String youremail, String yourenquiry) {
		name.sendKeys(yourname);
		email.sendKeys(youremail);
		enquiry.sendKeys(yourenquiry);
	}
	
	public void doContactForm() {
		submit.click();
	}
}
