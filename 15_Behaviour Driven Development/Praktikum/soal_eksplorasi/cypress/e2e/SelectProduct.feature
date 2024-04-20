Feature: Select product
  As a user
  I want to select a product
  so that I can make a purchase

  Scenario: Selecting pulsa product
    Given I am on the home page
    When I select the "Pulsa" product
    Then I will see the display to fill in the telephone number and desired pulsa amount

  Scenario: Selecting voucher game product
    Given I am on the home page
    When I select the "Voucher Game" product
    Then I will see the display of various game voucher options and game top ups

  Scenario: Selecting other products menu
    Given I am on the home page
    When I select the "other product" product
    Then I should see all sepulsa's products