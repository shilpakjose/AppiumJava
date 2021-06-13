package AppiumTest;

import java.net.MalformedURLException;
import java.util.concurrent.TimeUnit;

import io.appium.java_client.AppiumDriver;
import io.appium.java_client.android.AndroidElement;

public class ECTest1_Neg extends ECParent {

	public static void main(String[] args) throws MalformedURLException {
	
		// TODO Auto-generated method stub
		
		AppiumDriver<AndroidElement>driver= capabilities();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		
//First page positive
		
//driver.findElementByXPath("//android.widget.TextView[@text ='android.widget.TextView']").click();
		
//driver.findElementByXPath("//android.widget.EditText[@text ='Enter name here']").sendKeys("hello");
//driver.hideKeyboard();
driver.findElementByXPath("//android.widget.RadioButton[@text ='Female']").click();
//driver.findElementByXPath("//android.widget.Button[@text ='android.widget.Button']").click();
driver.findElementById("com.androidsample.generalstore:id/btnLetsShop").click();
String Text= driver.findElementByXPath("//android.widget.Toast[1]").getAttribute("name");

//String toastMessage=driver.findElement(By.xpath("//android.widget.Toast[1]")).getAttribute("name");
System.out.println(Text);



	}

}
