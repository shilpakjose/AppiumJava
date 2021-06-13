package AppiumTest;

import java.net.MalformedURLException;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebElement;

import io.appium.java_client.AppiumDriver;
import io.appium.java_client.TouchAction;
import io.appium.java_client.android.AndroidElement;
import static io.appium.java_client.touch.LongPressOptions.longPressOptions;
import static io.appium.java_client.touch.offset.ElementOption.element;
import static java.time.Duration.ofSeconds;


public class SwipeAction extends Parentclass {

	public static void main(String[] args) throws MalformedURLException {
		// TODO Auto-generated method stub
AppiumDriver<AndroidElement>driver= capabilities();
driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);

//

driver.findElementByXPath("//android.widget.TextView[@text='Views']").click();

driver.findElementByXPath("//android.widget.TextView[@text='Date Widgets']").click();
driver.findElementByXPath("//android.widget.TextView[@text='2. Inline']").click();
driver.findElementByXPath("//*[@content-desc='9']").click();

TouchAction t= new TouchAction(driver);

//long press //on element// 2 sec// move to another element and you release
WebElement A = driver.findElementByXPath("//*[@content-desc='15']");
WebElement B = driver.findElementByXPath("//*[@content-desc='45']");

t.longPress(longPressOptions().withElement(element(A)).withDuration(ofSeconds(2))).moveTo(element(B)).release().perform();



	}

}
