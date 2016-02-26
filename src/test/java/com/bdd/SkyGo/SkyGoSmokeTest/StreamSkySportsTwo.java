package com.bdd.SkyGo.SkyGoSmokeTest;

import org.testng.annotations.Test;

public class StreamSkySportsTwo extends SetCapabilities {
	
	HomePageSkyGo hPage;
	SignInPage signIn;
	OnNowPage onNow;
	
  @Test
  public void runSkySportsTwo() {
	  createInstance();
	  hPage.removePopUp();
	  hPage.clickSettings();
	  hPage.clickSingIn();
	  signIn.enterUserName("mraffi");
	  signIn.enterUserPwd("test1234");
	  signIn.clickSignInBtn();
	  signIn.goBack();
	  signIn.goBack();
	  hPage.clickOnNow();
	  onNow.tapSports();
	  onNow.tapSkySportsTwo();
	  onNow.tapWatch();
  }
  public void createInstance(){
	  hPage = new HomePageSkyGo(MobileDriver);
	  signIn = new SignInPage(MobileDriver);
	  onNow = new OnNowPage(MobileDriver);
  }
}
