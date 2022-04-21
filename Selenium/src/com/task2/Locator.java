package com.task2;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.opera.OperaDriver;

public class Locator {
	public static void main(String[] args) {
		System.setProperty("webdriver.opera.driver",
				"C:\\Users\\Aridass\\eclipse-workspace\\Selenium\\Driver\\operadriver.exe");
		
		WebDriver driver= new OperaDriver();
		driver.get("https://www.facebook.com");
		
		
		WebElement txtUserName = driver.findElement(By.id("email"));
		txtUserName.sendKeys("aridassp55");
		
		WebElement txtPassword = driver.findElement(By.id("pass"));
	    txtPassword.sendKeys("7894563210");
	
	}

}
