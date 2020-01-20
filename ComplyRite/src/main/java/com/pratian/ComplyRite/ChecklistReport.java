package com.pratian.ComplyRite;

import org.openqa.selenium.By;

import io.appium.java_client.android.AndroidDriver;

public class ChecklistReport {
public void waitmethods() {
	try {
		Thread.sleep(3000);
	}catch(InterruptedException e)
	{
		e.printStackTrace();
	}
}

public AndroidDriver TestCase6(AndroidDriver driver) {
	waitmethods();
	driver.findElementByAndroidUIAutomator("new UiScrollable(new UiSelector().scrollable(true).instance(0))"
    		+ ".scrollIntoView(new UiSelector().textContains(\""+"CONTINUE"+"\").instance(0))");
	System.out.println("Successfully scrolled down to the screen");
	waitmethods();
	waitmethods();
	driver.findElement(By.xpath("//android.widget.Button['com.example.user.myapplication:id/button_checklist_report_contiue_button']")).click();
	System.out.println("Successfully clicked on the Continue Button");
	return driver;
}

}
