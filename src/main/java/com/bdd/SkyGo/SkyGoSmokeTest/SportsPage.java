package com.bdd.SkyGo.SkyGoSmokeTest;

import org.openqa.selenium.By;

import io.appium.java_client.MobileElement;
import io.appium.java_client.android.AndroidDriver;

public class SportsPage extends HomePageSkyGo{

	private By home = By.name("Home");
	
	public SportsPage(AndroidDriver<MobileElement>driver){
		super(driver);
	}
	
	protected HomePageSkyGo clickHome(){
		driver.findElement(home).click();
		return new HomePageSkyGo(driver);
	}
}
