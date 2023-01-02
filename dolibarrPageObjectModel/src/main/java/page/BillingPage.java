package page;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import model.BillingModel;

public class BillingPage extends BillingModel {

	public BillingPage(WebDriver d) {
		super(d);
		
	}
	public void clickOnBillingManu() {
		WebElement click=getBillingManu();
		click.click();
	}

}
