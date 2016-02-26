package com.bdd.SkyGo.SkyGoSmokeTest;

import org.openqa.selenium.By;

import io.appium.java_client.MobileElement;
import io.appium.java_client.android.AndroidDriver;

public class CatchUpPage extends HomePageSkyGo{

	//AndroidDriver<MobileElement> driver;
	private By home = By.name("Home");
	
	public CatchUpPage(AndroidDriver<MobileElement>driver) {
		super(driver);
		//this.driver=driver;
	}
	
	protected HomePageSkyGo clickHome(){
		driver.findElement(home).click();
		return new HomePageSkyGo(driver);
	}

}
