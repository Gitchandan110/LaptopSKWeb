package com.PageObjectRepository.file;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import com.Commonutills.file.Base;

public class SK_ActiveEventPO extends Base {

	public WebElement IncomingIncident() {

		try {
			By incomingIncident = By.xpath(("//td[contains(., 'Incoming')]"));
			return driver.findElement(incomingIncident);
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return null;

	}

	public WebElement InvestigatingEvent() {

		try {
			By investigating = By.xpath(("//td[contains(., 'Investigating')]"));
			return driver.findElement(investigating);
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return null;

	}

	public WebElement OpenEvent() {

		try {
			By openEvent = By.xpath(("//tr[@class='condensed-profile profile']"));
			return driver.findElement(openEvent);
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return null;

	}

	public List<WebElement> allActiveEvents() {

		try {
			By allEvents = By.xpath(("//table[@class='incident-responsive'][@id='incident-table']//tbody//tr"));
			return driver.findElements(allEvents);
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return null;

	}

	public WebElement incidentTable() {

		try {
			By incidentTable = By.xpath(("//table[@class='incident-responsive'][@id='incident-table']"));
			return driver.findElement(incidentTable);
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return null;

	}

	// input[@name='selected_event'][@type='checkbox']

	public WebElement chkbxIncident() {

		try {
			By chkbxIncident = By.xpath("//input[@name='selected_event'][@type='checkbox']");
			return driver.findElement(chkbxIncident);
		} catch (Exception e) {
			e.printStackTrace();
		}
		return null;

	}

	public WebElement OpenIncident() {

		try {
			By openIncident = By.xpath("//td[contains(., ' Open')]");
			return driver.findElement(openIncident);
		} catch (Exception e) {
			e.printStackTrace();
		}
		return null;

	}

	public WebElement Incident911() {

		try {
			By inc911 = By.xpath("//div/img[@title='911']");
			return driver.findElement(inc911);
		} catch (Exception e) {
			e.printStackTrace();
			return null;
		}
	}

	public WebElement logoKuvrr() {

		try {
			By logo = By.xpath("//span[@class='logo']");
			return driver.findElement(logo);
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return null;

	}
	
	
	public WebElement btnFilterActiveEvents() {

		By Filter = By.xpath("//input[@type='button'][@name='filter']");
		return driver.findElement(Filter);
	}

	public WebElement btnCloseEvents() {

		By Close = By.xpath("//a[@id='incidentClose-link'][@title='Close Events']");
		return driver.findElement(Close);
	}
	
	
	public WebElement btnShareIncident() {

		By Share = By.xpath("//a[@id='share-link'][@title='Share']");
		return driver.findElement(Share);
	}
	
	


	
	
	public WebElement txtEmailField() {

		By EmailField = By.xpath("//textarea[@id='share-recipient-emails']");
		return driver.findElement(EmailField);
	}
	
	public WebElement dropdownResolution() {

		By Resolution = By.xpath("//select[@id='action_resolution']");
		return driver.findElement(Resolution);
	}
	
	
	
	public WebElement optionResolution() {

		By Resolution = By
				.xpath("//select[@id='action_resolution']//option[contains (text(),'Test')]");
		return driver.findElement(Resolution);
	}
	
	
	public WebElement txtResponse() {

		By Response = By.xpath("//textarea[@id='events_action_response']");
		return driver.findElement(Response);
	}
	

	public WebElement btnSubmit() {
		
		By Submit = By.xpath("//input[@type='button'][@class='btn submit']");
		return driver.findElement(Submit);
	}
	
	public WebElement btnShare() {
		
		By Share = By.xpath("//input[@id='share-submit'][@class='btn submit']");
		return driver.findElement(Share);
	}
	
	

	
	
}
