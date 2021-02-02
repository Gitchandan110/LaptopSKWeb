package com.TestNGScript.file;

import java.io.IOException;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import com.BussinessFlow.file.SK_HomePageBL;
import com.BussinessFlow.file.SK_LoginBL;
import com.BussinessFlow.file.SK_MenuListBL;
import com.BussinessFlow.file.SK_ActiveEventBL;
import com.BussinessFlow.file.SK_VisitorPassTypesBL;
import com.Commonutills.file.Base;
import com.Commonutills.file.ExcelUtils;

public class SK_LA_VisitorPassType extends Base {

	SK_LoginBL loginSKbl = PageFactory.initElements(driver, SK_LoginBL.class);
	SK_HomePageBL homePageMenuBL = PageFactory.initElements(driver, SK_HomePageBL.class);
	SK_MenuListBL menuList=PageFactory.initElements(driver, SK_MenuListBL.class);
	SK_VisitorPassTypesBL visitorManagementbl=PageFactory.initElements(driver, SK_VisitorPassTypesBL.class);

	String LoginDataSheet = "Login";

	@BeforeMethod

	public void launchSKApp() throws Exception {

		  openSKApp();
	    
        System.out.println("SK_LA_VisitorPassType Started");
	}

	@Test(priority=1)

	public void VisitorPassType() throws Exception {

		
    	loginSKbl.loginLA();
    	homePageMenuBL.verifyHamburgerMenu();
    	menuList.clickMenuOrganizationResources();
    	menuList.clickMenuVisitorManagement();
       	menuList.clickMenuVisitorPassType();
    	visitorManagementbl.verifyManageVisitorPassTypes();
    	visitorManagementbl.editVisitorPassType();
    	visitorManagementbl.clickButtonCreateVisitorPassType();
   	    visitorManagementbl.fillCreateVisitorPassType();
	}

		
	
	@AfterMethod

	public void closeBrowser() {

    driver.quit();
	
	}

}