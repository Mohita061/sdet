package testNGTests;

import org.testng.annotations.Test;
import org.testng.annotations.BeforeClass;

import static org.testng.Assert.assertEquals;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.Assert;
import org.testng.annotations.AfterClass;

public class Activity3 {

	WebDriver driver;
	
	@Test
	public void loginTest() {
		
		WebElement user = driver.findElement(By.xpath("//input[@id='username']"));
		WebElement pass = driver.findElement(By.xpath("//input[@id='password']"));
		WebElement button = driver.findElement(By.xpath("//button[text()='Log in']"));
		
		user.sendKeys("admin");
		pass.sendKeys("password");
		button.click();
		
		String loginMessage = driver.findElement(By.xpath("//div[@id='action-confirmation']")).getText();
		
		Assert.assertEquals("Welcome Back, admin",loginMessage);
	}
	

	@BeforeClass
	public void beforeClass() {
		driver = new FirefoxDriver();
		driver.get("https://www.training-support.net/selenium/login-form");
		
	}
	

	@AfterClass
	public void afterClass() {
		driver.close();
	}

}