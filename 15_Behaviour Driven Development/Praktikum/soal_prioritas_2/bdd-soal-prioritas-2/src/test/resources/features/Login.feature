Feature: Login
  As a user
  I want to Login
  so that I can access sepulsa.com with my account

  Scenario: Successful Login with Valid Credentials
    Given I am on the login page
    When I enter my valid username and password
    And I click "Sign In" button
    Then I should be directed to the HomePage

  Scenario: Failed Login with Invalid Credentials
    Given I am on the login page
    When I enters an invalid username or password
    And I click "Sign In" button
    Then an error message should be displayed

  Scenario: Successful Password Reset
    Given I am on the login page
    When I click the "Forgot Password?" link
    And I enter my registered email address
    And I click "Send" button
    Then I should receive a password reset email with instructions