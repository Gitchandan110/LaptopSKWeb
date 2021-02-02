package com.TestNGScript.file;

import org.testng.annotations.BeforeSuite;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
import org.testng.annotations.AfterTest;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterGroups;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeGroups;

public class TestNgAnnotation {

	@AfterSuite

	public void AfterSuite() {

		System.out.println("After Suite");
	}

	@AfterClass

	public void AfterClass() {

		System.out.println("After Class");
	}

	@Test

	public void Test() {

		System.out.println("Test");
	}

	@BeforeClass

	public void BeforeClass() {

		System.out.println("Before Class");

	}

	@BeforeGroups
	public void BeforeGroups() {

		System.out.println("Before Groups");

	}

	@AfterTest

	public void AfterTest() {

		System.out.println("After Test");
	}

	@AfterMethod

	public void AfterMethod() {

		System.out.println("After Method");
	}

	@BeforeSuite
	public void BeforeSuit() {

		System.out.println("Before Suit");

	}

	@BeforeTest
	public void BeforeTest() {

		System.out.println("Before Test");
	}

	@BeforeMethod

	public void BeforeMethod() {

		System.out.println("Before Method");

	}

	@AfterGroups

	public void AfterGroups() {

		System.out.println("After Groups");
	}

}
