package SeleniumAssignment;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Assi1 {
	WebDriver driver;
 
	public void met1() {
	
		driver=new FirefoxDriver();
	
	}
	public void met2() {
		String path = ("C:\\Users\\M1046989\\Downloads\\chromedriver_win32\\chromedriver.exe");
		System.setProperty("webdriver.chrome.driver", path);
		
		driver=new ChromeDriver();
		
	}
	public void met3() {
		System.setProperty("webdriver.edge.driver","C:\\Users\\M1046989\\Desktop"); 
		 
        WebDriver driver = new EdgeDriver();
        
	
	}
	public static void main(String[] args) {
	Assi1 a=new Assi1();
	//a.met1();
	
	//a.met2();
	

	a.met3();

	

	}

}