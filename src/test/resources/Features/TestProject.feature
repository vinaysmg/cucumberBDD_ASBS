Feature: TestProject login functionality

  Scenario Outline: Check login with valid credentials
    Given "CHROME" browser is open
    And user in TestProject login page
    When user enters TestProject <username> and <password>
    And user clicks on loginButton
    Then user is navigated to TestProject homePage
    Examples:
      | username | password |
      | Abcd | 123 |
      | qwerty | 09876 |