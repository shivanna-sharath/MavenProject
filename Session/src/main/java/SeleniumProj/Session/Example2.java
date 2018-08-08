package SeleniumProj.Session;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Example2 {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		String path = ("C:\\Users\\M1046989\\Downloads\\chromedriver_win32\\chromedriver.exe");
		System.setProperty("webdriver.chrome.driver",path);
		WebDriver driver;
		driver=new ChromeDriver();

driver.get("https://www.amazon.com");
driver.findElement(By.xpath("//input[@type='text']")).sendKeys("jbl speaker");

driver.findElement(By.xpath("//input[@type='submit']")).click();
driver.findElement(By.xpath("//h2[@data-attribute='JBL Flip 4 Waterproof Portable Bluetooth Speaker (Red)']")).click();
driver.findElement(By.xpath("//input[@id='add-to-cart-button']")).click();
driver.findElement(By.xpath("//a[@id='hlb-view-cart-announce']")).click();
driver.findElement(By.xpath("//input[@name='proceedToCheckout']")).click();
driver.findElement(By.xpath("//input[@class='a-input-text a-span12 auth-autofocus auth-required-field']")).sendKeys("9110261611");
driver.findElement(By.xpath("//input[@id='continue']")).click();
driver.findElement(By.xpath("//input[@id='ap_password']")).sendKeys("Sharu@15");
driver.findElement(By.xpath("//input[@id='signInSubmit']")).click();
driver.findElement(By.xpath("//a[@class='a-declarative a-button-text ']")).click();
driver.findElement(By.xpath("//input[@class='a-button-text']")).click();

	}

}