package com.TestNGScript.file;

import java.io.IOException;

import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import com.BussinessFlow.file.SK_LoginBL;
import com.BussinessFlow.file.SK_MenuListBL;
import com.BussinessFlow.file.SK_OrganizationBL;
import com.BussinessFlow.file.SK_LoginBL;
import com.BussinessFlow.file.SK_HomePageBL;
import com.Commonutills.file.Base;
import com.Commonutills.file.ExcelUtils;

public class SK_SA_OrganizationList extends Base {

	SK_HomePageBL homePageMenuBL = PageFactory.initElements(driver, SK_HomePageBL.class);
	SK_LoginBL prodSALoginbl=PageFactory.initElements(driver, SK_LoginBL.class);
	SK_LoginBL loginSafetyKuvrrBL = PageFactory.initElements(driver, SK_LoginBL.class);
	SK_OrganizationBL organizationBL=PageFactory.initElements(driver, SK_OrganizationBL.class);
	SK_MenuListBL menuList=PageFactory.initElements(driver, SK_MenuListBL.class);
	String LoginDataSheet = "Login";

	@BeforeMethod

	public void launchSKApp() throws Exception {
		
		  openSKApp();
        
        System.out.println("SK_SA_OrganizationList Started");   
	    	
	}

	@Test()

	public void OrganizationList() throws Exception {

		prodSALoginbl.loginSA();
		homePageMenuBL.verifyHamburgerMenu();
		menuList.clickMenuOrganizationResources();
		menuList.clickMenuAdministration();
		organizationBL.getOrgPageRowCount();
		organizationBL.getOrgPageColumnCount();
		organizationBL.getColumnName();
		organizationBL.getOrganizationName();
		organizationBL.getOrganizationAddress();
		organizationBL.getOrganizationCity();
		organizationBL.getOrganizationState();
		organizationBL.getOrganizationPostalCode();
		organizationBL.getOrganizationCountry();
		organizationBL.getOrganizationStatus();
	}

	@AfterMethod

	public void closeBrowser() {

		driver.quit();
	}
}

