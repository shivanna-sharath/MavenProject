package com.mindtree;

import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class SeleniumDemo {
 
	public WebDriver driver;

	public void Example() throws InterruptedException {
	
		String path = ("C:\\Users\\M1046989\\Downloads\\chromedriver_win32\\chromedriver.exe");
		System.setProperty("webdriver.chrome.driver", path);
		driver=new ChromeDriver();
		driver.get("https://www.flipkart.com/");
		Thread.sleep(3000);
		driver.findElement(By.xpath("//button[@class='_2AkmmA _29YdH8']")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("//input[@type='text']")).sendKeys("redmi note 4");
		Thread.sleep(3000);
		
		driver.findElement(By.xpath("//button[@class='vh79eN'][@type='submit']")).click();
		Thread.sleep(6000);
		driver.findElement(By.xpath("//div[@class='_3wU53n']")).click();
		Thread.sleep(4000);
driver.get("https://www.flipkart.com/redmi-note-4-dark-grey-64-gb/p/itmeqg88cnhyyuaf?pid=MOBEQ98TWG8X4HH3&srno=s_1_1&otracker=search&lid=LSTMOBEQ98TWG8X4HH3K9GEMH&fm=SEARCH&iid=3a925249-fce7-4f4b-b243-d5f78ee52a4a.MOBEQ98TWG8X4HH3.SEARCH&ppt=Homepage&ppn=Homepage&ssid=cnjy42qluo0000001533054445066&qH=0ebb2e8c32c9f552");
Thread.sleep(2000);
		 //Set<String> handle= driver.getWindowHandles();//Return a set of window handle
		driver.findElement(By.xpath("//button[@class='_2AkmmA _2Npkh4 _2kuvG8 _7UHT_c']")).click();
	
		Thread.sleep(4000);
	
		 driver.findElement(By.xpath("//input[@class='_2zrpKA _14H79F']")).sendKeys("9110261611");
		
		//driver.findElement(By.xpath("//button[@class='_2AkmmA _2Npkh4 _2MWPVK']")).click();
		 driver.findElement(By.xpath("//button[@class='_2AkmmA _1poQZq _7UHT_c']")).click();
		 Thread.sleep(4000);
		 driver.findElement(By.xpath("//input[@type='password']")).sendKeys("12345");
		 driver.findElement(By.xpath("//button[@class='_2AkmmA _1poQZq _7UHT_c']")).click();
		 
		
		

		
		
		
	}

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		SeleniumDemo ob = new SeleniumDemo();
		ob.Example();

	}

}