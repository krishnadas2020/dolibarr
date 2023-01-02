package test;

import java.io.IOException;

import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import libary.ExcelReader;

public class DraftCreatePageTest extends BaseTest {
	@Test(dataProvider="data")
	public void testDraftCreatePage(String user,String password,String al,String year,String month,String day,String date,String term,
			String method,String bank,String projectName, String inco, String template, String currence,String publ, String priv,String draft)
	{
		getHomePage();
		hp.clickOnCompanyMenuFacturingProduct();
		
		
		getLogInPage();
		lip.typeOnUserIdtextBox(user);
		lip.typeOnPasswordtextBox(password);
		lip.clickOnLoginButton();
		
		getBillingPage();
		bp.clickOnBillingManu();
		
		getNewInvoicePage();
		np.clickOnNewInvoice();
		
		getDraftCreatePage();
		dcp.clickOnThirdParty();
		dcp.typeOnThirdPartyTextBox(al);
		dcp.clickOnThirdPartyOptions();
		
		dcp.clickOnStandardInvoiceButton();
		
		dcp.clickOnDatePickerTrigger();
		dcp.clickOnDatePickerYear(year);
		dcp.clickOnDatePickerMonth(month);
		dcp.clickOnDatePickerDay(day);
		dcp.typeOnInvoiceDateTextBox(date);
		
		dcp.clickOnPaymentTerms();
		dcp.typeOnPaymentTermsTextBox(term);
		dcp.clickOnPaymentTermsOptions();
		
		dcp.clickOnPaymentMethod();
		dcp.typeOnPaymentMethodTextBox(method);
		dcp.clickOnPaymentMethodOptions();
		
     	dcp.clickOnBankAccount();
		dcp.typeOnBankAccountTextBox(bank);
		dcp.clickOnBankAccountTest();
		
		dcp.clickOnProject();
		dcp.typeOnProjectTextBox(projectName);
		dcp.clickOnProjectOptions();
		
		dcp.clickOnSelectCoTerms(inco);
		
		dcp.clickOnDocTemplate();
		dcp.typeOnDocTemplateTextBox(template);
		dcp.clickOnDocTemplateOptions();
		
		dcp.clickOnCurrence();
		dcp.typeOnCurrenceTextBox(currence);
		dcp.clickOnCurrenceTextBoxOptions();
		 
		dcp.typeOnNotePublicTextBox(publ);
		dcp.typeOnNotePrivateTextBox(priv);
		
		//dcp.ClickOnCreateDraft();				
	}
	
	@DataProvider(name="data")
	public Object[][]getData() throws IOException{
		Object [][]ob;
		String path="data/file.xlsx";
		String sheet="dolibar";
		ExcelReader obj = new ExcelReader(path,sheet);
		ob=obj.excelToArray();
		
		return ob;
	}	
}
