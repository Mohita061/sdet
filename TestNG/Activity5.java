package testNGTests;

import org.testng.annotations.Test;
import org.testng.annotations.BeforeClass;

import static org.testng.Assert.assertEquals;

import java.awt.Color;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.Assert;
import org.testng.annotations.AfterClass;

public class Activity5 {
	WebDriver driver;

	@Test (groups = {"Header", "Button"})
	public void checkTitle() {
		String title = driver.getTitle();
		Assert.assertEquals(title, "Target Practice");
	}
	
	@Test (groups = {"Header"})
	public void checkHeaderText() {
		String text = driver.findElement(By.cssSelector("h3#third-header")).getText();
		Assert.assertEquals(text, "Third header");
		
	}
	
	@Test (groups = {"Header"})
	public void checkHeaderColor() {
		String color = driver.findElement(By.cssSelector("h5.ui.green.header")).getCssValue("color");
		Assert.assertEquals(color, "rgb(251, 189, 8)");
	}
	
	@Test (groups = {"Button"})
	public void checkOliveButton() {
		String buttonText = driver.findElement(By.cssSelector("button.ui.olive.button")).getText();
		Assert.assertEquals(buttonText, "Olive");
	}
	
	@Test (groups = {"Button"})
	public void checkBrownButton() {
		String buttonColor = driver.findElement(By.cssSelector("button.ui.brown.button")).getText();
		Assert.assertEquals(buttonColor, "rgb(255, 255, 255)");
	}
	
	
	

	@BeforeClass (groups = {"Header", "Button"})
	public void beforeClass() {
		driver = new FirefoxDriver();
		driver.get("https://www.training-support.net/selenium/target-practice");
		
	}

	@AfterClass (groups = {"Header", "Button"})
	public void afterClass() {
		driver.close();
	}

}