package com.BussinessFlow.file;

import java.util.HashMap;
import java.util.Iterator;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import com.Commonutills.file.Base;

public class SK_UsersContactsBL extends Base {

	public void getUsersContacts() throws Exception {

		List<WebElement> listUserContacts = driver.findElements(By
				.xpath("//table[@summary='List of Contacts']//tbody/tr"));

		Iterator<WebElement> itr = listUserContacts.iterator();

		HashMap<String, String> UserContacts = new HashMap<String, String>();

		int i = 1;

		while (itr.hasNext()) {
			String Contacts = itr.next().getText();
			System.out.println("Element Name is :" + Contacts);
			UserContacts.put("UserContacts :" + i, Contacts);
			i++;

		}

		System.out.println("UserContacts HashMap values are: " + UserContacts);

	}

}
