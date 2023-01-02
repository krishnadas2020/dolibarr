package model;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class DraftCreateModel extends NewInvoiceModel{

	public DraftCreateModel(WebDriver d) {
		super(d);
		// TODO Auto-generated constructor stub
	}
 public WebElement getThirdParty() { //click
	WebElement thirdParty = driver.findElement(By.xpath("//span[@class='placeholder']"));
	return thirdParty;	 
 }
 public WebElement getThirdPartyTextBox() { //sendkeys
		WebElement element = driver.findElement(By.xpath("//input[@class='select2-search__field']"));
		return element;	 
	 }
 
 public WebElement getThirdPartyOptions() { // click
		WebElement option = driver.findElement(By.xpath("//li[@role='option']"));// completed
		return option;	 
	 }
 public WebElement getStandardInvoiceButton() { //sendkeys
		WebElement radio = driver.findElement(By.xpath("//input[@id='radio_standard']"));
		return radio;	 
	 }
 public WebElement getDatePickerTrigger() { //click
	WebElement datePicker = driver.findElement(By.xpath("//img[@class='ui-datepicker-trigger']"));
	return datePicker;	 
 }
 public WebElement getDatePickerYear() { //click
	WebElement year = driver.findElement(By.xpath("//select[@class='ui-datepicker-year']"));
	
	return year;	 
 }
 
 public WebElement getDatePickerMonth() { //click
	WebElement month = driver.findElement(By.xpath("//select[@class='ui-datepicker-month']"));
	return month;	 
 }
 public WebElement getDates(String d) {//click
	 String datePath="//a[text()='"+d+"']";
		WebElement day = driver.findElement(By.xpath(datePath));
		return day;	 
	 }
 
 
 
 public WebElement getInvoiceDateTextBox() { //sendkeys
		WebElement date = driver.findElement(By.xpath("//input[@id='re']"));
		return date;	 
	 }
 
 public WebElement getPaymentTerms() { //click
		WebElement payment = driver.findElement(By.xpath("//span[@id='select2-cond_reglement_id-container']"));
		return payment;	 
	 }
 public WebElement getPaymentTermsTextBox() { //sendkeys
		WebElement textBox = driver.findElement(By.xpath("//input[@class='select2-search__field']"));
		return textBox;	 
	 }
 public WebElement getPaymentTermsOptions() { //click
		WebElement getOption = driver.findElement(By.xpath("//li[text()='30 days']"));
		return getOption;	 
		
		
	 }
 public WebElement getPaymentMethod() { //click
		WebElement mathod= driver.findElement(By.xpath("//span[@id='select2-selectmode_reglement_id-container']"));
		return mathod;	 
	 }
 public WebElement getPaymentMethodTextBox() { //sendkeys
		WebElement mathodTextBx= driver.findElement(By.xpath("//input[@class='select2-search__field']"));
		return mathodTextBx;	 
	 }
 public WebElement getPaymentMethodOptions() { //click
		WebElement paymentOption= driver.findElement(By.xpath("//li[@role='option']"));
		return paymentOption;	 
	 }
 
 public WebElement getBankAccount() { //click
		WebElement bank= driver.findElement(By.xpath("//span[@id='select2-selectfk_account-container']"));
		return bank;	 
	 }
 public WebElement getBankAccountTextBox() { //sendkeys
		WebElement accountTextBox= driver.findElement(By.xpath("//input[@class='select2-search__field']"));
		return accountTextBox;	 
	 }
 public WebElement getBankAccountTest() { //click
		WebElement accountOption= driver.findElement(By.xpath("//li[text()='Cash']"));
		return accountOption;	 
	 }
 public WebElement getProject (){ //click
		WebElement project= driver.findElement(By.xpath("//span[@id='select2-projectid-container'] "));
		return project;	 
	 }
 public WebElement getProjectTextBox (){ //sendkeys
		WebElement projectTextBox= driver.findElement(By.xpath("//input[@class='select2-search__field']"));
		return projectTextBox;	 
	 }
 public WebElement getProjectOptions (){ //click
		WebElement projectOption= driver.findElement(By.xpath("//li[text()='22-P-00045-002, test']"));
		return projectOption;	 
	 }
 public WebElement getSelectCoTerms() { //select
	 WebElement selectCoTerms= driver.findElement(By.xpath("//select[@id='incoterm_id']"));
	return selectCoTerms;	 
 }
 public WebElement getDocTemplate() {    //click
	 WebElement getTemplate= driver.findElement(By.xpath("//span[@id=\"select2-model-container\"]"));
	return getTemplate;
 
 }
 public WebElement getDocTemplateTextBox() {// sendkeys
	 WebElement getTemplateBox= driver.findElement(By.xpath("//input[@class='select2-search__field']"));
	return getTemplateBox;
 }
 public WebElement getDocTemplateOptions (){// sendkeys
	 WebElement TemplateOption= driver.findElement(By.xpath("//li[text()='crabe']"));
	return TemplateOption;
 }
 
 public WebElement getCurrence (){// click
	 WebElement currence= driver.findElement(By.xpath("//span[@id='select2-multicurrency_code-container']"));
	return currence;
 }
 public WebElement getCurrenceTextBox (){// sendkeys
	 WebElement currenceBox= driver.findElement(By.xpath("//input[@class='select2-search__field']"));
	return currenceBox;
 }
 
 public WebElement getCurrenceTextBoxOptions (){// sendkeys
	 WebElement currenceBoxOption= driver.findElement(By.xpath("//li[text()='US Dollars ($)']"));
	return currenceBoxOption;
 }
 

 public WebElement getNotePublicTextBox(){// sendkeys
	 WebElement publicTextBox= driver.findElement(By.xpath("//textarea[@id='note_public']"));
	return publicTextBox;
 }
 public WebElement getNotePrivateTextBox(){// sendkeys
	 WebElement privateTextBox= driver.findElement(By.xpath("//textarea[@id='note_private']"));
	return privateTextBox;
 }
 
 public WebElement getCreateDraft(){// sendkeys
	 WebElement createDraft= driver.findElement(By.xpath("//input[@name='save']"));
	return createDraft;
 }
 
 
 
 
 
 
 
 
 
 
 
 
 
 
 
 
 
 
 
 
 
 
 
}
