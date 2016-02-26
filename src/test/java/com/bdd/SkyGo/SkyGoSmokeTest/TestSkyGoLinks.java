package com.bdd.SkyGo.SkyGoSmokeTest;

import org.openqa.selenium.WebElement;
import org.seleniumhq.jetty9.server.HomeBaseWarning;
import org.testng.Assert;
import org.testng.annotations.Test;

/**
 * Created by Syed on 26/02/2016.
 */
public class TestSkyGoLinks extends SetCapabilities {

    HomePageSkyGo homePage;

    @Test
    public void clickLink(){
        homePage = new HomePageSkyGo(MobileDriver);

         homePage.removePopUp()
                 .clickSports()
                 .goBack()
                 .clickSkyBoxSets()
                 .goBack()
                 .clickCatchUp()
                 .goBack()
                 .clickSkyMovies()
                 .goBack();
    }

}
