package com.pratian.ComplyRite;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import io.appium.java_client.android.AndroidDriver;
//import io.appium.java_client.android.AndroidElement;

public class MainClass {
	private static WebDriver driver = null;
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		Setup sup=new Setup();
		driver = sup.setup();
		System.out.println("SetUp is Successfull");		
		System.out.println("********************************************");		
		System.out.println("You are on the tour page");
		
		TourPage tp = new TourPage();
		driver = tp.tourPage(driver);
		System.out.println("Successfully navigated to Login video screen");
		System.out.println("********************************************");
		System.out.println("Successfully navigated to Login screen");
		
		Login log=new Login();
		driver=log.TestCase(driver);
		System.out.println("********************************************");	
		System.out.println("Successfully Navigated to Passcode screen");
		
		Passcode passcode=new Passcode();
		driver=passcode.pc(driver);
		System.out.println("********************************************");	
		System.out.println("Successfully Navigated to Schedule screen");
		
		ApplicationTour apptour=new ApplicationTour();
		driver=apptour.at(driver);
		System.out.println("********************************************");	
		System.out.println("Successfully on the Schedule screen");
		
		Schedule schedule=new Schedule();
		driver=schedule.sch(driver);
		System.out.println("********************************************");	
		System.out.println("Successfully on the Checklist screen");
		
		Home home=new Home();
		driver=home.hom(driver);
		System.out.println("********************************************");	
		System.out.println("Successfully on the Checklist home screen");
		
		ChecklistHome checklisthome=new ChecklistHome();
		driver=checklisthome.cheklist(driver);
		System.out.println("********************************************");	
		
		/*System.out.println("********************************************");		
		System.out.println("Successfully navigated to the Checklist Home Screen");
		ChecklistHome ch=new ChecklistHome();
		driver=ch.TestCase3(driver);
		System.out.println("Viewed Checklist in Detail");
		
		System.out.println("********************************************");
		
		System.out.println("Successfully navigated to Perform Checks Screen");
		SpecificCheck sc=new SpecificCheck();
		driver=sc.TestCase4(driver);
		System.out.println("Successfully performed the checks");
		System.out.println("********************************************");
		
		System.out.println("Successfully navigated to Checklist Preview Screen");
		ChecklistPreview cp=new ChecklistPreview();
		driver=cp.TestCase5(driver);*/
		//System.out.println("Successfully scrolled down to the screen");
		/*System.out.println("********************************************");
		
		ChecklistReport cr=new ChecklistReport();
		driver=cr.TestCase6(driver);
		System.out.println("Successfully navigated to the AuditHome screen");*/
	}
	}
