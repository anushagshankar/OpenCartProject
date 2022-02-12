package webPages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import defaultClasses.BasePage;

public class HomePage extends BasePage{

	public HomePage(WebDriver driver) {
		super(driver);
		// TODO Auto-generated constructor stub
	}
	
	@FindBy(xpath="//body/nav[@id='top']/div[1]")
	public WebElement parentcontainer;
	
	@FindBy(xpath="//body/div[1]/nav[1]/div[2]")
	public WebElement storemenu;
	
	@FindBy(xpath="//body/div[@id='common-home']/div[1]/div[1]/div[3]")
	public WebElement commonhome;
	
	@FindBy(id="input-firstname")
	public WebElement firstname;
	
	@FindBy(id="input-lastname")
	public WebElement lastname;
	
	@FindBy(id="input-email")
	public WebElement email;
	
	@FindBy(id="input-telephone")
	public WebElement telephone;
	
	@FindBy(id="input-password")
	public WebElement password;
	
	@FindBy(id="input-confirm")
	public WebElement confirm;
	
	@FindBy(xpath="//body/div[@id='account-register']/div[1]/div[1]/form[1]/div[1]/div[1]/input[1]")
	public WebElement checkbox;
	
	@FindBy(xpath="//body/div[@id='account-register']/div[1]/div[1]/form[1]/div[1]/div[1]/input[2]")
	public WebElement submit;
	
	@FindBy(xpath="//h1[contains(text(),'Your Account Has Been Created!')]")
	public WebElement expected;
	
	@FindBy(xpath="//body/nav[@id='top']/div[1]/div[2]/ul[1]/li[2]/a[1]")
	public WebElement myaccount;
	
	@FindBy(xpath="//a[contains(text(),'Continue')]")
	public WebElement cont;
	
	public void doMyAccount() {
		myaccount.click();
		
	}
	
	@FindBy(xpath="/html[1]/body[1]/nav[1]/div[1]/div[2]/ul[1]/li[2]/ul[1]/li[1]/a[1]")
	public WebElement register;
	
	
	public void doRegister() {
		register.click();
	}
	
	public void doRegisterAccount(String fname, String lname, String mail, String tele, String pwd, String conf) {
		firstname.sendKeys(fname);
		lastname.sendKeys(lname);
		email.sendKeys(mail);
		telephone.sendKeys(tele);
		password.sendKeys(pwd);
		confirm.sendKeys(conf);
		checkbox.click();
		submit.click();		
	}
	
	public void doContinue() {
		cont.click();
	}
}
