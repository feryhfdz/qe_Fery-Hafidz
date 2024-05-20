@LoginUser
Feature: Login
  As a admin
  I want to Login
  So that i can get token for access

  Background:
    Given I set API endpoint to Login

  Scenario: As an admin i want to Login using valid credential
    When I send request to login and fill valid credential(email, password)
    Then I receive status code 200 OK response
    And I receive my token

  Scenario: As an admin i want to login using blank credentials
    When I send request to login and fill blank credentials
    Then I receive status code 400 Bad Request
    And I receive error message with empty field

  Scenario: As an admin i want to login with invalid email
    When I send request to login with invalid email
    And I receive status code 401 Unauthorized
    Then I receive error message stating that username or password is incorrect

