package com.BussinessFlow.file;

import java.io.IOException;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Date;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import com.Commonutills.file.Base;
import com.PageObjectRepository.file.SK_ERP_PO;
import junit.framework.Assert;

public class SK_ManageERPBL extends SK_ERP_PO {

	SK_HomePageBL homepageBL;
	SK_MenuListBL menulistBL;

	public void verifyERPListScreen() throws Exception {

		if (titleListERP() != null && titleListERP().isDisplayed()) {
			Assert.assertEquals("List of Emergency Response Plans", driver.getTitle());
			System.out.println("Landed on List ERP Screen");
			Base.FullPageScreenShot("ERP List");
			if (btnFilter() != null && btnFilter().isDisplayed()) {
				btnFilter().click();
				filterTitle().click();
				filterTitle().sendKeys("Fire");
				Base.takeScreenShot("ERP");
				btnSubmit().click();
				Thread.sleep(3000);
				Base.takeScreenShot("ERP");
				System.out.println("Title Filter Pass");
				btnFilter().click();
				filterTitle().clear();
				btnSubmit().click();
				Thread.sleep(3000);
				btnFilter().click();
				filterOrganization().click();
				filterOrganization().sendKeys("OrgNCR");
				Thread.sleep(3000);
				Base.takeScreenShot("ERP");
				btnSubmit().click();
				Thread.sleep(3000);
				System.out.println("Organization Filter Pass");
				btnFilter().click();
				filterOrganization().clear();
				Thread.sleep(2000);
				btnSubmit().click();
				Thread.sleep(3000);
				btnFilter().click();
				filterICon().click();
				filterICon().sendKeys("https://s3.amazonaws.com/erp-icon/fire.png");
				Base.takeScreenShot("ERP");
				btnSubmit().click();
				Thread.sleep(3000);
				System.out.println("ICON Filter Pass");
				btnFilter().click();
				filterICon().clear();
				btnSubmit().click();
				Thread.sleep(3000);
				linkDetails().click();
				Base.FullPageScreenShot("ERP Details");
				driver.navigate().back();
				Thread.sleep(3000);

			}
		}

		else {

			System.out.println("ERP Screen has issue");
		}
	}

	public void verifyEditERP() throws Exception {

		int ErpRowCount = tableRow().size();
		System.out.println("Total ERP Row Count is : " + ErpRowCount);

		for (int i = 1; i <= ErpRowCount; i++) {

			String xpathVariable = "//table[@summary='List of Emergency Response Plans']//tbody//tr[" + i
					+ "]//td[2]//a[contains(text(),'Edit')]";

			driver.findElement(By.xpath(xpathVariable)).click();
			Thread.sleep(7000);
			Base.scrolltoElement(driver, btnSortingKeys());
			btnSortingKeys().click();
			btnSortingKeys().clear();
			DateFormat dateFormat = new SimpleDateFormat("ss");
			String timeString = dateFormat.format(new Date()).toString();
			btnSortingKeys().sendKeys(timeString);
			btnSubmit().click();
			Thread.sleep(6000);
			driver.navigate().back();
			Thread.sleep(4000);
			driver.navigate().back();
			Thread.sleep(4000);
		}

		System.out.println("Edit ERP Done");

	}

}
