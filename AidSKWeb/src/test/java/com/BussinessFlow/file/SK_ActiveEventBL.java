package com.BussinessFlow.file;

import java.io.File;
import java.io.IOException;
import java.util.Iterator;
import java.util.Set;

import org.apache.maven.shared.utils.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;

import com.Commonutills.file.Base;
import com.Commonutills.file.ExcelUtils;
import com.Commonutills.file.ExcelWrite;
import com.PageObjectRepository.file.SK_ActiveEventPO;

public class SK_ActiveEventBL extends SK_ActiveEventPO {

	String SanitySheet = "Sanity_SK";

	public void clickIncomingIncident() throws Exception {

		if (IncomingIncident() != null && IncomingIncident().isDisplayed()) {

			ExcelWrite.writeSanitySheet(SanitySheet, 9, 1, "Pass");
			Base.scrolltoElement(driver, IncomingIncident());
			ExcelWrite.writeSanitySheet(SanitySheet, 17, 1, "Pass");
			Base.takeScreenShot("Incoming Incident");
			Thread.sleep(3000);
			Base.highLightElement(driver, IncomingIncident());
			ExcelWrite.writeSanitySheet(SanitySheet, 32, 1, "Pass");
			Thread.sleep(2000);
			IncomingIncident().click();
			System.out.println("Incoming Incident found and selected");
			ExcelWrite.writeSanitySheet(SanitySheet, 31, 1, "Pass");
			Thread.sleep(10000);
			Base.manageChildWindow();

		} else {

			System.out
					.println("No Incoming Incident Found Now Searching for Open Incident");

			if (OpenIncident() != null && OpenIncident().isDisplayed()) {
				ExcelWrite.writeSanitySheet(SanitySheet, 9, 1, "Pass");
				Base.scrolltoElement(driver, OpenIncident());
				ExcelWrite.writeSanitySheet(SanitySheet, 17, 1, "Pass");
				Thread.sleep(3000);
				Base.highLightElement(driver, OpenIncident());
				ExcelWrite.writeSanitySheet(SanitySheet, 32, 1, "Pass");
				Thread.sleep(2000);
				OpenIncident().click();
				System.out.println("Open Incident found and selected");
				ExcelWrite.writeSanitySheet(SanitySheet, 31, 1, "Pass");
				Thread.sleep(5000);
				Base.manageChildWindow();

			} else {

				System.out.println("No Open Incident Found");
			}
		}

	}

	public void click911Incident() throws Exception {

		if (Incident911() != null && Incident911().isDisplayed()) {
			Base.scrolltoElement(driver, Incident911());
			Thread.sleep(3000);
			Base.highLightElement(driver, Incident911());
			Base.takeScreenShot("911 Incident");
			ExcelWrite.writeSanitySheet(SanitySheet, 20, 1, "Pass");
			Thread.sleep(2000);
			Incident911().click();
			System.out.println("911 Incident found and selected");
			ExcelWrite.writeSanitySheet(SanitySheet, 31, 1, "Pass");
			Thread.sleep(5000);
			Base.manageChildWindow();

		} else {

			System.out.println("No 911 Incident Found");

		}

	}

	public void selectAllActiveEvents() throws Exception {

		Base.scrolltoElement(driver, incidentTable());
		int countActiveEvents = allActiveEvents().size();

		System.out.println("Total number of New Tip Incidents are : "
				+ countActiveEvents);

		for (int i = 1; i <= countActiveEvents; i++) {

			WebElement checkbox = driver.findElement(By.xpath("//tbody//tr["
					+ i + "]//td//input[@type='checkbox']"));
			String titleTip = driver.findElement(
					By.xpath("//tbody//tr[" + i + "]//td[10]//div//img"))
					.getAttribute("title");
			System.out.println("Tip Tytle is : " + titleTip);
			checkbox.click();

		}

	}

	public void selectActiveEvents() throws Exception {

		Base.scrolltoElement(driver, incidentTable());

		WebElement checkbox = driver.findElement(By
				.xpath("//tbody//tr[1]//td//input[@type='checkbox']"));

		checkbox.click();

	}

	public void verifyFilter() throws Exception {

		if (btnFilterActiveEvents() != null
				&& btnFilterActiveEvents().isDisplayed()) {
			btnFilterActiveEvents().click();
			Thread.sleep(2000);
			System.out.println("Filter button found and clicked");

		}

		else {

			System.out.println("Filter button not found");

		}
	}

	public void verifyCloseAction() throws Exception {

		if (btnCloseEvents() != null && btnCloseEvents().isDisplayed()) {
			btnCloseEvents().click();
			Thread.sleep(5000);
			System.out.println("Close button found and clicked");
			dropdownResolution().click();
			Thread.sleep(3000);
			optionResolution().click();
			txtResponse().click();
			txtResponse()
					.sendKeys(
							" Both 911 and Medical Emergencies, which are automatically closed by the system when triggered, will continue to show in the Active events tab for up to five minutes from event start. After the duration, these events will show up only in the Closed tab.");
			Base.takeScreenShot("Action Close");
			Thread.sleep(3000);
			Base.highLightElement(driver, btnSubmit());
			btnSubmit().click();
			Thread.sleep(10000);

		}

		else {

			System.out.println("Close button not found");

		}
	}

	public void verifyShareIncident() throws Exception {

		if (btnShareIncident() != null && btnShareIncident().isDisplayed()) {
			btnShareIncident().click();
			Thread.sleep(2000);
			System.out.println("Share Incident Link found and clicked");
			txtEmailField().click();
			txtEmailField()
					.sendKeys(
							"share@mailinator.com;chandan.kumar@netsutra.com;ck@mailinator.com");
			Base.takeScreenShot("Share Incoming Incidents");
			btnShare().click();
			Thread.sleep(4000);

		}

		else {

			System.out.println("Share Active Incident not working");

		}
	}

}
