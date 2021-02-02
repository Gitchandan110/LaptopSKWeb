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
import com.PageObjectRepository.file.SK_EventScreenPO;

public class SK_EventScreenBL extends SK_EventScreenPO {

	String SanitySheet = "Sanity_SK";

	public void verifyVideoContainer() throws Exception {

		System.out.println("Waiting for Video Screen");
		Base.waitFor180Seconds(videoContainer());
		System.out.println(SystemTime());
		Base.scrolltoElement(driver, videoContainer());
		Thread.sleep(10000);

	}

	public void verifySmartResponse() throws Exception {

		Base.scrolltoElement(driver, chatRoom());
		if (txtSmartResponse().isDisplayed()) {
			txtSmartResponse().click();
			txtSmartResponse()
					.sendKeys(
							"Test Threat Keyword like: depressed, weapon, trafficking, theft, suicide, terror, attack, fire, threat, trap, knife ");

			btnSendSmartResponse().click();
			Thread.sleep(8000);

			if (btnSmartResponse().isDisplayed()) {
				btnSmartResponse().click();
				Thread.sleep(2000);
				Base.highLightElement(driver, chatSmartResponse());
				Base.takeScreenShot("Incident Screen");
			}
			Actions actions = new Actions(this.driver);
			actions.moveToElement(chatSmartResponse());
			Thread.sleep(9000);
			Base.takeScreenShot("Incident Screen");
			chatSmartResponse().click();
			Thread.sleep(8000);
			Base.takeScreenShot("Incident Screen");
			System.out.println("SmartResponse chat text submitted");
			Base.takeScreenShot("Incident Screen");
			ExcelWrite.writeSanitySheet(SanitySheet, 14, 1, "Pass");

		}
	}

	public void enterEventNotes() throws Exception {

		if (txtEventNotes().isDisplayed()) {
			txtEventNotes().click();
			txtEventNotes()
					.sendKeys(
							"Be careful as criminals always carrying anything like Bomb, Knife, Gun, and they can do gun Shot, Fire, Goon, Acid Attack, Stone Pelting");
			btnSaveEventNotes().click();
			Base.takeScreenShot("Incident Screen");
			Thread.sleep(2000);
			System.out.println("Event Notes sent");
			ExcelWrite.writeSanitySheet(SanitySheet, 15, 1, "Pass");
		}

	}

	public void clickIconShareIncident() throws Exception {

		if (iconShareIncident().isDisplayed()) {
			iconShareIncident().click();
			Thread.sleep(2000);
			System.out.println("Share Incident icon is found and clicked");

		}

		else {

			System.out.println("Unable to Share an incident");

		}
	}

	public void submitShareIncident() throws Exception {

		if (shareIncidentEmailfield().isDisplayed()) {
			shareIncidentEmailfield().click();
			shareIncidentEmailfield()
					.sendKeys(
							"ck@mailinator.com;chandan@mailinator.com;share@mailinator.com");
			btnSubmitShareIncident().click();
			Base.takeScreenShot("Incident Screen");
			Thread.sleep(2000);
			System.out
					.println("Share incident mail are sent to: ck@mailinator.com;chandan@mailinator.com;share@mailinator.com");
			ExcelWrite.writeSanitySheet(SanitySheet, 27, 1, "Pass");
			Thread.sleep(10000);
			driver.switchTo().alert().accept();
			btnCloseEventView().click();
			Thread.sleep(5000);
		}
	}

	public void clickIncidentActionsClose() throws Exception {

		if (dropdownIncidentAction().isDisplayed()) {
			dropdownIncidentAction().click();
			incidentActionClose().click();
			Thread.sleep(2000);
			System.out.println("Event action closed");

		}
	}

	public void clickIncidentResolutionFalseAlarm() throws Exception {

		if (dropdownIncidentResolution().isDisplayed()) {
			dropdownIncidentResolution().click();
			incidentResolutionFalseAlarm().click();
			Thread.sleep(2000);
			System.out.println("Incident Resolution: False Alarm selected");
		}

	}

	public void enterIncidentActionResponse() throws Exception {

		if (txtIncidentActionResponse().isDisplayed()) {
			txtIncidentActionResponse().click();
			txtIncidentActionResponse().sendKeys("Its a False Alarm");
			btnSaveIncidentResponse().click();
			Thread.sleep(5000);
			Base.FullPageScreenShot("Incident Screen Action");
			ExcelWrite.writeSanitySheet(SanitySheet, 38, 1, "Pass");
		}
	}

}
