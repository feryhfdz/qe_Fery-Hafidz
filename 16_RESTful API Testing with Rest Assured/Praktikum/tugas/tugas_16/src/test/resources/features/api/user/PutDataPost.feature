Feature: Put data post by ID
  As a admin
  I want to update data by ID
  So that I can modify specific details of a post

  Scenario: As an admin, I can successfully update post data
    Given I set API endpoint for put data with ID
    When I send a PUT request to the endpoint with the ID and updated data
    Then I receive a successful response status code 200
    And The post data should be updated successfully


  Scenario: As an admin, I get an error response for a non-existent post ID
    Given I set API endpoint for put data with ID
    When I send a PUT request to update the post data with that invalid ID
    Then I receive status code 404
    And the response body contains an error message Post not found