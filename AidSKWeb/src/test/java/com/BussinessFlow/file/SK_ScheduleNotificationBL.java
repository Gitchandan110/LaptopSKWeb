package com.BussinessFlow.file;

import org.openqa.selenium.By;

import com.Commonutills.file.Base;
import com.PageObjectRepository.file.SK_ScheduleNotificationPO;

import junit.framework.Assert;

public class SK_ScheduleNotificationBL extends SK_ScheduleNotificationPO {

	public void verifyScheduleNotification() throws Exception {

		if (pageTitle() != null && pageTitle().isDisplayed()) {
			Assert.assertEquals("Schedule Notification", driver.getTitle());
			System.out.println("Landed on Schedule Notification Page");

		}

		else {

			System.out.println("Unable to find Schedule Notification Page");
		}

		if (filterTitle() != null && filterTitle().isDisplayed()) {
			Base.highLightElement(driver, filterTitle());
			filterTitle().sendKeys("Sch");
			btnFilter().click();
			Thread.sleep(5000);
			Base.FullPageScreenShot("Schedule Notification Title");
			btnClear().click();
			System.out.println("Schedule Notification Filter Pass");
			Base.waitFor30Seconds(ddStatus());
		}

		if (ddStatus() != null && ddStatus().isDisplayed()) {
			Base.highLightElement(driver, ddStatus());
			ddStatus().click();
			Thread.sleep(2000);
			filterActiveStatus().click();
			btnFilter().click();
			Thread.sleep(5000);
			Base.FullPageScreenShot("Schedule");
			btnClear().click();
			System.out.println("filterActiveStatus() Pass");
			Base.waitFor30Seconds(ddStatus());
			ddStatus().click();
			filterInactiveStatus().click();
			btnFilter().click();
			Thread.sleep(5000);
			Base.takeScreenShot("Schedule");
			btnClear().click();
			System.out.println("filterInactiveStatus() Pass");
			Thread.sleep(5000);
			ddStatus().click();
			filterExpiredStatus().click();
			btnFilter().click();
			Thread.sleep(5000);
			Base.takeScreenShot("Schedule");
			btnClear().click();
			System.out.println("filterExpiredStatus() Pass");
			Thread.sleep(5000);

		}
		if (linkDetails() != null && linkDetails().isDisplayed()) {
			System.out.println("linkDetails found");
			linkDetails().click();
			Thread.sleep(5000);
			Base.FullPageScreenShot("Schedule Details");
			Base.scrollEndofthePage(driver);
			Thread.sleep(3000);
			btnCancelDetails().click();
			Thread.sleep(5000);

		}
	}

	public void clickLinkNewSchedule() throws Exception {

		if (linkCreateNewSchedule() != null
				&& linkCreateNewSchedule().isDisplayed()) {
			Base.highLightElement(driver, linkCreateNewSchedule());
			linkCreateNewSchedule().click();
			Thread.sleep(5000);
		}

	}

	public void createNewSchedule() throws Exception {

		if (ddSelectTemplate() != null && ddSelectTemplate().isDisplayed()) {
			ddSelectTemplate().click();
			System.out.println("ddSelectTemplate() Clicked");
			Base.takeScreenShot("Schedule");
			Thread.sleep(3000);
			AutomationTemplate().click();
			Thread.sleep(3000);
			Base.takeScreenShot("Schedule");
			System.out.println("AutomationTemplate() selected");
			Base.scrolltoElement(driver, ddTimeZone());
			ddTimeZone().click();
			Thread.sleep(3000);
			textTimeZone().sendKeys("Asia/Kolkata");
			optionAsiaKolkata().click();
			System.out.println("optionAsiaKolkata() Selected");
			Base.takeScreenShot("Schedule");
			btnCalendarStartDate().click();
			selectCalendarDate().click();
			Base.FullPageScreenShot("Schedule Creation");
			btnSubmitSchedule().click();
			Thread.sleep(5000);
			try{
			if (ErrorMessage().isDisplayed()) {
				System.out.println("Create Schedule Fail");
				Base.FullPageScreenShot("Create Schedule Fail");

			}

		} catch(Exception e) {
			
			e.printStackTrace();
		}
	}
	}

	public void selectSubmitBtn() throws Exception {

		if (BtnSubmit() != null && BtnSubmit().isDisplayed()) {
			BtnSubmit().click();
			Thread.sleep(5000);
		}

	}

}
