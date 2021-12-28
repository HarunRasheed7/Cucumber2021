Feature: Validate Google Search

  Scenario: To check google search function
    Given User navigates to google search
    When User enters the search data
    And clicks Enter
    Then User navigates to the search results
