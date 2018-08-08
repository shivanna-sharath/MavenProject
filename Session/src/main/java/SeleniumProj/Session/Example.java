package SeleniumProj.Session;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Example {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		String path = ("C:\\Users\\M1046989\\Downloads\\chromedriver_win32\\chromedriver.exe");
		System.setProperty("webdriver.chrome.driver", path);
		WebDriver driver;
		WebElement e;
		driver = new ChromeDriver();
		driver.get("https://www.flipkart.com");
		driver.findElement(By.xpath("//button[@class='_2AkmmA _29YdH8']")).click();
		driver.findElement(By.xpath("//ul[@class='_114Zhd'] //span[contains(text(),'Electronics')]")).click();
		WebDriverWait wait = new WebDriverWait(driver, 30);
		e = wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//a[@title='Mobiles']")));
		e.click();

		e = wait.until(
				ExpectedConditions.visibilityOfElementLocated(By.xpath("//div[@class='_3b7jyH'] //img[@alt='Mi']")));
		e.click();

	}

}
