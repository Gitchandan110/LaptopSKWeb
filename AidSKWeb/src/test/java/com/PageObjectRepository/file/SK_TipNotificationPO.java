package com.PageObjectRepository.file;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import com.Commonutills.file.Base;

public class SK_TipNotificationPO extends Base {

	public WebElement pageTipNotifications() {

		try {
			By pageTitle = By.xpath("//div[@class='col-md-8' and contains (text(),'Tip Notifications')]");
			return driver.findElement(pageTitle);
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return null;

	}

	public WebElement filterTipTitle() {

		try {
			By TipTitle = By.xpath("//input[@id='txtTitle']");
			return driver.findElement(TipTitle);
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return null;

	}

	public WebElement filterStatus() {

		try {
			By status = By.xpath("//select[@id='ddlStatus']");
			return driver.findElement(status);
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
			System.out.println("Exception in WebElement ddStatus:" + e.getMessage());
		}
		return null;
	}

	public WebElement filterActiveStatus() {

		try {
			By Activestatus = By.xpath("//option[@value='Yes']");
			return driver.findElement(Activestatus);
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
			System.out.println("Exception in WebElement ddActiveStatus:" + e.getMessage());
		}
		return null;
	}

	public WebElement filterInactiveStatus() {

		try {
			By Inactivestatus = By.xpath("//option[@value='No']");
			return driver.findElement(Inactivestatus);
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

	public WebElement linkDetails() {

		try {
			By details = By.linkText("Details");
			return driver.findElement(details);
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return null;
	}

	public WebElement btnCancelDetails() {

		try {
			By cancel = By.xpath("//a[@class='kv-btn kv-btn-primary' and contains (text(),'Cancel')]");
			return driver.findElement(cancel);
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return null;
	}

	public WebElement btnAddTipNotification() {

		try {
			By btnAddTipNotification = By.xpath("//a[@class='kv-btn kv-btn-primary' and contains(text(),'Add Tip Notification')]");
			return driver.findElement(btnAddTipNotification);
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return null;
	}

	public WebElement txtTipNotificationTitle() {

		try {
			By title = By.id("txtTitle");
			return driver.findElement(title);
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return null;
	}
	
	
	public WebElement ddSelectTipTemplate() {

		try {
			By ddSelectTipTemplate = By.xpath("//select[@id='ddlTemplate']");
			return driver.findElement(ddSelectTipTemplate);
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return null;
	}
	
	
	
	public WebElement ddTipTemplateOption() {

		try {
			By ddTipTemplateOption = By.xpath("//select[@id='ddlTemplate']//option[2]");
			return driver.findElement(ddTipTemplateOption);
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return null;
	}
	
		

	public WebElement BtnSubmit() {

		By Submit = By.xpath("//button[@type='submit']");
		return driver.findElement(Submit);

	}
	
	public WebElement ErrorMessage() {

		By ErrorMessage = By.xpath("//div[@class='alert alert-error']");
		return driver.findElement(ErrorMessage);

	}
	
	
	
	
}
