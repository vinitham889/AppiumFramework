package AppiumFramework.AppiumFramework;

import java.net.MalformedURLException;
import java.net.URL;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.remote.DesiredCapabilities;
import org.testng.annotations.BeforeClass;

import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.android.AndroidElement;
import io.appium.java_client.remote.AndroidMobileCapabilityType;
import io.appium.java_client.remote.AutomationName;
import io.appium.java_client.remote.MobileCapabilityType;

public class BaseTest {
	public static AndroidDriver<AndroidElement> driver ;
	@BeforeClass
	public static AndroidDriver<AndroidElement> capability() throws MalformedURLException{
	DesiredCapabilities dc = new DesiredCapabilities();
	
	dc.setCapability(MobileCapabilityType.DEVICE_NAME,"emulator-5554");
	dc.setCapability(MobileCapabilityType.PLATFORM_NAME,"Android");
	dc.setCapability(AndroidMobileCapabilityType.APP_PACKAGE,"com.androidsample.generalstore");
	dc.setCapability(AndroidMobileCapabilityType.APP_ACTIVITY,"com.androidsample.generalstore.SplashActivity");
	
	dc.setCapability(MobileCapabilityType.AUTOMATION_NAME,AutomationName.ANDROID_UIAUTOMATOR2);
	dc.setCapability(MobileCapabilityType.AUTOMATION_NAME,AutomationName.APPIUM);
	dc.setCapability(AndroidMobileCapabilityType.CHROMEDRIVER_EXECUTABLE, "C:/Users/User/Desktop/chromedriver.exe");
	 driver = new AndroidDriver<AndroidElement>(new URL("http://0.0.0.0:4723/wd/hub"),dc);
	 driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
	return driver;

	
	}
//	@AfterClass
//	public void tearDown() {
//		driver.close();
	
//	}

}


