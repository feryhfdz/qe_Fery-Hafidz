Feature: Select Product
  As a user
  I want to choose a product
  so that I can make a purchase


  Scenario: As a user I can choose Pulsa product service
    Given I am on the landing page
    When I click sign in button on the landing page
    And I am on the login page
    And I input valid email
    And I input valid password
    And I click sign in button
    And I see loading system
    And I switched to the home page and I saw a successful login confirmation message
    And I see all the product service
    And I click pulsa product service
    Then I am on the pulsa page