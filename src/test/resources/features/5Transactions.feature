@Transaction
Feature: As a user I want to see Transactions data

  Background:
    Given I am on the home page
    And I click icon login button
    And I am on the login page
    And I input valid email login
    And I input valid password login
    When I click button login
    And I clicked the buy button for all three items once
    And I click the button shopping cart
    And I click the button bayar
    Then I on the transactions page

  @ClickDetailData
  Scenario: I will see a list of data on products, prices, quantities, sub-totals
    And I clicked the product icon twice
    And I clicked the harga icon twice
    And I clicked the banyaknya icon twice
    And I clicked the sub-harga icon twice

  @ClickIconNextAndBack
  Scenario: I will see a list of data on page next and back in transaction
    And I click icon next
    And I click icon back