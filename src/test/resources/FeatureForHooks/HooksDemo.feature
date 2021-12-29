Feature: Feature for hooks demo

  @smoke
  Scenario: sample 1
    Given User in inside the login page
    When User enters the credential
    And user enters login
    Then User is inside the homepage

  Scenario: sample 2
    Given User in inside the login page
    When User enters the credential
    And user enters login
    Then User is inside the homepage
