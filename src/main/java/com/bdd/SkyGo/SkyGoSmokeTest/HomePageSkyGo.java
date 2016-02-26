package com.bdd.SkyGo.SkyGoSmokeTest;

import java.io.FileNotFoundException;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.testng.Assert;

import io.appium.java_client.MobileElement;
import io.appium.java_client.android.AndroidDriver;

public class HomePageSkyGo {

	protected AndroidDriver<MobileElement> driver;

	public HomePageSkyGo(AndroidDriver<MobileElement> driver) {
		this.driver = driver;
	}

	String name;
	private By settings = By.id("com.bskyb.skygo:id/settings_menu");
	private By signin = By.name("Sign in");
	private By search = By.id("com.bskyb.skygo:id/search");
	private By sports = By.name("Sports");
	private By skyBoxSets = By.name("Sky Box Sets");
	private By catchUp = By.name("Catch Up");
	private By SkyMovies = By.name("Sky Movies");
	private By onNow = By.name("On Now");
	private By title = By.name("Home");
	private By PopUp = By.name("Close");
	private By signout = By.name("Sign Out");
	private By yes = By.name("Yes");

	
	
	protected void getPageTitle() {
		Assert.assertTrue(driver.findElement(title).getText().contains("Home"));
		
	}

	protected HomePageSkyGo removePopUp() {
		try {

			driver.findElement(PopUp).click();
		} catch (Exception e) {
			e.printStackTrace();
		}
		return new HomePageSkyGo(driver);
	}

	protected HomePageSkyGo clickSettings() {
		// driver.manage().timeouts().implicitlyWait(15, TimeUnit.SECONDS);
		driver.findElement(settings).click();
		return new HomePageSkyGo(driver);
	}

	protected HomePageSkyGo goBack() {
		driver.navigate().back();
		return new HomePageSkyGo(driver);
	}

	protected SignInPage clickSingIn() {
		try {
			driver.findElement(signout).click();
			driver.findElement(yes).click();
		} catch (Exception e) {
			e.printStackTrace();
		}
		driver.findElement(signin).click();
		return new SignInPage(driver);
	}

	protected void clickSingOut() {
		try {
			driver.findElement(signin).click();

		} catch (Exception e) {
			e.printStackTrace();
		}
		driver.findElement(signout).click();
		driver.findElement(yes).click();
	}

	protected SearchPage clickSearchButton() {
		driver.findElement(search).click();
		return new SearchPage(driver);
	}

	protected SportsPage clickSports() {
		driver.findElement(sports).click();
		return new SportsPage(driver);
	}

	protected SkyBoxSetsPage clickSkyBoxSets() {
		driver.findElement(skyBoxSets).click();
		return new SkyBoxSetsPage(driver);
	}

	protected CatchUpPage clickCatchUp() {
		driver.findElement(catchUp).click();
		return new CatchUpPage(driver);
	}

	protected OnNowPage clickOnNow() {
		driver.findElement(onNow).click();
		return new OnNowPage(driver);
	}

	protected SkyMovies clickSkyMovies() {
		driver.findElement(SkyMovies).click();
		return new SkyMovies(driver);
	}
}
