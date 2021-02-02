package com.PageObjectRepository.file;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import com.Commonutills.file.Base;

public class SK_AppUserPermissionsPO extends Base{
	
	
	public List<WebElement> checkBoxCanManageVisitors(){
		
		By manageVisitors=By.xpath("//tbody//tr//td[4]//input[@type='checkbox']");
		return driver.findElements(manageVisitors);
		
		
		
		
		
	}

}
