@AddAndRemove
Feature: As a user I want to add or remove items on the order page

  Background:
    Given I am on the home page

  @AddButNotLogin
  Scenario: As a user I want to add once items on the order page but I am not logged in
    When I clicked the buy button for all three items once
    And I click the button shopping cart
    And I click the add button once on each item
    Then Check the ordered items on the shopping cart
    And I click the button bayar
    And validate on page transaction
  @AddButNotLoginAndToLoginPage
  Scenario: As a user I want to add once items on the order page but I am not logged in and go to login
    When I clicked the buy button for all three items once
    And I click the button shopping cart
    And I click the add button once on each item
    Then Check the ordered items on the shopping cart
    And I click the button bayar
    And I am on the login page at transaction
    And I input valid email login
    And I input valid password login
    And I click button login at transaction
    And validate on page transaction
  @RemoveButNotLogin
  Scenario: As a user I want to remove onec items on the order page but I am not logged in
    When I clicked the buy button for all three items once
    And I click the button shopping cart
    Then Check the ordered items on the shopping cart
    And I click the remove button once on each item
    And validate on page order is empty
  @AddAnLogin
  Scenario: As a user I want to add once items on the order page
    And I click icon login button
    When I am on the login page
    And I input valid email login
    And I input valid password login
    And I click button login at transaction
    Then I clicked the buy button for all three items once to order page
    And I click the button shopping cart
    And I click the add button once on each item
    And I click the button bayar
    And validate on page transaction
  @RemoveAnLogin
  Scenario: As a user I want to remove onec items on the order page
    And I click icon login button
    When I am on the login page
    And I input valid email login
    And I input valid password login
    And I click button login to order page
    Then I clicked the buy button for all three items once to order page
    And I click the button shopping cart
    And I click the remove button once on each item
    And validate on page order is empty
