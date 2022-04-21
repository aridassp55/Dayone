package com.task2;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.opera.OperaDriver;

public class RedBus {
	public static void main(String[] args) {
		System.setProperty("webdriver.opera.driver", 
				"C:\\Users\\Aridass\\eclipse-workspace\\Selenium\\Driver\\operadriver.exe");
	
	         
	        WebDriver driver= new OperaDriver();
		    driver.get("https://www.redbus.in/");
		    
		    WebElement txtFrom = driver.findElement(By.id("src"));
		    txtFrom.sendKeys("Chennai");
		    
		    WebElement txtTo = driver.findElement(By.id("dest"));
		    txtTo.sendKeys("Tenkasi");
		    
	}

}
