package com.pratian.ComplyRite;

import org.openqa.selenium.By;

import io.appium.java_client.android.AndroidDriver;

public class SpecificCheck {
	public void waitmethods(){

	    try {
	        Thread.sleep(5000);
	    } catch (InterruptedException e) {
	        // TODO Auto-generated catch block
	        e.printStackTrace();
	    }
	}
	
	public AndroidDriver TestCase4(AndroidDriver driver) {
		waitmethods();
		for (int k=1; k <= 3; k++) 
			driver.findElement(By.xpath("//android.widget.ImageButton[@resource-id='com.example.user.myapplication:id/imageButton_Reject_Response_PerformChecks']")).click();
		waitmethods();
		for (int j=1; j <= 4; j++) 
			driver.findElement(By.xpath("//android.widget.ImageButton[@resource-id='com.example.user.myapplication:id/imageButton_Accept_Response_PerformChecks']")).click();
		waitmethods();
		return driver;
	}
	}
