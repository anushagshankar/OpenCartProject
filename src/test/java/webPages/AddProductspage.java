package webPages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import defaultClasses.BasePage;

public class AddProductspage extends BasePage{

	public AddProductspage(WebDriver driver) {
		super(driver);
		// TODO Auto-generated constructor stub
	}
	
	@FindBy(xpath="//body/div[1]/nav[1]/div[2]/ul[1]/li[1]/a[1]")
	public WebElement desktops;
	
	@FindBy(xpath="//a[contains(text(),'Mac (1)')]")
	public WebElement mac;
	
	@FindBy(xpath="//body/div[1]/nav[1]/div[2]/ul[1]/li[3]/a[1]")
	public WebElement comps;
	
	@FindBy(xpath="//a[contains(text(),'Monitors (2)')]")
	public WebElement monitors;
	
	@FindBy(xpath="//body/div[1]/nav[1]/div[2]/ul[1]/li[4]/a[1]")
	public WebElement tablets;
	
	@FindBy(xpath="//body/div[1]/nav[1]/div[2]/ul[1]/li[6]/a[1]")
	public WebElement phones;
	
	@FindBy(xpath="//body/div[1]/nav[1]/div[2]/ul[1]/li[7]/a[1]")
	public WebElement cameras;
	
	@FindBy(xpath="//span[contains(text(),'Add to Cart')]")
	public WebElement addtocart;
	
	@FindBy(xpath="//body/div[@id='product-category']/div[1]/div[1]/div[3]/div[2]/div[1]/div[2]/div[2]/button[1]/span[1]")
	public WebElement addmonitor;
	
	@FindBy(xpath="//body/div[@id='product-category']/div[1]/div[1]/div[2]/div[1]/div[1]/div[2]/div[2]/button[1]/span[1]")
	public WebElement addhtc;

	@FindBy(xpath="//body/div[@id='product-category']/div[1]/div[1]/div[2]/div[2]/div[1]/div[2]/div[2]/button[1]/span[1]")
	public WebElement addiphone;
	
	@FindBy(xpath="//body/div[@id='product-category']/div[1]/div[1]/div[2]/div[2]/div[1]/div[2]/div[2]/button[1]/span[1]")
	public WebElement addnikon;
	
	public void clickDesktops() {
		desktops.click();
	}
	
	public void clickMac() {
		mac.click();
	}
	
	public void clickComponents() {
		comps.click();
	}
	
	public void clickMonitors() {
		monitors.click();
	}
	
	public void clickTablets() {
		tablets.click();
	}
	
	public void clickPhones() {
		phones.click();
	}
	
	public void clickCameras() {
		cameras.click();
	}
	
	public void clickAddtoCart() {
		addtocart.click();
	}
	
	public void clickAddMonitor() {
		addmonitor.click();
	}
	
	public void clickAddHTC() {
		addhtc.click();
	}
	
	public void clickAddiPhone() {
		addiphone.click();
	}
	
	public void clickAddNikon() {
		addnikon.click();
	}
	
}
