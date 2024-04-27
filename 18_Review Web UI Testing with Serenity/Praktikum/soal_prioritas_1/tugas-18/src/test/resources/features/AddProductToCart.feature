Feature: Add Product to cart
  As a user
  I want to add my selected product to cart
  So that I can purchase the product

  Scenario: As a user I can add the products I choose to the cart
    Given I am on the login page
    When I input valid username
    And I input valid password
    And I click login button
    And I see products image
    And I see products description
    And I click add to cart button
    And I click cart button
    Then I can see my product in cart page