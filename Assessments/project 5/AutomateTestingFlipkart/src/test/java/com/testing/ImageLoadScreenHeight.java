package com.testing;

import org.testng.annotations.Test;
import org.testng.annotations.BeforeMethod;

import java.awt.Toolkit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.testng.Reporter;
import org.testng.annotations.AfterMethod;

public class ImageLoadScreenHeight {
	WebDriver wd;
  @Test
  public void ImageLoadScreenHeightTest() throws InterruptedException {
	  wd.get("https://www.flipkart.com/");
	  WebElement sign_in_cross = wd.findElement(By.xpath("//button[@class='_2KpZ6l _2doB4z']"));
	  sign_in_cross.click();
	  java.awt.Dimension screenSize = Toolkit.getDefaultToolkit().getScreenSize();
	  int width = (int) screenSize.getWidth();
	  int height = (int) screenSize.getHeight();
	  System.out.println("Resoultion of the device :  Screen  width "+ width+" Screen Height "+height );
	  int widthimg=wd.findElement(By.xpath("//img[@class='kJjFO0 _3DIhEh']")).getSize().getWidth();
      int heightimg=wd.findElement(By.xpath("//img[@class='kJjFO0 _3DIhEh']")).getSize().getHeight();
      System.out.println("Resoultion of the image :  Image  width "+ widthimg+" Image Height "+heightimg );
	  WebElement img = wd.findElement(By.xpath("//div[@class='_3ywSr_']"));     
	  if(img.isDisplayed()){
		  if (heightimg<height)
      		{
          		System.out.println("Images are loaded and visible till the screen height only"); 
          		Reporter.log("Images are loaded and visible till the screen height only");
      		}
	  }
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
