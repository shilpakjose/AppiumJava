package AppiumTest;

import java.io.File;
import java.net.MalformedURLException;
import java.net.URL;

import org.openqa.selenium.remote.DesiredCapabilities;

import io.appium.java_client.AppiumDriver;
import io.appium.java_client.MobileElement;
import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.android.AndroidElement;
import io.appium.java_client.remote.MobileCapabilityType;

public class Parentclass {

	static AppiumDriver<AndroidElement> driver;	

	public static AppiumDriver<AndroidElement> capabilities() throws MalformedURLException {
		// TODO Auto-generated method stub
		
		File f =new File ("src/test/java");
		File fs=new File(f,"ApiDemos-debug.apk");
		
				
		DesiredCapabilities cap = new DesiredCapabilities() ;
		
		cap.setCapability(MobileCapabilityType.DEVICE_NAME, "SKJ ");
		cap.setCapability(MobileCapabilityType.APP, fs.getAbsolutePath());
		cap.setCapability(MobileCapabilityType.PLATFORM_VERSION, "7.1.1");
		cap.setCapability(MobileCapabilityType.PLATFORM_NAME, "Android");
		cap.setCapability(MobileCapabilityType.AUTOMATION_NAME, "uiautomator2");
		
		AndroidDriver driver=new AndroidDriver(new URL("http://127.0.0.1:4723/wd/hub"), cap);
	
		
		
		//URL url =new URL("http://127.0.0.1:4723/wd/hub");
		//driver = new AppiumDriver <AndroidElement> (url,cap);
		
       return driver;



	}

}
