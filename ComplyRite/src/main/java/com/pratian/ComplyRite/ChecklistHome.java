package com.pratian.ComplyRite;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import io.appium.java_client.android.AndroidDriver;

public class ChecklistHome {
	public static void waitmethods(){

	    try {
	        Thread.sleep(5000);
	    } catch (InterruptedException e) {
	        // TODO Auto-generated catch block
	        e.printStackTrace();
	    }
	}
	
	public static WebDriver cheklist(WebDriver driver) {
		waitmethods();
		driver.findElement(By.xpath("//android.widget.RelativeLayout['com.greentickft.pratian.GTComplyRite.uat:id/relativeLayout_border_Child1_1_2_listItem_All']")).click();
		waitmethods();
		return driver;
	}
}
