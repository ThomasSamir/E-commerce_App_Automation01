@smoke
Feature: a logged in user can have the ability to add item to cart

  Background: user must register first & login
    Then add valid data for registration
    And click button
    Then click  logout tab
    Then click  login tab

    Scenario: user can have the ability to aad items to his cart
      Then logging user
      When hover over tab
      And click category
      Then click item
      Then add cart


