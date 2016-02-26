package com.bdd.SkyGo.SkyGoSmokeTest;

import java.io.File;
import java.net.MalformedURLException;
import java.net.URL;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.remote.DesiredCapabilities;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;

import io.appium.java_client.MobileElement;
import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.remote.MobileCapabilityType;
import io.appium.java_client.remote.MobilePlatform;
import io.appium.java_client.service.local.AppiumDriverLocalService;
import io.appium.java_client.service.local.AppiumServiceBuilder;

public class SetCapabilities {
	AndroidDriver<MobileElement> MobileDriver;
	AppiumDriverLocalService service;
	 
  @BeforeClass
  public void beforeClass() throws MalformedURLException {
	  service = AppiumDriverLocalService.buildService(new AppiumServiceBuilder()
				.usingDriverExecutable(new File("/Applications/Appium.app/Contents/Resources/node/bin/node"))
		.withAppiumJS(new File("/Applications/Appium.app/Contents/Resources/node_modules/appium/bin/appium.js"))
		.withIPAddress("127.0.0.1")
		.usingPort(4723));///Applications/Appium.app/Contents/Resources/node_modules/appium/bin/appium.js
	  						//
		service.start();
		if(service.isRunning()){
			System.out.println("Appium Started successfully.");
		}
		
		DesiredCapabilities cap = new DesiredCapabilities();
		cap.setCapability(MobileCapabilityType.PLATFORM_NAME, MobilePlatform.ANDROID);
		cap.setCapability(MobileCapabilityType.DEVICE_NAME, "Android Device");
		cap.setCapability(MobileCapabilityType.APP_PACKAGE, "com.bskyb.skygo");
		cap.setCapability(MobileCapabilityType.APP_ACTIVITY, "com.bskyb.skygo.component.fragment.main.SkyGoActivity");
		cap.setCapability(MobileCapabilityType.NEW_COMMAND_TIMEOUT, "25");
		MobileDriver = new AndroidDriver<MobileElement>(new URL("http://127.0.0.1:4723/wd/hub"), cap);
		//Thread.sleep(20000);
		MobileDriver.manage().timeouts().implicitlyWait(15, TimeUnit.SECONDS);
  }

  @AfterClass
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
	  //service.
  }

}
