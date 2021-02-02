package com.BussinessFlow.file;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.List;

import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import com.Commonutills.file.ExcelUtils;
import com.Commonutills.file.ExcelWrite;
import com.PageObjectRepository.file.SK_OrganizationPO;

public class SK_OrganizationBL extends SK_OrganizationPO {

	SK_OrganizationPO organizationpl;
	String OrganizationSheet = "Web_Organization";

	public void getOrgPageRowCount() throws Exception {

		int OrgRowCount = RowListOrganization().size();
		System.out.println("OrgRowCount are : " + OrgRowCount);

	}

	public void getOrgPageColumnCount() throws Exception {
		int OrgColumnCount = columnListOrganization().size();
		System.out.println("OrgColumnCount are : " + OrgColumnCount);

	}

	public void getColumnName() throws Exception {

		int OrgColumnCount = columnListOrganization().size();
		for (int i = 1; i <= OrgColumnCount; i++) {

			String ColumnName = driver
					.findElement(
							By.xpath("//table[@summary='List of Organizations']//thead//tr//td["
									+ i + "]")).getText();

			System.out.println("Column Names are :" + ColumnName);

			ExcelUtils.writeExcel(OrganizationSheet, 0, i - 1, ColumnName);
		}

	}

	public void getOrganizationName() throws Exception {

		int j = 1;
		while (RowListOrganization().size() >= j) {

			String OrgName = driver
					.findElement(
							By.xpath("//*[@id='content']//div//div[3]//table//tbody//tr["
									+ j + "]//td[3]")).getText();
			System.out.println("OrgName are :" + OrgName);
			ExcelUtils.writeExcel(OrganizationSheet, j, 2, OrgName);
			j++;

		}

	}

	public void getOrganizationAddress() throws Exception {

		int OrgRowCount = RowListOrganization().size();
		for (int i = 1; i <= OrgRowCount; i++) {

			String orgAddress = driver
					.findElement(
							By.xpath("//*[@id='content']//div//div[3]//table//tbody//tr["
									+ i + "]//td[4]")).getText();
			System.out.println("orgAddress are :" + orgAddress);

			// ExcelWrite.writeInputDataExcel(OrganizationSheet, i, 3,
			// orgAddress);
			ExcelUtils.writeExcel(OrganizationSheet, i, 3, orgAddress);
		}

	}

	public void getOrganizationCity() throws Exception {

		for (int i = 1; i <= RowListOrganization().size(); i++) {

			String orgCity = driver
					.findElement(
							By.xpath("//*[@id='content']//div//div[3]//table//tbody//tr["
									+ i + "]//td[5]")).getText();

			System.out.println("orgCity are :" + orgCity);

			// ExcelWrite.writeInputDataExcel(OrganizationSheet, i, 4, orgCity);
			ExcelUtils.writeExcel(OrganizationSheet, i, 4, orgCity);
		}

	}

	public void getOrganizationState() throws Exception {

		int OrgRowCount = RowListOrganization().size();
		for (int i = 1; i <= OrgRowCount; i++) {

			String orgState = driver
					.findElement(
							By.xpath("//*[@id='content']//div//div[3]//table//tbody//tr["
									+ i + "]//td[6]")).getText();

			System.out.println("orgState are :" + orgState);

			// ExcelWrite.writeInputDataExcel(OrganizationSheet, i, 5,
			// orgState);
			ExcelUtils.writeExcel(OrganizationSheet, i, 5, orgState);
		}

	}

	public void getOrganizationPostalCode() throws Exception {

		int OrgRowCount = RowListOrganization().size();
		for (int i = 1; i <= OrgRowCount; i++) {

			String orgPostalCode = driver
					.findElement(
							By.xpath("//*[@id='content']//div//div[3]//table//tbody//tr["
									+ i + "]//td[7]")).getText();

			System.out.println("orgPostalCode are :" + orgPostalCode);

			ExcelUtils.writeExcel(OrganizationSheet, i, 6, orgPostalCode);

		}

	}

	public void getOrganizationCountry() throws Exception {

		int OrgRowCount = RowListOrganization().size();
		for (int i = 1; i <= OrgRowCount; i++) {

			String orgCountry = driver
					.findElement(
							By.xpath("//*[@id='content']//div//div[3]//table//tbody//tr["
									+ i + "]//td[8]")).getText();

			System.out.println("orgCountry are :" + orgCountry);

			ExcelUtils.writeExcel(OrganizationSheet, i, 7, orgCountry);

		}

	}

	public void getOrganizationStatus() throws Exception {

		int OrgRowCount = RowListOrganization().size();
		for (int i = 1; i <= OrgRowCount; i++) {

			String orgStatus = driver
					.findElement(
							By.xpath("//*[@id='content']//div//div[3]//table//tbody//tr["
									+ i + "]//td[9]")).getText();

			System.out.println("orgStatus are :" + orgStatus);

			ExcelUtils.writeExcel(OrganizationSheet, i, 8, orgStatus);

		}

	}

}
