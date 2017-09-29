package appium;

import java.io.File;
import java.net.MalformedURLException;
import java.net.URL;

import org.openqa.selenium.remote.DesiredCapabilities;

import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.remote.AndroidMobileCapabilityType;
import io.appium.java_client.remote.MobileCapabilityType;
import io.appium.java_client.remote.MobilePlatform;

public class Installing_Application {

	public void setUp() throws MalformedURLException {
		DesiredCapabilities capabilities = new DesiredCapabilities();
		AndroidDriver androidDriver;

		/**
		 * Providing Device Name
		 * 
		 * @return
		 */

		capabilities.setCapability(MobileCapabilityType.DEVICE_NAME, "");

		/**
		 * Providing Platform Version
		 */

		capabilities.setCapability(MobileCapabilityType.PLATFORM_VERSION, "");

		/**
		 * Providing Platform Name
		 */

		capabilities.setCapability(MobileCapabilityType.PLATFORM_NAME, MobilePlatform.ANDROID);

		/**
		 * Installing Application
		 */
		capabilities.setCapability(MobileCapabilityType.APP, "D:/apkfolder/file.apk");

		/* Connecting to the Appium Server with local host */
		androidDriver = new AndroidDriver(new URL("http://localhost:4723/wd/hub"), capabilities);

	}

}
