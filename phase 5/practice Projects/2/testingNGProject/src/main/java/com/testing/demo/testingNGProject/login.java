package com.testing.demo.testingNGProject;

import org.testng.annotations.Test;
import org.testng.annotations.BeforeMethod;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;

public class login {
	WebDriver driver;
  @Test
  public void loginTest() {
	  
	  driver.get("https://99booksstore.com/account/login?return_url=%2Faccount");
	  WebElement uname = driver.findElement(By.id("CustomerEmail"));
	  WebElement pass = driver.findElement(By.id("CustomerPassword"));
	 

	  uname.sendKeys("rosalindgay468@emvil.com");
	  pass.sendKeys("12345Aa#");
	  driver.findElement(By.xpath("//*[@id=\"customer_login\"]/p[1]/button")).click();	 
	
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
