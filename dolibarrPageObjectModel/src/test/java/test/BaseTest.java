package test;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeSuite;

import page.BillingPage;
import page.DraftCreatePage;
import page.HomePage;
import page.ListPage;
import page.LogInPage;
import page.NewInvoicePage;

public class BaseTest {
	static WebDriver driver;
	static HomePage hp;
	static LogInPage lip;
	static BillingPage bp;
	static NewInvoicePage np;
	static DraftCreatePage dcp;
	static ListPage lp;
	
	@BeforeSuite
	public void setUp() {
	
	System.setProperty("webdriver.chrome.driver", "/Users/krishnadas/downloads/chromedriver");
	driver = new ChromeDriver();
	driver.get("https://demo.dolibarr.org");
	driver.manage().window().maximize();
	driver.manage().timeouts().implicitlyWait(15,TimeUnit.SECONDS);

}
	public void getHomePage() {
		hp = new HomePage(driver);
	}
	public void getLogInPage() {
		lip= new LogInPage(driver);
	
	}
	public void getBillingPage() {
		bp= new BillingPage(driver);
	}
	public void getNewInvoicePage() {
		np= new NewInvoicePage(driver);
	}
	
	public void getDraftCreatePage() {
		dcp= new DraftCreatePage(driver);
	}
	public void getListPage() {
		lp = new ListPage(driver);
		
	}
	
	
	
}