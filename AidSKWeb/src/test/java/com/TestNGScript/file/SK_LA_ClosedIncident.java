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

import com.BussinessFlow.file.SK_ClosedIncidentBL;
import com.BussinessFlow.file.SK_HomePageBL;
import com.BussinessFlow.file.SK_LoginBL;
import com.Commonutills.file.Base;
import com.Commonutills.file.ExcelUtils;

public class SK_LA_ClosedIncident extends Base {

	SK_HomePageBL homepagebl = PageFactory.initElements(driver, SK_HomePageBL.class);
	SK_LoginBL loginSKbl = PageFactory.initElements(driver, SK_LoginBL.class);
	SK_ClosedIncidentBL closedIncidentbl=PageFactory.initElements(driver, SK_ClosedIncidentBL.class);

	String LoginDataSheet = "Login";
	
	

	@BeforeMethod

	public void launchSKApp() throws Exception {

		  openSKApp();
        
        
        System.out.println("SK_LA_ClosedIncident Started"); 

	}

	@Test()

	public void ClosedIncident() throws Exception {

		
    	loginSKbl.loginLA();
    	homepagebl.verifyTabClosedIncident();
    	closedIncidentbl.clickSOSIncident();
    	closedIncidentbl.clickSafeWalkIncident();
    	closedIncidentbl.click911Incident();
		
	}

	@AfterMethod

	public void closeBrowser() {

     driver.quit();
	
	}

}