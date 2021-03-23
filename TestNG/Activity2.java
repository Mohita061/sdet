package testNGTests;

import org.testng.annotations.Test;
import org.testng.annotations.BeforeClass;

import static org.testng.Assert.assertEquals;

import java.awt.Button;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.SkipException;
import org.testng.annotations.AfterClass;

public class Activity2 {
	
	WebDriver driver;
	
	@Test
	public void titletest() {
		System.out.println("Title of the page is :"+driver.getTitle());
		assertEquals(driver.getTitle(), "Target Practice");
	}
	
	@Test
	public void Buttontest() {
		WebElement Button = driver.findElement(By.xpath("//button[text()='Black']"));
		assertEquals(Button.getText(), "Brown");
	}
	
	@Test (enabled = false)
	public void Skippedtest() {
	}
	
	@Test
	public void SkipExceptiontest() {
		throw new SkipException("This test case is skipped");
	}

	@BeforeClass
	public void beforeClass() {
		driver= new FirefoxDriver();
		driver.get("https://www.training-support.net/selenium/target-practice");
		
	}

	@AfterClass
	public void afterClass() {
		driver.close();
	}

}