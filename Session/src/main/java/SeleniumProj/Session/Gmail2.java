package SeleniumProj.Session;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Gmail2 {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		WebDriver driver;
		WebElement e;
		String path = ("C:\\Users\\M1046989\\Downloads\\chromedriver_win32\\chromedriver.exe");
		System.setProperty("webdriver.chrome.driver", path);
		driver = new ChromeDriver();

		driver.get("https://www.gmail.com");
		
		driver.findElement(By.xpath("//input[@class='whsOnd zHQkBf']")).sendKeys("sharuaekangi.1111");
		driver.findElement(By.xpath("//div[@id='identifierNext'] ")).click();
		Thread.sleep(5000);
		driver.findElement(By.xpath("//input[@jsname='YPqjbf']")).sendKeys("");
		Thread.sleep(5000);
		driver.findElement(By.xpath("//span[@class='RveJvd snByac']")).click();
		Thread.sleep(9000);
		driver.findElement(By.xpath("//div[@class='T-I J-J5-Ji T-I-KE L3']")).click();
		Thread.sleep(9000);
		driver.findElement(By.xpath("//textarea[@id=':o7']")).sendKeys("saurabh@qatechhub.com");
		Thread.sleep(7000);

		driver.findElement(By.xpath("//input[@name='subjectbox']")).sendKeys("Program practise");
		Thread.sleep(9000);
		driver.findElement(By.xpath("//div[@id=':oz']")).sendKeys("Test email");
		Thread.sleep(9000);
		driver.findElement(By.xpath("//div[@id=':nk']")).click();
	}

}