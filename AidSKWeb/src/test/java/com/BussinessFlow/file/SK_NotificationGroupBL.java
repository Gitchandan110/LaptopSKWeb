package com.BussinessFlow.file;

import java.io.IOException;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.interactions.Actions;

import com.Commonutills.file.Base;
import com.PageObjectRepository.file.SK_NotificationGroupsPO;

import junit.framework.Assert;

public class SK_NotificationGroupBL extends SK_NotificationGroupsPO {

	public void verifyNotificationGroup() throws Exception {

		if (pageNotificationGroups() != null
				&& pageNotificationGroups().isDisplayed()) {
			Assert.assertEquals("Manage Notification Groups", driver.getTitle());
			System.out.println("Landed on Notification Groups Page");
			Base.FullPageScreenShot("Notification Groups");
			Base.scrolltoElement(driver, pageNotificationGroups());
		}

		else {

			System.out.println("Unable to find Notification Groups Page");
		}

		if (filterGroupName() != null && filterGroupName().isDisplayed()) {
			Base.highLightElement(driver, filterGroupName());
			// filterGroupName().sendKeys("NGAll");

			// Java Script executor is used below to enter text without using
			// send keys

			JavascriptExecutor js = (JavascriptExecutor) driver;
			js.executeScript("document.getElementById('group_name').value='NGAll'");

			Thread.sleep(3000);

			// Java Script executor is used below to click on Filter button

			js.executeScript("arguments[0].click();", btnFilter());

			// btnFilter().click();
			Thread.sleep(5000);
			Base.takeScreenShot("Notification Groups");
			btnClear().click();
			System.out.println("filterGroupName Pass");
			Base.waitFor30Seconds(filterStatus());
		}

		if (filterStatus() != null && filterStatus().isDisplayed()) {
			Base.highLightElement(driver, filterStatus());
			filterStatus().click();
			Thread.sleep(5000);
			filterActiveStatus().click();
			btnFilter().click();
			Thread.sleep(5000);
			Base.takeScreenShot("Notification Groups");
			btnClear().click();
			System.out.println("filterActiveStatus() Pass");
			Base.waitFor30Seconds(filterStatus());
			filterStatus().click();
			filterInactiveStatus().click();
			btnFilter().click();
			Thread.sleep(5000);
			Base.takeScreenShot("Notification Groups");
			btnClear().click();
			System.out.println("filterInactiveStatus() Pass");
			Thread.sleep(5000);

		}
		if (linkDetails() != null && linkDetails().isDisplayed()) {
			System.out.println("linkDetails found");
			linkDetails().click();
			Thread.sleep(5000);
			Base.FullPageScreenShot("Notification Group Detail");
			Base.scrollEndofthePage(driver);
			Thread.sleep(3000);
			btnCancelDetails().click();
			Thread.sleep(5000);

		}
	}

	public void CreateNewGroup() throws Exception {

		if (linkCreateNewGroup() != null && linkCreateNewGroup().isDisplayed()) {
			Base.highLightElement(driver, linkCreateNewGroup());
			linkCreateNewGroup().click();
			Thread.sleep(5000);
		}
		if (txtNewGroupName() != null && txtNewGroupName().isDisplayed()) {
			Base.highLightElement(driver, txtNewGroupName());
			txtNewGroupName().sendKeys("NGNew");
			txtGroupDescription().sendKeys("New Group");
			chkboxOrganizationUser().click();
		}

	}

	public void selectSubmitBtn() throws Exception {

		if (BtnSubmit() != null && BtnSubmit().isDisplayed()) {
			Base.FullPageScreenShot("Notification Group");
			BtnSubmit().click();
			Thread.sleep(5000);

		}

		if (ErrorMessage().isDisplayed()) {
			System.out.println("Create Notification Group Fail");
			Base.FullPageScreenShot("Create Notification Group Fail");

		}

	}

}
