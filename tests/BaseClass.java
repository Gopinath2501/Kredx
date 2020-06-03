import java.net.MalformedURLException;
import java.net.URL;

import org.openqa.selenium.remote.DesiredCapabilities;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import io.appium.java_client.AppiumDriver;
import io.appium.java_client.MobileElement;
import io.appium.java_client.remote.MobileCapabilityType;

public class BaseClass {
	
	static AppiumDriver<MobileElement> driver;

	@BeforeTest
	public void setup() throws MalformedURLException
	
	{
	
		DesiredCapabilities caps=new DesiredCapabilities();
		
		caps.setCapability(MobileCapabilityType.PLATFORM_NAME,"ANDROID");
		caps.setCapability(MobileCapabilityType.PLATFORM_VERSION,"7.1.2");
		caps.setCapability(MobileCapabilityType.DEVICE_NAME,"REDMI");
		caps.setCapability(MobileCapabilityType.UDID,"65954ab");
		caps.setCapability(MobileCapabilityType.NEW_COMMAND_TIMEOUT,"60");
		//caps.setCapability(MobileCapabilityType.APP,"");
		caps.setCapability(MobileCapabilityType.BROWSER_NAME,"chrome");
		
		
		URL url=new URL("http://127.0.0.1:727/wd/hub");
		
		driver=new AppiumDriver<MobileElement>(url,caps);
		
	    //driver=new AndroidDriver<MobileElement>(url,caps);
		
	try
	{
		
	}
	
	catch(Exception exp)
	
	{
		System.out.println(exp.getCause());
		System.out.println(exp.getMessage());
		exp.printStackTrace();
	}
	}
		
	@Test
    public void sampletest()
    {
    	System.out.println("AppiumDemoFramework");
    }
										
	@AfterTest
    public void teardown ()
	
	{
	
		driver.close();
		driver.quit();
    }

}
