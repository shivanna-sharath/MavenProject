package SeleniumProj.Session;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
class main extends Gmail{
	public void name() throws InterruptedException {
		String s=driver.findElement(By.xpath("//span[@class='gD']")).getText();
		System.out.println( s);
		Thread.sleep(5000);
		String k = driver.findElement(By.xpath("//h2[@class='hP']")).getText();
		System.out.println(" subject="+" "+k);
		driver.close();
		
	}
}

public class Gmail {
   
	static  WebElement e;
	static WebDriver driver;
   
	

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		
		String path = ("C:\\Users\\M1046989\\Downloads\\chromedriver_win32\\chromedriver.exe");
		System.setProperty("webdriver.chrome.driver", path);
		driver = new ChromeDriver();
		
		WebDriverWait wait = new WebDriverWait(driver, 30);
		driver.get("https://www.gmail.com");
		driver.findElement(By.xpath("//input[@class='whsOnd zHQkBf']")).sendKeys("sharuaekangi.1111@gmail.com");
		driver.findElement(By.xpath("//div[@id='identifierNext'] ")).click();
		Thread.sleep(5000);
		driver.findElement(By.xpath("//input[@jsname='YPqjbf']")).sendKeys("");
		Thread.sleep(5000);
		driver.findElement(By.xpath("//span[@class='RveJvd snByac']")).click();
		Thread.sleep(8000);
		
		e = driver.findElement(By.xpath("//div[@class='aAy J-KU-KO aIf-aLe']"));
		String t=e.getAttribute("aria-selected");
		if(t.equals("false")){
System.out.println("primary need to be clicked");	
e.click();
		}
		else {
			System.out.println("primary is already selected");
		}
		Thread.sleep(5000);
		String f = driver.findElement(By.xpath("//span[@class='ts'][2]")).getText();
		System.out.println(f);
		e = wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//tr[@class='zA yO']")));
		e.click();
		Thread.sleep(5000);
		main met1=new main();
		met1.name();
		
		
	}

}
