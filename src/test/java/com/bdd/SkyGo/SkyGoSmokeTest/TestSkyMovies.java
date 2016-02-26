package com.bdd.SkyGo.SkyGoSmokeTest;

import java.io.FileNotFoundException;
import org.openqa.selenium.By;
import org.testng.Assert;
import org.testng.annotations.Test;

public class TestSkyMovies extends SetCapabilities{

	HomePageSkyGo homePage;
	SkyMovies moviesPage;
	SignInPage signInPage;
	
	@Test
	public void testRunMovie() throws FileNotFoundException{
		homePage   = new HomePageSkyGo(MobileDriver);
		moviesPage = new SkyMovies(MobileDriver);
		signInPage = new SignInPage(MobileDriver);
		
		homePage
			.removePopUp()
			.clickSettings();
		Assert.assertEquals("Sky Go", MobileDriver.findElement(By.id("com.bskyb.skygo:id/menu_title")).getText());
		homePage
			.clickSingIn()
			.enterUserName("mraffi")
			.enterUserPwd("test1234")
			.clickSignInBtn()
			.goBackHome()
			.clickSkyMovies()
			.clickMostPopular()
			.selectMovie()
			.clickWatch()
			.enterPin("1234")
			.clickWatch()
			.watchMovie();
	}
	
}
