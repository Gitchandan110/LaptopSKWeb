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
import com.BussinessFlow.file.SK_NotificationGroupBL;
import com.BussinessFlow.file.SK_UserProfilesBL;
import com.Commonutills.file.Base;
import com.Commonutills.file.ExcelUtils;

public class SK_LA_UsersProfile extends Base {

	SK_LoginBL loginSKbl = PageFactory.initElements(driver, SK_LoginBL.class);
	SK_HomePageBL homePageMenuBL = PageFactory.initElements(driver, SK_HomePageBL.class);
	SK_MenuListBL menuList=PageFactory.initElements(driver, SK_MenuListBL.class);
	SK_UserProfilesBL userProfiles=PageFactory.initElements(driver, SK_UserProfilesBL.class);
	

	String LoginDataSheet = "Login";

	@BeforeMethod

	public void launchSKApp() throws Exception {

		  openSKApp();
        
        System.out.println("SK_LA_NotificationGroup Started");
	    	
	}

	@Test()

	public void UsersProfile() throws Exception {

		
    	loginSKbl.loginLA();
    	homePageMenuBL.verifyHamburgerMenu();
    	menuList.clickUsers();
    	menuList.clickUserProfiles();
    	userProfiles.getuserDetails();
    	
	}

	@AfterMethod

	public void closeBrowser() {

      driver.quit();
	
	}

}