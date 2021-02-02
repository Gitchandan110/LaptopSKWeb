package com.BussinessFlow.file;

import static org.testng.Assert.assertTrue;

import java.io.IOException;

import org.testng.Assert;

import com.Commonutills.file.Base;
import com.Commonutills.file.ExcelUtils;
import com.Commonutills.file.ExcelWrite;
import com.PageObjectRepository.file.SK_LoginPO;

public class SK_LoginBL extends SK_LoginPO {

	String LoginDataSheet = "Login";
	String SanitySheet = "Sanity_SK";

	public void loginSA() throws Exception {

		if (Email().isDisplayed()) {
			Email().sendKeys(ExcelUtils.ReadExcel(LoginDataSheet, 1, 2));
			Base.RobotPrintScreen();
			System.out.println("User is:" + ExcelUtils.ReadExcel(LoginDataSheet, 1, 2));
		}

		else {
			System.out.println("Email not entered");
		}

		if (Password().isDisplayed()) {
			String url = driver.getCurrentUrl();
			if (url.equalsIgnoreCase("https://safety-red5.kuvrr.com/?next=/observer/")) {
				Password().sendKeys(ExcelUtils.ReadExcel(LoginDataSheet, 3, 3));
			} else {

				Password().sendKeys(ExcelUtils.ReadExcel(LoginDataSheet, 1, 3));

			}

			System.out.println("Password entered");

		}

		else {

			System.out.println("Password not entered");
		}

		if (BtnContinue().isDisplayed()) {
			Base.FullPageScreenShot("LoginScreen_SA");
			BtnContinue().click();
			Thread.sleep(5000);

		}

		try {

			if (errorLoginFail().isDisplayed()) {
				Base.FullPageScreenShot("LoginFail_SA");
				System.out.println("Unable to Login due to incorrect user credential");
				ExcelWrite.writeSanitySheet(SanitySheet, 1, 1, "Fail");
			}

		} catch (Exception e) {

			e.printStackTrace();
		}
	}

	public void loginLA() throws Exception {

		if (Email().isDisplayed()) {
			Base.F12PrintScreen();
			Email().sendKeys(ExcelUtils.ReadExcel(LoginDataSheet, 1, 4));
			System.out.println("User is:" + ExcelUtils.ReadExcel(LoginDataSheet, 1, 4));
		}

		else {
			System.out.println("Email not entered");
		}

		if (Password().isDisplayed()) {

			Password().sendKeys(ExcelUtils.ReadExcel(LoginDataSheet, 1, 5));
			System.out.println("Password entered");

		}

		else {

			System.out.println("Password not entered");
		}

		if (BtnContinue().isDisplayed()) {
			Base.FullPageScreenShot("LoginScreen_LA");
			BtnContinue().click();
			Thread.sleep(5000);

		}

		try {

			if (errorLoginFail().isDisplayed()) {
				Base.FullPageScreenShot("LoginFail_LA");
				System.out.println("Unable to Login due to incorrect user credential");
				ExcelWrite.writeSanitySheet(SanitySheet, 21, 2, "Fail");
			}

		} catch (Exception e) {

			e.printStackTrace();
		}

	}

	public void loginObserver() throws Exception {

		if (Email().isDisplayed()) {
			Email().sendKeys(ExcelUtils.ReadExcel(LoginDataSheet, 1, 6));
			System.out.println("User is:" + ExcelUtils.ReadExcel(LoginDataSheet, 1, 6));
		}

		else {
			System.out.println("Email not entered");
		}

		if (Password().isDisplayed()) {
			Password().sendKeys(ExcelUtils.ReadExcel(LoginDataSheet, 1, 7));
			System.out.println("Password entered");

		}

		else {

			System.out.println("Password not entered");
		}

		if (BtnContinue().isDisplayed()) {
			Base.FullPageScreenShot("LoginScreen_Observer");
			BtnContinue().click();
			Thread.sleep(3000);

		}

		try {

			if (errorLoginFail().isDisplayed()) {
				Base.FullPageScreenShot("LoginFail_Observer");
				System.out.println("Unable to Login due to incorrect user credential");
				ExcelWrite.writeSanitySheet(SanitySheet, 3, 1, "Fail");
			}
		} catch (Exception e) {

			e.printStackTrace();
		}
	}

	public void VerifyForgotPassword() throws Exception {

		if (linkForgotPassword().isDisplayed()) {
			linkForgotPassword().click();
			Thread.sleep(7000);

		}
		if (emailResetPassword().isDisplayed()) {
			emailResetPassword().click();
			emailResetPassword().sendKeys(ExcelUtils.ReadExcel(LoginDataSheet, 1, 4));
			btnSubmitResetPassword().click();
			Thread.sleep(5000);
			Base.FullPageScreenShot("Password Reset");
		} else {
			System.out.println("ForgotPassword() is not Working");
		}

	}

}
