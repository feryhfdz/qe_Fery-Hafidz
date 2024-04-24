Feature: Create a user
  As a admin
  I want to create a post data
  So that post data is saved

  Scenario: As an admin, ensure that the data is added successfully
    Given I set API endpoint for create a post data
    When I send a request to create a post data
    Then I receive status code 201
    And I receive valid data for created post data

  Scenario: As an admin i can send request with unrecognized additional parameter
    Given I set API endpoint for create a post data
    When  I send a request to create a post data with unrecognized additional parameter
    Then I receive status code 400
    And the response body should contain an error message that mentions the unrecognized parameter