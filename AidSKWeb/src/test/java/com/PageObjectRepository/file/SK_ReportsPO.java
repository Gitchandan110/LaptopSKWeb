package com.PageObjectRepository.file;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import com.Commonutills.file.Base;

public class SK_ReportsPO extends Base {

	public WebElement CommunicationHistoryReports() {

		By communicationHistory = By
				.xpath("//div[contains(text(),'Communication History')]");
		return driver.findElement(communicationHistory);

	}

	public WebElement tabCommunicationHistory() {

		By tabCommunicationHistory = By.xpath("//a[contains (text(),' Communication History')]");
		
	//	By communicationHistory = By.linkText(" Communication History");
		return driver.findElement(tabCommunicationHistory);

	}

	public WebElement EventsHistoryReport() {

		By EventsHistoryReport = By
				.xpath("//div[contains (text(),'Events History')]");
		return driver.findElement(EventsHistoryReport);

	}

	public WebElement tabEventHistory() {

		By EventHistoryDay = By
				.xpath("//a[contains (text(),' Events History')]");
		return driver.findElement(EventHistoryDay);

	}

	public WebElement SelfCertificationDashboardReports() {

		By SelfCertificationDashboard = By
				.xpath("//div[contains(text(),'Self-Certification Live Dashboard')]");
		return driver.findElement(SelfCertificationDashboard);

	}

	public WebElement SelfCertificationAlertsReports() {

		By SelfCertificationAlerts = By
				.xpath("//div[contains(text(),'Self-Certification Alerts')]");
		return driver.findElement(SelfCertificationAlerts);

	}

	public WebElement SelfCertificationHistoryReports() {

		By SelfCertificationHistory = By
				.xpath("//div[contains(text(),'Self-Certification History')]");
		return driver.findElement(SelfCertificationHistory);

	}

	public WebElement ThermalScanAlertsReports() {

		By ThermalReports = By
				.xpath("//div[contains(text(),'Thermal Scan Alerts')]");
		return driver.findElement(ThermalReports);

	}

	public WebElement ThermalScanDashboardReports() {

		By ThermalScanDashboard = By
				.xpath("//div[contains (text(),'Thermal Scan Dashboard')]");
		return driver.findElement(ThermalScanDashboard);

	}

	public WebElement ThermalScanHistoryReports() {

		By ThermalScanHistory = By
				.xpath("//div[contains (text(),'Thermal Scan History')]");
		return driver.findElement(ThermalScanHistory);
	}

	public WebElement TipHistoryReports() {

		By TipHistory = By.xpath("//div[contains (text(),'Tip History')]");
		return driver.findElement(TipHistory);
	}

	public WebElement TipsByCategoryReports() {

		By TipHistory = By.xpath("//div[contains (text(),'Tips By Category')]");
		return driver.findElement(TipHistory);
	}

	public WebElement IncomingTipsByDayTimeReports() {

		By IncomingTipsByDayTime = By
				.xpath("//div[contains (text(),'Incoming Tips By Day/Time')]");
		return driver.findElement(IncomingTipsByDayTime);
	}

	public WebElement UserReport() {

		By UserReport = By.xpath("//div[contains (text(),'User Report')]");
		return driver.findElement(UserReport);
		
	}
	
	
	
	public WebElement tabUserReport() {

		By UserReport = By.xpath("//a[contains(text(),' User Report')]");
		return driver.findElement(UserReport);
		
	}

	public WebElement BacktoReport() {

		By BacktoReport = By
				.xpath("//a[@class='return_link' and contains(text(),'Back to Reports')]");
		return driver.findElement(BacktoReport);
		
		}

	public WebElement btncloseReports() {

		By btnClosed = By
				.xpath("//i[@class='icon-remove-sign'][@onclick='close_popup_forms()']");
		return driver.findElement(btnClosed);

	}

}
