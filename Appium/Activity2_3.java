package Appium;

import java.net.MalformedURLException;
import java.net.URL;

import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import io.appium.java_client.AppiumDriver;
import io.appium.java_client.MobileBy;
import io.appium.java_client.MobileElement;
import io.appium.java_client.android.AndroidDriver;

public class Activity2_3 {
	
	AppiumDriver<MobileElement>  driver=null;	
	WebDriverWait wait;
@BeforeTest

public void intilize() throws MalformedURLException
{	
	  
		  DesiredCapabilities caps = new DesiredCapabilities();
		  caps.setCapability("deviceName", "Piaxel4emulator");
	      caps.setCapability("platformName", "Android");
	      caps.setCapability("appPackage", "com.google.android.apps.nexuslauncher");
	      caps.setCapability("appActivity", "NexusLauncherActivity");
	      caps.setCapability("noReset", true);
		  
	    
	  driver = new AndroidDriver<MobileElement>(new URL("http://127.0.0.1:4723/wd/hub"), caps);
	  }

@Test
  public void f() {
	driver.findElementByXPath("//android.widget.TextView[@content-desc=\"Phone\"]");
	driver.findElementById("contact_name").click();
    MobileElement firstName = driver.findElementByXPath("//android.widget.EditText[@text='First name']");	
    MobileElement lastName = driver.findElementByXPath("//android.widget.EditText[@text='Surname']");
    MobileElement phoneNumber = driver.findElementByXPath("//android.widget.EditText[@text='Phone']");
    firstName.sendKeys("Aaditya");
	lastName.sendKeys("Varma");
    phoneNumber.sendKeys("9991284782");
    driver.findElementById("editor_menu_save_button").click();
	
    wait.until(ExpectedConditions.presenceOfElementLocated(MobileBy.id("toolbar_parent")));
    MobileElement mobileCard = driver.findElementById("toolbar_parent");
    Assert.assertTrue(mobileCard.isDisplayed());
    String contactName = driver.findElementById("large_title").getText();
    Assert.assertEquals(contactName, "Aaditya Varma");

}



@AfterClass

public void afterClass() {

    driver.quit();

}
	  
	  
  }