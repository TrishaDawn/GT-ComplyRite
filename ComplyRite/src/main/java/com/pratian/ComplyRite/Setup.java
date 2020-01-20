package com.pratian.ComplyRite;

//library to create the path to apk
import java.io.File;

//library use to verify if URL is malformed
import java.net.MalformedURLException;

//library used to create URL for Appium server
import java.net.URL;

import org.junit.After;
import org.junit.Before;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.remote.RemoteWebDriver;

//Library for appium drivers
import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.remote.MobileCapabilityType;

public class Setup {
private static WebDriver driver;

@Before
public static WebDriver setup() {
	File f= new File("src/");
	
	// Path to <project folder>/Apps -> ComplyRite apk file
	 File fs=new File(f,"complyrite-buildTest-debug-pratianserver-1.0.17.apk");
	 
	 //To create an object of desired capabilities
	 DesiredCapabilities androidcab = new DesiredCapabilities();
	 //Name of mobile web browser to automate. It should be an empty string, as we are automation an app
	 //androidcab.setCapability(MobileCapabilityType.DEVICE_NAME,"PIXEL 3 XL API 28");
	 androidcab.setCapability(MobileCapabilityType.DEVICE_NAME,"OnePlus 6T");
	 androidcab.setCapability(MobileCapabilityType.APP, fs.getAbsolutePath());
	 androidcab.setCapability(MobileCapabilityType.CLEAR_SYSTEM_FILES, true); 
	 androidcab.setCapability(MobileCapabilityType.AUTOMATION_NAME, "Appium");	 
	 androidcab.setCapability(MobileCapabilityType.PLATFORM_NAME, "Android");
	 androidcab.setCapability(MobileCapabilityType.NO_RESET, false);
	 androidcab.setCapability("appPackage", "com.greentickft.pratian.GTComplyRite.test");
	 androidcab.setCapability("appActivity", "com.greentickft.pratian.GTComplyRite.modules.OnBoardActivity");
	 try {
		 driver=new RemoteWebDriver(new URL("http://127.0.0.1:4723/wd/hub"), androidcab);
	 }catch(MalformedURLException e1) {
			 e1.printStackTrace();
		 }
	 return driver;
	 }
}


	