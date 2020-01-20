package com.pratian.ComplyRite;

import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class Home {

	public static void waitmethods(){

	    try {
	        Thread.sleep(5000);
	    } catch (InterruptedException e) {
	        // TODO Auto-generated catch block
	        e.printStackTrace();
	    }
	}
@Test
public static WebDriver hom(WebDriver driver){
	//waitmethods();
	driver.findElement(By.xpath("//android.widget.TextView[@resource-id='com.greentickft.pratian.GTComplyRite.uat:id/tv_skip']")).click();
	waitmethods();
	driver.findElement(By.xpath("//android.widget.RelativeLayout[@resource-id='com.greentickft.pratian.GTComplyRite.uat:id/relativeLayout_border_Child1_1_2_listItem_All']")).click();
	waitmethods();
	return driver;
}
	
}
