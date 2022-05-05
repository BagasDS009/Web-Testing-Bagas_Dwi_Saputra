@Login
Feature: as a user i want to buy but i need to login account

  Background:
    Given I am on the home page
    And I click icon login button
    When I am on the login page

  @InvalidPassword
  Scenario: As a user I login with a valid email and invalid password
    And I input valid email login
    And I input invalid password login
    Then I click button login
    And Login failed validation invalid password
  @InvalidEmail
  Scenario: As a user I login with a invalid email and valid password
    And I input invalid email login
    And I input valid password login
    Then I click button login
    And Login failed validation invalid email
  @InvalidEmailAndPassword
  Scenario: As a user I login with a invalid email and password
    And I input invalid email login
    And I input invalid password login
    Then I click button login
    And Login failed validation invalid password and email
  @ValidEmailAndPassword
  Scenario: As a user I login with a valid email and password
    And I input valid email login
    And I input valid password login
    Then I click button login
    And Login successful validation

