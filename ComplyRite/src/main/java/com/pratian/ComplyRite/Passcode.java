package com.pratian.ComplyRite;

import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class Passcode {

	public static void waitmethods(){

	    try {
	        Thread.sleep(5000);
	    } catch (InterruptedException e) {
	        // TODO Auto-generated catch block
	        e.printStackTrace();
	    }
	}

	@Test
	public static WebDriver pc(WebDriver driver) {
	    //waitmethods();
	    for (int i = 1; i < 9; i++){
			//System.out.println("pass");
			 //click the button
			driver.findElement(By.xpath("//android.widget.TextView[@text=0]")).click();
			//System.out.println("code");
			}
	    //waitmethods();
		return driver;
	
}
}
