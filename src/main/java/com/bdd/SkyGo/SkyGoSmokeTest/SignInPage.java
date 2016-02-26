package com.bdd.SkyGo.SkyGoSmokeTest;

import java.util.List;
import java.util.concurrent.TimeUnit;
import org.openqa.selenium.By;
import io.appium.java_client.MobileElement;
import io.appium.java_client.android.AndroidDriver;

public class SignInPage extends HomePageSkyGo {

	public SignInPage(AndroidDriver<MobileElement> driver) {
		super(driver);
	}

	private By Username = By.className("android.widget.EditText");
	private By SignOut = By.name("Sign Out");
	private By Yes = By.name("Yes");

	/*
	 * protected void signoutFirst(){ try { driver.findElement(SignOut).click();
	 * driver.findElement(Yes).click();
	 * 
	 * } catch (Exception e) { e.printStackTrace(); } }
	 */

	protected SignInPage enterUserName(String uID) {
		driver.findElement(Username).sendKeys(uID);
		return new SignInPage(driver);
	}

	protected SignInPage enterUserPwd(String pwd) {
		List<MobileElement> list1 = driver.findElements(By.className("android.widget.EditText"));
		list1.get(1).sendKeys(pwd);
		return new SignInPage(driver);
	}

	protected SignInPage clickSignInBtn() {
		driver.findElement(By.className("android.widget.Button")).click();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		driver.navigate().back();
		//driver.navigate().back();
		return new SignInPage(driver);
	}
	
	protected HomePageSkyGo goBackHome(){ 
		driver.manage().timeouts().implicitlyWait(15, TimeUnit.SECONDS);
		driver.navigate().back();
		driver.navigate().back(); 
		  return new HomePageSkyGo(driver);
	  }
	 
}
