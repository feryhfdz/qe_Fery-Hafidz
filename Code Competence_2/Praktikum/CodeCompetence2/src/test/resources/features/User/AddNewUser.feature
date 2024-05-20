@AddNewUser
Feature: Add New User
  As an admin
  I want to create a new User
  So that my user was successfully created

  Scenario: As an admin I can create a new user
    Given I set users API endpoint
    When I send POST request endpoint for create new user
    Then I receive status code 200 OK response
    And I receive valid data for my user