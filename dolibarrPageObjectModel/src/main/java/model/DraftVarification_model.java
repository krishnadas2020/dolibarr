package model;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class DraftVarification_model extends BaseModel{

	public DraftVarification_model(WebDriver d) {
		super(d);
	}
	public WebElement getRegCustomer() {
	WebElement regCus=	driver.findElement(By.xpath("//a[@class='classfortooltip refurl']"));
		return regCus;	
	}
	public WebElement getProjectName() {
		 WebElement getPro =driver.findElement(By.xpath("(//a[@class='classfortooltip'])[3]"));
		return getPro;	
	}
	public WebElement getInvoiceDateField() {
		 WebElement invoiceDate =driver.findElement(By.xpath("(//span[@class='valuedate'])[1]"));
		return invoiceDate;	
	}
	
	public WebElement getPaymentDateField() {
		 WebElement paymentData =driver.findElement(By.xpath("//td[text()='30 days']"));
		return paymentData;	
	}
	public WebElement getPaymentDateDueField() {
		 WebElement dueDate =driver.findElement(By.xpath("(//span[@class='valuedate'])[2]"));
		return dueDate;
	}
	public WebElement getPaymentMethod() {
		 WebElement paymentMethod=driver.findElement(By.xpath("//td[text()='Cash']"));
		return paymentMethod;
	}
	public WebElement getCurrenceField() {
		 WebElement currence=driver.findElement(By.xpath("//td[text()='USD - US Dollars']"));
		return currence;
	}
	public WebElement getBankAccountField() {
		 WebElement bankAccount=driver.findElement(By.xpath("(//a[@class='classfortooltip'])[4]"));
		return bankAccount;
	}	
	public WebElement getIncoTermsField() {
		 WebElement incoTerms=driver.findElement(By.xpath("//td[text()='CFR']"));
		return incoTerms;
	}	
	
	
	
	public WebElement getNoteTap() {
		 WebElement noteTap=driver.findElement(By.xpath("//a[@id='note']"));
		return noteTap;
	}
	public WebElement get() {
		 WebElement noteTap=driver.findElement(By.xpath("//a[@id='note']"));
		return noteTap;
	}
	
	
		
		
		
		
		
		
		
		
		
		
		
		
		
	}


