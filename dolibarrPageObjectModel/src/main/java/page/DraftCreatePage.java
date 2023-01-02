package page;


import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;

import model.DraftCreateModel;

public class DraftCreatePage extends DraftCreateModel {

	public DraftCreatePage(WebDriver d) {
		super(d);
		
	}
	public void clickOnThirdParty() {
		WebElement thirdParty=getThirdParty();
		thirdParty.click();
	}
	public void typeOnThirdPartyTextBox(String al) {
		WebElement thirdParty=getThirdPartyTextBox();
		thirdParty.sendKeys(al);
	}
	public void clickOnThirdPartyOptions() {
		WebElement thirdPartyOption=getThirdPartyOptions();
		thirdPartyOption.click();
	}
	
	
	
	public void clickOnStandardInvoiceButton() {
		WebElement button= getStandardInvoiceButton();
		button.click();
	}
	
	public void clickOnDatePickerTrigger() {
		WebElement dataPicker= getDatePickerTrigger();
		dataPicker.click();
	}
	public void clickOnDatePickerYear(String y) {
		WebElement year= getDatePickerYear();
		Select sel= new Select(year);
		sel.selectByVisibleText(y);		
	}
	public void clickOnDatePickerMonth(String m) {
		WebElement month= getDatePickerMonth();
		Select sel= new Select(month);
		sel.selectByVisibleText(m);		
	}
	public void clickOnDatePickerDay(String d) {
		WebElement day= getDates(d);
		day.click();		
		
		
	}
	public void typeOnInvoiceDateTextBox(String date) {
		WebElement getDate =getInvoiceDateTextBox();
		getDate.sendKeys(date);
	}
	public void clickOnPaymentTerms() { //click
		WebElement term =getPaymentTerms();
		term.click();	
	}
	public void typeOnPaymentTermsTextBox(String t) {// sendkeys
		WebElement getTextBox =getPaymentTermsTextBox();
		getTextBox.sendKeys(t);
	}
	public void clickOnPaymentTermsOptions() {//click
		WebElement getOption =getPaymentTermsOptions();
		getOption.click();
	}
	
	
	public void clickOnPaymentMethod() {  //click
		WebElement paymentMethod =getPaymentMethod();
		paymentMethod.click();
	}
	public void typeOnPaymentMethodTextBox(String tb) {  //sendkeys
		WebElement methodTextBox =getPaymentMethodTextBox();
		methodTextBox.sendKeys(tb);
	}
	public void clickOnPaymentMethodOptions() {  //click
		WebElement methodTextBoxOption =getPaymentMethodOptions();
		methodTextBoxOption.click();
		
		
	}
	public void clickOnBankAccount() {  //click
		WebElement bank =getBankAccount();
		bank.click();
	}
	public void typeOnBankAccountTextBox(String b) {  //sendkeys
		WebElement bankTextBox =getBankAccountTextBox();
		bankTextBox.sendKeys(b);
	}
	public void clickOnBankAccountTest() {  //click
		WebElement bankAccount =getBankAccountTest();
		bankAccount.click();
	}
	
	
	public void clickOnProject() {  //click
		WebElement project =getProject();
		project.click();
	}
	public void typeOnProjectTextBox(String p) {  //click
		WebElement projectTextBox =getProjectTextBox();
		projectTextBox.sendKeys(p);
	}
	public void clickOnProjectOptions() {  //click
		WebElement ProjectOption =getProjectOptions();
		ProjectOption.click();
	}
	
	public void clickOnSelectCoTerms(String ct) {  //click
		WebElement coTerm =getSelectCoTerms();
		Select select = new Select(coTerm);
		select.selectByVisibleText(ct);		
	}
	
	public void clickOnDocTemplate() {  //click
		WebElement docTemplate =getDocTemplate();
		docTemplate.click();
	}
	public void typeOnDocTemplateTextBox(String tt) {  //sendkeys
		WebElement docTemplateBox =getDocTemplateTextBox();
		docTemplateBox.sendKeys(tt);
	}
	public void clickOnDocTemplateOptions() {  //click
		WebElement docTemplateOption =getDocTemplateOptions();
		docTemplateOption.click();
	}
	public void clickOnCurrence() {  //click
		WebElement currenec =getCurrence();
		currenec.click();
	}
	public void typeOnCurrenceTextBox(String c) {  //sendkeys
		WebElement currenecTextBox =getCurrenceTextBox();
		currenecTextBox.sendKeys(c);
	}
	public void clickOnCurrenceTextBoxOptions() {  //click
		WebElement currenecTextBoxOption =getCurrenceTextBoxOptions();
		currenecTextBoxOption.click();
	}
	
	public void typeOnNotePublicTextBox(String p) {  //click
		WebElement publicTextBox =getNotePublicTextBox();
		publicTextBox.sendKeys(p);
	}
	public void typeOnNotePrivateTextBox(String pp) {  //click
		WebElement publicTextBox =getNotePrivateTextBox();
		publicTextBox.sendKeys(pp);
	}
	
	public void ClickOnCreateDraft() {
		WebElement createDraft=getCreateDraft();
		createDraft.click();
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
}

