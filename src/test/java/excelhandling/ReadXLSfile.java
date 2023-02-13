package excelhandling;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;

import org.apache.poi.hssf.usermodel.HSSFSheet;
import org.apache.poi.hssf.usermodel.HSSFWorkbook;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.testng.annotations.Test;

public class ReadXLSfile {
@Test
	public void ReadXLSXfile() throws IOException {
		// TODO Auto-generated method stub
		File f = new File("TestData", "hrm_test_data.xlsx");

		FileInputStream fis = new FileInputStream(f);

		HSSFWorkbook workbook = new HSSFWorkbook(fis);

		
		  HSSFSheet sheet = workbook.getSheet("sheet1");
	}

}
