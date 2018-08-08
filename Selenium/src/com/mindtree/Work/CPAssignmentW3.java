package com.mindtree.Work;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class CPAssignmentW3 {
	public static void  main(String[] args) throws InterruptedException {
	WebDriver driver;
	WebElement e;
	String path = ("C:\\Users\\M1046989\\Downloads\\chromedriver_win32\\chromedriver.exe");
	System.setProperty("webdriver.chrome.driver", path);
	driver = new ChromeDriver();
	driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);

	driver.get("http://newtours.demoaut.com/");
	driver.findElement(By.xpath("//input[@name='userName']")).sendKeys("mercury");
	driver.findElement(By.xpath("//input[@name='password']")).sendKeys("mercury");
	driver.findElement(By.xpath("//input[@name='login']")).click();
	driver.findElement(By.xpath("//input[@value='oneway']")).click();
	driver.findElement(By.xpath("//select[@name='passCount'] //option[@value='4']")).click();
	driver.findElement(By.xpath("//select[@name='fromPort'] //option[@value='Frankfurt']")).click();
	driver.findElement(By.xpath("//select[@name='fromMonth'] //option[@value='11']")).click();
	driver.findElement(By.xpath("//select[@name='fromDay'] //option[@value='19']")).click();
	driver.findElement(By.xpath("//select[@name='toPort'] //option[@value='London']")).click();
	driver.findElement(By.xpath("//select[@name='toMonth'] //option[@value='11']")).click();
	driver.findElement(By.xpath("//select[@name='toDay'] //option[@value='20']")).click();
	driver.findElement(By.xpath("//input[@value='First']")).click();
	driver.findElement(By.xpath("//select[@name='airline'] //option[3]")).click();
	driver.findElement(By.xpath("//input[@name='findFlights']")).click();
	Thread.sleep(3000);

	driver.findElement(By.xpath("//input[@value='Unified Airlines$363$281$11:24']")).click();
	driver.findElement(By.xpath("//input[@value='Pangea Airlines$632$282$16:37']")).click();
	driver.findElement(By.xpath("//input[@name='reserveFlights']")).click();
	Thread.sleep(3000);
	driver.findElement(By.xpath("//input[@name='passFirst0']")).sendKeys("Tester1");
	driver.findElement(By.xpath("//input[@name='passLast0']")).sendKeys("LN1");
	driver.findElement(By.xpath("//select[@name='pass.0.meal'] //option[@value='HNML']")).click();
	driver.findElement(By.xpath("//input[@name='passFirst1']")).sendKeys("Tester2");
	driver.findElement(By.xpath("//input[@name='passLast1']")).sendKeys("LN2");
	driver.findElement(By.xpath("//select[@name='pass.1.meal'] //option[@value='LCML']")).click();
	driver.findElement(By.xpath("//input[@name='passFirst2']")).sendKeys("Tester3");
	driver.findElement(By.xpath("//input[@name='passLast2']")).sendKeys("LN3");
	driver.findElement(By.xpath("//select[@name='pass.2.meal'] //option[@value='KSML']")).click();
	driver.findElement(By.xpath("//input[@name='passFirst3']")).sendKeys("Tester4");
	driver.findElement(By.xpath("//input[@name='passLast3']")).sendKeys("LN4");
	driver.findElement(By.xpath("//select[@name='pass.3.meal']")).click();
driver.findElement(By.xpath("//input[@name='creditnumber']")).sendKeys("234234");
driver.findElement(By.xpath("//input[@value='1325 Borregas Ave.']")).clear();
driver.findElement(By.xpath("//input[@value='1325 Borregas Ave.']")).sendKeys("101,notting hill");
driver.findElement(By.xpath("//input[@name='billCity']")).clear();
driver.findElement(By.xpath("//input[@name='billCity']")).sendKeys("New Jersey");
driver.findElement(By.xpath("//input[@name='billState']")).clear();
driver.findElement(By.xpath("//input[@name='billState']")).sendKeys("Nj");
driver.findElement(By.xpath("//input[@name='billZip']")).clear();
driver.findElement(By.xpath("//input[@name='billZip']")).sendKeys("07342");

driver.findElement(By.xpath("//input[@name='delAddress1']")).clear();
driver.findElement(By.xpath("//input[@name='delAddress1']")).sendKeys("131 bills road");
driver.findElement(By.xpath("//input[@name='delCity']")).clear();
driver.findElement(By.xpath("//input[@name='delCity']")).sendKeys("alpharetta");
driver.findElement(By.xpath("//input[@name='delState']")).clear();
driver.findElement(By.xpath("//input[@name='delState']")).sendKeys("GA");
driver.findElement(By.xpath("//input[@name='delZip']")).clear();
driver.findElement(By.xpath("//input[@name='delZip']")).sendKeys("30001");
Thread.sleep(5000);

driver.findElement(By.xpath("//input[@name='buyFlights']")).click();
driver.findElement(By.xpath("//img[@src='/images/forms/Logout.gif']")).click();







}
}
