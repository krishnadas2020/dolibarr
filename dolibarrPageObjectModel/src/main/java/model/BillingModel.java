package model;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class BillingModel extends LogInModel {

	public BillingModel(WebDriver d) {
		super(d);
		
	}
	public WebElement getBillingManu() {
		WebElement bill =driver.findElement(By.xpath("//div[@class='mainmenu billing topmenuimage']"));
		return bill;
		
	}

}
