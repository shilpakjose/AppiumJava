package AppiumTest;

import java.io.File;
import java.net.MalformedURLException;
import java.net.URL;

import org.openqa.selenium.remote.DesiredCapabilities;

import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.remote.MobileCapabilityType;

public class EcommerceP {

	public static void main(String[] args) throws MalformedURLException {
		// TODO Auto-generated method stub

		File f =new File ("src/test/java");
		File fs=new File(f,"General-Store.apk");
		
				
		DesiredCapabilities cap = new DesiredCapabilities() ;
		
		cap.setCapability(MobileCapabilityType.DEVICE_NAME, "SKJ ");
		cap.setCapability(MobileCapabilityType.APP, fs.getAbsolutePath());
		cap.setCapability(MobileCapabilityType.PLATFORM_VERSION, "7.1.1");
		cap.setCapability(MobileCapabilityType.PLATFORM_NAME, "Android");
		cap.setCapability(MobileCapabilityType.AUTOMATION_NAME, "uiautomator2");
		
		AndroidDriver driver=new AndroidDriver(new URL("http://127.0.0.1:4723/wd/hub"), cap);
	}

}
