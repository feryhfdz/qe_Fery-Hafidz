@GetAllCategories
Feature: Get All Categories
  As an admin
  I want to get all categories
  So that i can get all categories

  Scenario: As an admin I can get all categories
    Given I set categories API endpoint for get all categories
    When I send GET request body for get all categories
    Then I receive status code 200 OK response
    And I receive data for all categories