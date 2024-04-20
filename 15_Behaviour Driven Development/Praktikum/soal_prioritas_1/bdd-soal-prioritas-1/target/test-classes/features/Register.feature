Feature: New User Registration
  As a user
  I want to create a new account
  so I will be able to access linkedin with my new account

  Scenario: Successful Registration
    Given I am on the LinkedIn registration page
    When I enters all required registration information
    And I clicks the "Join Now" button
    Then I LinkedIn account is successfully created

  Scenario: Failed Registration - Email Already In Use
    Given I am on the LinkedIn registration page
    When I enters registration information with an already registered email address
    And I clicks the "Join Now" button
    Then I should see the system displays an error message stating that the email address is already in use



