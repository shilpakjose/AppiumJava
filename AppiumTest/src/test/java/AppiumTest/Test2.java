package AppiumTest;

import java.net.MalformedURLException;
import java.net.URL;

import org.openqa.selenium.remote.DesiredCapabilities;

import io.appium.java_client.AppiumDriver;
import io.appium.java_client.MobileElement;
import io.appium.java_client.remote.MobileCapabilityType;

public class Test2 {
static AppiumDriver<MobileElement> driver;

	public static void main(String[] args) throws Exception {
		// TODO Auto-generated method stub
DesiredCapabilities cap =new DesiredCapabilities();
//cap.setCapability("noReset", "true");
//cap.setCapability("FullReset", "false");
cap.setCapability("platformVersion", "7.1.1");
cap.setCapability("platformName","Android");
cap.setCapability("appPackage","com.android.chrome");
cap.setCapability("appActivity","com.google.android.apps.chrome.Main");
driver=new AppiumDriver<MobileElement>(new URL("http://127.0.0.1:4723/wd/hub"), cap);
	}

}
