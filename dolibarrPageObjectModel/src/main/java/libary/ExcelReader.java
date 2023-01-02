package libary;

import java.io.FileInputStream;
import java.io.IOException;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class ExcelReader {
	Sheet sh;

	public ExcelReader(String filename, String sheetname) throws IOException {

		FileInputStream obj = new FileInputStream(filename);
		Workbook wb = new XSSFWorkbook(obj);
		 sh = wb.getSheet(sheetname);	
}
	
	public Object[][] excelToArray() {
		Object[][] t;// declare
		int totalRows = sh.getPhysicalNumberOfRows();
		int totalcols = sh.getRow(0).getPhysicalNumberOfCells();
		t = new Object[totalRows - 1][totalcols];  //initialization 

		for (int row = 1; row < totalRows; row++) {
			for (int col = 0; col < totalcols; col++) {
				Cell c = sh.getRow(row).getCell(col);

				String value = "";
				if (c.getCellType() == Cell.CELL_TYPE_STRING) { 
					value = c.getStringCellValue();
				}
				else {
					if (c.getNumericCellValue() % 1 == 0) {
						value = "" + (int) c.getNumericCellValue();
					} else {
						value = "" + c.getNumericCellValue();
					}
				}

				t[row - 1][col] = value;// after the loop then converting happen
			}

		}
		return t;
	}

}
