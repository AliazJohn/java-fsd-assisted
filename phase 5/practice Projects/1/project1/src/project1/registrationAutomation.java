package project1;

import org.openqa.selenium.support.ui.*;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class registrationAutomation {
public static void main(String[] args) {
	String path="E:\\testing\\chromedriver_win32\\chromedriver.exe";
	System.setProperty("webdriver.chrome.driver", path);
	WebDriver driver = new ChromeDriver();
	String url="https://testpages.herokuapp.com/styled/basic-html-form-test.html";
	//driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
	driver.get(url);
	//System.out.println("title is "+driver.getTitle());
	WebElement email=driver.findElement(By.name("username"));
	email.sendKeys("aliyasjohn123@gmail.com");

	WebElement password=driver.findElement(By.name("password"));
	password.sendKeys("123456");
	
	WebElement textarea=driver.findElement(By.name("comments"));
	textarea.sendKeys("Automated testing of registration form inside this textarea is success!!!");
	
	WebElement checkbox= driver.findElement(By.name("checkboxes[]"));
	checkbox.click();
	
	WebElement radio3 = driver.findElement(By.xpath("//*[@id=\"HTMLFormElements\"]/table/tbody/tr[6]/td/input[3]"));
	radio3.click();
	
	WebElement multiple = driver.findElement(By.name("multipleselect[]"));
	Select select = new Select(multiple);
	select.deselectByValue("ms4");
	select.selectByValue("ms3");
	select.selectByValue("ms2");

	WebElement dropdown = driver.findElement(By.name("dropdown"));
	Select select1 = new Select(dropdown);
	//select1.deselectByValue("dd3");
	select1.selectByValue("dd2");
	
	WebElement button=driver.findElement(By.name("submitbutton"));
	button.submit();
}
}
