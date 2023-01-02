package model;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class HomeModel extends BaseModel {

	public HomeModel(WebDriver d) {
		super(d);
		
	}
	public WebElement getCompanyMenuFacturingProduct() {
		WebElement element =driver.findElement(By.xpath("(//div[@style='padding: 10px;'])[2]"));
		
		return element;
		
	}

}
