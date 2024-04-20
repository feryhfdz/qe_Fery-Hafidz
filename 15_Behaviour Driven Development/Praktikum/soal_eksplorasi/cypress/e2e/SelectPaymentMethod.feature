Feature: Payment
  As a user
  I want to make payment
  so I can complete the payment

  Scenario: Make Payments via DANA
    Given I am on the checkout page
    When I choose the payment method using DANA
    And I click "Pay Now" button
    Then I was directed to the DANA link to confirm payment

  Scenario: Make Payments via Gopay
    Given I am on the checkout page
    When I choose the payment method using Gopay
    And I click "Pay Now" button
    Then I was directed to the Gopay link to confirm payment

  Scenario: Make Payments via Virgo
    Given I am on the checkout page
    When I choose the payment method using Virgo
    And I click "Pay Now" button
    Then I was directed to the Virgo link to confirm payment