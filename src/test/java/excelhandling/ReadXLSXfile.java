package excelhandling;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;

import org.apache.poi.xssf.usermodel.XSSFAnchor;
import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class ReadXLSXfile {

	public static void main(String[] args) throws IOException {

		File f = new File("TestData", "hrm_test_data.xlsx");

		FileInputStream fis = new FileInputStream(f);

		XSSFWorkbook workbook = new XSSFWorkbook(fis);

		
		  XSSFSheet sheet = workbook.getSheet("sheet1");
		 
			/*
			 * XSSFRow row = sheet.getRow(0);
			 * 
			 * XSSFCell cell = row.getCell(0);
			 * 
			 * System.out.println(cell.getStringCellValue());
			 * 
			 * System.out.println(row.getLastCellNum());
			 */

			for (int row = 0; row <= 6; row++) {
				String data = sheet.getRow(row).getCell(1).getStringCellValue();
				System.out.println(data);
			}
	
	
	
             workbook.close();




	}	
}
