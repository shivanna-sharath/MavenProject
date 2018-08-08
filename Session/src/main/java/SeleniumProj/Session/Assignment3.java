package SeleniumProj.Session;

import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Action;
import org.openqa.selenium.interactions.Actions;

public class Assignment3 {
	static WebDriver driver;
	static WebElement e;

	public void met1() {
		e = driver.findElement(By.id("menu-item-15"));
		String s = e.getText();
		System.out.println(s);
		String s1 = driver.findElement(By.xpath("//li[@id='menu-item-33']")).getText();
		System.out.println(s1);
		String s2 = driver.findElement(By.xpath("//li[@id='menu-item-16']")).getText();
		System.out.println(s2);
		String s3 = driver.findElement(By.xpath("//li[@id='menu-item-72']")).getText();
		System.out.println(s3);
		driver.findElement(By.xpath("//li[@id='menu-item-33']")).click();
	}

	public void met2() {
		String s = driver.findElement(By.xpath("//li[@id='menu-item-34']")).getText();
		System.out.println(s);
		s = driver.findElement(By.xpath("//li[@id='menu-item-35']")).getText();
		System.out.println(s);
		s = driver.findElement(By.xpath("//li[@id='menu-item-36']")).getText();
		System.out.println(s);
		s = driver.findElement(By.xpath("//li[@id='menu-item-37']")).getText();
		System.out.println(s);
		s = driver.findElement(By.xpath("//li[@id='menu-item-38']")).getText();
		System.out.println(s);
		s = driver.findElement(By.xpath("//li[@id='menu-item-39']")).getText();
		System.out.println(s);
	}

	public void drag() {
		Actions action = new Actions(driver);
		action.moveToElement(driver.findElement(By.xpath("//li[@id='menu-item-33']"))).build().perform();
	}

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		List<WebElement> EleLis = new ArrayList();

		String path = ("C:\\Users\\M1046989\\Downloads\\chromedriver_win32\\chromedriver.exe");
		System.setProperty("webdriver.chrome.driver", path);
		driver = new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		driver.get("https://toolsqa.com/)");
		e = driver.findElement(By.linkText("DEMO SITES"));
		Actions action = new Actions(driver);
		action.moveToElement(e).build().perform();
		driver.findElement(By.linkText("E-Commerce Demo Site")).click();

		driver.get("http://store.demoqa.com/");
		// driver.switchTo().window("http://store.demoqa.com");

		/*
		 * ArrayList<String> tab = new ArrayList<String>(driver.getWindowHandles());
		 * driver.switchTo().window(tab.get(0)); int c =
		 * driver.getWindowHandles().size(); System.out.println(c);
		 */
		Assignment3 a = new Assignment3();
		a.met1();
		a.drag();
		a.met2();
		driver.findElement(By.xpath("//li[@id='menu-item-34']")).click();

		a.drag();
		driver.findElement(By.xpath("//li[@id='menu-item-35']")).click();

		a.drag();
		driver.findElement(By.xpath("//li[@id='menu-item-36']")).click();

		a.drag();
		driver.findElement(By.xpath("//li[@id='menu-item-37']")).click();

		a.drag();
		driver.findElement(By.xpath("//li[@id='menu-item-38']")).click();

		a.drag();
		driver.findElement(By.xpath("//li[@id='menu-item-39']")).click();

		EleLis = driver.findElements(By.xpath("//ul[@class='group']"));
		for (WebElement d : EleLis) {

			String s = d.getText();
			if (s.equals("More Details >")) {
				continue;
			} else if (s.equals("Pinterest")) {
				break;
			} else
				System.out.println("-" + s + "-");
		}

	}

}
