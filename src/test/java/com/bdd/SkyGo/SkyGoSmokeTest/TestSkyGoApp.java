package com.bdd.SkyGo.SkyGoSmokeTest;

import java.io.FileNotFoundException;

import org.testng.Assert;
import org.testng.annotations.Test;

public class TestSkyGoApp extends SetCapabilities {

	HomePageSkyGo homePage;
	SearchPage searchPage;
	SignInPage signInPage;
	SportsPage sportsPage;
	SkyBoxSets skyBoxSets;
	CatchUpPage catchUp;
	SkyMovies skyMovies;

	@Test(priority = 1)
	public void testSignInJourny() throws FileNotFoundException {
		createInstance();
		homePage.removePopUp()
			.clickSettings()
			.clickSingIn()
			.enterUserName("mraffi")
			.enterUserPwd("test1234")
			.clickSignInBtn();
			//.goBack();
	}

	@Test(priority = 4)
	public void testSportsLink() {
		createInstance();
		homePage.clickSports();
		sportsPage.clickHome();
	}

	@Test(priority = 3)
	public void testSkyBoxSetsLink() {
		createInstance();
		homePage.clickSkyBoxSets();
		skyBoxSets.clickHome();
	}

	@Test(priority = 2)
	public void testCatchUpLink() {
		createInstance();
		homePage.clickCatchUp();
		catchUp.clickHome();
	}

	@Test(priority = 5)
	public void testSearchButton() {
		createInstance();
		homePage.clickSearchButton();
		searchPage.inputWord("sky");
		searchPage.countOptions();
		searchPage.backHome();
	}

	@Test(priority = 6)
	public void testRunMovie() {
		createInstance();
		skyMovies.clickSkyMovies();
		skyMovies.clickMostPopular();
		skyMovies.selectMovie();
		skyMovies.clickWatch();
		skyMovies.enterPin("1234");
		skyMovies.clickWatch();
		skyMovies.watchMovie();
	}

	@Test(priority = 7)
	public void testSignOutJourny() {
		createInstance();
		homePage.clickSettings();
		homePage.clickSingOut();
		homePage.goBack();
		homePage.goBack();
	}

	public void createInstance() {
		homePage = new HomePageSkyGo(MobileDriver);
		signInPage = new SignInPage(MobileDriver);
		sportsPage = new SportsPage(MobileDriver);
		skyBoxSets = new SkyBoxSets(MobileDriver);
		catchUp = new CatchUpPage(MobileDriver);
		searchPage = new SearchPage(MobileDriver);
		skyMovies = new SkyMovies(MobileDriver);
	}
}
