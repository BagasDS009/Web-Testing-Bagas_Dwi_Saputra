@ALL
Feature: as a user i want to login but before that do the registration first

  Background:
    Given I am on the home page
    And I click icon login button
    And I validate on login page
    When I click icon register to make account

  @RegisterFaker
  Scenario: as a user I want to register first
    And I entered a successful name in the registration using faker
    And I entered a successful email in the registration using faker
    And I entered a successful password in the registration using faker
    Then I click button register
  @InvalidEmail
  Scenario: as a user I want to register first but the email is invalid
    And I input nama in register
    And I input invalid email in register
    And I input password in register
    Then I click button register
  @NameAlreadyInUse
  Scenario: as a user I want to register first but the name is already in use
    And I input nama is already in use
    And I input email in register
    And I input password in register
    Then I click button register
  @EmailAlreadyInUse
  Scenario: as a user I want to register first but the email is already in use
    And I input nama in register
    And I input email is already in use
    And I input password in register
    Then I click button register