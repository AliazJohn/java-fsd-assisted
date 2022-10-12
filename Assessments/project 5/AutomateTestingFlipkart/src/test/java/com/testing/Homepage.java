package com.testing;

import org.testng.annotations.Test;
import org.testng.annotations.BeforeMethod;


import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.testng.Assert;
import org.testng.Reporter;
import org.testng.annotations.AfterMethod;

public class Homepage {
	WebDriver wd;
  @Test
  public void homePageTest() {
	  String url = "https://www.flipkart.com/";
	  wd.get(url);
	  Reporter.log("Chrome Invoked and navigated to URL: " + url + "<br>", true);
	  WebElement sign_in_cross = wd.findElement(By.xpath("//button[@class='_2KpZ6l _2doB4z']"));
	  sign_in_cross.click();
	  String actual = wd.getTitle();
	  String expected = "Online Shopping Site for Mobiles, Electronics, Furniture, Grocery, Lifestyle, Books & More. Best Offers!";
	  Assert.assertEquals(actual, expected);
	  Reporter.log("Page Navigated." + "<br>", true);
	  
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
	  Thread.sleep(2000);
	  wd.close();
  }

}
