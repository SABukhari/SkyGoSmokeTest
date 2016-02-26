/*package com.bdd.SkyGo.SkyGoSmokeTest;

import com.bdd.SkyGo.SkyGoSmokeTest.CatchUpPage;
import com.bdd.SkyGo.SkyGoSmokeTest.HomePageSkyGo;
import com.bdd.SkyGo.SkyGoSmokeTest.SearchPage;
import com.bdd.SkyGo.SkyGoSmokeTest.SignInPage;
import com.bdd.SkyGo.SkyGoSmokeTest.SkyBoxSets;
import com.bdd.SkyGo.SkyGoSmokeTest.SportsPage;

import cucumber.api.java.en.And;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import io.appium.java_client.MobileElement;
import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.service.local.AppiumDriverLocalService;

public class SkyGoStepDefinitions extends SetCapabilities {
	AndroidDriver<MobileElement> MobileDriver;
	AppiumDriverLocalService service;
	HomePageSkyGo  homePage = new HomePageSkyGo(MobileDriver);
	SearchPage searchPage = new SearchPage(MobileDriver);
	SignInPage signInPage = new SignInPage(MobileDriver);
	SportsPage sportsPage = new SportsPage(MobileDriver);
	SkyBoxSets skyBoxSets = new SkyBoxSets(MobileDriver);
	CatchUpPage catchUp = new CatchUpPage(MobileDriver);
	  
	  @Given("^the application launched and objected created$")
	  public void the_application_launched_and_objected_created() throws Throwable {

		  System.out.println("Hellllooooooo");
			
	  }

	  @Then("^I click on Settings$")
	  public void i_click_on_Settings() throws Throwable {
		 
		  homePage.clickSettings();
			
	  }

	  @Then("^I click Signin$")
	  public void i_click_Signin() throws Throwable {
		  homePage.clickSingIn();
			
	  }

	  @And("^enter details$")
	  public void enter_details() throws Throwable {
		  signInPage.enterUserName("mraffi");
		  signInPage.enterUserPwd("test1234");
		
	  }

	  @Then("^I click signin button$")
	  public void i_click_signin_button() throws Throwable {
			signInPage.clickSignInBtn();
			
	  }

	  @And("^return to home page$")
	  public void return_to_home_page() throws Throwable {
		  	signInPage.goBackHome();
			signInPage.goBackHome();
	  }
	
}
*/