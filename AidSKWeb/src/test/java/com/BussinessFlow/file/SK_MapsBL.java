package com.BussinessFlow.file;

import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import com.Commonutills.file.Base;
import com.PageObjectRepository.file.SK_Maps_PO;
import com.PageObjectRepository.file.SK_MenuListPO;

public class SK_MapsBL extends SK_Maps_PO {

	public void ViewAllMap() throws Exception {

		String parentWindowId = driver.getWindowHandle();
		System.out.println("Parent Window ID is: " + parentWindowId);

		// To iterate over all open windows

		Set<String> allWindows = driver.getWindowHandles();

		// To get the count of all open window

		int windowCount = allWindows.size();
		System.out.println("Total Open window count is :" + windowCount);

		// Apply enhanced For loop to get the window id of all open window.
		// Window id will help to uniquely identified the all open window.

		for (String childWindowId : allWindows) {
			if (!parentWindowId.equalsIgnoreCase(childWindowId)) {
				driver.switchTo().window(childWindowId);
				Thread.sleep(15000);

				if (dropdownMAP() != null && dropdownMAP().isDisplayed()) {
					Base.highLightElement(driver, dropdownMAP());
					driver.manage().window().maximize();
					Base.FullPageScreenShot("MapScreen");
					dropdownMAP().click();
					int TotalMapCount = AllMaps().size();
					System.out.println("Total Map Count is " + TotalMapCount);

					for (int i = 1; i <= TotalMapCount; i++) {

						WebElement MenuMap = driver.findElement(By
								.xpath("//select[@id='map-list']//option[" + i
										+ "]"));

						String MapName = MenuMap.getText();
						System.out.println("Map Name is :" + MapName);
						// dropdownMAP().click();
						MenuMap.click();
						Thread.sleep(15000);
						Base.takeScreenShot("Map");
					}

				}

				else {

					System.out.println("MAP not found");
				}
			}

			driver.switchTo().window(parentWindowId);

		}

	}

}
