package com.bdd.SkyGo.SkyGoSmokeTest;

import java.util.List;

import org.openqa.selenium.By;

import io.appium.java_client.MobileElement;
import io.appium.java_client.android.AndroidDriver;

public class OnNowPage extends HomePageSkyGo{
	 //AndroidDriver<MobileElement>driver;
	 List<MobileElement> chennalList;
	public OnNowPage(AndroidDriver<MobileElement>driver){
		super(driver);
		//this.driver=driver;
	}
	

	
	private By Sports = By.name("Sports");
	private By Watch = By.name("Watch");

	public void tapSports(){
		driver.findElement(Sports).click();
	}
	public void tapSkySportsTwo(){
		chennalList = driver.findElements(By.id("com.bskyb.skygo:id/nownext_program_one_image"));
		chennalList.get(2).click();
		//driver.findElement(By.id("com.bskyb.skygo:id/nownext_program_one_image")).click();
	}
	public void tapWatch(){
		driver.findElement(Watch).click();
	}
}
