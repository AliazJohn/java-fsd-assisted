package com.testing;

import org.testng.annotations.Test;
import org.testng.annotations.BeforeMethod;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.testng.Reporter;
import org.testng.annotations.AfterMethod;

public class Loadtime {
	WebDriver driver;
  @Test
  public void loadTimeTest() {
	  long start = System.currentTimeMillis();

	  driver.get("https://www.flipkart.com/");
	  driver.close();
	  long finish = System.currentTimeMillis();
	  long totalTime = finish - start; 
	  System.out.println("Total Time for page load - "+totalTime+ " milliseconds");
	  Reporter.log("Total Time for page load - "+totalTime+ " milliseconds");
  }
  @BeforeMethod
  public void beforeMethod() {
	  System.setProperty("webdriver.chrome.driver", "E:\\testing\\chromedriver_win32\\chromedriver.exe");
	  ChromeOptions options = new ChromeOptions();
	  options.addArguments("start-maximized");
	  driver = new ChromeDriver(options);
  }

  @AfterMethod
  public void afterMethod() throws InterruptedException {
//	  Thread.sleep(3000);
//	  driver.close();
  }

}
