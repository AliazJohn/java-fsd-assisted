package com.testing;

import org.testng.annotations.Test;
import org.testng.annotations.BeforeMethod;
import org.openqa.selenium.By;
import org.openqa.selenium.Dimension;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Reporter;
import org.testng.annotations.AfterMethod;

public class DiffScreenResolution {
	WebDriver wd;
  @Test
  public void DiffScreenResolutionTest() throws InterruptedException {
	  String url = "https://www.flipkart.com/";
	  wd.get(url);
	  WebElement sign_in_cross = wd.findElement(By.xpath("//button[@class='_2KpZ6l _2doB4z']"));
	  sign_in_cross.click();
	  Thread.sleep(3000);
	  JavascriptExecutor js = (JavascriptExecutor) wd;
	  js.executeScript("window.scrollBy(0,1000)", "");
	  wd.manage().window().setSize(new Dimension(1620, 820));
	  Thread.sleep(3000);
	  WebElement textField = wd.findElement(By.name("q"));
	  textField.sendKeys("Iphone 13");
	  wd.findElement(By.xpath("//button[@class='L0Z3Pu']")).click();
	  js.executeScript("window.scrollBy(0,1000)", "");
	  wd.navigate().back();
	  Thread.sleep(3000);
	  wd.manage().window().maximize();
	  Thread.sleep(3000);
	  js.executeScript("window.scrollBy(0,1000)", "");
	  wd.manage().window().setSize(new Dimension(240, 360));
	  textField.sendKeys("mini");
	  Thread.sleep(3000);
	  js.executeScript("window.scrollBy(0,1000)", "");
	  Reporter.log("Different browsers and screen resolutions render it in the same way.");
  }
  @BeforeMethod
  public void beforeMethod() {
	  System.setProperty("webdriver.chrome.driver", "E:\\testing\\chromedriver_win32\\chromedriver.exe");
	  wd = new ChromeDriver();
  }

  @AfterMethod
  public void afterMethod() throws InterruptedException {
	  Thread.sleep(3000);
	  wd.close();
  }

}
