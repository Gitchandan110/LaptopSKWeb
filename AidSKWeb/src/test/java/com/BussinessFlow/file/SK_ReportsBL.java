package com.BussinessFlow.file;

import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;

import com.Commonutills.file.Base;
import com.PageObjectRepository.file.SK_MenuListPO;
import com.PageObjectRepository.file.SK_ReportsPO;

public class SK_ReportsBL extends SK_ReportsPO {

	public void clickCommunicationHistoryReports() throws Exception {

		if (CommunicationHistoryReports().isDisplayed() == true) {
			Base.highLightElement(driver, CommunicationHistoryReports());
			CommunicationHistoryReports().click();
			Thread.sleep(6000);
			Base.FullPageScreenShot("Communication History Dashboard");
			System.out.println("CommunicationHistoryDashboard found");

			Base.scrolltoElement(driver, tabCommunicationHistory());
			Base.highLightElement(driver, tabCommunicationHistory());
			System.out.println("Communication History tab found");
			Thread.sleep(3000);

		}

		String url = driver.getCurrentUrl();
		System.out.println(url);
		if (url.equalsIgnoreCase("https://safety-red5.kuvrr.com/report/communication-history-dashboard/")) {
			System.out.println("Red5 Server is running");

			driver.navigate()
					.to("https://safety-red5.kuvrr.com/report/communication-history/");

		}

		else if (url
				.equalsIgnoreCase("https://safety.kuvrr.com/report/communication-history-dashboard/")) {
			System.out.println("Production Server is running");

			driver.navigate().to(
					"https://safety.kuvrr.com/report/communication-history/");

		}

		else if (url
				.equalsIgnoreCase("https://safety-test.kuvrr.com/report/communication-history-dashboard/")) {
			System.out.println("Dev Server is running");

			driver.navigate()
					.to("https://safety-test.kuvrr.com/report/communication-history/");

		}

		System.out.println("Communication History screen Opened");
		Thread.sleep(6000);
		Base.FullPageScreenShot("Communication History");
		BacktoReport().click();
		Thread.sleep(4000);

	}

	public void clickEventsHistoryReport() throws Exception {

		if (EventsHistoryReport().isDisplayed() == true) {
			Base.highLightElement(driver, EventsHistoryReport());
			EventsHistoryReport().click();
			Thread.sleep(5000);
			Base.FullPageScreenShot("Events History Dashboard");

		} else {

			System.out.println("EventsHistoryReport() not found");
		}

	}

	public void clickTabEventHistory() throws Exception {

		if (tabEventHistory().isDisplayed() == true) {
			Base.highLightElement(driver, tabEventHistory());
			tabEventHistory().click();
			Thread.sleep(8000);
			Base.FullPageScreenShot("Events History");
			BacktoReport().click();
			Thread.sleep(4000);

		} else {

			System.out.println("Event History not found");
		}

	}

	public void clickSelfCertificationDashboardReports() throws Exception {

		if (SelfCertificationDashboardReports().isDisplayed() == true) {
			Base.highLightElement(driver, SelfCertificationDashboardReports());
			SelfCertificationDashboardReports().click();
			Thread.sleep(5000);
			Base.FullPageScreenShot("Self Certification Dashboard Reports");
			BacktoReport().click();
			Thread.sleep(5000);

		} else {

			System.out.println("SelfCertificationDashboardReports() not found");
		}

	}

	public void clickSelfCertificationAlertsReports() throws Exception {

		if (SelfCertificationAlertsReports().isDisplayed() == true) {
			Base.highLightElement(driver, SelfCertificationAlertsReports());
			SelfCertificationAlertsReports().click();
			Thread.sleep(5000);
			Base.FullPageScreenShot("Self Certification Alerts Reports");
			BacktoReport().click();
			Thread.sleep(5000);

		} else {

			System.out.println("SelfCertificationAlertsReports() not found");
		}

	}

	public void clickSelfCertificationHistoryReports() throws Exception {

		if (SelfCertificationHistoryReports().isDisplayed() == true) {
			Base.highLightElement(driver, SelfCertificationHistoryReports());
			SelfCertificationHistoryReports().click();
			Thread.sleep(5000);
			Base.FullPageScreenShot("Self Certification Alerts Reports");
			BacktoReport().click();
			Thread.sleep(5000);

		} else {

			System.out.println("SelfCertificationHistoryReports() not found");
		}

	}

	public void clickThermalScanAlertsReports() throws Exception {

		if (ThermalScanAlertsReports().isDisplayed() == true) {
			Base.highLightElement(driver, ThermalScanAlertsReports());
			ThermalScanAlertsReports().click();
			Thread.sleep(5000);
			Base.FullPageScreenShot("Thermal Scan Alerts Reports");
			BacktoReport().click();
			Thread.sleep(5000);

		} else {

			System.out.println("ThermalScanAlertsReports() not found");
		}

	}

	public void clickThermalScanDashboardReports() throws Exception {

		if (ThermalScanDashboardReports().isDisplayed() == true) {
			Base.highLightElement(driver, ThermalScanDashboardReports());
			ThermalScanDashboardReports().click();
			Thread.sleep(5000);
			Base.FullPageScreenShot("Thermal Scan Dashboard Reports");
			BacktoReport().click();
			Thread.sleep(5000);

		} else {

			System.out.println("ThermalScanDashboardReports() not found");
		}

	}

	public void clickThermalScanHistoryReports() throws Exception {

		if (ThermalScanHistoryReports().isDisplayed() == true) {
			Base.highLightElement(driver, ThermalScanHistoryReports());
			ThermalScanHistoryReports().click();
			Thread.sleep(5000);
			Base.FullPageScreenShot("Thermal Scan History Reports");
			BacktoReport().click();
			Thread.sleep(5000);

		} else {

			System.out.println("ThermalScanHistoryReports() not found");
		}

	}

	public void clickTipHistoryReports() throws Exception {

		if (TipHistoryReports().isDisplayed() == true) {
			Base.highLightElement(driver, TipHistoryReports());
			TipHistoryReports().click();
			Thread.sleep(5000);
			Base.FullPageScreenShot("Tip History Reports");
			BacktoReport().click();
			Thread.sleep(5000);

		} else {

			System.out.println("TipHistoryReports() not found");
		}

	}

	public void clickTipsByCategoryReports() throws Exception {

		if (TipsByCategoryReports().isDisplayed() == true) {
			Base.highLightElement(driver, TipsByCategoryReports());
			TipsByCategoryReports().click();
			Thread.sleep(5000);
			Base.FullPageScreenShot("Tip By Category Reports");
			BacktoReport().click();
			Thread.sleep(5000);

		} else {

			System.out.println("TipsByCategoryReports() not found");
		}

	}

	public void clickIncomingTipsByDayTimeReports() throws Exception {

		if (IncomingTipsByDayTimeReports().isDisplayed() == true) {
			Base.highLightElement(driver, IncomingTipsByDayTimeReports());
			IncomingTipsByDayTimeReports().click();
			Thread.sleep(5000);
			Base.FullPageScreenShot("Incoming Tips By Day Time Reports");
			BacktoReport().click();
			Thread.sleep(5000);

		} else {

			System.out.println("IncomingTipsByDayTimeReports() not found");
		}

	}

	public void clickUserReport() throws Exception {

		if (UserReport().isDisplayed() == true) {
			Base.highLightElement(driver, UserReport());
			UserReport().click();
			Thread.sleep(5000);
			Base.FullPageScreenShot("App User Dashboard Reports");
			Base.highLightElement(driver, tabUserReport());
			tabUserReport().click();
			Thread.sleep(5000);
			Base.FullPageScreenShot("User Reports");
			BacktoReport().click();
			Thread.sleep(5000);

		} else {

			System.out.println("UserReport() not found");
		}

	}

}
