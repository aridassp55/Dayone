package com.task2;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.opera.OperaDriver;

public class Google {
        public static void main(String[] args) {
	
        System.setProperty("webdriver.opera.driver",
    				"C:\\Users\\Aridass\\eclipse-workspace\\Selenium\\Driver\\operadriver.exe");
        
        WebDriver driver=new OperaDriver();
        driver.get("https://www.google.com");
        
        WebElement txtSearch = driver.findElement(By.name("q"));
        txtSearch.sendKeys("greens Technology");
        
	
	
	
	
	
	
	
	
	
	
	
	
	
	
}
}
