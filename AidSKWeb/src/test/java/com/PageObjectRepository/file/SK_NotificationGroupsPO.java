package com.PageObjectRepository.file;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import com.Commonutills.file.Base;

public class SK_NotificationGroupsPO extends Base {

	public WebElement pageNotificationGroups() {

		try {
			By pageTitle = By.xpath("//div[@class='col-md-8' and contains (text(),'Manage Notification Groups')]");
			return driver.findElement(pageTitle);
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return null;

	}

	public WebElement filterGroupName() {

		try {
			By GroupName = By.xpath("//input[@id='group_name']");
			return driver.findElement(GroupName);
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return null;

	}

	public WebElement filterStatus() {

		try {
			By status = By.xpath("//select[@id='group_status']");
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
			By Activestatus = By.xpath("//option[@value='yes']");
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
			By Inactivestatus = By.xpath("//option[@value='no']");
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

	public WebElement linkCreateNewGroup() {

		try {
			By NewGroup = By.xpath("//a[@class='kv-btn kv-btn-primary' and contains(text(),'New Group')]");
			return driver.findElement(NewGroup);
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return null;
	}

	public WebElement txtNewGroupName() {

		try {
			By txtNewGroupName = By.id("textGroupName");
			return driver.findElement(txtNewGroupName);
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return null;
	}
	
	
	public WebElement txtGroupDescription() {

		try {
			By txtGroupDescription = By.id("txtGroupDescription");
			return driver.findElement(txtGroupDescription);
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return null;
	}
	
	
	
	public WebElement chkboxOrganizationUser() {

		try {
			By OrganizationUser = By.xpath("//input[@type='checkbox']");
			return driver.findElement(OrganizationUser);
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
