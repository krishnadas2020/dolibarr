package test;

import java.io.IOException;

import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import libary.ExcelReader;

public class ListPageTest extends BaseTest {
	@Test(dataProvider="dp")
	public void TestListPage(String user,String password,String al,String year,String month,String day,String date,String term,
			String method,String bank,String projectName, String inco, String template, String currence,String publ, String priv,String draft) {
		getHomePage();
		hp.clickOnCompanyMenuFacturingProduct();
		
		getLogInPage();
		lip.typeOnUserIdtextBox(user);
		lip.typeOnPasswordtextBox(password);
		lip.clickOnLoginButton();
		
		getBillingPage();
		bp.clickOnBillingManu(); 
		
		getListPage();
		lp.clickOnListMenu();
		lp.typeOnSearchBox(draft);
		lp.clickOnSearchButton();
		
		lp.clickOnDraftId();		
	}
	
	@DataProvider(name="dp")
	public Object[][]getDataFromExcel() throws IOException{
		Object [][]ob;
		String path="data/file.xlsx";
		String sheet="dolibar";
		ExcelReader ed = new ExcelReader(path,sheet);
		ob=ed.excelToArray();	
		
		return ob;
	}
}
