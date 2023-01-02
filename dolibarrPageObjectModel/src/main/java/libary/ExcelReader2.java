package libary;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.DataFormatter;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class ExcelReader2 {
	Sheet sh;
	/*so i have created one constructor which has two  String arguments then i create
	 * object for fileInoutStream to read the excel file then i create objects for 
	 * XssfWorkBook to create sheet
	 */
	public ExcelReader2(String filename,String sheetname) throws IOException {
		FileInputStream fis = new FileInputStream(filename);
		Workbook wb = new XSSFWorkbook(fis);
		 sh = wb.getSheet(sheetname);
	}
	public Object[][] excelToArray(){
		Object [][]t;
		int rows = sh.getPhysicalNumberOfRows();
		 int cols= sh.getRow(0).getPhysicalNumberOfCells();
		t = new Object[rows-1][cols];
		for(int r=1; r<rows; r=r+1 ) {
			for(int c=0; c<cols;  c=c+1) {
				t[r-1][c]=getCellData(r,c);
			}
		}		
		return t;		
	}
	
	public String getCellData(int r,int c) {
		Cell cell =sh.getRow(r).getCell(c);
		DataFormatter df= new DataFormatter();
		String cellValue =df.formatCellValue(cell);
		return cellValue;		
	}
}
