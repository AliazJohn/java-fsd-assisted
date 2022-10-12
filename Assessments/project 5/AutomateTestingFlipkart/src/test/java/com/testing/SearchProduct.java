package com.testing;

import org.testng.annotations.Test;
import org.testng.annotations.BeforeMethod;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.testng.Reporter;
import org.testng.annotations.AfterMethod;

public class SearchProduct {
	WebDriver wd;
  @Test
  public void searchProductTest() throws InterruptedException {
	  wd.get("https://www.flipkart.com/");
	  WebElement sign_in_cross = wd.findElement(By.xpath("//button[@class='_2KpZ6l _2doB4z']"));
	  sign_in_cross.click();
	  wd.findElement(By.xpath("//div[@class='CXW8mj']")).click();
	  Thread.sleep(1000);
	  WebElement textField = wd.findElement(By.name("q"));
	  textField.sendKeys("Iphone 13");
	  wd.findElement(By.xpath("//button[@class='L0Z3Pu']")).click();
	  Reporter.log("Product Have Been Searched Successfully");
  }
  @BeforeMethod
  public void beforeMethod() {
	  System.setProperty("webdriver.chrome.driver", "E:\\testing\\chromedriver_win32\\chromedriver.exe");
	  ChromeOptions options = new ChromeOptions();
	  options.addArguments("start-maximized");
	  wd = new ChromeDriver(options);
  }

  @AfterMethod
  public void afterMethod() throws InterruptedException {
	  Thread.sleep(3000);
	  wd.close();
  }

}
