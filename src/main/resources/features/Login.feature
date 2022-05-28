@smoke
Feature: User can have the ability to login.

  Scenario: User login valid Data.
    Given open link for login
    And  enter valid data "thomas@thomas.com"and"P@ssw0rd"
    Then  click on login button
    And   check account tab exists
