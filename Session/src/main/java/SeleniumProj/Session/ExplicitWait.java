package SeleniumProj.Session;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

class call extends ExplicitWait {
	public void name() throws InterruptedException {
		e = wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//span[@class='gD']")));
		String s = e.getText();
		System.out.println(s);

		e = wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//h2[@class='hP']")));
		String k = e.getText();
		System.out.println(" subject=" + " " + k);
		driver.close();

	}
}

public class ExplicitWait {
	static WebElement e;
	static WebDriver driver;
	static WebDriverWait wait;

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		// TODO Auto-generated method stub

		String path = ("C:\\Users\\M1046989\\Downloads\\chromedriver_win32\\chromedriver.exe");
		System.setProperty("webdriver.chrome.driver", path);
		driver = new ChromeDriver();

		wait = new WebDriverWait(driver, 30);
		driver.get("https://www.gmail.com");
		Thread.sleep(6000);
		driver.findElement(By.xpath("//input[@class='whsOnd zHQkBf']")).sendKeys("sharuaekangi.1111");
		driver.findElement(By.xpath("//div[@id='identifierNext'] ")).click();

		e = wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//input[@jsname='YPqjbf']")));
		e.sendKeys("leave me alone");
		driver.findElement(By.xpath("//span[@class='RveJvd snByac']")).click();

		e = driver.findElement(By.xpath("//div[@class='aAy J-KU-KO aIf-aLe']"));
		String t = e.getAttribute("aria-selected");
		if (t.equals("false")) {
			System.out.println("primary need to be clicked");
			e.click();
		} else {
			System.out.println("primary is already selected");
		}
		String f = driver.findElement(By.xpath("//span[@class='ts'][2]")).getText();
		System.out.println(f);
		e = wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//tr[@class='zA yO']")));
		e.click();
		call met1 = new call();
		met1.name();

	}

}
