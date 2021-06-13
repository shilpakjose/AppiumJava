package AppiumTest;

import java.net.MalformedURLException;
import java.util.concurrent.TimeUnit;

import io.appium.java_client.AppiumDriver;
import io.appium.java_client.android.AndroidElement;

public class ScrollingDemo extends Parentclass {

	public static void main(String[] args) throws MalformedURLException {
		// TODO Auto-generated method stub
		
AppiumDriver<AndroidElement>driver= capabilities();
driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);

 //scroll till finding the required filed

driver.findElementByXPath("//android.widget.TextView[@text='Views']").click();


	}

}
