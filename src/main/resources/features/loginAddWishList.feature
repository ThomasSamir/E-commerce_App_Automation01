Feature: a logged in user can add items to wish list

  Background: user first must register
    Then add valid data in registration
    And  click on  button
    Then click on logout tab
    Then click on login tab
    Then login as user

Scenario: user can add items to wish list
  When hover on tab
  And click on category
  Then click on item
  Then add to wishlist
  Given open wish list to make sure item exist
