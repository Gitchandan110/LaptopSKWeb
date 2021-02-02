package com.BussinessFlow.file;

import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import com.Commonutills.file.Base;
import com.PageObjectRepository.file.SK_UserProfilesPO;

public class SK_UserProfilesBL extends SK_UserProfilesPO {

	public void getuserDetails() throws Exception {

		List<WebElement> userDetails = driver.findElements(By
				.xpath("//table[@summary='List of Users']//tbody//tr"));
		Iterator<WebElement> itr = userDetails.iterator();

		HashMap<String, String> ElementValues = new HashMap<String, String>();

		int i = 1;

		while (itr.hasNext()) {

			WebElement element = itr.next();
			String value = element.getText();
			System.out.println("Element Value is :" + value);

			ElementValues.put("Element Value : " + i, value);

			i++;
		}

		System.out.println(ElementValues);
	}

}
