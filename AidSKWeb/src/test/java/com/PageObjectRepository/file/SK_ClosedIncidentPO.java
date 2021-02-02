package com.PageObjectRepository.file;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import com.Commonutills.file.Base;

public class SK_ClosedIncidentPO extends Base {

	public WebElement closedSOS() {

		By sos = By.xpath("//div/img[@title='SOS']");
		return driver.findElement(sos);
	}

	public WebElement closedSafeWalk() {

		By walkSafe = By.xpath("//div/img[@title='Walk Safe']");
		return driver.findElement(walkSafe);
	}

	public WebElement closed911() {

		By closed911 = By.xpath("//div/img[@title='911']");
		return driver.findElement(closed911);
	}

	public WebElement closedMedicalEmergency() {

		By closed911 = By.xpath("//div/img[@title='Medical Emergency']");
		return driver.findElement(closed911);
	}

	public WebElement videoContainer() {

		By videoContainer = By.xpath("	//div[@id='video-container']");
		return driver.findElement(videoContainer);
	}

	public WebElement btnQuitIncidentScreen() {

		By btnQuit = By.xpath("//*[@id='incident-detail']/article/a");
		return driver.findElement(btnQuit);
	}
	
	public WebElement screenHeader() {

		By header = By.xpath("//header[@class='user-nav']");
		return driver.findElement(header);
	}
	
	


}
