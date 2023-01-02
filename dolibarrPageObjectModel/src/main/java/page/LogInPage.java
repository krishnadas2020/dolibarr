package page;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import model.LogInModel;

public class LogInPage extends LogInModel{

	public LogInPage(WebDriver d) {
		super(d);
		
	}
	public void typeOnUserIdtextBox(String user) {
		WebElement id =getUserIdtextBox();
		id.clear();
		id.sendKeys(user);
	}
	public void typeOnPasswordtextBox(String password) {
		WebElement pass =getPasswordtextBox();
		pass.clear();
		pass.sendKeys(password);
	}
	public void clickOnLoginButton() {
		WebElement click =getLogin();
		click.click();
		
		
	}
	
}
