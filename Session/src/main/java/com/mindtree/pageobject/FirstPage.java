package com.mindtree.pageobject;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import com.mindtree.Utility.Const;

public class FirstPage {
	public WebElement e;
	public WebDriverWait wait;
	public void met2() {
		Const a=new Const();
	WebDriver driver=a.met1();
		driver.get(a.s);
		driver.findElement(By.xpath("//button[@class='_2AkmmA _29YdH8']")).click();
		driver.findElement(By.xpath("//ul[@class='_114Zhd'] //span[contains(text(),'Electronics')]")).click();
		wait = new WebDriverWait(driver, 30);
		e = wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//a[@title='Mobiles']")));
		e.click();

		

	}

}
