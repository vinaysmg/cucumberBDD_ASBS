@SmokeScenarios # adding tag to Feature
Feature: feature to test login fuctionality

  @SmokeTest  # adding tag to scenario
  Scenario: Check login fuctionality with valid fuctionality
    Given user is on login page
    When user enters username and password
    And click on login button
    Then user is navigated to homePage