package com.TestNGScript.file;

import java.io.FileNotFoundException;
import java.io.IOException;

import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import com.BussinessFlow.file.SK_DataProviderBL;
import com.Commonutills.file.Base;
import com.Commonutills.file.Excel2DArray;
import com.Commonutills.file.ExcelUtils;

public class SK_DataProvider extends Base {
	String LoginDataSheet = "Login";

	SK_DataProviderBL dataproviderbl = PageFactory.initElements(driver, SK_DataProviderBL.class);

	@BeforeMethod
	public void launchSKApp() throws IOException {

		chromeDriver();
		String urlProd=ExcelUtils.ReadExcel(LoginDataSheet, 1, 1);
		String urlTest=ExcelUtils.ReadExcel(LoginDataSheet, 2, 1);
		String urlInt=ExcelUtils.ReadExcel(LoginDataSheet, 3, 1);
		driver.get(urlTest);

	}

	@DataProvider

	public Object[][] getlogindata() throws FileNotFoundException {

		Object data[][] = Excel2DArray.getExcelData("ObsLogin");

		return data;

	}

	@Test(dataProvider = "getlogindata")

	public void loginSK(String Email, String Password) {

		dataproviderbl.login(Email, Password);

	}

	@AfterMethod

	public void closeApp() {

		driver.quit();

	}

}
