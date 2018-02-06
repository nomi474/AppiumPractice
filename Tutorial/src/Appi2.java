import java.io.File;
import java.net.MalformedURLException;
import java.net.URL;

import org.openqa.selenium.remote.DesiredCapabilities;

import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.android.AndroidElement;
import io.appium.java_client.remote.MobileCapabilityType;
import io.appium.java_client.remote.MobilePlatform;

public class Appi2 {

	public static void main(String[] args) throws MalformedURLException {
		File appDire = new File("src");
		
		DesiredCapabilities cap = new DesiredCapabilities();
		cap.setCapability(MobileCapabilityType.PLATFORM_NAME, MobilePlatform.ANDROID);
		cap.setCapability(MobileCapabilityType.DEVICE_NAME, "NexusAPI27");
		cap.setCapability(MobileCapabilityType.NEW_COMMAND_TIMEOUT, "25");
		//cap.setCapability(MobileCapabilityType.APP_PACKAGE, "");
		//cap.setCapability(MobileCapabilityType.APP_ACIVITY, "");
		cap.setCapability(MobileCapabilityType.VERSION, 52);
		AndroidDriver<AndroidElement> driver = new AndroidDriver<>(new URL("http://127.0.0.1:4723/wd/hub"), cap);
		

	}

}
