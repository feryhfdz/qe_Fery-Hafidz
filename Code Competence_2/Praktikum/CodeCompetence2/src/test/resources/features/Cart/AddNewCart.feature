@AddNewCart
Feature: Create a New Cart
  As an admin
  I want to create a new cart
  So that the cart was successfully created

  Scenario: As an admin I can create cart
    Given I set cart API endpoint for create new cart
    When I send POST request endpoint for create new cart
    Then I receive status code 200 OK response
    And I receive request body input data added successfully