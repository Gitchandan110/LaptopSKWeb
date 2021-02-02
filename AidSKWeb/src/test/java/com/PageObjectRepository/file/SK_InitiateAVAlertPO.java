package com.PageObjectRepository.file;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import com.Commonutills.file.Base;

public class SK_InitiateAVAlertPO extends Base {
	
	
	public WebElement ddOrganizationName() {

		try {
			By controllerName = By.xpath("//div[@class='col-md-6']//select[@ng-model='vm.frm.org_id']");
			return driver.findElement(controllerName);
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return null;

	}
	
	

	public WebElement ddControllerName() {

		try {
			By controllerName = By.xpath("//div[@class='col-md-6']//select[@ng-model='vm.frm.controller_id']");
			return driver.findElement(controllerName);
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return null;

	}

	public WebElement optionAPSController() {

		try {
			By APSController = By.xpath("//select[@ng-model='vm.frm.controller_id']//option [contains(text(),'APS_Controller')]");
			return driver.findElement(APSController);
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return null;
	}

	public WebElement btnAVAlert() {

		try {
			By AVAlert = By.xpath("//div[@class='col-md-6']//div");
			return driver.findElement(AVAlert);
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return null;
	}
	


}