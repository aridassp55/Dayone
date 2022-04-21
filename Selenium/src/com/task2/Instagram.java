package com.task2;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.opera.OperaDriver;

public class Instagram {
	
	public static void main(String[] args) {
		System.setProperty("webdriver.opera.driver",
				"C:\\Users\\Aridass\\eclipse-workspace\\Selenium\\Driver\\operadriver.exe");
		
		WebDriver driver= new OperaDriver();
		driver.get("https://www.instagram.com/accounts/login/?hl=en)");
		
		
		WebElement txtUserName = driver.findElement(By.name("username"));
		txtUserName.sendKeys("Aridass__");
		
		WebElement txtPassword = driver.findElement(By.name("password"));
	    txtPassword.sendKeys("123456789");
	}

}
