@GetInCategory
Feature: GetInCategory
  As an admin
  I want to Get In Category
  So that i can get in category

  Scenario: As an user i can get in category
    Given I set category API endpoint for get in category
    When I send GET request endpoint for get in category
    Then I receive status code 200 OK response
    And I receive detail information by category