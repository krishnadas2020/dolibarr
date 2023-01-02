package model;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class NewInvoiceModel  extends BillingModel{

	public NewInvoiceModel(WebDriver d) {
		super(d);
		
	}
	public WebElement getNewInvoice() { // click
		WebElement invoice =driver.findElement(By.xpath("(//a[@title='New invoice'])[1]"));
		return invoice;
		
	}

}
