import java.net.MalformedURLException;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.android.AndroidElement;

public class Raaga extends Base{

	public static void main(String[] args) throws MalformedURLException {
		AndroidDriver<AndroidElement> driver = Capabilities();
		driver.manage().timeouts().implicitlyWait(8, TimeUnit.SECONDS);
		WebDriverWait wait = new WebDriverWait(driver, 10);
		WebElement element = wait.until(ExpectedConditions.elementToBeClickable(By.id("android:id/list")));
		driver.findElementByXPath("//android.widget.TextView[@text='nomi.sheikh@gmail.com']").click();
		driver.findElementByXPath("//android.widget.TextView[@text='Hindi']").click();
		driver.findElementByXPath("//android.widget.TextView[@text='Maybe later']").click();
		driver.findElementByAndroidUIAutomator("new UiScrollable(new UiSelector()).scrollIntoView(text(\"Trending\"));");
		driver.findElementById("com.raaga.android:id/music_catalog_item_line1").click();
		driver.findElementsById("com.raaga.android:id/song_row_more_btn").get(1).click();
		driver.findElementByXPath("//android.widget.TextView[@text='PLAY']").click();
		
		
	}
}