package com.PageObjectRepository.file;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import com.Commonutills.file.Base;

public class SK_UserProfilesPO extends Base {

	public List<WebElement> rowList() {

		By RowList = By.xpath("//table[@summary='List of Users']//tbody//tr");
		return driver.findElements(RowList);

	}
}