package com.task2;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.opera.OperaDriver;

public class Swiggy {
	public static void main(String[] args) {
	      System.setProperty("webdriver.opera.driver",
  				"C:\\Users\\Aridass\\eclipse-workspace\\Selenium\\Driver\\operadriver.exe");
      
      WebDriver driver=new OperaDriver();
      driver.get(" https://www.swiggy.com/");
      
      WebElement txtLocation = driver.findElement(By.id("location"));
      txtLocation.sendKeys("OMR");
      
	
	}

}
