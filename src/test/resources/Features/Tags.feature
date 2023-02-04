#Tags are inherited by child elements, Tags that are added to Feature will be inherited by Scenario, Scenario Outline or Examples
# Tags can be placed for Feature: Scenario, Scenario Outline, Examples
# Tags cannot be added to Backgrounds and steps (Given, When, Then, And and But)
@all
Feature: Execute feature files using tags
  @Smoke
  Scenario: scenario 1
    Given
    When
    Then

  @Regression
  Scenario: scenario 2
    Given
    When
    Then

  @Important
  Scenario: scenario 3
    Given
    When
    Then

  @Smoke @Regression
  Scenario: scenario 4
    Given
    When
    Then

  @Smoke @Important
  Scenario: scenario 5
  Given
  When
  Then