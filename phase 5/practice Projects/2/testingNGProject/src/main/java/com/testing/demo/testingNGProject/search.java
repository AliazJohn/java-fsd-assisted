package com.testing.demo.testingNGProject;

import org.testng.annotations.Test;
import org.testng.annotations.BeforeMethod;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;

public class search {
	WebDriver driver;
  @Test
  public void searchTest() {
	  driver.get("https://99booksstore.com/");
	  WebElement searchbox = driver.findElement(By.className("site-header__search-input"));
		searchbox.sendKeys("wuthering heights");
		
		driver.findElement(By.xpath("//*[@id=\"SiteHeader\"]/div[1]/div[1]/div/div[3]/form/button[1]")).click();
		
		
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
