Feature: To test login funtionality
@smokeTest
  Scenario: check login
    Given User is on login page
    When user enters credential
    And user enters login button
    Then User navigated to home page
