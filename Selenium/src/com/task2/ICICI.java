package com.task2;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.opera.OperaDriver;

public class ICICI {
          public static void main(String[] args) {
        	System.setProperty("webdriver.opera.driver", 
      				"C:\\Users\\Aridass\\eclipse-workspace\\Selenium\\Driver\\operadriver.exe");
			
			WebDriver driver= new OperaDriver();
			driver.get("https://infinity.icicibank.com/corp/Login.jsp");
			
		    WebElement txtUserName = driver.findElement(By.id("DUMMY1"));
		    txtUserName.sendKeys("Aridass");
		    
		    WebElement txtPass = driver.findElement(By.className("login-input-password"));
		    txtPass.sendKeys("123456789");
		    
			
			
			
			
			
			
			
		}
}
