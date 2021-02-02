package com.BussinessFlow.file;

import com.PageObjectRepository.file.SK_LoginPO;

public class SK_DataProviderBL extends SK_LoginPO{
	
	
		
	public void login(String Email, String Password) {
		
		Email().sendKeys(Email);
		Password().sendKeys(Password);
		BtnContinue().click();
		
		
	}
	

}
