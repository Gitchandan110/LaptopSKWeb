package com.Commonutills.file;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

import org.apache.poi.ss.usermodel.CellType;
import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class ExcelCompare {

	static File PathAppData = new File("C:\\Users\\Chandan\\Git\\ArtifactMaven\\Test Data\\AppData.xlsx");
	static File PathDBData = new File("C:\\Users\\Chandan\\Git\\ArtifactMaven\\Test Data\\DBData.xlsx");

	public static void compareTwoSheet(String sheetname) throws IOException {

		FileInputStream fisAppData = new FileInputStream(PathAppData);
		XSSFWorkbook workbookAppData = new XSSFWorkbook(fisAppData);
		XSSFSheet sheetAppData = workbookAppData.getSheet(sheetname);
		int rowCountAppsheet = sheetAppData.getPhysicalNumberOfRows();
		System.out.println("rowCountAppsheet :" + rowCountAppsheet);

		FileInputStream fisDBData = new FileInputStream(PathDBData);
		XSSFWorkbook workbookDBData = new XSSFWorkbook(fisDBData);
		XSSFSheet sheetDBData = workbookDBData.getSheet(sheetname);
		int rowCountDBSheet = sheetDBData.getPhysicalNumberOfRows();
		System.out.println("rowCountDBSheet :" + rowCountDBSheet);

	/*//	for (int irow = 0; irow < rowCountDBSheet; irow++) {
		int cellCountAppsheet0 = sheetAppData.getRow(0).getLastCellNum();
		int cellCountAppsheet1 = sheetAppData.getRow(20).getLastCellNum();
		//int cellCountAppsheet2 = sheetAppData.getRow(21).getLastCellNum();
*/		int irow=0;
		while (rowCountDBSheet > irow) {
		
			int rowcount=irow+1;
			System.out.println("Current Row is : "+ rowcount);
			
			XSSFRow rowAppsheet = sheetAppData.getRow(irow);
			XSSFRow rowDBsheet = sheetDBData.getRow(irow);
			
			int cellCountAppsheet = sheetAppData.getRow(irow).getLastCellNum();
			System.out.println("cellCountAppsheet at index " + irow + " is " + cellCountAppsheet);
			
			int cellCountDBsheet = sheetDBData.getRow(irow).getLastCellNum();
			System.out.println("cellCountDBsheet at index " + irow + " is " + cellCountDBsheet);

			for (int icell = 0; icell <= cellCountAppsheet; icell++) {
				String cellAppsheetValue;
				XSSFCell cellAppsheet = rowAppsheet.getCell(icell);
				if (cellAppsheet != null) {
					cellAppsheet.setCellType(CellType.STRING);
					cellAppsheetValue = cellAppsheet.getStringCellValue().trim();
					System.out.println("cellAppsheetValue at index: " + icell + " " + cellAppsheetValue);

				}

			}

			for (int icell = 0; icell <= cellCountDBsheet; icell++) {

				String cellDBsheetValue;
				XSSFCell cellDBsheet = rowDBsheet.getCell(icell);
				if (cellDBsheet != null) {
					cellDBsheet.setCellType(CellType.STRING);
					cellDBsheetValue = cellDBsheet.getStringCellValue().trim();
					System.out.println("cellDBsheetValue at index: " + icell + " " + cellDBsheetValue);

				}

			} irow++;
		} 

	}

}
