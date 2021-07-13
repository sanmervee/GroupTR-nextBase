Feature: Next Base app login feature
  User Story:
  As a user, I should be able to login to the app
  Accounts are: hr, helpdesk, marketing

  Scenario: Login as hr
    Given User is on the login page
    When User enters hr username
    And User enters hr password
    And User should able to click remember me
    Then User should see the dashboard

  Scenario: Login as helpdesk
    Given User is on the login page
    When User enters helpdesk username
    And User enters helpdesk password
    And User should able to click remember me
    Then User should see the dashboard

  Scenario: Login as marketing
    Given User is on the login page
    When User enters marketing username
    And User enters marketing password
    And User should able to click remember me
    Then User should see the dashboard

    Scenario: Testing forgot password
      Given User is on the login page
      When User clicks FORGOT YOUR PASSWORD? link
      When User enters hr username
      And User clicks reset password
      Then User should able to see approve text


