package AppiumTest;

import java.net.MalformedURLException;
import java.util.concurrent.TimeUnit;

import io.appium.java_client.AppiumDriver;
import io.appium.java_client.MobileBy;
import io.appium.java_client.MobileElement;
import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.android.AndroidElement;

public class Auto1 extends Testing {

	public static void main(String[] args) throws MalformedURLException {
		// TODO Auto-generated method stub
		
		AndroidDriver driver= capabilities();
driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);

driver.findElementByXPath("//android.widget.TextView[@text ='Preference']").click();
driver.findElementByXPath("//android.widget.TextView[@text ='3. Preference dependencies']").click();
driver.findElementById("android:id/checkbox").click();
driver.findElementByXPath("(//android.widget.RelativeLayout)[2]").click();
driver.findElementById("android:id/edit").sendKeys("hello");
driver.findElementById("android:id/button1").click();
//driver.findElementByClassName("android.widget.Button").get(2).click();



	}

}