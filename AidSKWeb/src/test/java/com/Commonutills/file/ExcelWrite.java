package com.Commonutills.file;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

import org.apache.poi.hssf.usermodel.HSSFCellStyle;
import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.xssf.usermodel.XSSFCellStyle;
import org.apache.poi.xssf.usermodel.XSSFFont;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class ExcelWrite {

	static File PathInputData = new File(".\\Test Data\\InputData.xlsx");
	static File PathOutputData = new File(".\\Test Data\\OutputData.xlsx");
	static File PathSanitySheet = new File(".\\Test Data\\SanityWebSheet.xlsx");
	
	public static void writeInputDataExcel(String sheetname, int rownum, int cellnum,  String celldata)
			throws IOException {
		try {
			FileInputStream fis = new FileInputStream(PathInputData);
			XSSFWorkbook workbook = new XSSFWorkbook(fis);
			XSSFSheet sheet = workbook.getSheet(sheetname);
			Row row = sheet.getRow(rownum);
			if(row==null) {
			row = sheet.createRow(rownum);
			}
			Cell cell = row.createCell(cellnum);
			cell.setCellValue(celldata);
			FileOutputStream fos = new FileOutputStream(PathInputData);
			workbook.write(fos);
			workbook.close();
		
		} catch (Exception ex) {
			System.out.println("Exception caught in Write Excel is: "+ ex);

		}
	}
	
	public static void writeOutputDataExcel(String sheetname, int rownum, int cellnum,  String celldata)
			throws IOException {
		try {
			FileInputStream fis = new FileInputStream(PathOutputData);
			XSSFWorkbook workbook = new XSSFWorkbook(fis);
			XSSFSheet sheet = workbook.getSheet(sheetname);
			Row row = sheet.getRow(rownum);
			if(row==null) {
			row = sheet.createRow(rownum);
			}
			Cell cell = row.createCell(cellnum);
			cell.setCellValue(celldata);
			FileOutputStream fos = new FileOutputStream(PathOutputData);
			workbook.write(fos);
			workbook.close();
		} catch (Exception ex) {
			System.out.println("Exception caught in Write Excel is: "+ ex);

		}
	}
	
	
	public static void writeSanitySheet(String sheetname, int rownum, int cellnum,  String celldata)
			throws IOException {
		try {
			FileInputStream fis = new FileInputStream(PathSanitySheet);
			XSSFWorkbook workbook = new XSSFWorkbook(fis);
			XSSFSheet sheet = workbook.getSheet(sheetname);
			Row row = sheet.getRow(rownum);
			if(row==null) {
			row = sheet.createRow(rownum);
			}
			Cell cell = row.createCell(cellnum);
			cell.setCellValue(celldata);
			FileOutputStream fos = new FileOutputStream(PathSanitySheet);
			workbook.write(fos);
			workbook.close();
		} catch (Exception ex) {
			System.out.println("Exception caught in Write Excel is: "+ ex);

		}
	}
	
	
}
