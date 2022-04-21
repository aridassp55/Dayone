package com.task2;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.opera.OperaDriver;

public class Automation {
	
	public static void main(String[] args) {
		
		System.setProperty("webdriver.opera.driver",
				"C:\\Users\\Aridass\\eclipse-workspace\\Selenium\\Driver\\operadriver.exe");
		
		WebDriver driver= new OperaDriver();
		driver.get("http://demo.automationtesting.in/Register.html");
		
		
       WebElement txtFirstName = driver.findElement(By.className("form-control ng-pristine ng-invalid ng-invalid-required ng-touched"));
       txtFirstName.sendKeys("Ari");
       WebElement txtLastName = driver.findElement(By.className("form-control ng-pristine ng-invalid ng-invalid-required ng-touched"));
       txtLastName.sendKeys("Dass");
       
       WebElement txtAddress = driver.findElement(By.className("form-control ng-pristine ng-valid ng-touched"));
       txtAddress.sendKeys("tenkasi"); 
       
       WebElement txtEmail = driver.findElement(By.className("form-control ng-pristine ng-valid-email ng-invalid ng-invalid-required ng-touched"));
       txtEmail.sendKeys("aridassp55@gmail.com");
       
       WebElement txtPhone = driver.findElement(By.className("form-control ng-pristine ng-untouched ng-invalid ng-invalid-required ng-valid-pattern"));
       txtPhone.sendKeys("8248360600");
       
       WebElement txtPassword = driver.findElement(By.id("firstpassword"));
       txtPassword.sendKeys("ariii555@");
       
       WebElement txtRetypePassword = driver.findElement(By.id("secondpassword"));
       txtRetypePassword.sendKeys("ariii555@");
       
       
       
       
       
       
		
	}

}
