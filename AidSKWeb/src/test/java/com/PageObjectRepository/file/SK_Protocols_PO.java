package com.PageObjectRepository.file;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import com.Commonutills.file.Base;

public class SK_Protocols_PO extends Base{
	
	public WebElement ddResponseProtocols() {

		try {
			By ddRProtocols = By.xpath("//a[@class='dd-selected']");
			return driver.findElement(ddRProtocols);
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return null;
	}
	
	public WebElement Smart911() {

		try {
			By earthQuick = By.xpath("//label[@class='dd-option-text' and contains(text(),'Smart 911')]");
			return driver.findElement(earthQuick);
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return null;
	}
	
	public WebElement erpEvacuation() {

		try {
			By earthQuick = By.xpath("//label[@class='dd-option-text' and contains(text(),'Evacuation')]");
			return driver.findElement(earthQuick);
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return null;
	}
	
	public WebElement titleListERP() {

		try {
			By titleListERP = By.xpath("//div[@class='page-title']");
			return driver.findElement(titleListERP);
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return null;
	}
	
	
	public WebElement btnFilter() {

		try {
			By btnFilter = By.xpath("//input[@class='filter-button']");
			return driver.findElement(btnFilter);
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return null;
	}
	
	public WebElement filterTitle() {

		try {
			By filterTitle = By.xpath("//input[@id='id_title'][@type='text']");
			return driver.findElement(filterTitle);
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return null;
	}
	
	public WebElement filterOrganization() {

		try {
			By filterOrganization = By.xpath("//input[@id='id_organization__name'][@type='text']");
			return driver.findElement(filterOrganization);
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return null;
	}
	
	public WebElement filterICon() {

		try {
			By filterICon = By.xpath("//input[@id='id_icon'][@type='text']");
			return driver.findElement(filterICon);
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return null;
	}
	
	public WebElement btnSubmit() {

		try {
			By btnSubmit = By.xpath("//input[@type='submit']");
			return driver.findElement(btnSubmit);
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return null;
	}
	

	
	public WebElement linkDetails() {

		try {
			By linkDetails = By.xpath("//tr//td[1]//a");
			return driver.findElement(linkDetails);
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return null;
	}
	
	public WebElement linkEdit() {

		try {
			By linkEdit = By.xpath("//tr//td[2]//a");
			return driver.findElement(linkEdit);
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return null;
	}
	
	
	
	
	public List<WebElement> tableRow() {
		
	By RowList=By.xpath("//table[@summary='List of Emergency Response Plans']//tbody//tr");	
	return driver.findElements(RowList);
		
		
	}
	
	
	public WebElement btnSortingKeys() {

		try {
			By btnSortingKeys = By.xpath("//input[@id='id_sortkey'][@name='sortkey']");
			return driver.findElement(btnSortingKeys);
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return null;
	}
	
	
	
	
	
	

}
