package com.mindtree.Assignment2;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Action;
import org.openqa.selenium.interactions.Actions;

public class Amazon {

	public static void main(String[] args) {
		WebDriver driver;
		WebElement e;
		String path = ("C:\\Users\\M1046989\\Downloads\\chromedriver_win32\\chromedriver.exe");
		System.setProperty("webdriver.chrome.driver", path);
		driver = new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		driver.get("https://www.amazon.in/");
		Actions builder = new Actions(driver);

		Action move = builder
				.moveToElement(driver.findElement(By.xpath("//div[@id='nav-tools'] //a[@data-nav-role='signin']")))
				.build();
		move.perform();

		Actions MClick = builder.moveToElement(driver.findElement(By.xpath("//a[@data-nav-role='signin']"))).click();
		MClick.perform();

		Action typeInCAPS = builder.keyDown(Keys.SHIFT).sendKeys("test practise").keyUp(Keys.SHIFT).build();
		typeInCAPS.perform();

	}

}