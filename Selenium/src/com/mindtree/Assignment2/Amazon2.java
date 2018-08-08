package com.mindtree.Assignment2;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Amazon2 {
	public static void main(String[] args) {
	WebDriver driver;
	WebElement e;
	String path = ("C:\\Users\\M1046989\\Downloads\\chromedriver_win32\\chromedriver.exe");
	System.setProperty("webdriver.chrome.driver", path);
	driver = new ChromeDriver();
	driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
	driver.get("https://www.amazon.in/");
	driver.findElement(By.xpath("//input[@id=\"twotabsearchtextbox\"]")).sendKeys("mobiles");
	driver.findElement(By.xpath("//input[@type=\"submit\"]")).click();

}
}
