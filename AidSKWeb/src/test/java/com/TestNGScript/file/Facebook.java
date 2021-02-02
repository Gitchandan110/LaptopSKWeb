package com.TestNGScript.file;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.KeyEvent;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Facebook {

	public static void main(String[] args) throws InterruptedException, AWTException {
		// TODO Auto-generated method stub
		
		//Set Chrome driver and Path
		
		System.setProperty("webdriver.chrome.driver", "C:/Users/Chandan/Desktop/Selenium/chromedriver.exe");
		
		//Open Chrome Driver
		
		WebDriver driver=new ChromeDriver();
		
		Thread.sleep(10000);
		
		//Open Facebook Login Page
		driver.get("https://www.facebook.com/");
        driver.manage().window().maximize();
		Thread.sleep(10000);
		
		//Enter Email
		
		driver.findElement(By.cssSelector("input[type=email]")).clear();
		driver.findElement(By.cssSelector("input[type=email]")).click();
		driver.findElement(By.cssSelector("input[type=email]")).sendKeys("subprod@outlook.com");
		System.out.println("Email entered SUccessfull");
		Thread.sleep(5000);
		

		//Enter Password
		
		driver.findElement(By.cssSelector("input[type=password]")).clear();
		driver.findElement(By.cssSelector("input[type=password]")).click();
		driver.findElement(By.cssSelector("input[type=password]")).sendKeys("omsai11ram");
		System.out.println("Password entered SUccessfull");
		Thread.sleep(5000);
		
		//Click Login Button
		driver.findElement(By.cssSelector("input[type=submit]")).click();
		Thread.sleep(10000);
		
		//Close Pop Up Notification
		
		Robot r = new Robot();
		r.keyPress(KeyEvent.VK_ESCAPE);
		r.keyRelease(KeyEvent.VK_ESCAPE);
		System.out.println("Pop Up Closed");
		Thread.sleep(5000);
		
		
		// Write Something and Post
		
		driver.findElement(By.cssSelector("div[data-offset-key=40s4e-0-0]")).click();
		driver.findElement(By.cssSelector("div[data-offset-key=40s4e-0-0]")).sendKeys("Hello 88");
		
		
		
		
		
		
		
	}
	
	
	

}
