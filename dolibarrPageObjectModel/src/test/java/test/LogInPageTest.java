package test;

import org.testng.annotations.Test;
import java.io.IOException;

import org.testng.annotations.DataProvider;


import libary.ExcelReader;

public class LogInPageTest extends BaseTest {
	@Test(dataProvider ="excel")
	public void testLogInPage(String user,String password) {
		getLogInPage();
		lip.typeOnUserIdtextBox(user);
		lip.typeOnPasswordtextBox(password);
		lip.clickOnLoginButton();
		//lip.clickOnLoginButton();
		
	}
	
	
	@DataProvider(name="excel")
	public Object[][]getData() throws IOException{
		Object[][]obj;
		String path = "data/file.xlsx";
		String sheet="Sheet2";
		ExcelReader ed = new ExcelReader(path,sheet);
		obj=ed.excelToArray();
		
		
		return obj;
		
	}
	
	
	

}
