package com.Commonutills.file;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class Excel1DArray {

	static File Path = new File("C:\\Users\\Chandan\\git\\repository\\ArtifactMaven\\Test Data\\AppData.xlsx");

	public static void main(String[] args) throws IOException {

		FileInputStream fis = new FileInputStream(Path);
		XSSFWorkbook wb = new XSSFWorkbook(fis);
		XSSFSheet sheet = wb.getSheet("Login");
		Row row = sheet.getRow(1);
		Cell cellnum = row.getCell(3);

		for (int i = 0; i < row.getLastCellNum(); i++) {
			
			System.out.println("Last row number is:"+sheet.getLastRowNum());

			String testdata = sheet.getRow(i+1).getCell(3).getStringCellValue();
			
			System.out.println("Cell Data is:" + testdata);
		}
		wb.close();
	}


	
}
