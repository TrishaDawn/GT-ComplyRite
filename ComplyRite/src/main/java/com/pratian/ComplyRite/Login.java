package com.pratian.ComplyRite;

import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import io.appium.java_client.android.AndroidDriver;

public class Login {
	
public static void waitmethods(){

    try {
        Thread.sleep(5000);
    } catch (InterruptedException e) {
        // TODO Auto-generated catch block
        e.printStackTrace();
    }
}

@Test
public static WebDriver TestCase(WebDriver driver) {
    waitmethods();
    driver.findElement(By.xpath("//android.widget.Button[@resource-id='com.greentickft.pratian.GTComplyRite.uat:id/button_Login']")).click();
    waitmethods();
    driver.findElement(By.xpath("//android.widget.EditText[@resource-id='userNameInput']")).sendKeys("meenakshi@health1stservices.com");
    waitmethods();
    driver.findElement(By.xpath("//android.widget.EditText[@resource-id='passwordInput']")).sendKeys("password@12345");
    waitmethods();
    driver.findElement(By.xpath("//android.widget.Image[@resource-id='companyLogo']")).click();
    waitmethods();
    driver.findElement(By.xpath("//android.widget.Button[@resource-id='submitButton']")).click();
    waitmethods();
    waitmethods();
   // driver.findElement(By.xpath("//android.widget.Button[@resource-id='android:id/button2']")).click();
    //driver.findElement(By.xpath("//android.widget.Button/button2[@text='YES']")).click();
    driver.findElement(By.xpath("//android.widget.Button[@bounds='[642,1208][810,1350]']")).click();
    return driver;
	}

}
