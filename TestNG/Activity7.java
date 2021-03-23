package testNGTests;

import org.testng.annotations.Test;
import org.testng.annotations.DataProvider;
import org.testng.annotations.BeforeClass;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.Assert;
import org.testng.annotations.AfterClass;

public class Activity7 {

	WebDriver driver;

	@Test(dataProvider = "cred")
	public void testLogin(String user, String pass) {

		WebElement username = driver.findElement(By.xpath("//input[@id='username']"));
		WebElement password = driver.findElement(By.xpath("//input[@id='password']"));
		WebElement button = driver.findElement(By.xpath("//button[text()='Log in']"));
		
		username.sendKeys(user);
		password.sendKeys(pass);
		button.click();
	
		WebElement welcometext = driver.findElement(By.xpath("//div[@id='action-confirmation']"));
		Assert.assertEquals(welcometext.getText(), "Welcome Back, admin");
	}

	@DataProvider(name = "cred")
	public Object[][] credData() {
		return new Object[][] { new Object[] { "admin", "password" } };
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