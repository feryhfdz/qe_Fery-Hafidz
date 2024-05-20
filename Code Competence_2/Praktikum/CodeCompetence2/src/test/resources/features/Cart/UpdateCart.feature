@UpdateCart
Feature: Update Cart
  As an admin
  I want to update cart
  So that I can update information for specific items in my cart

  Scenario: As an admin i can update cart
    Given I set carts API endpoint for update cart
    When I send PUT request to update cart
    Then I receive status code 200 OK response
    And I should get the data cart that I updated