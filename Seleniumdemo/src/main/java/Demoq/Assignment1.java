package Demoq;

import java.util.NoSuchElementException;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Assignment1 {
	public WebDriver driver;

	public void met1() throws InterruptedException {
		String path = ("C:\\Users\\M1046989\\Downloads\\chromedriver_win32\\chromedriver.exe");
		System.setProperty("webdriver.chrome.driver", path);
		driver = new ChromeDriver();
		driver.get(" https://store.demoqa.com/");
		driver.findElement(By.xpath("//div[@id='account']")).click();
		driver.findElement(By.xpath("//div[@id='login_wrapper']// input[@type='text']")).sendKeys("sharath");
		driver.findElement(By.xpath("//div[@id='login_wrapper']// input[@type='password']")).sendKeys("sharath");
		driver.findElement(By.xpath("//div[@id='login_wrapper']// input[@type='submit']")).click();
		try {
			Thread.sleep(5000);
			WebElement res = driver.findElement(By.linkText("Lost your password?"));
			System.out.println("invalid user name");
		} catch (NoSuchElementException e) {
			System.out.println("login sucess");
		}

	}

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		Assignment1 ob = new Assignment1();
		ob.met1();

	}

}
