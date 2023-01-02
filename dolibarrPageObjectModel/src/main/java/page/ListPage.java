package page;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import model.ListModel;

public class ListPage extends ListModel {
	public ListPage(WebDriver d) {
		super(d);
	}
	public void clickOnListMenu() {
		WebElement listMenu=getListMenu();
		listMenu.click();
	}
	public void typeOnSearchBox(String draft) {
		WebElement searchBox=getSearchBox();
		searchBox.sendKeys(draft);
	}
	public void clickOnSearchButton() {
		WebElement searchButton=getSearchButton();
		searchButton.click();
	}
	public void clickOnDraftId() {
		WebElement draft=getDraftId();
		draft.click();
	}

}
