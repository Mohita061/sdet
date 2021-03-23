package testNGTests;

import org.testng.annotations.Test;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeTest;
import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.Reporter;
import org.testng.annotations.AfterTest;

public class Activity9 {

	WebDriver driver;

	@Test
	public void simpleAlertTestCase() {
		WebElement simple = driver.findElement(By.cssSelector("button#simple"));
		simple.click();
		Reporter.log("simple alert clicked");

		Alert alert = driver.switchTo().alert();
		Reporter.log("Text on alert" + alert.getText());

		alert.accept();
		Reporter.log("Alert Closed");
	}

	@Test
	public void confirmAlertTestCase() {
		WebElement confirm = driver.findElement(By.cssSelector("button#confirm"));
		confirm.click();

		Reporter.log("confirm alert clicked");

		Alert alert = driver.switchTo().alert();
		Reporter.log("Text on alert" + alert.getText());

		alert.accept();
		Reporter.log("Alert Closed");
	}

	@Test
	public void promptAlertTestCase() {

		WebElement prompt = driver.findElement(By.cssSelector("button#prompt"));
		prompt.click();

		Reporter.log("prompt alert clicked");

		Alert alert = driver.switchTo().alert();
		Reporter.log("Text on alert" + alert.getText());

		alert.accept();
		Reporter.log("Alert Closed");
	}

	@BeforeMethod
	public void beforeMethod() {

		driver.switchTo().defaultContent();
		Reporter.log("Switching to default content");
	}

	@BeforeTest
	public void beforeTest() {
		driver = new FirefoxDriver();
		driver.get("https://www.training-support.net/selenium/javascript-alerts");
		
		Reporter.log("Opening the url");
	}

	@AfterTest
	public void afterTest() {
		driver.close();
	}

}