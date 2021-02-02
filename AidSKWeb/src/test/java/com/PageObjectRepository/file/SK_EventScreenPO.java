package com.PageObjectRepository.file;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import com.Commonutills.file.Base;

public class SK_EventScreenPO extends Base {

	
	public WebElement videoContainer() {

		try {
			By video = By.xpath("//div[@id='video-container']");
			return driver.findElement(video);
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return null;

	}

	public WebElement mapContainer() {

		try {
			By map = By.xpath("//div[@class='profile-map-container']");
			return driver.findElement(map);
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return null;

	}

	public WebElement iconShareIncident() {

		try {
			By share = By.xpath("//span[@class='share']//a[@id='share-link']");
			return driver.findElement(share);
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return null;

	}

	public WebElement shareIncidentEmailfield() {

		try {
			By emailtxt = By.xpath("//textarea[@id='share-recipient-emails']");
			return driver.findElement(emailtxt);
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return null;
	}

	public WebElement btnSubmitShareIncident() {

		By share = By.xpath("//input[@name='share-submit']");
		return driver.findElement(share);

	}

	public WebElement dropdownIncidentAction() {

		By ddeventAction = By.xpath("//select[@id='incident-action-select']");
		return driver.findElement(ddeventAction);

	}

	public WebElement incidentActionClose() {

		By closeoption = By.xpath("//select[@id='incident-action-select']//option[@value='1']");
		return driver.findElement(closeoption);
	}

	public WebElement dropdownIncidentResolution() {

		By ddeventAction = By.xpath("//select[@id='incident-resolution-select']");
		return driver.findElement(ddeventAction);

	}

	public WebElement incidentResolutionFalseAlarm() {

		By closeoption = By.xpath("//select[@id='incident-resolution-select']//option[@value='3']");
		return driver.findElement(closeoption);
	}

	public WebElement txtIncidentActionResponse() {

		By txtIA = By.xpath("//textarea[@id='incident-action-response']");
		return driver.findElement(txtIA);

	}

	public WebElement btnSaveIncidentResponse() {

		By btnSave = By.xpath("//button[@class='kv-btn kv-btn-primary']");
		return driver.findElement(btnSave);

	}

	public WebElement chatRoom() {

		By chatRoom = By.xpath("//div[@class='chat-container'][@id='chat']");
		return driver.findElement(chatRoom);
	}

	public WebElement btnSmartResponse() {

		By smartResponse = By.xpath("//a[@id='quick-responses-button']");
		return driver.findElement(smartResponse);
	}

	public WebElement chatSmartResponse() {

		By chat = By
				.xpath("//div[@id='quick-responses']//ul//li//span[contains(text(),'Keep speaking we can hear you')]");
		return driver.findElement(chat);
	}

	public WebElement txtSmartResponse() {

		By txtSR = By.cssSelector("input[name='message'][id='message']");
		return driver.findElement(txtSR);
	}

	public WebElement btnSendSmartResponse() {

		By txtSR = By.xpath("//div[@class='field submit-field']//input[@name='submit']");
		return driver.findElement(txtSR);
	}

	public WebElement txtEventNotes() {

		By txtEN = By.cssSelector("textarea[class='notes_message'][id='notes-message']");
		return driver.findElement(txtEN);
	}

	public WebElement btnSaveEventNotes() {

		By txtSR = By.xpath("//div[@class='field submit-field']//input[@name='notes-submit']");
		return driver.findElement(txtSR);
	}

	
	
	public WebElement txtEmailField() {

		By EmailField = By.xpath("//textarea[@id='share-recipient-emails']");
		return driver.findElement(EmailField);
	}
	
		
	
	public WebElement btnCloseEventView() {
		
		By CloseEventView = By.xpath("//button[@type='button' and contains (text(),'Close Event View')]");
		return driver.findElement(CloseEventView);
	}
	
	
}
