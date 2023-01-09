Feature: Search products

  Scenario: Search iphone
    Given The home page is visible
    When The users types phone name in the search bar
    When The users press enter
    Then The results are displayed

  Scenario: Search samsung
    Given The home page is visible
    When The users types phone name in the search bar
    When The users press enter
    Then The results are displayed


  Scenario Outline: Search <phones>
    Examples:
      | samsung |
      | iphone  |
      | huawey  |