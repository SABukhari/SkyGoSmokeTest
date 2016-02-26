package com.bdd.SkyGo.SkyGoSmokeTest;

import org.testng.Assert;

/**
 * Created by Syed on 26/02/2016.
 */
public class TestLinksStepDefinition extends SetCapabilities {

    @Given("^the home page is open$")
    public void the_home_page_is_open() throws Throwable {
        System.out.print(MobileDriver.getTitle());
    }

    @Then("^remove the popup window if it appears$")
    public void remove_the_popup_window_if_it_appears() throws Throwable {
        // Write code here that turns the phrase above into concrete actions
        throw new PendingException();
    }

    @Then("^click sports link to open page$")
    public void click_sports_link_to_open_page() throws Throwable {
        // Write code here that turns the phrase above into concrete actions
        throw new PendingException();
    }

    @Then("^return to home page$")
    public void return_to_home_page() throws Throwable {
        // Write code here that turns the phrase above into concrete actions
        throw new PendingException();
    }

}
