package com.BussinessFlow.file;

import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import com.Commonutills.file.Base;
import com.PageObjectRepository.file.SK_InitiateAVAlertPO;
import com.PageObjectRepository.file.SK_MenuListPO;

public class SK_InitiateAVAlertBL extends SK_InitiateAVAlertPO {

	public void clickAVAlertAlarm() throws Exception{

				
			if (ddOrganizationName() != null && ddOrganizationName().isDisplayed()) {
				Base.highLightElement(driver, ddOrganizationName());
				System.out.println("ddOrganizationName() Found");
				Base.FullPageScreenShot("Initiate AVAlert");
			

			if (ddControllerName() != null && ddControllerName().isDisplayed()) {
				Base.scrolltoElement(driver, ddControllerName());
				System.out.println("ddControllerName Found");
				Base.highLightElement(driver, ddControllerName());
				Base.takeScreenShot("AV Alert");
				
				
				for (int i = 1; i <= 8; i++) {

					WebElement btnAVAlarms = driver.findElement(By.xpath("//div[@ng-repeat='alarm in vm.alarms'][" + i + "]//div"));
					System.out.println("AV Alert button found");
					btnAVAlarms.click();
					Thread.sleep(2000);

				}
			} 
			
			
		}
			
		else {

				System.out.println("InitiateAVAlert not Working");
			}

	}

}
