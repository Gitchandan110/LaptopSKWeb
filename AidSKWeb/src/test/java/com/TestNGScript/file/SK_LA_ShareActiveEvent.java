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

import com.BussinessFlow.file.SK_LoginBL;
import com.BussinessFlow.file.SK_ActiveEventBL;
import com.Commonutills.file.Base;
import com.Commonutills.file.ExcelUtils;

public class SK_LA_ShareActiveEvent extends Base {

	SK_ActiveEventBL incidentbl = PageFactory.initElements(driver, SK_ActiveEventBL.class);
	SK_LoginBL loginSKbl = PageFactory.initElements(driver, SK_LoginBL.class);

	String LoginDataSheet = "Login";

	@BeforeMethod

	public void launchSKApp() throws Exception {

		  openSKApp();
        
        System.out.println("SK_LA_ShareActiveEvent Started");

	}

	@Test()

	public void ShareActiveEvent() throws Exception {

		
    	loginSKbl.loginLA();
    	incidentbl.selectActiveEvents();
    	incidentbl.verifyShareIncident();
	}

	@AfterMethod

	public void closeBrowser() {

    driver.quit();
	
	}

}