@SmokeScenarios # adding tag to Feature
Feature: feature to test login fuctionality

  @SmokeTest  # adding tag to scenario
  Scenario: Check login fuctionality with valid fuctionality
    Given user is on login page
    When user enters username and password
    And click on login button
    Then user is navigated to homePage

    # If scenarios need to execute for multiple sets of inputs, Use Scenario Outline:

#  Scenario Outline: : Check login fuctionality with valid fuctionality
#    Given user is on login page
#    When user enters <username> and <password>
#    And click on login button
#    Then user is navigated to homePage

#    Examples: # Examples: provide inputs to Scenario Outline: . Its like a DataProvider in TestNG
#    | username | password |
#    | user1 | pass1 |
#    | user2 | pass2 |

    # this is a comment