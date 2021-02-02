package com.PageObjectRepository.file;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import com.Commonutills.file.Base;

public class SK_VisitorPassTypePO extends Base {

	public WebElement pageManageVisitorPassTypes() {

		try {
			By pageName = By.xpath("//*[@class='col-md-8' and contains(text(),'Manage Visitor Pass Types')]");
			return driver.findElement(pageName);
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return null;

	}

	public WebElement filterPassTypeTitle() {

		try {
			By PassType = By.xpath("//input [@id='pass_title']");
			return driver.findElement(PassType);
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return null;
	}

	public WebElement filterNumberOfDays() {

		try {
			By NumberOfDays = By.xpath("//input [@id='pass_validity']");
			return driver.findElement(NumberOfDays);
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return null;
	}

	public WebElement ddStatus() {

		try {
			By status = By.xpath("//select[@id='pass_status']");
			return driver.findElement(status);
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
			System.out.println("Exception in WebElement ddStatus:" + e.getMessage());
		}
		return null;
	}

	public WebElement ddActiveStatus() {

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

	public WebElement ddInactiveStatus() {

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

	public WebElement btnCreateVisitorPassType() {

		try {
			By btnCreate = By
					.xpath("//a[@class='kv-btn kv-btn-primary' and contains(text(),'Create Visitor Pass Type')]");
			return driver.findElement(btnCreate);
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return null;
	}

	public WebElement txtVisitorPassTypeTiltle() {

		try {
			By passTitle = By.cssSelector("input[type='text'][id='txtPasscodeName']");
			return driver.findElement(passTitle);
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return null;
	}

	public WebElement txtDiscriptionVisitorPassType() {

		try {
			By txtDiscription = By.xpath("//textarea[@id='txtPasscodeDesc']");
			return driver.findElement(txtDiscription);
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return null;
	}

	public WebElement ddTimeZone() {

		try {
			By TimeZone = By.xpath("//div[@ng-model='vm.selected_timezone']//div");
			return driver.findElement(TimeZone);
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return null;
	}

	public WebElement txtSearchTimeZone() {

		try {
			By searchTimeZone = By.cssSelector("input[type='search'][aria-label='Select box']");
			return driver.findElement(searchTimeZone);
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return null;
	}

	public WebElement timeZoneAsiaKolkata() {

		try {
			// By asiaKolkataTimeZone =
			// By.xpath("//div//span//span[contains(text(),'Asia/Kolkata')]");
			By asiaKolkataTimeZone = By.xpath("//div[@class='option ui-select-choices-row-inner']");
			return driver.findElement(asiaKolkataTimeZone);
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return null;
	}

	public WebElement txtNumberOfDays() {

		try {
			By numberofDays = By.id("txtPassValidity");
			return driver.findElement(numberofDays);
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return null;
	}
	
	public WebElement txtEmailSubject() {

		try {
			By emailSubject = By.id("email_subject");
			return driver.findElement(emailSubject);
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return null;
	}
	
	

	public WebElement btnMonitorEverywhere() {

		try {
			By MonitorEverywhere = By.cssSelector("input[type='radio'][value='everywhere']");
			return driver.findElement(MonitorEverywhere);
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return null;
	}
	
	
	public WebElement popUpConformationEditVisitorPass() {

		try {
			By popUpConformation = By.xpath("//div[@class='modal-content']");
			return driver.findElement(popUpConformation);
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return null;
	}
	

	public WebElement btnCancelEditVisitorPass() {

		try {
			By btnCancel = By.xpath("//button[contains(text(),'Cancel')]");
			return driver.findElement(btnCancel);
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return null;
	}
	

	public WebElement btnSubmit() {

		try {
			By Submit = By.cssSelector("button[class='kv-btn kv-btn-primary'][type='submit']");
			return driver.findElement(Submit);
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return null;
	}

	public WebElement btnCancel() {

		try {
			By Cancel = By.xpath("//a[@class='kv-btn kv-btn-primary' and contains(text(),'Cancel')]");
			return driver.findElement(Cancel);
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return null;
	}

	public WebElement btnEditVisitorPassType() {

		try {
			By edit = By.xpath("//tbody//tr//td//a[contains(text(),'Edit')]");
			return driver.findElement(edit);
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return null;
	}

}
