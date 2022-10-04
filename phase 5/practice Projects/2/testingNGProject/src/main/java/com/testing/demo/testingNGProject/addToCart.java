package com.testing.demo.testingNGProject;

import org.testng.annotations.Test;
import org.testng.annotations.BeforeMethod;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;

public class addToCart {
	WebDriver driver;
  @Test
  public void addToCartTest() {
	  driver.get("https://99booksstore.com/collections/bestseller-books/products/atomic-habits-paperback-james-clear");
	  
	 driver.findElement(By.xpath("//*[@id=\"AddToCartForm-template--15027456082073__main-7071191793817\"]/div[2]/button")).click();	
	 
	
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
