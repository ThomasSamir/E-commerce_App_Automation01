Feature: logged in user can hover and select categories

  Background: user register then login
    When userRegisterInBackGround
    And  clickOnRegistrationButton


  Scenario: user hover & select categories
    Given open link to login
    And   user login
    When  click on loginButton
    Then  user hover on tap
    Then  select a category