package Appium;

import java.io.IOException;
import java.net.MalformedURLException;
import java.net.URL;

import org.openqa.selenium.remote.DesiredCapabilities;
import org.testng.Assert;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import io.appium.java_client.AppiumDriver;
import io.appium.java_client.MobileElement;
import io.appium.java_client.android.AndroidDriver;

public class Activity2 {
	
	@Test
	
	public void calc() throws InterruptedException , IOException
	{
	
	DesiredCapabilities a = new DesiredCapabilities();
	a.setCapability("deviceId",  "emulator-5554");
	a.setCapability("deviceName", "My Phone");
	a.setCapability("platformName", "Android");
	a.setCapability("appPackage", "com.android.calculator2");
	a.setCapability("appActivity", "Calculator");
	
	
	AppiumDriver<MobileElement> driver = null;
	try
	{
		driver = new AndroidDriver<MobileElement>(new URL("http://127.0.0.1:4723/wd/hub"), a);
		System.out.println("calculator is open");
		
	} catch (MalformedURLException e)
	{
		System.out.println(e.getMessage());
	}
}
}