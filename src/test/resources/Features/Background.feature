# Background
#  A step or group of step that are common to all scenarios in a feature is defined once in feature and runs before every
# scenario of the feature.
#  Backgrounds are visible to people who reads feature file.
#  We can have only one background per feature file.

  Feature: check homePage functionality

    Background: user is logged in
      Given user is on login page
      When user enters username and password
      And click on login button
      Then user is navigated to homePage

    Scenario: check logout link
      When user clicks on account button
      Then logout link is displayed

    Scenario: check summary link
      When user clicks on hamberger menu
      Then summary link is displayed