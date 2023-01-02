package model;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class LogInModel extends HomeModel {

	public LogInModel(WebDriver d) {
		super(d);
		
	}
public WebElement getUserIdtextBox() {
	WebElement id=driver.findElement(By.xpath("//input[@name='username']"));
	return id;	
}
public WebElement getPasswordtextBox() {
	WebElement pass=driver.findElement(By.xpath("//input[@id='password']"));
	return pass;	
}
public WebElement getLogin() {
	WebElement log=driver.findElement(By.xpath("//input[@type='submit']"));
	return log;	
}


	
	
}
