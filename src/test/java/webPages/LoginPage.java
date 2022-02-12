package webPages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import defaultClasses.BasePage;

public class LoginPage extends BasePage{

	public LoginPage(WebDriver driver) {
		super(driver);
		// TODO Auto-generated constructor stub
	}
	
	@FindBy(id="input-email")
	public WebElement emailaddress;
	
	@FindBy(id="input-password")
	public WebElement password;
	
	@FindBy(xpath="//a[contains(text(),'Continue')]")
	public WebElement cont;
	
	@FindBy(xpath="//body/div[@id='account-login']/div[1]/div[1]/div[1]/div[2]/div[1]/form[1]/input[1]")
	public WebElement clicklogin;
	
	@FindBy(xpath="//body/nav[@id='top']/div[1]/div[2]/ul[1]/li[2]/a[1]")
	public WebElement myaccount;
	
	public void doMyAccount() {
		myaccount.click();
	}
	
	@FindBy(xpath="//body/nav[@id='top']/div[1]/div[2]/ul[1]/li[2]/ul[1]/li[5]/a[1]")
	public WebElement logout;
	
	public void doLogout() {
		logout.click();
	}
	
	@FindBy(xpath="//a[contains(text(),'Login')]")
	public WebElement login;
	
	public void doLogin() {
		login.click();
	}
	
	public void doCont() {
		cont.click();
	}
	
	public void doAccess(String email, String pwd) {
		emailaddress.sendKeys(email);
		password.sendKeys(pwd);
		clicklogin.click();
	}
	
}
