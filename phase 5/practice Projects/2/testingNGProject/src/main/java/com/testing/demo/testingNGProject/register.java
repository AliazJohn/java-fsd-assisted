package com.testing.demo.testingNGProject;

import org.testng.annotations.Test;
import org.testng.annotations.BeforeMethod;


import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import org.testng.annotations.AfterMethod;

public class register {
	WebDriver driver;
  @Test
  public void registerTest() {
	  
	  driver.get("https://99booksstore.com/account/register");
	  
	  WebElement fname = driver.findElement(By.name("customer[first_name]"));
	  WebElement lname = driver.findElement(By.name("customer[last_name]"));
	  WebElement email = driver.findElement(By.id("Email"));
	  WebElement pass = driver.findElement(By.id("CreatePassword"));
	  
	  fname.sendKeys("james");
	  lname.sendKeys("Mcgill");
	  email.sendKeys("winos93792@deitada.com");
	  pass.sendKeys("12345Aa#");
	  
	  
	  driver.findElement(By.id("agree")).click();
	  driver.findElement(By.xpath("//*[@id=\"create_customer\"]/p[2]/input")).click();
	
  }
  
  
  @BeforeMethod
  public void beforeMethod() {
	  System.setProperty("webdriver.chrome.driver", "E:\\testing\\chromedriver_win32\\chromedriver.exe");
		driver= new ChromeDriver();
  }

  @AfterMethod
  public void afterMethod() throws InterruptedException {
	  Thread.sleep(3000);
	  driver.close();
  }

}
