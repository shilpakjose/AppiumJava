package AppiumTest;


import java.net.MalformedURLException;
import java.util.concurrent.TimeUnit;

import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.android.AndroidElement;

public class UIAutomator extends Parentclass {

	public static void main(String[] args) throws MalformedURLException {
		// TODO Auto-generated method stub

	AndroidDriver<AndroidElement> driver=(AndroidDriver<AndroidElement>) capabilities();
	     driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
	    // driver.findElementByAndroidUIAutomator("attribute("value")")
	     
	     driver.findElementByAndroidUIAutomator("text(\"Views\")").click();
	     
	     
	    // driver.findElementByAndroidUIAutomator("text(\"Views\")").click();
	     
	   //  Validate clickable feature for all options
	     //  driver.findElementsByAndroidUIAutomator("new UiSelector().property(value)");  
	 System.out.println(driver.findElementsByAndroidUIAutomator("new UiSelector().clickable(true)").size()); 
	     
	}
}