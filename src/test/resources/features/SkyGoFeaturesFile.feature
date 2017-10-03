Feature: SkyGoTesting

  Scenario: SkyGoTest
    Given the application launched and objected created
    Then I click on Settings
    Then I click Signin
    And enter details
    Then I click signin button
    And return to home page
    When I am here
    Then I have change the scenario