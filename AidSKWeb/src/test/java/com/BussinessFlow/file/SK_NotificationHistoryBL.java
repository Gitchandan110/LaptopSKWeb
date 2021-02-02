package com.BussinessFlow.file;

import java.io.IOException;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Date;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.interactions.Actions;

import com.Commonutills.file.Base;
import com.PageObjectRepository.file.SK_NotificationHistoryPO;

import junit.framework.Assert;

public class SK_NotificationHistoryBL extends SK_NotificationHistoryPO {

	public void verifyNotificationHistory() throws Exception{

		
			if (pageNotificationHistory() != null && pageNotificationHistory().isDisplayed()) {
				Assert.assertEquals("Notification History", driver.getTitle());
				System.out.println("Landed on Notification History Page");

			}

			else {

				System.out.println("Unable to find Notification History Page");
			}

			if (filterTitle() != null && filterTitle().isDisplayed()) {
				Base.highLightElement(driver, filterTitle());
				filterTitle().sendKeys("Sch");
				btnFilter().click();
				Thread.sleep(10000);
				Base.takeScreenShot("Notification History");
				btnClear().click();
				Thread.sleep(10000);
				System.out.println("filterTitle Pass");
				Base.waitFor30Seconds(filterType());
			}

			if (filterType() != null && filterType().isDisplayed()) {
				Base.highLightElement(driver, filterType());
				filterType().click();
				Thread.sleep(5000);
				filterImmediate().click();
				btnFilter().click();
				Thread.sleep(10000);
				Base.takeScreenShot("Notification History");
				btnClear().click();
				System.out.println("filterImmediate() Pass");
				Thread.sleep(10000);
				filterType().click();
				Thread.sleep(5000);
				filterScheduled().click();
				btnFilter().click();
				Thread.sleep(10000);
				Base.takeScreenShot("Notification History");
				btnClear().click();
				System.out.println("filterScheduled()  Pass");
				Thread.sleep(10000);

			}

		}


	public void viewHistoryDetails() throws Exception {


			if (sourceBroadcast() != null && sourceBroadcast().isDisplayed()) {
				Base.highLightElement(driver, linkView());
				linkView().click();
				Thread.sleep(10000);
				Base.FullPageScreenShot("Notification History Recipients");
				System.out.println("Notification Recipients Screen displayed");
				linkView().click();
				Thread.sleep(6000);
				Base.FullPageScreenShot("Notification History Contents ");
				System.out.println("Notification Contents Screen displayed");
				btnClose().click();
			}
			
	}
	
}
	
