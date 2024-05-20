@GetASingleUser
Feature: Get a Single User
  As an Admin
  I want to get user by id
  So That i can get 200 OK response detail user information by valid ID

  Scenario: As an admin i want to get user by id
    Given I set users API endpoint by ID
    When I send GET request to get user information by ID
    Then I receive status code 200 OK response
    And I receive detail user information by ID