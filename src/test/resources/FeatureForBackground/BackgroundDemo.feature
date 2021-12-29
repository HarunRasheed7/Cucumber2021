Feature: To check Background Function

  Background: User is logged in
    Given user is the login page
    When User gives the credential
    Then user navigated to Homepage

  Scenario: To validate mobiles
    When User clicks the mobile link
    Then User navigated to the mobile page

  Scenario: To validate laptops
    When User clicks the laptop link
    Then User navigated to the laptop page
