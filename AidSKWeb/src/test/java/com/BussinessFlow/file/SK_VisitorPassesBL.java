package com.BussinessFlow.file;

import static org.testng.Assert.assertEquals;
import static org.testng.Assert.assertTrue;

import java.io.IOException;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Date;

import com.Commonutills.file.Base;
import com.PageObjectRepository.file.SK_VisitorsPO;

import junit.framework.Assert;

public class SK_VisitorPassesBL extends SK_VisitorsPO {

	public void verifyManageVisitorPasses() throws Exception {

		if (txtManageVisitorPasses() != null
				&& txtManageVisitorPasses().isDisplayed()) {
			Assert.assertEquals("Manage Visitor Passes", driver.getTitle());
			System.out.println("Landed on Manage Visitors Passes");

		}

		else {

			System.out.println("Unable to find Manage Visitors Passes");
		}

	}

	public void verifyFilterManageVisitorPasses() throws Exception {

		if (filterLastName() != null && filterLastName().isDisplayed()) {
			Base.highLightElement(driver, filterLastName());
			filterLastName().sendKeys("SK");
			btnFilter().click();

			Thread.sleep(5000);

			Base.FullPageScreenShot("Manage Visitor Passes_filterLastName");
			btnClear().click();
			System.out.println("filterLastName() Pass");
			Base.waitFor30Seconds(filterFirstName());
		}

		if (filterFirstName() != null && filterFirstName().isDisplayed()) {
			Base.highLightElement(driver, filterFirstName());
			filterFirstName().sendKeys("V");
			btnFilter().click();
			Thread.sleep(5000);
			Base.FullPageScreenShot("Manage Visitor Passes_filterFirstName");
			btnClear().click();
			System.out.println("filterFirstName() Pass");
			Base.waitFor30Seconds(filterEmail());
		}

		if (filterEmail() != null && filterEmail().isDisplayed()) {
			Base.highLightElement(driver, filterEmail());
			filterEmail().sendKeys("vapp@yopmail.com");
			btnFilter().click();
			Thread.sleep(5000);
			Base.FullPageScreenShot("Manage Visitor Passes_filterEmail");
			btnClear().click();
			System.out.println("filterEmail() Pass");
			Base.waitFor30Seconds(filterMobileNumber());
		}

		if (filterMobileNumber() != null && filterMobileNumber().isDisplayed()) {
			Base.highLightElement(driver, filterMobileNumber());
			filterMobileNumber().sendKeys("0000123456");
			btnFilter().click();
			Thread.sleep(5000);
			Base.FullPageScreenShot("Manage Visitor Passes_filterMobileNumber");
			btnClear().click();
			System.out.println("filterMobileNumber() Pass");

		}

		Base.scrolltoElement(driver, linkIssueVisitorPass());

		if (ddType() != null && ddType().isDisplayed()) {
			Base.highLightElement(driver, ddType());
			ddType().click();
			Thread.sleep(3000);
			typeWithApp().click();
			btnFilter().click();
			Thread.sleep(5000);
			Base.FullPageScreenShot("Manage Visitor Passes_WithApp");
			btnClear().click();
			Thread.sleep(3000);
			Base.scrolltoElement(driver, linkIssueVisitorPass());
			ddType().click();
			Thread.sleep(3000);
			typeWithoutApp().click();
			btnFilter().click();
			Thread.sleep(5000);
			Base.FullPageScreenShot("Manage Visitor Passes_WithoutApp");
			btnClear().click();
			System.out.println("Type Filter Pass");
			Thread.sleep(5000);

		}

	}

	public void verifyPassStatus() throws Exception {

		Base.scrolltoElement(driver, linkIssueVisitorPass());
		if (ddStatus() != null && ddStatus().isDisplayed()) {
			Base.highLightElement(driver, ddStatus());
			ddStatus().click();
			Thread.sleep(5000);
			ddStatusExpired().click();
			btnFilter().click();
			Thread.sleep(5000);
			Base.FullPageScreenShot("Manage Visitor Passes_ExpiredVisitor");
			btnClear().click();
			Thread.sleep(5000);
			Base.scrolltoElement(driver, linkIssueVisitorPass());
			ddStatus().click();
			Thread.sleep(5000);
			ddStatusNonExpired().click();
			btnFilter().click();
			Thread.sleep(5000);
			Base.FullPageScreenShot("Manage Visitor Passes_NonExpiredVisitor");
			btnClear().click();
			Thread.sleep(5000);
			Base.scrolltoElement(driver, linkIssueVisitorPass());
			ddStatus().click();
			Thread.sleep(5000);
			ddStatusAll().click();
			btnFilter().click();
			Thread.sleep(5000);
			Base.FullPageScreenShot("Manage Visitor Passes_AllVisitor");
			btnClear().click();
			Thread.sleep(5000);

		}

	}

	public void verifyPassDetails() throws Exception {

		if (linkDetails() != null && linkDetails().isDisplayed()) {
			System.out.println("linkDetails found");
			linkDetails().click();

			Thread.sleep(5000);

			Base.FullPageScreenShot("Manage Visitor Passes_Details");
			Base.scrollEndofthePage(driver);
			Thread.sleep(3000);
			btnCancelDetails().click();
			Thread.sleep(5000);

		}

	}

	public void clickIssueVisitorPass() throws Exception {

		if (linkIssueVisitorPass() != null
				&& linkIssueVisitorPass().isDisplayed()) {
			linkIssueVisitorPass().click();
			Thread.sleep(5000);
			System.out.println("Issue Visitor Pass option clicked");
		}

	}

	public void verifyIssueVisitorPassWithSKApp() throws Exception {

		DateFormat dateFormat = new SimpleDateFormat("ss");
		String timeString = dateFormat.format(new Date()).toString();

		Assert.assertEquals("Issue Visitor Pass", driver.getTitle());
		System.out.println("Landed on Issue A Visitor Pass Page");
		if (btnCountryCode() != null && btnCountryCode().isDisplayed()) {
			Base.highLightElement(driver, btnCountryCode());
			btnCountryCode().click();
			Thread.sleep(3000);
			Base.takeScreenShot("IssueVisitorPass");
			CountryCodeIndia().click();
			System.out.println("Country Code Selected");

		}

		if (txtMobile() != null && txtMobile().isDisplayed()) {
			Base.highLightElement(driver, txtMobile());
			txtMobile().sendKeys("0012" + timeString + "56" + timeString);
			// btnCountryCode().click();
			Thread.sleep(2000);
			Base.takeScreenShot("IssueVisitorPass");
			btnSubmit().click();
			Thread.sleep(3000);

		}

		if (txtFirstName() != null && txtFirstName().isDisplayed()) {
			Base.highLightElement(driver, txtFirstName());
			txtFirstName().sendKeys("Vsk");
			System.out.println("txtFirstName() entered");
			txtLastName().clear();
			txtLastName().sendKeys("SK");
			System.out.println("txtLastName() entered");
			txtCompanyName().clear();
			txtCompanyName().sendKeys("Netsutra");
			System.out.println("txtCompanyName() entered");
			ddHost().click();
			ddHost().sendKeys("Lackorg@mailinator.com");
			selectHost().click();
			System.out.println("selectHost() done");
			txtEmail().click();
			txtEmail().sendKeys("Visitor" + timeString + "@mailinator.com");
			System.out.println("txtEmail() filled");

			radioSafetyKuvrrApp().click();

			System.out.println("radioSafetyKuvrrApp() selected");
			Thread.sleep(2000);
			chkbxERP().click();
			System.out.println("chkbxERP() selected");
			chkbxMaps().click();
			System.out.println("chkbxMaps() selected");
			txtNotes().click();
			txtNotes().sendKeys("Visitor Notes");
			System.out.println("txtNotes() entered");
			Thread.sleep(2000);
			Base.scrollEndofthePage(driver);
			ddVisitorPassType().click();
			Thread.sleep(2000);
			Base.takeScreenShot("IssueVisitorPass");
			PassTypeVP_10AM_8PM_365Days().click();
			System.out.println("ddVisitorPassType() selected");
			Thread.sleep(2000);
			Base.FullPageScreenShot("Create Visitor Pass");
			Base.highLightElement(driver, btnSubmitCreateVisitor());
			btnSubmitCreateVisitor().click();
			Thread.sleep(8000);
try{
			if (ErrorMessage().isDisplayed()) {
				System.out.println("Create Visitor Pass Fail");
				Base.FullPageScreenShot("Create Visitor Pass Fail");
			}

		} catch(Exception e){
			
			e.printStackTrace();
		}}

	}

	public void verifyIssueVisitorPassNotificationOnly() throws Exception {

		DateFormat dateFormat = new SimpleDateFormat("ss");
		String timeString = dateFormat.format(new Date()).toString();

		Assert.assertEquals("Issue Visitor Pass", driver.getTitle());
		System.out.println("Landed on Issue A Visitor Pass Page");
		if (btnCountryCode() != null && btnCountryCode().isDisplayed()) {
			Base.highLightElement(driver, btnCountryCode());
			btnCountryCode().click();
			Thread.sleep(3000);
			Base.takeScreenShot("IssueVisitorPass");
			CountryCodeIndia().click();
			System.out.println("Country Code Selected");

		}

		if (txtMobile() != null && txtMobile().isDisplayed()) {
			Base.highLightElement(driver, txtMobile());
			txtMobile().sendKeys("0012" + timeString + "56" + timeString);
			// btnCountryCode().click();
			Thread.sleep(2000);
			Base.takeScreenShot("IssueVisitorPass");
			btnSubmit().click();
			Thread.sleep(3000);

		}

		if (txtFirstName() != null && txtFirstName().isDisplayed()) {
			Base.highLightElement(driver, txtFirstName());
			txtFirstName().sendKeys("Vsk");
			System.out.println("txtFirstName() entered");
			txtLastName().sendKeys("SK");
			System.out.println("txtLastName() entered");
			txtCompanyName().sendKeys("Netsutra");
			System.out.println("txtCompanyName() entered");
			Thread.sleep(2000);
			ddHost().click();
			Thread.sleep(2000);
			ddHost().sendKeys("Lackorg@mailinator.com");
			Thread.sleep(2000);
			selectHost().click();
			System.out.println("selectHost() done");
			txtEmail().click();
			txtEmail().sendKeys("Vis" + timeString + "@mailinator.com");
			System.out.println("txtEmail() filled");

			/*
			 * radioSafetyKuvrrApp().click();
			 * 
			 * System.out.println("radioSafetyKuvrrApp() selected");
			 * Thread.sleep(2000); chkbxERP().click();
			 * System.out.println("chkbxERP() selected"); chkbxMaps().click();
			 * System.out.println("chkbxMaps() selected");
			 */
			txtNotes().click();
			txtNotes().sendKeys("Visitor Notes");
			System.out.println("txtNotes() entered");
			Thread.sleep(2000);
			Base.scrollEndofthePage(driver);
			ddVisitorPassType().click();
			Thread.sleep(2000);
			Base.takeScreenShot("IssueVisitorPass");
			PassTypeVP_10AM_8PM_365Days().click();
			System.out.println("ddVisitorPassType() selected");
			Thread.sleep(2000);
			Base.FullPageScreenShot("Create Visitor Pass");
			Base.highLightElement(driver, btnSubmitCreateVisitor());
			btnSubmitCreateVisitor().click();
			Thread.sleep(8000);
try{
			if (ErrorMessage().isDisplayed()) {
				System.out
						.println("Create Visitor Pass Notification Only Fail");
				Base.FullPageScreenShot("Create Visitor Pass Fail");
			}

		} catch(Exception e){
			
			e.printStackTrace();
		}

	}
	}
}
