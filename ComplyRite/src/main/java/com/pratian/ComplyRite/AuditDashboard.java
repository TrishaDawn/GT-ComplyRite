package com.pratian.ComplyRite;

import org.openqa.selenium.By;

import io.appium.java_client.android.AndroidDriver;

public class AuditDashboard {
	public void waitmethods(){

	    try {
	        Thread.sleep(5000);
	    } catch (InterruptedException e) {
	        // TODO Auto-generated catch block
	        e.printStackTrace();
	    }
	}
	public AndroidDriver TestCase1(AndroidDriver driver) {
		waitmethods();
		waitmethods();
		driver.findElement(By.xpath("//android.widget.RelativeLayout[@resource-id='com.example.user.myapplication:id/relativeLayout_Main_Dashboard_Scheduled_Child1_Subchild1']")).click();
		return driver;
	}
	
}
