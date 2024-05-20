@UpdateUser
Feature: Update User
  As an admin
  I want to update user
  So that I can update a newest data for that user

  Scenario: As an admin i want to update user
    Given I set users api endpoint for update user
    When I send PUT request to update user
    Then I receive status code 200 OK response
    And I receive newly updated user