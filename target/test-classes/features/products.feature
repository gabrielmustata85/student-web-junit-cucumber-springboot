Feature: Search products

  Scenario: Search phones
    Given The home page is visible
    When The users types phone name in the search bar
    When The users press enter
    Then The results are displayed