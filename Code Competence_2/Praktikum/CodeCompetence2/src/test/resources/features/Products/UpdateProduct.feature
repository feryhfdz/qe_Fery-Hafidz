@UpdateProduct
Feature: Update Product
  As an admin
  I want to update product
  So that I can receive 200 OK response and detail information

  Scenario: As an admin i want to update product
    Given I set product api endpoint for update product
    When I send PUT request to update product
    Then I receive status code 200 OK response
    And I receive detail information product