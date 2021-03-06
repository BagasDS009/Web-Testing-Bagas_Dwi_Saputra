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
    And Login failed validation invalid password "email or password is invalid"
  @InvalidEmail
  Scenario: As a user I login with a invalid email and valid password
    And I input invalid email login
    And I input valid password login
    Then I click button login
    And Login failed validation invalid email "record not found"
  @InvalidEmailAndPassword
  Scenario: As a user I login with a invalid email and password
    And I input invalid email login
    And I input invalid password login
    Then I click button login
    And Login failed validation invalid password and email "record not found"
  @ValidEmailAndPassword
  Scenario: As a user I login with a valid email and password
    And I input valid email login
    And I input valid password login
    Then I click button login
    And Login successful validation

  @LogoutAccount
  Scenario: As a user I want to log out of the account
    And I input valid email login
    And I input valid password login
    Then I click button login
    And I click button user
    And I logout account
    And Validate that the account is logged out
  @TransaksiAccount
  Scenario: As a user I want to see transaction of the account
    And I input valid email login
    And I input valid password login
    Then I click button login
    And I click button user
    And I transaction account
    And Validate that the account has entered the transaction page

