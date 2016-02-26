package com.bdd.SkyGo.SkyGoSmokeTest;

import io.appium.java_client.MobileElement;
import io.appium.java_client.android.AndroidDriver;

public class SkyBoxSetsPage extends HomePageSkyGo{
	
	public SkyBoxSetsPage(AndroidDriver<MobileElement>driver) {
		super(driver);
	}
	
	public void goBackHome(){
		goBack();
	}
}
