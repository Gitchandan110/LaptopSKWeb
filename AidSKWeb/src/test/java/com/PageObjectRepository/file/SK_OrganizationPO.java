package com.PageObjectRepository.file;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import com.Commonutills.file.Base;

public class SK_OrganizationPO extends Base {

	public WebElement colDetails() {

		By linkDetails = By.xpath("//a[@href='/organization/7']");
		return driver.findElement(linkDetails);

	}

	public List<WebElement> columnListOrganization() {

		By tcOrg = By.xpath("//table[@summary='List of Organizations']//thead//tr//td");
		return driver.findElements(tcOrg);

	}

	public List<WebElement> RowListOrganization() {

		By trOrg = By.xpath("//table[@summary='List of Organizations']//tbody//tr");

		return driver.findElements(trOrg);

	}

}
