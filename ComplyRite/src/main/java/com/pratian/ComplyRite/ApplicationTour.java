package com.pratian.ComplyRite;

import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class ApplicationTour {
	public static void waitmethods(){

	    try {
	        Thread.sleep(5000);
	    } catch (InterruptedException e) {
	        // TODO Auto-generated catch block
	        e.printStackTrace();
	    }
	}
	
	@Test
	public static WebDriver at(WebDriver driver) {
	    waitmethods();
	    driver.findElement(By.xpath("//android.widget.TextView[@text='SKIP']")).click();
	    return driver;
}
}
