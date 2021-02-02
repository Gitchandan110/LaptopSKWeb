package com.PageObjectRepository.file;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import com.Commonutills.file.Base;

public class SK_MenuListPO extends Base {

	public WebElement ActiveEvents() {

		try {
			By activeEvents = By.xpath("//a[@href='/observer/']");
			return driver.findElement(activeEvents);
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return null;
	}

	public WebElement ClosedEvents() {

		try {
			By closedEvents = By.xpath("//li[@class='system-nav-item-closed-incidents ']");
			return driver.findElement(closedEvents);
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return null;
	}
	
	
	public WebElement menuGeofences() {

		try {
			By Geofences = By.xpath("//a[@href='/geofence/']");
			
			//a//span[contains(text(),'Geo Fences')]
			
			return driver.findElement(Geofences);
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return null;
	}
	
	
	public WebElement menuContacts() {

		try {
			By Contacts = By.xpath("//a//span[contains(text(),'Contacts')]");
			
			//a//span[contains(text(),'Geo Fences')]
			
			return driver.findElement(Contacts);
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return null;
	}
	
	
	public WebElement menuEmergencyContacts() {

		try {
			By EmergencyContacts = By.xpath("//a[contains(text(),'Emergency Contacts')]");
			
			//a//span[contains(text(),'Geo Fences')]
			
			return driver.findElement(EmergencyContacts);
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return null;
	}
	
	public WebElement menuExternalContacts() {

		try {
			By ExternalContacts = By.xpath("//a[contains(text(),'External Contacts')]");
			
			//a//span[contains(text(),'Geo Fences')]
			
			return driver.findElement(ExternalContacts);
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return null;
	}
	
	

	
	public WebElement menuAssets() {

		try {
			By Assets = By.xpath("//a//span[contains(text(),'Assets')]");
			
			//a//span[contains(text(),'Geo Fences')]
			
			return driver.findElement(Assets);
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return null;
	}
	

	
	public WebElement menuManageAssets() {

		try {
			By ManageAssets = By.xpath("//li//a[@href='/assets/list/']");
			
			//a//span[contains(text(),'Geo Fences')]
			
			return driver.findElement(ManageAssets);
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return null;
	}

	public WebElement EventNotification() {

		try {
			By EventNotification = By.xpath("//li[@class='system-nav-item-incident-notifications ']");
			return driver.findElement(EventNotification);
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return null;
	}

	public WebElement EventAttendence() {

		try {
			By EventAttendence = By.xpath("//li[@class='system-nav-item-incident-observer ']");
			return driver.findElement(EventAttendence);
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return null;
	}

	public WebElement menuAdministration() {

		By Administration = By.xpath("//a[@href='/organization/']");

		// By linkOrganization= By.cssSelector("a[href='/organization/']");

		return driver.findElement(Administration);
	}
	
	
	public WebElement Contacts() {

		try {
			By contacts = By.xpath("//li[@class='system-nav-item-org-contacts']");
			return driver.findElement(contacts);
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return null;
	}
	
	

	public WebElement EmergencyContact() {

		try {
			By EventAttendence = By.xpath("//li//a[contains(text(),'Emergency Contacts')]");
			
			return driver.findElement(EventAttendence);
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return null;
	}
	
	public WebElement ExternalContact() {

		try {
			By EventAttendence = By.xpath("//li//a[contains(text(),'External Contacts')]");
			return driver.findElement(EventAttendence);
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return null;
	}
	
	
	
	public WebElement menuCommunications() {

		try {
			By Communications = By.xpath("//li[@class='dropdown communications']//a");
			return driver.findElement(Communications);
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return null;
	}
	
	public WebElement menuNotifications() {

		try {
			By Notifications = By.xpath("//li[@class='system-nav-item-broadcast']//a");
			return driver.findElement(Notifications);
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return null;
	}
	
	
	public WebElement sendNotifications() {

		try {
			By Send = By.xpath("//li[@class='system-nav-item-broadcast']//ul//li//a[contains(text(),'Send')]");
			return driver.findElement(Send);
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return null;
	}
	
	public WebElement MenuSchedule() {

		try {
			By Schedule = By.xpath("//li[@class='system-nav-item-broadcast']//ul//li//a[contains(text(),'Schedule')]");
			return driver.findElement(Schedule);
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return null;
	}
	
		
	public WebElement MenuGroups() {

		try {
			By Groups = By.xpath("//li[@class='system-nav-item-broadcast']//ul//li//a[contains(text(),'Groups')]");
			return driver.findElement(Groups);

		} catch (Exception e) {
			System.out.println("Groups locator is incorrect" + e.getMessage());
			e.printStackTrace();
		}
		return null;
	}

	public WebElement menuTemplates() {

		try {
			By Templates = By.linkText("Templates");
			return driver.findElement(Templates);

		} catch (Exception e) {
			System.out.println("menuTemplates() locator is incorrect" + e.getMessage());
			e.printStackTrace();
		}
		return null;
	}
	
	public WebElement menuTipNotification() {

		try {
			By TipNotification = By.xpath("//li[@class='system-nav-item-broadcast']//ul//li//a[contains(text(),'Tip Notifications')]");
			
		//	By ManageTemplates = By.xpath("//a[@href='/broadcast/template/list/']");
			return driver.findElement(TipNotification);

		} catch (Exception e) {
			System.out.println("menuManageTemplates() locator is incorrect" + e.getMessage());
			e.printStackTrace();
		}
		return null;
	}
	

	public WebElement menuNotificationHistory() {

		try {
			By History = By.xpath("//li[@class='system-nav-item-broadcast']//ul//li//a[contains(text(),'History')]");
			
		//	By ManageTemplates = By.xpath("//a[@href='/broadcast/template/list/']");
			return driver.findElement(History);

		} catch (Exception e) {
			System.out.println("menuNotificationHistory() locator is incorrect" + e.getMessage());
			e.printStackTrace();
		}
		return null;
	}
	
	
	public WebElement menuCovidCover() {

		try {
			By CovidCover = By.xpath("//li[@class='dropdown covid_kuvrr']//a");
			return driver.findElement(CovidCover);
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return null;
	}
	
	
	public WebElement menuConfigure() {

		try {
			By Configure = By.xpath("//li[@class='system-nav-item-survey-config ']//a");
			return driver.findElement(Configure);
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return null;
	}
	
	
	
	public WebElement menuOrganizationResources() {

		try {
			By OrganizationResources = By.xpath("//li[@class='dropdown organizations']//a");
			return driver.findElement(OrganizationResources);
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return null;
	}
	
	
	
	
	
	
	public WebElement menuVisitorManagement() {

		try {
			By menuVisitor = By.xpath("//li[@class='system-nav-item-guests']");
			return driver.findElement(menuVisitor);
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return null;
	}

	public WebElement menuVisitorPassType() {

		try {
			By menuVisitorPass = By.xpath("//a[@href='/visitor_management/visitor_passtypes/']");
			return driver.findElement(menuVisitorPass);
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return null;
	}

	public WebElement linkVisitorPasses() {

		try {
			By VisitorPasses = By.xpath("//a[@href='/visitor_management/visitors/']");
			return driver.findElement(VisitorPasses);
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return null;
	}

	public WebElement Polling() {

		try {
			By Polling = By.xpath("//li[@class='system-nav-item-poll']//a");
			return driver.findElement(Polling);
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return null;
	}
	
	public WebElement SendAPoll() {

		try {
			By SendAPoll = By.xpath("//li//a[contains(text(),'Send a Poll')]");
			return driver.findElement(SendAPoll);
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return null;
	}
	
	public WebElement PollGroups() {

		try {
			By PollGroups = By.xpath("//li//a[@href='/notification/send/']");
			return driver.findElement(PollGroups);
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return null;
	}
	
	
	public WebElement Map() {

		try {
			By Map = By.xpath("//li[@class='system-nav-item-maps']//a");
			return driver.findElement(Map);
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return null;
	}

	public WebElement VideoConference() {

		try {
			By video = By.xpath("//li[@class='system-nav-item-video']");
			return driver.findElement(video);
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return null;
	}

	public WebElement Reports() {

		try {
			By Reports = By.xpath("//li[@class='dropdown reports']//a");
			return driver.findElement(Reports);
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return null;
	}
	

	
	
	public WebElement AllReports() {

		try {
			By AllReports = By.xpath("//li[@class='system-nav-item-all-reports ']//a");
			return driver.findElement(AllReports);
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return null;
	}
	
	

	public WebElement EventResponsePlans() {

		try {
			By IRP = By.xpath("//li[@class='system-nav-item-irp']//a");
			return driver.findElement(IRP);
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return null;
	}


	
	public WebElement ManageERP() {

		try {
			By ManageERP = By.xpath("//li[@class='system-nav-item-irp']//ul//li//a[contains (text(),'Manage')]");
			return driver.findElement(ManageERP);
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return null;
	}
	
	public WebElement ShowERP() {

		try {
			By ShowERP = By.xpath("//li[@class='system-nav-item-irp']//ul//li//a[contains (text(),'Show')]");
			return driver.findElement(ShowERP);
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return null;
	}
	
	
	public WebElement AudioVisualAlarms() {

		try {
			By AudioVisualAlarms = By.xpath("//li[@class='dropdown av_alarms']//a");
			return driver.findElement(AudioVisualAlarms);
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return null;
	}
	
	
	
	public WebElement ActivateAVAlarms() {

		try {
			By ActivateAVAlarms = By.xpath("//li[@class='system-nav-item-avalert-activate ']//a");
			return driver.findElement(ActivateAVAlarms);
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return null;
	}
	
	public WebElement ManageAVAlarms() {

		try {
			By ManageAVAlarms = By.xpath("//li[@class='system-nav-item-manage-avalerts']//a");
			return driver.findElement(ManageAVAlarms);
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return null;
	}
	

	public WebElement ManageControllers() {

		try {
			By Controllers = By.xpath("//li//a[contains(text(),'Controller(s)')]");
			return driver.findElement(Controllers);
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return null;
	}
	
	
	public WebElement ManageAlarmDevices() {

		try {
			By AlarmDevices = By.xpath("//li//a[contains(text(),'Alarm Devices')]");
			return driver.findElement(AlarmDevices);
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return null;
	}
	
	public WebElement ManageVirtualAlarms() {

		try {
			By VirtualAlarms = By.xpath("//li//a[contains(text(),'Virtual Alarms')]");
			return driver.findElement(VirtualAlarms);
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return null;
	}
	

	public WebElement AVAlarmsHistory() {

		try {
			By AVAlarmsHistory = By.xpath("//li[@class='system-nav-item-avalert-history ']//a");
			return driver.findElement(AVAlarmsHistory);
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return null;
	}
	
	
	
	
	public WebElement Geofences() {

		try {
			By geo = By.xpath("//li[@class='system-nav-item-geofences ']");
			return driver.findElement(geo);
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return null;
	}

	public WebElement Users() {

		try {
			By users = By.xpath("//li[@class='dropdown users']//a");
			return driver.findElement(users);
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return null;
	}

	public WebElement UserProfiles() {

		try {
			By userProfiles = By.xpath("//a[@href='/user/']");
			
			//xpath[//li[@class='system-nav-item-user-profiles ']//a[@href='/user/']"]
			
			return driver.findElement(userProfiles);
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return null;
	}
	
	
	
	
	public WebElement AppUser() {

		try {
			By appUser = By.xpath("//li[@class='system-nav-item-users']");
			return driver.findElement(appUser);
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return null;
	}

	public WebElement AppUsersPermissions() {

		try {
			By appPermissions = By.xpath("//li//a[contains(text(),'Permissions')]");
			return driver.findElement(appPermissions);
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return null;
	}

	public WebElement userDevices() {

		try {
			By devices = By.xpath("//li[@class='system-nav-item-user-devices ']");
			return driver.findElement(devices);
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return null;
	}

	public WebElement userContacts() {

		try {
			By contacts = By.xpath("//li//a[@href='/contact/' and contains(text(),'Contacts')]");
			return driver.findElement(contacts);
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return null;
	}

	public WebElement CentralStation() {

		try {
			By centralStation = By.xpath("//li[@class='system-nav-item-central-station ']");
			return driver.findElement(centralStation);
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return null;
	}

}
