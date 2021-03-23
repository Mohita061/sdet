package Appium;

import java.net.MalformedURLException;
import java.net.URL;

import org.openqa.selenium.remote.DesiredCapabilities;
import org.testng.Assert;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import io.appium.java_client.AppiumDriver;
import io.appium.java_client.MobileElement;
import io.appium.java_client.android.AndroidDriver;

public class Activity3_2 {
	
	AppiumDriver<MobileElement>  driver=null;
	
  @BeforeTest
  public void Intialize() throws MalformedURLException {
	  
	  DesiredCapabilities caps = new DesiredCapabilities();
	  caps.setCapability("deviceName", "Piaxel4emulator");
      caps.setCapability("platformName", "Android");
      caps.setCapability("appPackage", "com.android.calculator2");
      caps.setCapability("appActivity", "Calculator");
      caps.setCapability("noReset", true);
	  
    
  driver = new AndroidDriver<MobileElement>(new URL("http://127.0.0.1:4723/wd/hub"), caps);
  
}
  @Test
  public void add()
  {
	  driver.findElementById("digit_5").click();
	  driver.findElementById("op_add").click();
	  driver.findElementById("digit_9").click();
	  driver.findElementById("eq").click();
	  
	  String result = driver.findElementById("result").getText();
	  System.out.println(result);
	  Assert.assertEquals(result, "14");
	  
  }
  
  @Test
	
  public void subtract() {
	
      driver.findElementById("digit_1").click();	
      driver.findElementById("digit_0").click();	
      driver.findElementById("op_sub").click();	
      driver.findElementById("digit_5").click();	
      driver.findElementById("eq").click();
	    
      String result = driver.findElementById("result").getText();
	  System.out.println(result);
	  Assert.assertEquals(result, "5");
  }

  @Test
	
  public void multiply() {
	
      driver.findElementById("digit_5").click();	
      driver.findElementById("op_mul").click();	
      driver.findElementById("digit_1").click();	
      driver.findElementById("digit_0").click();	
      driver.findElementById("digit_0").click();
	
          driver.findElementById("eq").click();
          String result = driver.findElementById("result").getText();
      	  System.out.println(result);
  	      Assert.assertEquals(result, "500");
  }
  @Test
	
  public void divide() {
	
      driver.findElementById("digit_5").click();	
      driver.findElementById("digit_0").click();	
      driver.findElementById("op_div").click();	
      driver.findElementById("digit_2").click();
	  driver.findElementById("eq").click();
		
      String result = driver.findElementById("result").getText();
	  System.out.println(result);
	  Assert.assertEquals(result, "25");
	  }
		
  @AfterClass
	
  public void afterClass() {
	
      driver.quit();
	
  }
}