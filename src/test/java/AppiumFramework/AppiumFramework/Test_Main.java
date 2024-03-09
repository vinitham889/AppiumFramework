package AppiumFramework.AppiumFramework;

import java.io.IOException;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.testng.annotations.Test;

import com.appiumframework.pages.android.FormPage;

import io.appium.java_client.MobileBy;

public class Test_Main extends BaseTest{
	
	@Test
	public void test1() throws IOException, InterruptedException {
		
		FormPage formpage = new FormPage(driver);
		formpage.setCountrySelection("Algeria");
		formpage.setNameField("vinitha");
		formpage.setGender("Female");
		formpage.submitForm();
		
		
		
		
	
		//toast message
//		String toast = driver.findElement(By.xpath("(//android.widget.Toast)[1]")).getText();
//		System.out.println(toast);
		//TakeScreeshot of toast msg
		
//		TakesScreenshot tc = (TakesScreenshot)driver;
//		File scr=tc.getScreenshotAs(OutputType.FILE);
//		FileUtil.copyFile(scr, new File("./Mobile_Hybrid/screenshot.png"));
		
		driver.findElement(By.xpath("(//*[@text='ADD TO CART'])[1]")).click();
		driver.findElement(By.id("com.androidsample.generalstore:id/appbar_btn_cart")).click();
		driver.findElement(By.className("android.widget.CheckBox")).click();
		driver.findElement(By.id("com.androidsample.generalstore:id/btnProceed")).click();
	    Set<String> id=	driver.getContextHandles();//switching from native to hybrid app
	    Thread.sleep(9001);
		for(String str:id) {
			System.out.println(str);
		}
		driver.context("WEBVIEW_com.androidsample.generalstore");
		driver.findElement(By.xpath("//*[@name='q']")).sendKeys("moolya", Keys.ENTER);
		
		
		
		
	}
	

}
