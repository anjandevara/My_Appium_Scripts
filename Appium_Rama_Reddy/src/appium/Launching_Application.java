package appium;

import java.net.MalformedURLException;
import java.net.URL;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.remote.MobileCapabilityType;
import io.appium.java_client.remote.MobilePlatform;

public class Launching_Application {
	DesiredCapabilities capabilities = new DesiredCapabilities();
	AndroidDriver androidDriver;
	
	@BeforeTest
	public void setUp() throws MalformedURLException {
		try {
			/**
			 * Providing Device Name
			 * 
			 * @return
			 */

			capabilities.setCapability(MobileCapabilityType.DEVICE_NAME, "potter_n");

			/**
			 * Providing Platform Version
			 */

			capabilities.setCapability(MobileCapabilityType.PLATFORM_VERSION, "7.0");

			/**
			 * Providing Platform Name
			 */

			capabilities.setCapability(MobileCapabilityType.PLATFORM_NAME, MobilePlatform.ANDROID);


		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}
	
	@Test
	public void Launch() {
		try {
			/**
			 * Launching Existing Application
			 */

			capabilities.setCapability("noReset", true);
			capabilities.setCapability("fullReset", false);
			capabilities.setCapability("appPackage", "com.google.android.gm");
			capabilities.setCapability("appActivity", ".ConversationListActivityGmail");
			
			/* Connecting to the Appium Server with local host */
			androidDriver = new AndroidDriver(new URL("http://localhost:4723/wd/hub"), capabilities);
			
			WebElement compose_button = androidDriver.findElementById("com.google.android.gm:id/compose_button");
			compose_button.click();
			
			WebElement to_field = androidDriver.findElementById("com.google.android.gm:id/to");
			to_field.click();
			to_field.sendKeys("aletilaxmikanthreddy@gmail.com");
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	
	public void tearDown() {
		androidDriver.quit();
	}

}
