package com.PageObjectRepository.file;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import com.Commonutills.file.Base;

public class SK_HomePagePO extends Base {
	
	public WebElement tabClosedIncident() {
		
		By tabClosed=By.xpath("//ul[@class='nav nav-tabs incidents-tabs']//*[contains(text(),'Closed')]");
		return driver.findElement(tabClosed);
		
		
	}	
	
	public WebElement HamburgerMenu() {
		
		By hamburgerMenu= By.cssSelector("div[id='hamburger']");
		
		return driver.findElement(hamburgerMenu);
		
	}
	
	
	
	public WebElement btnProtocols() {

		try {
			By Protocols = By.xpath("//a[@class='protocol-btn']");
			return driver.findElement(Protocols);
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return null;
	}
	
	
	
	public WebElement btnReports() {

		try {
			By Reports = By.xpath("//a[@class='report-btn' and contains (text(),'Reports')]");
			return driver.findElement(Reports);
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return null;
	}
	
		
	public WebElement btnERP() {

		try {
			By ERP = By.xpath("//a[@class='erp-btn']");
			return driver.findElement(ERP);
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return null;
	}
	
	
	public WebElement btnMAP() {

		try {
			By map = By.xpath("//a[@class='map-btn' and contains (text(),'Map')]");
			return driver.findElement(map);
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return null;
	}
	
	public WebElement btnAVAlerts() {

		try {
			By AVAlerts = By.xpath("//a[@class='av-btn' and contains (text(),'AV Alerts')]");
			return driver.findElement(AVAlerts);
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return null;
	}

	
	
}
