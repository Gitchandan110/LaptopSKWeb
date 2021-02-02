package com.PageObjectRepository.file;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import com.Commonutills.file.Base;

public class SK_ManageTemplatesPO extends Base {

	public WebElement pageManageTemplate() {

		try {
			By pageTitle = By.xpath("//div[@class='col-md-8' and contains (text(),'Manage Templates')]");
			return driver.findElement(pageTitle);
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return null;

	}

	public WebElement filterTemplateTiltle() {

		try {
			By TemplateTitle = By.id("template_title");
			return driver.findElement(TemplateTitle);
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return null;

	}

	public WebElement filterStatus() {

		try {
			By status = By.xpath("//select[@id='template_status']");
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

	public WebElement linkCreateTemplate() {

		try {
			By btnCreate = By.xpath("//a[@class='kv-btn kv-btn-primary' and contains(text(),'Create Template')]");
			return driver.findElement(btnCreate);
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return null;
	}

	public WebElement txtTitleNotificationTemplate() {

		try {
			By Title = By.id("txtTemplateName");
			return driver.findElement(Title);
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return null;
	}

	public WebElement txtEmailSub() {

		try {
			By Email = By.xpath("//input[@ng-model='vm.frm.email_subject']");
			return driver.findElement(Email);
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return null;
	}

	public WebElement txtEmailContainer() {

		try {
			By EmailContainer = By.xpath("//div[@id='email_content']//div//p");
			return driver.findElement(EmailContainer);
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return null;
	}

	public WebElement txtMobileSMS() {

		try {
			By Mobile = By.xpath("//textarea[@ng-model='vm.frm.sms_content']");
			return driver.findElement(Mobile);
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return null;
	}

	public WebElement txtAppNotification() {

		try {
			By App = By.xpath("//textarea[@ng-model='vm.frm.notification_content']");
			return driver.findElement(App);
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return null;
	}

	public WebElement chkbxGeoAware() {

		try {
			By GeoAware = By.xpath("//input[@type='checkbox'][@ng-model='vm.frm.geo_aware']");
			return driver.findElement(GeoAware);
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return null;
	}
	
	public WebElement txtIVR() {

		try {
			By IVR = By.xpath("//textarea[@ng-model='vm.frm.voice_content']");
			return driver.findElement(IVR);
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return null;
	}
	

	public WebElement dropdownUserGroups() {

		try {
			By UserGroup = By.xpath("//div[@ng-model='vm.userGroups_selected']");
			return driver.findElement(UserGroup);
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return null;
	}

	public List<WebElement> UserGroupList() {

		
		By UserGroups = By.xpath("//div[@class='ui-select-choices-group optgroup']//div[@role]");
		
		return driver.findElements(UserGroups);

	}
	
	public WebElement UserGroup() {

		By UserGroup = By.xpath("//div[@class='ui-select-choices-group optgroup']//div[@role='option']");
		return driver.findElement(UserGroup);

	}
	

	public WebElement dropdownUsers() {

		try {
			By Users = By.xpath("//div[@ng-model='vm.users_selected']");
			return driver.findElement(Users);
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return null;
	}
	
	public List<WebElement> UsersList(){
		
		By UserList=By.xpath("//div[@class='ui-select-choices-group optgroup']//div[@role='option']//div//span");
		
		return driver.findElements(UserList);
		
	
	}
	
	public WebElement Users() {

		By User = By.xpath("//div[@class='ui-select-choices-group optgroup']//div[@role='option']");
		return driver.findElement(User);

	}
	
	public WebElement radioBtnInactive() {

		By Inactive = By.xpath("//input[@type='radio'][@ng-value='false']");
		return driver.findElement(Inactive);

	}
	
	public WebElement radioBtnActive() {

		By Active = By.xpath("//input[@type='radio'][@ng-value='true']");
		return driver.findElement(Active);
	
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
