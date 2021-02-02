package com.Commonutills.file;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class Excel2DArray {
	

	static File Path = new File("C:\\Users\\Chandan\\Git\\ArtifactMaven\\Test Data\\AppData.xlsx");
		
	public static Object[][] getExcelData(String sheetName) throws FileNotFoundException {

		FileInputStream fis = new FileInputStream(Path);
		XSSFWorkbook workbook = null;
		try {
			workbook = new XSSFWorkbook(fis);
		} catch (IOException e) {
		
			e.printStackTrace();
		}
		XSSFSheet sheet = workbook.getSheet(sheetName);
		
		
	//	Object[][] obj=new 	Object[][]; 
		
		Object[][] data=new Object[sheet.getLastRowNum()][sheet.getRow(0).getLastCellNum()];
	
		
		for (int i=0; i<sheet.getLastRowNum();i++) {
			
			System.out.println("Last row number is:"+sheet.getLastRowNum());
			
				for (int k=0; k<sheet.getRow(0).getLastCellNum();k++) {
				
				data[i][k]=sheet.getRow(i+1).getCell(k).toString();
				
				System.out.println("Excel Data is:"+data[i][k]);
			}
		}
		
		
	     return data;

	}

}
