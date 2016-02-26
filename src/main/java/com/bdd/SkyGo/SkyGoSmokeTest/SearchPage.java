package com.bdd.SkyGo.SkyGoSmokeTest;

import java.util.List;

import org.openqa.selenium.By;

import io.appium.java_client.MobileElement;
import io.appium.java_client.android.AndroidDriver;

public class SearchPage extends HomePageSkyGo{
	 //AndroidDriver<MobileElement>driver;
	
	public SearchPage(AndroidDriver<MobileElement>driver){
		super(driver);
		//this.driver=driver;
	}
	
	private By searchWord = By.id("com.bskyb.skygo:id/search");
	private By options=By.className("android.widget.TextView");
	private By home=By.id("com.bskyb.skygo:id/nav_menu");

	public void inputWord(String word){
	   driver.findElement(searchWord).sendKeys(word);
	   
	}
	
	public HomePageSkyGo countOptions(){
		driver.hideKeyboard();
		List<MobileElement>wordsList=driver.findElements(options);
		System.out.println("The number of Options appeared are"+ wordsList.size());
		return new HomePageSkyGo(driver);
	}
	
	public HomePageSkyGo backHome(){
		driver.findElement(home).click();
		return new HomePageSkyGo(driver);
	}
	    
}
