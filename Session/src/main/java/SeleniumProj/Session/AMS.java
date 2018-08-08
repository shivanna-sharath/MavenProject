package SeleniumProj.Session;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class AMS {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		String path = ("C:\\Users\\M1046989\\Downloads\\chromedriver_win32\\chromedriver.exe");
		System.setProperty("webdriver.chrome.driver", path);
		WebDriver driver;
		WebElement e;
		driver = new ChromeDriver();
		driver.get("https://corpapps.mindtree.com/ams");
		 DateTimeFormatter dtf = DateTimeFormatter.ofPattern("MM/dd/yyyy");  
		   LocalDateTime now = LocalDateTime.now();  
		   String g=(dtf.format(now));  
	driver.findElement(By.xpath("//input[@name='username']")).sendKeys("M1046989");
		//driver.findElement(By.xpath("//input[@name='password']")).sendKeys("");
		//driver.findElement(By.xpath("//input[@class='credentials_input_submit']")).click();
		//driver.findElement(By.xpath("//div[@class='category-cont-wrap purple']")).click();
		driver.findElement(By.xpath("//input[@class='btn blue float-r']")).click();
		driver.findElement(By.xpath("//select[@data-val='true'] //option[@value='1']")).click();
		driver.findElement(By.xpath("//select[@id='drpFromTime']")).click(); 
		driver.findElement(By.xpath("//option[@value='6:00 PM']")).click();
		driver.findElement(By.xpath("//select[@id='drpToTime'] //option[@value='8:00 PM']")).click(); 
		driver.findElement(By.xpath("//input[@name='requestFromDate']")).click(); 
		e=driver.findElement(By.xpath("//input[@name='requestFromDate']"));
		e.sendKeys(g);
		e.sendKeys(Keys.TAB);
	
		e = driver.findElement(By.xpath("//input[@name='requestToDate']"));
				e.sendKeys(g);
				e.sendKeys(Keys.TAB);
				Thread.sleep(5000);
				driver.close();
	
		

	
	
	}

}
