package com.mindtree.Work;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class MultipleMail {
	WebDriver driver;
	
//@Parameters({"fname","sname","username","password"})
	@Test(dataProvider="dp")
	public void f(String fname,String sname, String username,String Password) {
		driver.findElement(By.id("firstName")).sendKeys(fname);
		driver.findElement(By.id("lastName")).sendKeys(sname);
		driver.findElement(By.id("username")).sendKeys(username);
		driver.findElement(By.xpath("//input[@name='Passwd']")).sendKeys(Password);
		driver.findElement(By.xpath("//input[@name='ConfirmPasswd']")).sendKeys(Password);
		driver.findElement(By.xpath("//span[@class='RveJvd snByac']")).click();
	}

	@DataProvider(name = "dp")
  public static Object[][] getData() {
      return new Object[][]  { { "sharath","gowda","t.estuser1", "Test@123" }, {"praveen","gowda", "t.estuser2", "Test@123" },{"no","one","t.estuser3","Test@123"}};
	}
   

	@BeforeMethod
	public void beforeMethod() {

		String path = ("C:\\Users\\M1046989\\Downloads\\chromedriver_win32\\chromedriver.exe");
		System.setProperty("webdriver.chrome.driver", path);
		driver = new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		driver.get(
				" https://accounts.google.com/SignUp?service=mail&continue=https%3A%2F%2Fmail.google.com%2Fmail%2F&ltmpl=default ");

	}

	@AfterMethod
	public void afterMethod() {
driver.close();
	}

}
