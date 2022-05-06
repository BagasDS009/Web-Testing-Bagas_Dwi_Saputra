@BuyItems
Feature:As a user I want to buy some on altashop items

  Background:
    Given I am on the home page

  @OneClick
  Scenario:As a user I want to buy available items Once
    When I clicked the buy button for all three items once
    And I click the button shopping cart
    Then Check the ordered items on the shopping cart
  @TwiceClick
  Scenario:As a user I want to buy available items twice
    When I clicked the buy button for all three items twice
    And I click the button shopping cart
    Then Check the ordered items on the shopping cart

  @ValidatePageCategory
  Scenario: As a user I want to see all categories and choose one to view
    When I click categories
    And I choose one
    Then I on the categories page