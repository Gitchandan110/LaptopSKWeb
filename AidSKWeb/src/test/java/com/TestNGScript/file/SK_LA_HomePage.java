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

public class SK_LA_HomePage extends Base {

	SK_LoginBL loginSKbl = PageFactory.initElements(driver, SK_LoginBL.class);
	SK_HomePageBL homePageMenuBL = PageFactory.initElements(driver, SK_HomePageBL.class);

	String LoginDataSheet = "Login";

	@BeforeMethod

	public void launchSKApp() throws Exception {
		
		  openSKApp();
        
        System.out.println("SK_LA_HomePage Started");
	    	
	}

	@Test()

	public void HomePage() throws Exception {
		
		
		
		loginSKbl.loginLA();
		homePageMenuBL.ViewMap();
		homePageMenuBL.ViewERP();
    	homePageMenuBL.clickReports();
        homePageMenuBL.ViewAVAlerts();
    	
	}

	@AfterMethod

	public void closeBrowser() {

     driver.quit();
	
	}

}