/*package com.bdd.SkyGo.SkyGoSmokeTest;

import java.io.File;
import java.net.MalformedURLException;
import java.net.URL;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.remote.DesiredCapabilities;

import cucumber.api.java.After;
import cucumber.api.java.Before;
import cucumber.api.java.en.And;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import io.appium.java_client.MobileElement;
import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.remote.MobileCapabilityType;
import io.appium.java_client.remote.MobilePlatform;
import io.appium.java_client.service.local.AppiumDriverLocalService;
import io.appium.java_client.service.local.AppiumServiceBuilder;

public class StepDefSkyGo {
    AndroidDriver<MobileElement> MobileDriver=null;
	AppiumDriverLocalService service;
	HomePageSkyGo homePage;
	SearchPage searchPage;
	SignInPage signInPage;
	SportsPage sportsPage;
	SkyBoxSets skyBoxSets;
	CatchUpPage catchUp;

	@Before
	public void beforeClass() throws MalformedURLException {
		service = AppiumDriverLocalService.buildService(new AppiumServiceBuilder()
				.usingDriverExecutable(new File("/Applications/Appium.app/Contents/Resources/node/bin/node"))
		.withAppiumJS(new File("/Applications/Appium.app/Contents/Resources/node_modules/appium/bin/appium.js"))
		.withIPAddress("127.0.0.1")
		.usingPort(4723));
		service.start();
		if (service.isRunning()) {
			System.out.println("Appium Started successfully.");
		}
		DesiredCapabilities cap = new DesiredCapabilities();
		cap.setCapability(MobileCapabilityType.PLATFORM_NAME, MobilePlatform.ANDROID);
		cap.setCapability(MobileCapabilityType.DEVICE_NAME, "Android Device");
		cap.setCapability(MobileCapabilityType.APP_PACKAGE, "com.bskyb.skygo");
		cap.setCapability(MobileCapabilityType.APP_ACTIVITY, "com.bskyb.skygo.component.fragment.main.SkyGoActivity");
		cap.setCapability(MobileCapabilityType.NEW_COMMAND_TIMEOUT, "25");
		MobileDriver = new AndroidDriver<MobileElement>(new URL("http://127.0.0.1:4723/wd/hub"), cap);
		// Thread.sleep(20000);
		MobileDriver.manage().timeouts().implicitlyWait(15, TimeUnit.SECONDS);
	}

	@Given("^the application launched and objected created$")
	public void the_application_launched_and_objected_created() throws Throwable {
		createInstance();

	}

	@Then("^I click on Settings$")
	public void i_click_on_Settings() throws Throwable {
		// homePage = new HomePageSkyGo(MobileDriver);
		createInstance();
		homePage.clickSettings();

	}

	@Then("^I click Signin$")
	public void i_click_Signin() throws Throwable {
		createInstance();
		homePage.clickSingIn();
		// homePage = new HomePageSkyGo(MobileDriver);

	}

	@And("^enter details$")
	public void enter_details() throws Throwable {
		createInstance();
		signInPage.enterUserName("mraffi");
		signInPage.enterUserPwd("test1234");

	}

	@Then("^I click signin button$")
	public void i_click_signin_button() throws Throwable {
		createInstance();
		signInPage.clickSignInBtn();

	}

	@And("^return to home page$")
	public void return_to_home_page() throws Throwable {
		createInstance();
		signInPage.goBackHome();
		signInPage.goBackHome();
	}

	@After
	public void afterClass() {
		try {
			MobileDriver.close();
			MobileDriver.quit();
			if (MobileDriver != null)
				MobileDriver = null;
		} catch (Exception e) {
			e.printStackTrace();
		}
		service.stop();
		
	}

	public void createInstance() {
		homePage = new HomePageSkyGo(MobileDriver);
		signInPage = new SignInPage(MobileDriver);
		sportsPage = new SportsPage(MobileDriver);
		skyBoxSets = new SkyBoxSets(MobileDriver);
		catchUp = new CatchUpPage(MobileDriver);
		searchPage = new SearchPage(MobileDriver);
	}
}
*/