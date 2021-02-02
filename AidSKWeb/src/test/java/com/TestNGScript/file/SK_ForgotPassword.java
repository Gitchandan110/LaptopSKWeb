package com.TestNGScript.file;

import java.io.IOException;

import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import com.BussinessFlow.file.SK_LoginBL;
import com.Commonutills.file.Base;
import com.Commonutills.file.ExcelUtils;

public class SK_ForgotPassword extends Base {
	SK_LoginBL loginSKbl = PageFactory.initElements(driver, SK_LoginBL.class);
	String LoginDataSheet = "Login";

	@BeforeMethod

	public void launchSKApp() throws Exception {
		
		           openSKApp();
        
        System.out.println("SK_ForgotPassword Started");
   	 	
	}

	@Test()

	public void ResetPassword() throws Exception {

		loginSKbl.VerifyForgotPassword();

	}

	
	@AfterMethod

	public void closeBrowser() {

		driver.quit();
	}

}
