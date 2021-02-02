package com.BussinessFlow.file;

import java.util.Set;

import com.Commonutills.file.Base;
import com.PageObjectRepository.file.SK_MenuListPO;

public class SK_MenuListBL extends SK_MenuListPO {

	public void clickActiveEvents() throws Exception {

		if (ActiveEvents().isDisplayed() == true) {
			Base.highLightElement(driver, ActiveEvents());
			ActiveEvents().click();
			Thread.sleep(5000);
			Base.FullPageScreenShot("Active Events");

		} else {

			System.out.println("ActiveEvents link not found");
		}

	}

	public void clickClosedEvents() throws Exception {

		if (ClosedEvents().isDisplayed() == true) {
			Base.highLightElement(driver, ClosedEvents());
			ClosedEvents().click();
			Thread.sleep(5000);
			Base.FullPageScreenShot("Closed Events");

		} else {

			System.out.println("ClosedEvents() link not found");
		}

	}

	public void clickGeofences() throws Exception {

		if (menuGeofences() != null && menuGeofences().isDisplayed()) {
			Base.highLightElement(driver, menuGeofences());
			menuGeofences().click();
			System.out.println("menuGeofences() clicked");
			Thread.sleep(10000);
			Base.takeScreenShot("Geofences");

		} else {

			System.out.println("Geofences not found");
		}

	}

	public void clickEmergencyContacts() throws Exception {

		if (menuContacts() != null && menuContacts().isDisplayed()) {
			Base.highLightElement(driver, menuContacts());
			menuContacts().click();
			menuEmergencyContacts().click();
			System.out.println("menuEmergencyContacts() clicked");
			Thread.sleep(10000);
			Base.takeScreenShot("EmergencyContacts");

		} else {

			System.out.println("EmergencyContacts not found");
		}

	}

	public void clickExternalContacts() throws Exception {

		if (menuContacts() != null && menuContacts().isDisplayed()) {
			Base.highLightElement(driver, menuContacts());
			menuContacts().click();
			menuExternalContacts().click();
			System.out.println("menuExternalContacts() clicked");
			Thread.sleep(10000);
			Base.takeScreenShot("ExternalContacts");

		} else {

			System.out.println("ExternalContacts not found");
		}

	}

	public void clickEventNotification() throws Exception {

		if (EventNotification().isDisplayed() == true) {
			Base.highLightElement(driver, EventNotification());
			EventNotification().click();
			Thread.sleep(5000);
			Base.FullPageScreenShot("Event Notification");

		} else {

			System.out.println("EventNotification() link not found");
		}

	}

	public void clickEventAttendence() throws Exception {

		if (EventAttendence().isDisplayed() == true) {
			Base.highLightElement(driver, EventAttendence());
			EventAttendence().click();
			Thread.sleep(5000);
			Base.FullPageScreenShot("Event Attendence");

		} else {

			System.out.println("EventAttendence() link not found");
		}
	}

	public void clickMenuAdministration() throws Exception {

		if (menuAdministration().isDisplayed() == true) {

			Base.highLightElement(driver, menuAdministration());
			menuAdministration().click();
			Thread.sleep(5000);
			Base.FullPageScreenShot("Administration");

		} else {

			System.out.println("Administration link not found");
		}
	}

	public void clickContacts() throws Exception {

		if (Contacts().isDisplayed() == true) {
			Base.highLightElement(driver, Contacts());
			Contacts().click();
			Thread.sleep(3000);

		} else {

			System.out.println("Contact() link not found");
		}
	}

	public void clickEmergencyContact() throws Exception {

		if (EmergencyContact().isDisplayed() == true) {

			Base.highLightElement(driver, EmergencyContact());
			EmergencyContact().click();
			Thread.sleep(5000);
			Base.FullPageScreenShot("Emergency Contacts");

		} else {

			System.out.println("EmergencyContact() link not found");
		}
	}

	public void clickExternalContact() throws Exception {

		if (ExternalContact().isDisplayed() == true) {
			Base.highLightElement(driver, ExternalContact());
			ExternalContact().click();
			Thread.sleep(5000);
			Base.FullPageScreenShot("External Contacts");

		} else {

			System.out.println("ExternalContact() link not found");
		}
	}

	public void clickAssets() throws Exception {

		if (menuAssets().isDisplayed() == true) {
			Base.highLightElement(driver, menuAssets());
			menuAssets().click();
			System.out.println("menuAssets found and clicked");
			Thread.sleep(5000);

		} else {

			System.out.println("menuAssets() not found");
		}
	}

	public void clickManageAssets() throws Exception {

		if (menuManageAssets().isDisplayed() == true) {
			Base.highLightElement(driver, menuManageAssets());
			menuManageAssets().click();
			Thread.sleep(9000);
			Base.FullPageScreenShot("Assets");

		} else {

			System.out.println("Assets not found");
		}
	}

	public void clickMenuCommunications() throws Exception {

		if (menuCommunications() != null && menuCommunications().isDisplayed()) {
			Base.scrolltoElement(driver, menuCommunications());
			Base.highLightElement(driver, menuCommunications());
			menuCommunications().click();
			System.out.println("menuCommunications() Clicked");
			Thread.sleep(3000);
		}

		else {

			System.out.println("menuCommunications() not found");
		}

	}

	public void clickNotifications() throws Exception {

		if (menuNotifications() != null && menuNotifications().isDisplayed()) {
			Base.scrolltoElement(driver, menuNotifications());
			Base.highLightElement(driver, menuNotifications());
			menuNotifications().click();
			System.out.println("menuNotifications() found and clicked");
			Thread.sleep(7000);

		} else {

			System.out.println("menuNotifications() not found");
		}
	}

	public void clickSendNotification() throws Exception {

		if (sendNotifications() != null && sendNotifications().isDisplayed()) {
			Base.highLightElement(driver, sendNotifications());
			sendNotifications().click();
			System.out.println("Send Notification found and Clicked");
			Thread.sleep(5000);
		} else {

			System.out.println("SendNotification() not found");
		}
	}

	public void clickSchedule() throws Exception {

		if (MenuSchedule() != null && MenuSchedule().isDisplayed()) {
			Base.highLightElement(driver, MenuSchedule());
			MenuSchedule().click();
			System.out.println("Schedule found and clicked");
			Thread.sleep(5000);
			Base.FullPageScreenShot("Schedule");

		} else {

			System.out.println("schedule() not found");
		}

	}

	public void clickPolling() throws Exception {

		if (Polling() != null && Polling().isDisplayed()) {
			Base.highLightElement(driver, Polling());
			Polling().click();
			System.out.println("Polling() found and clicked");
			Thread.sleep(5000);

		} else {

			System.out.println("Polling() not found");
		}

	}

	public void clickSendAPoll() throws Exception {

		if (SendAPoll() != null && SendAPoll().isDisplayed()) {
			Base.highLightElement(driver, SendAPoll());
			SendAPoll().click();
			System.out.println("SendAPoll() found and clicked");
			Thread.sleep(8000);
			Base.takeScreenShot("Polling");

		} else {

			System.out.println("SendAPoll() not found");
		}

	}

	public void clickPollGroups() throws Exception {

		if (PollGroups() != null && PollGroups().isDisplayed()) {
			Base.highLightElement(driver, PollGroups());
			PollGroups().click();
			System.out.println("PollGroups() found and clicked");
			Thread.sleep(8000);
			Base.takeScreenShot("Polling");

		} else {

			System.out.println("PollGroups() not found");
		}

	}

	public void clickGroups() throws Exception {

		if (MenuGroups() != null && MenuGroups().isDisplayed()) {
			Base.highLightElement(driver, MenuGroups());
			MenuGroups().click();
			Thread.sleep(8000);
			Base.FullPageScreenShot("Notification Groups");

		} else {

			System.out.println("Notification Groups not found");
		}
	}

	public void clickTemplates() throws Exception {

		if (menuTemplates() != null && menuTemplates().isDisplayed()) {
			Base.highLightElement(driver, menuTemplates());
			menuTemplates().click();
			System.out.println("menuTemplates() Clicked");
			Thread.sleep(5000);
			Base.FullPageScreenShot("Templates");

		} else {

			System.out.println("menuTemplates() not found");
		}

	}

	public void clickTipNotification() throws Exception {

		if (menuTipNotification() != null
				&& menuTipNotification().isDisplayed()) {
			Base.highLightElement(driver, menuTipNotification());
			menuTipNotification().click();
			Thread.sleep(5000);
			Base.FullPageScreenShot("Tip Notification");

		} else {

			System.out.println("menuTipNotification() not found");
		}

	}

	public void clickNotificationHistory() throws Exception {

		if (menuNotificationHistory() != null
				&& menuNotificationHistory().isDisplayed()) {
			Base.highLightElement(driver, menuNotificationHistory());
			menuNotificationHistory().click();
			Thread.sleep(15000);
			Base.FullPageScreenShot("Notification History");

		} else {

			System.out.println("menuNotificationHistory() not found");
		}

	}

	public void clickCovidCover() throws Exception {

		if (menuCovidCover() != null && menuCovidCover().isDisplayed()) {
			Base.scrolltoElement(driver, menuCovidCover());
			Base.highLightElement(driver, menuCovidCover());
			menuCovidCover().click();
			System.out.println("menuCovidCover() Clicked");
			Base.takeScreenShot("CovidCover");
			Thread.sleep(3000);

		} else {

			System.out.println("menuCovidCover() not found");
		}

	}

	public void clickConfigure() throws Exception {

		if (menuConfigure() != null && menuConfigure().isDisplayed()) {
			Base.scrolltoElement(driver, menuConfigure());
			menuConfigure().click();
			Thread.sleep(15000);
			Base.takeScreenShot("CovidCover");
			Base.FullPageScreenShot("Covid Survey Configuration");

		} else {

			System.out.println("Covid Survey not found");
		}

	}

	public void clickMenuOrganizationResources() throws Exception {

		if (menuOrganizationResources() != null
				&& menuOrganizationResources().isDisplayed()) {
			Base.highLightElement(driver, menuOrganizationResources());
			menuOrganizationResources().click();
			Thread.sleep(5000);
			Base.takeScreenShot("Organization Resources");

		}

		else {

			System.out.println("Menu Organization Resources not found");
		}
	}

	public void clickMenuVisitorManagement() throws Exception {

		if (menuVisitorManagement() != null
				&& menuVisitorManagement().isDisplayed()) {
			menuVisitorManagement().click();
			Thread.sleep(2000);

		} else {

			System.out.println("Visitor Management Menu not found");
		}

	}

	public void clickMenuVisitorPassType() throws Exception {

		if (menuVisitorPassType() != null
				&& menuVisitorPassType().isDisplayed()) {
			menuVisitorPassType().click();
			System.out.println("menuVisitorPassType selected");
			Thread.sleep(5000);
			Base.FullPageScreenShot("Visitor Pass Type");

		} else {

			System.out.println("menuVisitorPassType() not found");
		}

	}

	public void clickVisitorPasses() throws Exception {

		if (linkVisitorPasses() != null && linkVisitorPasses().isDisplayed()) {
			linkVisitorPasses().click();
			System.out.println("Visitor Passes selected");
			Thread.sleep(5000);
			Base.FullPageScreenShot("Visitor Passes");

		} else {

			System.out.println("Visitor Passes not found");
		}

	}

	public void clickMaps() throws Exception {

		if (Map() != null && Map().isDisplayed()) {
			Base.highLightElement(driver, Map());
			Map().click();
			System.out.println("Map clicked");
			Thread.sleep(10000);
			Base.takeScreenShot("Map");

		} else {

			System.out.println("Map not found");
		}

	}

	public void clickVideoConference() throws Exception {

		if (VideoConference() != null && VideoConference().isDisplayed()) {
			Base.highLightElement(driver, VideoConference());
			VideoConference().click();
			Thread.sleep(5000);
			Base.takeScreenShot("VideoConference");

		} else {

			System.out.println("VideoConference() not found");
		}

	}

	public void clickReports() throws Exception {

		if (Reports().isDisplayed() == true) {
			Base.scrolltoElement(driver, Reports());
			Base.highLightElement(driver, Reports());
			Reports().click();
			Thread.sleep(8000);
			Base.takeScreenShot("Reports");

		} else {

			System.out.println("Reports() link not found");
		}
	}

	public void clickAllReports() throws Exception {

		if (AllReports().isDisplayed() == true) {
			AllReports().click();
			Thread.sleep(8000);
			Base.FullPageScreenShot("Reports");

		} else {

			System.out.println("All Reports() link not found");
		}

	}

	public void clickEventResponsePlans() throws Exception {

		if (EventResponsePlans().isDisplayed() == true) {
			Base.scrolltoElement(driver, EventResponsePlans());
			Base.highLightElement(driver, EventResponsePlans());
			EventResponsePlans().click();
			Thread.sleep(5000);
			Base.takeScreenShot("ERP");

		} else {

			System.out.println("ERP link not found");
		}

	}

	public void clickManageERP() throws Exception {

		if (ManageERP().isDisplayed() == true) {
			ManageERP().click();
			Thread.sleep(6000);
			System.out.println("ERP List screen displayed");
			Base.FullPageScreenShot("Manage ERP");

		} else {

			System.out.println("ManageERP link not found");
		}

	}

	public void clickShowERP() throws Exception {

		if (ShowERP().isDisplayed() == true) {
			ShowERP().click();
			Thread.sleep(3000);
			System.out.println("Show ERP screen displayed");
			Base.FullPageScreenShot("Show ERP");

		} else {

			System.out.println("ShowERP link not found");
		}

	}

	public void clickAudioVisualAlarms() throws Exception {

		if (AudioVisualAlarms() != null && AudioVisualAlarms().isDisplayed()) {
			Base.highLightElement(driver, AudioVisualAlarms());
			AudioVisualAlarms().click();
			System.out.println("AudioVisualAlarms() found and clicked");
			Thread.sleep(5000);

		} else {

			System.out.println("AudioVisualAlarms() not found");
		}

	}

	public void clickActivateAVAlarms() throws Exception {

		if (ActivateAVAlarms() != null && ActivateAVAlarms().isDisplayed()) {
			Base.highLightElement(driver, ActivateAVAlarms());
			ActivateAVAlarms().click();
			System.out.println("ActivateAVAlarms() found and clicked");
			Thread.sleep(20000);

		} else {

			System.out.println("Activate AVAlarms not found");
		}

	}

	public void clickManageAlarms() throws Exception {

		if (ManageAVAlarms() != null && ManageAVAlarms().isDisplayed()) {
			Base.highLightElement(driver, ManageAVAlarms());
			ManageAVAlarms().click();
			System.out.println("ManageAVAlarms() found and clicked");
			Thread.sleep(3000);

		} else {

			System.out.println("ManageAVAlarms() not found");
		}

	}

	public void clickManageControllers() throws Exception {

		if (ManageControllers() != null && ManageControllers().isDisplayed()) {
			Base.highLightElement(driver, ManageControllers());
			ManageControllers().click();
			System.out.println("ManageControllers() found and clicked");
			Thread.sleep(8000);
			Base.takeScreenShot("AudioVisual Controllers");

		} else {

			System.out.println("ManageControllers() not found");
		}

	}

	public void clickManageAlarmDevices() throws Exception {

		if (ManageAlarmDevices() != null && ManageAlarmDevices().isDisplayed()) {
			Base.highLightElement(driver, ManageAlarmDevices());
			ManageAlarmDevices().click();
			System.out.println("ManageAlarmDevices() found and clicked");
			Thread.sleep(8000);
			Base.takeScreenShot("AudioVisual Controllers");

		} else {

			System.out.println("ManageAlarmDevices() not found");
		}

	}

	public void clickManageVirtualAlarms() throws Exception {

		if (ManageVirtualAlarms() != null
				&& ManageVirtualAlarms().isDisplayed()) {
			Base.highLightElement(driver, ManageVirtualAlarms());
			ManageVirtualAlarms().click();
			System.out.println("ManageVirtualAlarms() found and clicked");
			Thread.sleep(10000);
			Base.takeScreenShot("AudioVisual Controllers");
			Base.FullPageScreenShot("Manage VirtualAlarms");

		} else {

			System.out.println("ManageAlarmDevices() not found");
		}

	}

	public void clickAVAlarmsHistory() throws Exception {

		if (AVAlarmsHistory() != null && AVAlarmsHistory().isDisplayed()) {
			Base.highLightElement(driver, AVAlarmsHistory());
			AVAlarmsHistory().click();
			System.out.println("AVAlarmsHistory() found and clicked");
			Thread.sleep(10000);
			Base.takeScreenShot("AudioVisual Controllers");
			Base.FullPageScreenShot("AV Alert History");

		} else {

			System.out.println("AVAlarmsHistory() not found");
		}

	}

	public void clickUsers() throws Exception {

		if (Users() != null && Users().isDisplayed()) {
			Base.highLightElement(driver, Users());
			Users().click();
			System.out.println("Users() found and clicked");
			Thread.sleep(8000);

		} else {

			System.out.println("Users() not found");
		}

	}

	public void clickUserProfiles() throws Exception {

		if (UserProfiles() != null && UserProfiles().isDisplayed()) {
			Base.highLightElement(driver, UserProfiles());
			UserProfiles().click();
			System.out.println("UserProfiles() found and clicked");
			Thread.sleep(15000);
			Base.takeScreenShot("Users");
			Base.FullPageScreenShot("Users Profile");

		} else {

			System.out.println("UserProfiles() not found");
		}

	}

	public void clickAppUser() throws Exception {

		if (AppUser() != null && AppUser().isDisplayed()) {
			Base.highLightElement(driver, AppUser());
			AppUser().click();
			System.out.println("AppUser() found and clicked");
			Thread.sleep(3000);

		} else {

			System.out.println("AppUser() not found");
		}

	}

	public void clickAppUsersPermissions() throws Exception {

		if (AppUsersPermissions() != null
				&& AppUsersPermissions().isDisplayed()) {
			Base.highLightElement(driver, AppUsersPermissions());
			AppUsersPermissions().click();
			System.out.println("AppUsersPermissions() found and clicked");
			Thread.sleep(15000);
			Base.takeScreenShot("AppUsers Permissions");
			Base.FullPageScreenShot("AppUsers Permissions");

		} else {

			System.out.println("AppUsers Permissions not found");
		}

	}

	public void clickUserContacts() throws Exception {

		if (userContacts() != null && userContacts().isDisplayed()) {
			Base.highLightElement(driver, userContacts());
			userContacts().click();
			System.out.println("userContacts() found and clicked");
			Thread.sleep(15000);
			Base.takeScreenShot("Users");
			Base.FullPageScreenShot("Users Contacts");

		} else {

			System.out.println("Users Contacts not found");
		}

	}

}
