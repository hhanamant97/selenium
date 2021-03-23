package seleniumproject;



import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;

import org.openqa.selenium.WebElement;

import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.Test;

import baseclass.Baseclass;


public class Chrome extends Baseclass{

	
	@Test

		public void loginUrl() throws InterruptedException {
		
		driver.get("http://localhost/login.do");
		JavascriptExecutor js=(JavascriptExecutor)driver;
		WebElement email = driver.findElement(By.name("username"));
		js.executeScript("arguments[0].value=arguments[1]",email,"admin");
		WebElement pass = driver.findElement(By.name("pwd"));
		js.executeScript("arguments[0].value='manager'", pass);
		WebDriverWait wait = new WebDriverWait(driver, 20);
		wait.until(ExpectedConditions.visibilityOfElementLocated(By.id("loginButton"))).click();
		System.out.println(driver.getTitle());
		Thread.sleep(5000);
		
		
		
//		String st=driver.findElement(By.xpath("//p[contains(text(),'To login for')]")).getText();
//	    System.out.println(st);
	}
	
	
	
	
	
	

}
