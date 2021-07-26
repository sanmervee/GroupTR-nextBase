Feature: Next Base app login feature
  User Story:
  As a user, I should be able to login to the app
  Accounts are: hr, helpdesk, marketing

  Scenario Outline: Login
    Given User is on the login page
    When User enters "<username>" "<password>" "<remember>"
    Then User should see the dashboard as "Portal"
    Examples:
      | username                       | password | remember |
      | hr29@cybertekschool.com        | UserUser | true     |
      | marketing29@cybertekschool.com | UserUser | false    |
      | helpdesk29@cybertekschool.com  | UserUser | true     |


  Scenario: Testing forgot password
    Given User is on the login page
    When User clicks FORGOT YOUR PASSWORD? link
    When User enters hr username
    And User clicks reset password
    Then User should able to see approve text