@GetAllCart
Feature: Get All Cart
  As an admin
  I want to get all cart
  So That i can get 200 OK response and data for all cart

  Scenario: As an admin i want to get all cart
    Given I set cart API endpoint for get all cart
    When I send GET request endpoint for get all cart
    Then I receive status code 200 OK response
    And I receive data for all cart