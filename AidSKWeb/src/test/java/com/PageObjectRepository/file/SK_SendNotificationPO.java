package com.PageObjectRepository.file;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import com.Commonutills.file.Base;

public class SK_SendNotificationPO extends Base {

	public WebElement pageTitle() {

		try {
			By pageTitle = By.xpath("//div[contains (text(),'Send Notification')]");
			return driver.findElement(pageTitle);
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return null;

	}

	
	public WebElement ddSelectTemplate() {

		try {
			By ddSelectTemplate = By.xpath("//select[@id='ddlTemplate']");
			return driver.findElement(ddSelectTemplate);
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return null;
	}

	public WebElement TemplateOption() {

		try {
			By TemplateOption = By.xpath("//select[@id='ddlTemplate']//option[2]");
			return driver.findElement(TemplateOption);
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
