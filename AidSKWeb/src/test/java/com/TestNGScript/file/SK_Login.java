package com.TestNGScript.file;

import java.io.IOException;

import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import com.BussinessFlow.file.SK_LoginBL;
import com.Commonutills.file.Base;
import com.Commonutills.file.ExcelUtils;

public class SK_Login extends Base {

	SK_LoginBL loginSKbl = PageFactory.initElements(driver, SK_LoginBL.class);
	String LoginDataSheet = "Login";

	@BeforeMethod

	public void launchSKApp() throws Exception {
		
		  openSKApp();
        
        
        System.out.println("SK_Login Started");
   	 	
	}

	@Test(priority = 1)

	public void loginSA() throws Exception {

		loginSKbl.loginSA();

	}

	@Test(priority = 2)

	public void loginLA() throws Exception {

		loginSKbl.loginLA();

	}

	@Test(priority = 3)

	public void loginObs() throws Exception {

		loginSKbl.loginObserver();

	}

	@AfterMethod

	public void closeBrowser() {

		driver.quit();
	}

}
