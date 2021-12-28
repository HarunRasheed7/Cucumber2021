Feature: Test login functionality

  Scenario Outline: Check login
    Given User is in the login page
    When User enters the <username> and <password>
    And User clicks enter
    Then User is in the Homepage

    Examples: 
      | username | password |
      | Harun    |    12345 |
      | jack     |    12345 |
      | Rose     |    12345 |
