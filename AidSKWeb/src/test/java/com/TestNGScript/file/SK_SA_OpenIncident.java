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
import com.BussinessFlow.file.SK_EventScreenBL;
import com.Commonutills.file.Base;
import com.Commonutills.file.ExcelUtils;

public class SK_SA_OpenIncident extends Base {

	SK_ActiveEventBL incidentbl = PageFactory.initElements(driver, SK_ActiveEventBL.class);
	SK_LoginBL loginSKbl = PageFactory.initElements(driver, SK_LoginBL.class);
	SK_EventScreenBL eventbl= PageFactory.initElements(driver, SK_EventScreenBL.class);
	String LoginDataSheet = "Login";

	@BeforeMethod

	public void launchSKApp() throws Exception {

		  openSKApp();
	    
        System.out.println("SK_SA_OpenIncident Started");
	}

	@Test()

	public void SAOpenIncident() throws Exception {

	    loginSKbl.loginSA();
		incidentbl.clickIncomingIncident();
		eventbl.verifyVideoContainer();
		eventbl.verifySmartResponse();
		eventbl.enterEventNotes();
		eventbl.clickIncidentActionsClose();
		eventbl.clickIncidentResolutionFalseAlarm();
		eventbl.enterIncidentActionResponse();
		eventbl.clickIconShareIncident();
		eventbl.submitShareIncident();
		
	}

	@AfterMethod

	public void closeBrowser() {

	driver.quit();
	
	}

}