package SeleniumProj;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Activity2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		WebDriver driver = new FirefoxDriver();
		driver.get("https://www.training-support.net");
    //Get the title of the page using driver.getTitle() and print out the title
		String title= driver.getTitle();
		System.out.println(title);
	// By ID locator	
		WebElement IDLocator = driver.findElement(By.id("about-link"));
		System.out.println("ID locator Text : " +IDLocator.getText());
		
	// By ClassName locator	
		WebElement classNameLocator = driver.findElement(By.className("green"));
		System.out.println("className locator Text : " +classNameLocator.getText());
		
    // By LinkText locator	
		WebElement LinkTextLocator = driver.findElement(By.linkText("About Us"));
		System.out.println("LinkText locator Text : " +LinkTextLocator.getText());	
		
	// By cssSelector locator	
		WebElement cssSelectorLocator = driver.findElement(By.cssSelector(".inverted"));
		System.out.println("cssSelector locator Text : " +cssSelectorLocator.getText());	
					
        driver.close();
	}

}