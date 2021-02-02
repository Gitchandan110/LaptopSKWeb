package com.PageObjectRepository.file;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import com.Commonutills.file.Base;

public class SK_NotificationHistoryPO extends Base {

	public WebElement pageNotificationHistory() {

		try {
			By pageTitle = By.xpath("//div[@class='col-md-8' and contains (text(),'Notification History')]");
			return driver.findElement(pageTitle);
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return null;

	}

	public WebElement filterTitle() {

		try {
			By TipTitle = By.xpath("//input[@id='txtTitle']");
			return driver.findElement(TipTitle);
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return null;

	}

	public WebElement filterType() {

		try {
			By filterType = By.xpath("//select[@id='ddlStatus']");
			return driver.findElement(filterType);
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
			System.out.println("Exception in WebElement ddStatus:" + e.getMessage());
		}
		return null;
	}

	public WebElement filterImmediate() {

		try {
			By filterImmediate = By.xpath("//option[@value='SEND']");
			return driver.findElement(filterImmediate);
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
			System.out.println("Exception in WebElement ddActiveStatus:" + e.getMessage());
		}
		return null;
	}

	public WebElement filterScheduled() {

		try {
			By filterScheduled = By.xpath("//option[@value='SCH']");
			return driver.findElement(filterScheduled);
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
			System.out.println("Exception in WebElement ddInactiveStatus:" + e.getMessage());
		}
		return null;
	}

	public WebElement btnFilter() {

		try {
			By FilterButton = By.cssSelector("input[type='submit'][name='filter']");
			return driver.findElement(FilterButton);
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return null;
	}

	public WebElement btnClear() {

		try {
			By FilterButton = By.xpath("//input [@name='cancel']");
			return driver.findElement(FilterButton);
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return null;
	}

	public WebElement linkView() {

		try {
			By View = By.xpath("//tbody//tr//td//a[contains(text(),'View')]");
			return driver.findElement(View);
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return null;
	}
	
	
	
	
	public WebElement sourceBroadcast() {

		try {
			By Broadcast = By.xpath("//tbody//tr//td[contains(text(),'Broadcast')]");
			return driver.findElement(Broadcast);
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return null;
	}
	


	public WebElement btnClose() {

		try {
			By close = By.xpath("//button[@type='button' and contains(text(),'Close')]");
			return driver.findElement(close);
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return null;
	}

	
	
	public WebElement ErrorMessage() {

		By ErrorMessage = By.xpath("//div[@class='alert alert-error']");
		return driver.findElement(ErrorMessage);

	}
	
	
	
	
}
