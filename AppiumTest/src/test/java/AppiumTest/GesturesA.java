package AppiumTest;

import java.net.MalformedURLException;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebElement;

import io.appium.java_client.AppiumDriver;
import io.appium.java_client.TouchAction;
import static io.appium.java_client.touch.TapOptions.tapOptions;
import static io.appium.java_client.touch.offset.ElementOption.element;
import io.appium.java_client.android.AndroidElement;
import static io.appium.java_client.touch.LongPressOptions.longPressOptions;
import static java.time.Duration.ofSeconds;

public class GesturesA extends Parentclass {

	public static void main(String[] args) throws MalformedURLException {
		// TODO Auto-generated method stub
		
	AppiumDriver<AndroidElement>driver= capabilities();
	driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		
		//Gesture Tap
	driver.findElementByXPath("//android.widget.TextView[@text='Views']").click();
	
    TouchAction t= new TouchAction(driver);
    WebElement expandlist = driver.findElementByXPath("//android.widget.TextView[@text ='Expandable Lists']");
    t.tap(tapOptions().withElement(element(expandlist))).perform();
    
    //Long press
    
    driver.findElementByXPath("//android.widget.TextView[@text ='1. Custom Adapter']").click();
    WebElement pn =driver.findElementByXPath("//android.widget.TextView[@text ='People Names']");
    
    //t.longPress(longPressOptions().withElement(element(pn)).withDuration(ofSeconds(2))).release().perform();
	t.longPress(longPressOptions().withElement(element(pn)).withDuration(ofSeconds(2))).release().perform();
	
	System.out.println(driver.findElementByXPath("//android.widget.TextView[@text ='Sample menu']").getText());
	
	}

}
