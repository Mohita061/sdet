package Appium;

import org.testng.annotations.Test;
import io.appium.java_client.AppiumDriver;
import io.appium.java_client.MobileElement;

import io.appium.java_client.android.AndroidDriver;

import java.io.IOException;
import java.net.MalformedURLException;
	
import java.net.URL;
	
	
import org.testng.annotations.Test;
	
import org.openqa.selenium.remote.DesiredCapabilities;

public class NewTest {
    @Test
	
    public void calc() throws InterruptedException, IOException {
	
        // Set the Desired Capabilities
	
        DesiredCapabilities caps = new DesiredCapabilities();
	
        caps.setCapability("deviceId", "emulator-5554");
	
        caps.setCapability("deviceName", "My Phone");
	
        caps.setCapability("platformName", "Android");
	
        caps.setCapability("appPackage", "com.android.calculator2");
	
        caps.setCapability("appActivity", "Calculator");
	
 
        AppiumDriver<MobileElement> driver = null;
	
        try {
	
            driver = new AndroidDriver<MobileElement>(new URL("http://127.0.0.1:4723/wd/hub"), caps);
	
            System.out.println("Calculator is open");
	
        } catch (MalformedURLException e) {
	
            System.out.println(e.getMessage());
	
        }
	
    }
}