package page;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import model.NewInvoiceModel;

public class NewInvoicePage extends NewInvoiceModel {

	public NewInvoicePage(WebDriver d) {
		super(d);
		
	}
	public void clickOnNewInvoice() {
		WebElement click= getNewInvoice();
		click.click();
	}

}
