package com.pratian.ComplyRite;

import org.openqa.selenium.By;

import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.android.AndroidElement;

public class ChecklistPreview {
	public void waitmethods(){

	    try {
	        Thread.sleep(2000);
	    } catch (InterruptedException e) {
	        // TODO Auto-generated catch block
	        e.printStackTrace();
	    }
	}
	
	//public AndroidDriver TestCase5(AndroidDriver<AndroidElement> driver) {
	public AndroidDriver TestCase5(AndroidDriver driver) {
		/*waitmethods();
		waitmethods();*/
		driver.findElementByAndroidUIAutomator("new UiScrollable(new UiSelector().scrollable(true).instance(0))"
	    		+ ".scrollIntoView(new UiSelector().textContains(\""+"I approve that the checklist has been filled by me."+"\").instance(0))"); 
		System.out.println("Successfully scrolled down to the screen");
		waitmethods();
		driver.findElement(By.xpath("//android.widget.CheckBox['com.example.user.myapplication:id/checkbox_checklist_preview_submit_checkbox']")).click();
		System.out.println("Successfully able to check the box");
		waitmethods();
		driver.findElement(By.xpath("//android.widget.Button['com.example.user.myapplication:id/button_checklist_preview_submit_button']")).click();
		System.out.println("Successfully able to click on Submit");
		waitmethods();
		waitmethods();
		//driver.findElement(By.xpath("//android.widget.TextView['com.example.user.myapplication:id/btnPositive']")).click();
		driver.findElement(By.id("com.example.user.myapplication:id/btnPositive")).click();
		System.out.println("Successfully able to click on yes");
		return driver;
	}
}
