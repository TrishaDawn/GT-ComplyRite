package com.pratian.ComplyRite;

import java.util.concurrent.TimeUnit;

import org.aspectj.lang.annotation.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import io.appium.java_client.android.AndroidDriver;

public class TourPage {
	public static void waitmethods(){

	    try {
	        Thread.sleep(2000);
	    } catch (InterruptedException e) {
	        // TODO Auto-generated catch block
	        e.printStackTrace();
	    }
	}
	@Test
	public static WebDriver tourPage(WebDriver driver){
		waitmethods();	
		
		for (int i = 1; i < 4; i++){
			//System.out.println("1");
			 //click the button
			driver.findElement(By.xpath("//android.widget.ImageView[@resource-id='com.greentickft.pratian.GTComplyRite.uat:id/ivNext']")).click();
			waitmethods();
			//System.out.println("2");
			}
		waitmethods();
		driver.findElement(By.xpath("//android.widget.TextView[@resource-id='com.greentickft.pratian.GTComplyRite.uat:id/btn_skip']")).click();
		//driver.findElement(By.xpath("//android.widget.TextView[@test='   Let's Start   ' and @index='1' and @resource-id='com.greentickft.pratian.GTComplyRite.uat:id/ivNext']")).click();
		//System.out.println("4");

		return driver;
		
	}
	}
