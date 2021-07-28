@send
Feature: Send Message
  User Story: As a user, I should be able to send message.

  Background:
    Given User is on the login page
    When User enters "hr29@cybertekschool.com" "UserUser" "true"

  Scenario:  I should be able to send message
    Given user can click "message" tab
    When user can type message in the message text box
    And user clicks send button

  Scenario:  I should be able to add link to send message feature
    Given user can click "message" tab
    When user can type message in the message text box
    Given user can attach link by clicking on the "Link" icon.
    And user clicks send button

  Scenario:  I should be able to cancel to send message
    Given user can click "message" tab
    When user can type message in the message text box
    Then Verify users can cancel message.