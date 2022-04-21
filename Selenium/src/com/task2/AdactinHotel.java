package com.task2;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.opera.OperaDriver;

public class AdactinHotel {
	
	public static void main(String[] args) {
		
		System.setProperty("webdriver.opera.driver",
			"C:\\Users\\Aridass\\eclipse-workspace\\Selenium\\Driver\\operadriver.exe");
		
		WebDriver driver= new OperaDriver();
		driver.get("http://adactinhotelapp.com");
		
		
		WebElement txtUserName = driver.findElement(By.id("username"));
		txtUserName.sendKeys("Ari");
		
		WebElement txtPassword = driver.findElement(By.id("password"));
	    txtPassword.sendKeys("7532159824");
	
	}

		
	

}
