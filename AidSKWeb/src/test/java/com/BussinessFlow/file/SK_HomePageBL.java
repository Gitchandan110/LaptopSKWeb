package com.BussinessFlow.file;

import java.util.Set;

import org.openqa.selenium.By;

import com.Commonutills.file.Base;
import com.Commonutills.file.ExcelUtils;
import com.Commonutills.file.ExcelWrite;
import com.PageObjectRepository.file.SK_ERP_PO;
import com.PageObjectRepository.file.SK_HomePagePO;
import com.PageObjectRepository.file.SK_Maps_PO;

public class SK_HomePageBL extends SK_HomePagePO {

	String SanitySheet = "Sanity_SK";
	SK_Maps_PO mapPl = new SK_Maps_PO();
	SK_ERP_PO ERPL = new SK_ERP_PO();

	public void verifyActiveEventsPage() throws Exception {

		if (driver.getTitle().contains("Active Events")) {
			System.out.println("Active Events Page Title verified");
			Base.FullPageScreenShot("ActiveEvents");
			ExcelWrite.writeSanitySheet(SanitySheet, 1, 1, "Pass");

		} else {

			System.out.println("Active Events Page Title not verified");
		}

	}

	public void verifyTabClosedIncident() throws Exception {

		if (tabClosedIncident().isDisplayed()) {
			Base.highLightElement(driver, tabClosedIncident());
			tabClosedIncident().click();
			Thread.sleep(5000);
			Base.FullPageScreenShot("ClosedEvents");

		} else {

			System.out.println("Closed Incident not found");
		}

	}

	public void verifyHamburgerMenu() throws Exception {

		if (HamburgerMenu().isDisplayed() == true) {
			ExcelWrite.writeSanitySheet(SanitySheet, 7, 1, "Pass");
			Base.highLightElement(driver, HamburgerMenu());
			HamburgerMenu().click();
			System.out.println("Hamburger menu Clicked");
			Base.takeScreenShot("Menu List");
			ExcelWrite.writeSanitySheet(SanitySheet, 8, 1, "Pass");
			// driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
			Thread.sleep(7000);

		} else {

			System.out.println("Hamburger menu not found");
			ExcelWrite.writeSanitySheet(SanitySheet, 23, 2, "Fail");
		}
	}

	public void clickReports() throws Exception {

		if (btnReports().isDisplayed() == true) {
			Base.scrolltoElement(driver, btnReports());
			Base.highLightElement(driver, btnReports());
			btnReports().click();
			Thread.sleep(5000);
			Base.FullPageScreenShot("Reports");

		} else {

			System.out.println("Reports() link not found");
		}

	}

	public void ViewProtocols() throws Exception {

		if (btnProtocols().isDisplayed() == true) {
			Base.highLightElement(driver, btnProtocols());
			String parentWindowId = driver.getWindowHandle();
			System.out.println("Parent Window ID is: " + parentWindowId);
			btnProtocols().click();
			Thread.sleep(5000);
			Set<String> allWindows = driver.getWindowHandles();
			int windowCount = allWindows.size();
			System.out.println("Total Protocols window count is :"
					+ windowCount);

			for (String childWindowId : allWindows) {
				if (!parentWindowId.equalsIgnoreCase(childWindowId)) {
					driver.switchTo().window(childWindowId);
					Thread.sleep(5000);

					if (ERPL.dropdownERP() != null
							&& ERPL.dropdownERP().isDisplayed()) {
						Base.highLightElement(driver, ERPL.dropdownERP());
						ERPL.dropdownERP().click();
						Thread.sleep(3000);
						Base.FullPageScreenShot("ERP");
						ERPL.erpEarthquick().click();
						Thread.sleep(3000);
						Base.FullPageScreenShot("ERP_Earthquick");
						ERPL.dropdownERP().click();
						Thread.sleep(3000);
						ERPL.erpEvacuation().click();
						Thread.sleep(3000);

					}
				}
			}
		} else {

			System.out.println("ERP() not found");
		}

	}

	public void ViewMap() throws Exception {

		if (btnMAP() != null && btnMAP().isDisplayed()) {
			Base.highLightElement(driver, btnMAP());
			String parentWindowId = driver.getWindowHandle();
			System.out.println("Parent Window ID is: " + parentWindowId);
			btnMAP().click();
			Thread.sleep(10000);

			// To iterate over all open windows

			Set<String> allWindows = driver.getWindowHandles();

			// To get the count of all open window

			int windowCount = allWindows.size();
			System.out.println("Total Window count is :" + windowCount);

			// Apply enhanced For loop to get the window id of all open window.
			// Window id will help to uniquely identified the all open window.

			for (String childWindowId : allWindows) {
				if (!parentWindowId.equalsIgnoreCase(childWindowId)) {
					driver.switchTo().window(childWindowId);
					System.out.println("Child Window ID is: " + childWindowId);
					Thread.sleep(5000);
					driver.manage().window().maximize();
					Base.FullPageScreenShot("MapScreen");

					if (mapPl.dropdownMAP() != null
							&& mapPl.dropdownMAP().isDisplayed()) {
						Base.highLightElement(driver, mapPl.dropdownMAP());
						mapPl.dropdownMAP().click();
						
					int TotalMapCount=mapPl.AllMaps().size();
					System.out.println("TotalMapCount is :"+TotalMapCount);
						
					int i=1;
					
					while(i<=TotalMapCount){
					mapPl.dropdownMAP().click();
					String xpathVariable="//select[@id='map-list']//option["+ i +"]";
				    String MapName=driver.findElement(By.xpath(xpathVariable)).getText();
					System.out.println("Selected Map Name is :"+MapName);
					driver.findElement(By.xpath(xpathVariable)).click();
					Thread.sleep(15000);
					Base.takeScreenShot("Home Page");
					i++;
					
						
				} 
					
					driver.close();
					driver.switchTo().window(parentWindowId);
				}
				}
				}
			}
	}

	public void ViewERP() throws Exception {

		if (btnERP().isDisplayed() == true) {
			Base.highLightElement(driver, btnERP());
			String parentWindowId = driver.getWindowHandle();
			System.out.println("Parent Window ID is: " + parentWindowId);
			btnERP().click();
			Thread.sleep(5000);
			Set<String> allWindows = driver.getWindowHandles();
			int windowCount = allWindows.size();
			System.out.println("Total Window count is :" + windowCount);
			
				for (String childWindowId : allWindows) {
				if (!parentWindowId.equalsIgnoreCase(childWindowId)) {
					driver.switchTo().window(childWindowId);
					Thread.sleep(5000);

					if (ERPL.dropdownERP() != null
							&& ERPL.dropdownERP().isDisplayed()) {
						Base.highLightElement(driver, ERPL.dropdownERP());
						ERPL.dropdownERP().click();
						// Thread.sleep(3000);
						Base.FullPageScreenShot("ERP");

						int TotalERPList = ERPL.listERP().size();
						System.out.println("TotalERPList are:" + TotalERPList);

						int i = 1;

						while (i <= TotalERPList) {
							
	String xpathVariable = "//ul[@class='dd-options dd-click-off-close']//li["+ i + "]//a//label[@class='dd-option-text']";

							String ERPName = driver.findElement(
									By.xpath(xpathVariable)).getText();
							System.out.println("ERPName are :" + ERPName);

   driver.findElement(By.xpath("//ul[@class='dd-options dd-click-off-close']//li["+ i + "]//a")).click();
							
							Base.takeScreenShot("Home Page");
							ERPL.dropdownERP().click();
							i++;
						}
					    	driver.close();
							driver.switchTo().window(parentWindowId);
						
					}
				}
			}
		}
	}

	public void ViewAVAlerts() throws Exception {

		if (btnAVAlerts().isDisplayed() == true) {
			Base.highLightElement(driver, btnAVAlerts());
			btnAVAlerts().click();
			Thread.sleep(5000);
			System.out.println("btnAVAlerts() clicked");
			Base.FullPageScreenShot("Initiate AV Alert");

		}

	}

}
