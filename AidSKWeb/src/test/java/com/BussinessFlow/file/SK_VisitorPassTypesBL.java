package com.BussinessFlow.file;

import static org.testng.Assert.assertEquals;
import static org.testng.Assert.assertTrue;

import com.Commonutills.file.Base;
import com.PageObjectRepository.file.SK_VisitorPassTypePO;

import junit.framework.Assert;

public class SK_VisitorPassTypesBL extends SK_VisitorPassTypePO {

	public void verifyManageVisitorPassTypes() throws Exception {

		if (pageManageVisitorPassTypes() != null
				&& pageManageVisitorPassTypes().isDisplayed()) {
			Assert.assertEquals("Manage Visitor Pass Types", driver.getTitle());
			System.out.println("Landed on ManageVisitorPassTypes Page");
			Base.takeScreenShot("ManageVisitorPassTypes");
		}

		else {

			System.out.println("Unable to find ManageVisitorPassTypes Page");
		}

		if (filterPassTypeTitle() != null
				&& filterPassTypeTitle().isDisplayed()) {
			Base.highLightElement(driver, filterPassTypeTitle());
			filterPassTypeTitle().sendKeys("VP");
			btnFilter().click();
			Thread.sleep(5000);
			Base.takeScreenShot("ManageVisitorPassTypes");
			btnClear().click();
			System.out.println("filterPassTypeTitle Pass");
			Base.waitFor30Seconds(filterNumberOfDays());
		}

		if (filterNumberOfDays() != null && filterNumberOfDays().isDisplayed()) {
			Base.highLightElement(driver, filterNumberOfDays());
			filterNumberOfDays().sendKeys("365");
			Thread.sleep(5000);
			btnFilter().click();
			Thread.sleep(5000);
			Base.takeScreenShot("ManageVisitorPassTypes");
			btnClear().click();
			System.out.println("filterNumberOfDays Pass");
			Base.waitFor30Seconds(ddStatus());
		}

		if (ddStatus() != null && ddStatus().isDisplayed()) {
			Base.highLightElement(driver, ddStatus());
			ddStatus().click();
			Thread.sleep(5000);
			ddActiveStatus().click();
			btnFilter().click();
			Thread.sleep(5000);
			Base.takeScreenShot("ManageVisitorPassTypes");
			btnClear().click();
			System.out.println("ddActiveStatus() Pass");
			Base.waitFor30Seconds(ddStatus());
			Base.highLightElement(driver, ddStatus());
			ddStatus().click();
			ddInactiveStatus().click();
			btnFilter().click();
			Thread.sleep(5000);
			Base.takeScreenShot("ManageVisitorPassTypes");
			btnClear().click();
			System.out.println("ddInActiveStatus() Pass");
			Thread.sleep(5000);

		}
		if (linkDetails() != null && linkDetails().isDisplayed()) {
			System.out.println("linkDetails found");
			linkDetails().click();
			Thread.sleep(5000);
			Base.takeScreenShot("ManageVisitorPassTypes");
			Base.scrollEndofthePage(driver);
			Thread.sleep(3000);
			btnCancelDetails().click();
			Thread.sleep(5000);

		}
	}

	public void editVisitorPassType() throws Exception {

		if (btnEditVisitorPassType() != null
				&& btnEditVisitorPassType().isDisplayed()) {
			btnEditVisitorPassType().click();
			Thread.sleep(5000);
			txtVisitorPassTypeTiltle().clear();
			txtVisitorPassTypeTiltle().sendKeys("VP: " + Base.SystemDateTime());
			Thread.sleep(2000);
			txtDiscriptionVisitorPassType().clear();
			txtDiscriptionVisitorPassType().sendKeys(
					"VPDescription:" + Base.SystemTime());
			ddTimeZone().click();
			Thread.sleep(2000);
			txtSearchTimeZone().sendKeys("Asia/Kolkata");
			Thread.sleep(2000);
			timeZoneAsiaKolkata().click();
			txtNumberOfDays().clear();
			txtNumberOfDays().sendKeys("3");
			Thread.sleep(2000);
			txtEmailSubject().sendKeys("Email Subject");
			Base.takeScreenShot("ManageVisitorPassTypes");
			btnMonitorEverywhere().click();
			Thread.sleep(3000);
			Base.FullPageScreenShot("EditVisitorPassType");
			Base.scrollEndofthePage(driver);
			Base.highLightElement(driver, btnSubmit());
			btnSubmit().click();
			Thread.sleep(8000);

		}
		try {

			if (popUpConformationEditVisitorPass().isDisplayed() == true) {
				System.out
						.println("Following non Expired Visitors are associated with this Visitor Pass Type. The change made may lead to changes in the non Expired Visitor’s pass validity. Please Submit if you wish to proceed and save the changes.");
				Base.FullPageScreenShot("EditVisitorPass_Conformation");
				Base.takeScreenShot("ManageVisitorPassTypes");
				btnCancelEditVisitorPass().click();
				Thread.sleep(5000);
				btnCancel().click();
				Base.waitFor30Seconds(btnCreateVisitorPassType());
				System.out.println("editVisitorPassType() Pass");

			} else {

				Base.waitFor30Seconds(btnCreateVisitorPassType());
				System.out.println("editVisitorPassType() Pass");
			}
		} catch (Exception e) {
			e.printStackTrace();
		}

	}

	public void clickButtonCreateVisitorPassType() throws Exception {

		if (btnCreateVisitorPassType() != null
				&& btnCreateVisitorPassType().isDisplayed()) {

			btnCreateVisitorPassType().click();
			System.out
					.println("CreateVisitorPassType Button Found and Clicked");
			Thread.sleep(5000);
		}
	}

	public void fillCreateVisitorPassType() throws Exception {

		Assert.assertEquals("Create Visitor Pass Type", driver.getTitle());
		System.out.println("Page Title is : " + driver.getTitle());

		if (txtVisitorPassTypeTiltle() != null
				&& txtVisitorPassTypeTiltle().isDisplayed()) {
			txtVisitorPassTypeTiltle().sendKeys("VP: " + Base.SystemDateTime());
			Thread.sleep(2000);
			txtDiscriptionVisitorPassType().click();
			txtDiscriptionVisitorPassType().sendKeys(
					"VPDescription: " + Base.SystemTime());
			ddTimeZone().click();
			Thread.sleep(2000);
			txtSearchTimeZone().sendKeys("Asia/Kolkata");
			timeZoneAsiaKolkata().click();
			txtNumberOfDays().sendKeys("1");
			Thread.sleep(2000);
			txtEmailSubject().sendKeys("Email Invite");
			Base.takeScreenShot("ManageVisitorPassTypes");
			Thread.sleep(2000);
			btnMonitorEverywhere().click();
			Thread.sleep(3000);
			Base.FullPageScreenShot("CreateVisitorPassType");
			Base.scrollEndofthePage(driver);
			Base.highLightElement(driver, btnSubmit());
			btnSubmit().click();
			Thread.sleep(8000);

		}

	}

}
