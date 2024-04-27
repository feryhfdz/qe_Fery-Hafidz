Feature: Login
  As a user
  I want to login
  So that I can access products page

  Scenario: As a user I can login with valid credentials
    Given I am on the login page
    When I input valid username
    And I input valid password
    And I click login button
    Then I am on the products page

  Scenario: As a problem user I get false product image
    Given I am on the login page
    When I input problem username
    And I input valid password
    And I click login button
    And I see products image
    Then I cant see the real product image

  Scenario: As a locked user I cannot access products page
    Given I am on the login page
    When I input locked username
    And I input valid password
    And I click login button
    Then I can see error message "Epic sadface: Sorry, this user has been locked out."

  Scenario: As a user I cant login with all blank fields
    Given I am on the login page
    When I click login button
    Then I should see error message "Epic sadface: Username is required"