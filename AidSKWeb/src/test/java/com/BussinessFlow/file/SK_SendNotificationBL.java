package com.BussinessFlow.file;

import org.openqa.selenium.By;

import com.Commonutills.file.Base;
import com.PageObjectRepository.file.SK_SendNotificationPO;

import junit.framework.Assert;

public class SK_SendNotificationBL extends SK_SendNotificationPO {

	public void verifySendNotification() throws Exception {

		if (pageTitle() != null && pageTitle().isDisplayed()) {
			Assert.assertEquals("Send Notification", driver.getTitle());
			System.out.println("Landed on Send Notification Page");
		}

		else {

			System.out.println("Unable to find Send Notification Page");
		}

		if (ddSelectTemplate() != null && ddSelectTemplate().isDisplayed()) {
			Base.highLightElement(driver, ddSelectTemplate());
			ddSelectTemplate().click();
			System.out.println("Template Drop down clicked");
			Thread.sleep(3000);
			TemplateOption().click();
			Thread.sleep(5000);
			Base.FullPageScreenShot("Send Notification");
			Base.scrolltoElement(driver, BtnSubmit());
			BtnSubmit().click();
			Thread.sleep(5000);
			try {
				if (ErrorMessage().isDisplayed()) {
					System.out.println("Send Notification Fail");
					Base.FullPageScreenShot("Send Notification Fail");

				}

			} catch(Exception e) {
			
				e.printStackTrace();
			}
		}
		}
	}