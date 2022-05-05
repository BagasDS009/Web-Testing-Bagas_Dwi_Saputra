@Rating
Feature: As a user, I would like to rate the items I have purchased

  @RatingOnLogin
  Scenario: I want to rate the item (Already logged in)
    Given I am on the home page
    And I click icon login button
    And I am on the login page
    And I input valid email login
    And I input valid password login
    When I click button login
    And I click detail button on items
    And Validate on the rating page
    Then I rate the item from one to five
    And Validate rating success

  @RatingNotLogin
  Scenario: I want to rate the item (Not logged in yet)
    Given I am on the home page
    When I click detail button on items
    And Validate on the rating page
    Then I rate the item from one to five
    And Validate rating success