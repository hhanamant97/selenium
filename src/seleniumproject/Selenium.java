package seleniumproject;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Selenium {
	
	
	
	public static void main(String[] args) throws InterruptedException {
		
		
		
		
		System.setProperty("webdriver.gecko.driver", "D:\\Hanamant\\java\\driver\\geckodriver-v0.24.0-win64\\geckodriver.exe");
		WebDriver driver =new FirefoxDriver();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		driver.get("http://localhost/login.do");
		
		driver.findElement(By.name("username")).sendKeys("admin");
		driver.findElement(By.name("pwd")).sendKeys("manager");
		
		WebDriverWait wait = new WebDriverWait(driver, 20);
		wait.until(ExpectedConditions.visibilityOfElementLocated(By.id("loginButton"))).click();
	
		
		Thread.sleep(2000);
		driver.close();
	}

}
