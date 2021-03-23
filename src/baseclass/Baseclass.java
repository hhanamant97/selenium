package baseclass;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;

public class Baseclass {
	
	public static WebDriver driver;
	@BeforeMethod
	public void openBrowser(){
		System.setProperty("webdriver.chrome.driver", "D:\\Hanamant\\java\\driver\\chromedriver_win32 88\\chromedriver.exe");
		//HtmlUnitDriver driver= new HtmlUnitDriver();
		//ChromeDriver driver = new ChromeDriver();
	    driver =new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		
	}

	
	@AfterMethod
	public void closeBrowser() {
		driver.close();
	}
}
