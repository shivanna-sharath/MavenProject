package com.mindtree.Utility;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;


public class Const {
	public static String s = ("https://www.flipkart.com");

	public WebDriver met1() {
		String path = ("C:\\Users\\M1046989\\Downloads\\chromedriver_win32\\chromedriver.exe");
		System.setProperty("webdriver.chrome.driver", path);
		WebDriver driver;
		driver = new ChromeDriver();
		return driver;

	}
}
