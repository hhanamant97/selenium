package seleniumproject;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;


public class Chrome {
	
	
	
	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "D:\\Hanamant\\java\\driver\\chromedriver_win32(1) 83\\chromedriver.exe");
		WebDriver driver =new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		driver.get("http://localhost/login.do");
		
		String st=driver.findElement(By.xpath("//p[contains(text(),'To login for')]")).getText();
	    System.out.println(st);
	}

}
