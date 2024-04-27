Feature: Login
  As a user
  I want to login
  So I can access the application

  Scenario: As a user I can login with valid credentials
    Given I am on the landing page
    When I click sign in button on the landing page
    And I am on the login page
    And I input valid email
    And I input valid password
    And I click sign in button
    And I see loading system
    Then I switched to the home page and I saw a successful login confirmation message

  Scenario: As a user I cannot login with invalid credentials
    Given I am on the landing page
    When I click sign in button on the landing page
    And I am on the login page
    And I input invalid email
    And I input invalid password
    And I click sign in button
    And I see loading system
    Then I can a error message "Coba ingat-ingat lagi alamat e-mail/ nomor handphone dan password kamu. Masih ada yang salah nih."