package webPages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import defaultClasses.BasePage;

public class ReturnsPage extends BasePage{

	public ReturnsPage(WebDriver driver) {
		super(driver);
		// TODO Auto-generated constructor stub
	}
	
	@FindBy(xpath="//body/footer[1]/div[1]/div[1]/div[2]/ul[1]/li[2]/a[1]")
	public WebElement returns;
	
	public void clickReturnsLink() {
		returns.click();
	}
	
	@FindBy(xpath="//input[@id='input-firstname']")
	public WebElement firstname;
	
	@FindBy(xpath="//input[@id='input-lastname']")
	public WebElement lastname;
	
	@FindBy(xpath="//input[@id='input-email']")
	public WebElement email;
	
	@FindBy(xpath="//input[@id='input-telephone']")
	public WebElement telephone;
	
	@FindBy(xpath="//input[@id='input-order-id']")
	public WebElement orderid;
	
	@FindBy(xpath="//input[@id='input-date-ordered']")
	public WebElement orderdate;
	
	@FindBy(xpath="//input[@id='input-product']")
	public WebElement product;
	
	@FindBy(xpath="//input[@id='input-model']")
	public WebElement model;
	
	@FindBy(xpath="//input[@id='input-quantity']")
	public WebElement quantity;
	
	@FindBy(xpath="//body/div[@id='account-return']/div[1]/div[1]/form[1]/fieldset[2]/div[4]/div[1]/div[5]/label[1]/input[1]")
	public WebElement reason;
	
	@FindBy(xpath="//textarea[@id='input-comment']")
	public WebElement comments;
	
	@FindBy(xpath="//a[contains(text(),'Continue')]")
	public WebElement cont;
	
	@FindBy(xpath="//body/div[@id='account-return']/div[1]/div[1]/form[1]/div[1]/div[2]/input[1]")
	public WebElement submit;
	
	public void clearEntries() {
		firstname.clear();
		lastname.clear();
		email.clear();
		telephone.clear();
		orderid.clear();
		orderdate.clear();
		product.clear();
		model.clear();
		quantity.clear();
		comments.clear();
	}
	
	public void clickReturnsDetails(String fname, String lname, String mail, String tele, String id, String date, String prod, String code, String quant, String com) {
		firstname.sendKeys(fname);
		lastname.sendKeys(lname);
		email.sendKeys(mail);
		telephone.sendKeys(tele);
		orderid.sendKeys(id);
		orderdate.sendKeys(date);
		product.sendKeys(prod);
		model.sendKeys(code);
		quantity.sendKeys(quant);
		comments.sendKeys(com);
	}
	
	public void clickReason() {
		reason.click();
	}
	
	public void doSubmit() {
		submit.click();
	}
	
	public void doContinue() {
		cont.click();
	}
	
}
