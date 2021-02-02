package com.BussinessFlow.file;

import java.io.IOException;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Date;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.interactions.Actions;

import com.Commonutills.file.Base;
import com.PageObjectRepository.file.SK_TipNotificationPO;

import junit.framework.Assert;

public class SK_TipNotificationBL extends SK_TipNotificationPO {

	public void verifyTipNotifications() throws Exception {

		if (pageTipNotifications() != null
				&& pageTipNotifications().isDisplayed()) {
			Assert.assertEquals("Tip Notifications", driver.getTitle());
			System.out.println("Landed on Tip Notifications Page");
			Base.FullPageScreenShot("Tip Notifications");
		}

		else {

			System.out.println("Unable to find Tip Notifications Page");
		}

		if (filterTipTitle() != null && filterTipTitle().isDisplayed()) {
			Base.highLightElement(driver, filterTipTitle());
			filterTipTitle().sendKeys("Tip Notification");
			btnFilter().click();
			Thread.sleep(5000);
			Base.takeScreenShot("Tip Notifications");
			btnClear().click();
			System.out.println("filterTipTitle Pass");
			Base.waitFor30Seconds(filterStatus());
		}

		if (filterStatus() != null && filterStatus().isDisplayed()) {
			Base.highLightElement(driver, filterStatus());
			filterStatus().click();
			Thread.sleep(5000);
			filterActiveStatus().click();
			btnFilter().click();
			Thread.sleep(5000);
			Base.takeScreenShot("Tip Notifications");
			btnClear().click();
			System.out.println("filterActiveStatus() Pass");
			Base.waitFor30Seconds(filterStatus());
			filterStatus().click();
			filterInactiveStatus().click();
			btnFilter().click();
			Thread.sleep(5000);
			Base.takeScreenShot("Tip Notifications");
			btnClear().click();
			System.out.println("filterInactiveStatus() Pass");
			Thread.sleep(5000);

		}
		if (linkDetails() != null && linkDetails().isDisplayed()) {
			linkDetails().click();
			System.out.println("linkDetails found & Clicked");
			Thread.sleep(5000);
			Base.FullPageScreenShot("Tip Notification Detail");
			Base.scrollEndofthePage(driver);
			Thread.sleep(3000);
			btnCancelDetails().click();
			System.out.println("btnCancelDetails() found");
			Thread.sleep(5000);

		}
	}

	public void verifyAddNewTipNotification() throws Exception {

		DateFormat dateFormat = new SimpleDateFormat("ss");
		String timeString = dateFormat.format(new Date()).toString();

		if (btnAddTipNotification() != null
				&& btnAddTipNotification().isDisplayed()) {
       		Base.highLightElement(driver, btnAddTipNotification());
			btnAddTipNotification().click();
			System.out.println("btnAddTipNotification() found & Clicked");
			Thread.sleep(5000);
		}
		if (txtTipNotificationTitle() != null
				&& txtTipNotificationTitle().isDisplayed()) {
			Base.highLightElement(driver, txtTipNotificationTitle());
			txtTipNotificationTitle().sendKeys("TipNotification" + timeString);
			ddSelectTipTemplate().click();
			Thread.sleep(3000);
			Base.takeScreenShot("Tip Notifications");
			ddTipTemplateOption().click();
			Thread.sleep(2000);
			Base.takeScreenShot("Tip Notifications");
		
		}
	}

	public void selectSubmitBtn() throws Exception {

		if (BtnSubmit() != null && BtnSubmit().isDisplayed()) {
			BtnSubmit().click();
			Thread.sleep(5000);
			Base.FullPageScreenShot("Add Tip Notifications Pass");

		}
		
		try{

		if (ErrorMessage().isDisplayed()) {
			System.out.println("Tip Notifications Fail");
			Base.FullPageScreenShot("Tip Notifications Fail");

		}
	} catch (Exception e){
		
		e.printStackTrace();
	}
	}
}
