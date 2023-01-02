package model;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class ListModel extends DraftCreateModel {

	public ListModel(WebDriver d) {
		super(d);
		
	}
	public WebElement getListMenu() {
		WebElement list=driver.findElement(By.xpath("//a[@title='List'][1]"));
		return list;	
	}
	public WebElement getSearchBox() {
		WebElement search=driver.findElement(By.xpath("//input[@name='search_ref']"));
		return search;	
	}
	public WebElement getSearchButton() {
		WebElement searchButton=driver.findElement(By.xpath("//span[@class='fa fa-search']"));
		return searchButton;	
	}
	public WebElement getDraftId() {
		WebElement draft_Id=driver.findElement(By.xpath("//a[text()='(PROV846)']"));
		return draft_Id;	
	}
	
	
	
	
	

}
