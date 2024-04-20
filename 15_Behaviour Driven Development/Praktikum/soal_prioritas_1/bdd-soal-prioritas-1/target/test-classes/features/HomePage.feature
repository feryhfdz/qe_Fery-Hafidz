Feature: Create Post
  As a user
  I want to create a post
  so that I can share content with my network

  Scenario: Create a Text Post
    Given I am on the LinkedIn homepage
    When I click on the "Start a post" field
    And I enter text content for my post
    When I click the "Post" button
    Then My text post is successfully published on my LinkedIn feed

  Scenario: Cancel Post Creation
    Given I am on the LinkedIn homepage
    When I click on the "Start a post" field
    And I enter text content for my post
    When I click the "X" button
    Then A confirmation dialog appears asking me to confirm discarding the post or save as draft
    When I confirm discarding the post
    Then The post creation process is cancelled
    And I am returned to the LinkedIn homepage without the post being published


