package AppiumTest;
import java.io.File;
import java.net.MalformedURLException;
import java.net.URL;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.remote.DesiredCapabilities;

import io.appium.java_client.AppiumDriver;
import io.appium.java_client.MobileElement;
import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.remote.MobileCapabilityType;

public class Test3 {

	public static void main(String[] args) throws MalformedURLException {
		// TODO Auto-generated method stub
	        DesiredCapabilities cap = new DesiredCapabilities();
//
//	        // APK location on system
//	         File appDir = new File("/Users/therapybox/Desktop/Appium/Apps");
//
//
//	        /* ANDROID DEPENDENCIES START*/
//
//	        File newApp = new File (appDir ,"selendroid-test.apk" );
	        cap.setCapability(MobileCapabilityType.AUTOMATION_NAME,"Appium");
	        cap.setCapability(MobileCapabilityType.PLATFORM_NAME,"Android");
	        cap.setCapability(MobileCapabilityType.PLATFORM_VERSION,"7.1.1");
	        cap.setCapability(MobileCapabilityType.DEVICE_NAME,"Android Emulator");
	        cap.setCapability(MobileCapabilityType.APP,"C:\\apk_file\\ApiDemos-debug.apk");
	        URL url = new URL("http://127.0.0.1:4723/wd/hub");
	        AndroidDriver<WebElement> appDriver = new AndroidDriver<WebElement>(url, cap);
	    

//	    return appDriver;

	}

}
