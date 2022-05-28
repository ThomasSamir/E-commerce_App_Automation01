@smoke
Feature: user van search for product by product name and SKU

  Scenario: user can search for user by product name
   Given open browser for search
    When enter product name in search field

  Scenario: user can search for user by product SKU
    Given open browser for search
    And enter product SKU in search field