package com.pratian.ComplyRite;

import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class Schedule {

	public static void waitmethods(){

	    try {
	        Thread.sleep(5000);
	    } catch (InterruptedException e) {
	        // TODO Auto-generated catch block
	        e.printStackTrace();
	    }
	}
	
	@Test
	public static WebDriver sch(WebDriver driver) {
	    waitmethods();
	    driver.findElement(By.xpath("//android.widget.ImageView[@resource-id='com.greentickft.pratian.GTComplyRite.uat:id/textView_Main_Dashboard_Scheduled_RightArrow']")).click();
	    return driver;
}
}
