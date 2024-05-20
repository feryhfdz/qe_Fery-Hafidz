@GetASingleCart
Feature: Get a Single Cart
  As an admin
  I want to get a single
  So that I can receive 200 OK response and detail cart

  Scenario: As an admin i want to get a single cart
    Given I set carts API endpoint with an valid ID to get cart by ID
    When I send GET request endpoint for get cart by ID
    Then I receive status code 200 OK response
    And I receive detail a product cart by ID