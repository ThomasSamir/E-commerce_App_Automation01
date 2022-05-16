Feature: User can have the ability to register.

  Scenario: User register with a valid Data.
    Given open browser
    When  enter valid registration data
    And  click on registration button
    Then successful registration
    And check color
