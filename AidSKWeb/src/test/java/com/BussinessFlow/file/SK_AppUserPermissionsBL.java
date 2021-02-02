package com.BussinessFlow.file;

import java.io.IOException;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import com.Commonutills.file.Base;
import com.PageObjectRepository.file.SK_AppUserPermissionsPO;

public class SK_AppUserPermissionsBL extends SK_AppUserPermissionsPO {

	public void selectcanManageVisitors() throws Exception {

		int countCheckBoxCanManageVisitors = checkBoxCanManageVisitors().size();
		System.out.println("Total Number of CanManageVisitors check box is :"
				+ countCheckBoxCanManageVisitors);

		for (int i = 1; i <= countCheckBoxCanManageVisitors; i++) {
			String xpathVariable = "//tbody//tr[" + i
					+ "]//td[4]//input[@type='checkbox']";
			driver.findElement(By.xpath(xpathVariable)).click();
			

		}
		
		Base.FullPageScreenShot("AppUsers Permissions after Test");

	}

}
