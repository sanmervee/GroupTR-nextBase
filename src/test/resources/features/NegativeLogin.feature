@NegativeLogin
Feature: Next Base app login feature
  User Story:
  As a user, I should be able to login to the app
  Accounts are: hr, helpdesk, marketing

  Scenario: Login with wrong password and username
    Given User is on the login page
    When User enters wrong "username"
    And User enters wrong "password"
    And User should able to click remember me
    Then User should see the error msg as "Incorrect login or password"




