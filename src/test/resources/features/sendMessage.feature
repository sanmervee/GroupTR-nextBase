
@send
Feature: Send Message
  User Story: As a user, I should be able to send message.

  Background:
    Given User is on the login page
    When User enters "hr29@cybertekschool.com" "UserUser" "true"

  Scenario:  I should be able to send message
  Given Verify users can send message by clicking "message" tab
  Then Verify users can attach link by clicking on the "link" icon.
  Then Verify users can cancel message.