package com.bdd.SkyGo.SkyGoSmokeTest;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;

import io.appium.java_client.MobileElement;
import io.appium.java_client.android.AndroidDriver;

public class SkyMovies extends HomePageSkyGo{

	public SkyMovies(AndroidDriver<MobileElement>driver) {
		super(driver);
	}
	private By MostPopular = By.name("Most Popular");
	private By Movie = By.name("Blended");
	private By Watch = By.name("Watch");
	private By Pin = By.id("com.bskyb.skygo:id/pin_text");
	private By OK = By.name("OK");
	private By Home = By.id("com.bskyb.skygo:id/nav_menu");
	
	protected SkyMovies clickMostPopular(){
		driver.findElement(MostPopular).click();
		return new SkyMovies(driver);
	}
	protected SkyMovies selectMovie(){
		driver.findElement(Movie).click();
		return new SkyMovies(driver);
	}
	protected SkyMovies clickWatch(){
		driver.findElement(Watch).click();
		return new SkyMovies(driver);
	}
	protected SkyMovies enterPin(String number){
		driver.findElement(Pin).sendKeys(number);
		driver.findElement(OK).click();
		//driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		return new SkyMovies(driver);
	}
	protected SkyMovies watchMovie(){
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		driver.closeApp();
		return new SkyMovies(driver);
	}
	protected HomePageSkyGo backHome(){
		driver.navigate().back();
		//driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
		return new HomePageSkyGo(driver);
	}
	protected HomePageSkyGo clickHome(){
		driver.findElement(Home).click();
		return new HomePageSkyGo(driver);
	}
}
