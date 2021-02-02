package com.PageObjectRepository.file;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import com.Commonutills.file.Base;

public class SK_ScheduleNotificationPO extends Base {

	public WebElement pageTitle() {

		try {
			By pageTitle = By.xpath("//div[@class='col-md-8' and contains (text(),'Schedule Notification')]");
			return driver.findElement(pageTitle);
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return null;

	}

	public WebElement filterTitle() {

		try {
			By filterTitle = By.xpath("//input[@id='txtTitle'][@ng-model='vm.filter.title']");
			return driver.findElement(filterTitle);
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return null;

	}

	public WebElement ddStatus() {

		try {
			By ddStatus = By.xpath("//select[@id='ddlStatus']");
			return driver.findElement(ddStatus);
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
	
	
	
	public WebElement filterExpiredStatus() {

		try {
			By ExpiredStatus = By.xpath("//option[@value='Completed']");
			return driver.findElement(ExpiredStatus);
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

	public WebElement linkCreateNewSchedule() {

		try {
			By CreateNewSchedule = By.xpath("//a[@class='kv-btn kv-btn-primary' and contains(text(),'New')]");
			return driver.findElement(CreateNewSchedule);
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return null;
	}
	
	public WebElement headerckOrgDemo() {

		try {
			By headerckOrgDemo = By.xpath("//div[@class='top-warning web-only' and contains (text(),'ckOrg')]");
			return driver.findElement(headerckOrgDemo);
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return null;
	}
	
	
	public WebElement logoSafetyKuvrr() {

		try {
			By logoSafetyKuvrr = By.xpath("//span[@class='logo']");
			return driver.findElement(logoSafetyKuvrr);
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

	public WebElement AutomationTemplate() {

		try {
			By templateOption = By.xpath("//option[@class='ng-binding ng-scope' and contains (text(),'Automation Template')]");
			return driver.findElement(templateOption);
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return null;
	}

	
	public WebElement ddTimeZone() {

		By ddTimeZone = By.xpath("//div[@ng-model='vm.selected_timezone']//div");
		return driver.findElement(ddTimeZone);

	}
	
	
	public WebElement textTimeZone() {

		By textTimeZone = By.xpath("//div[@ng-model='vm.selected_timezone']//div//input[@type='search']");
		return driver.findElement(textTimeZone);

	}
	

	public WebElement optionAsiaKolkata() {

		By textTimeZone = By.xpath("//div[@class='option ui-select-choices-row-inner']");
		return driver.findElement(textTimeZone);

	}
	
	
	
	public WebElement btnCalendarStartDate() {

		By calendarStartDate = By.xpath("//input[@type='text'][@id='start_date']");
		return driver.findElement(calendarStartDate);

	}
	

	public WebElement selectCalendarDate() {

		By calendarStartDate = By.xpath("//td[@class=' '][@data-handler='selectDay'][@data-event='click']");
		return driver.findElement(calendarStartDate);

	}
	
	public WebElement btnSubmitSchedule() {

		By btnSubmitSchedule = By.xpath("//button[@type='submit']");
		return driver.findElement(btnSubmitSchedule);

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
