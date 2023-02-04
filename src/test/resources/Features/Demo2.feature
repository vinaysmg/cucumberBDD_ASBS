@SmokeScenarios
Feature: Passing Data to tests from feature file

  @SmokeTest  # adding tag to scenario
  Scenario: Check login fuctionality with valid fuctionality
    Given user is on login page
    When user enters username and password
    And click on login button
    Then user is navigated to homePage
    And verify home page title "HomePageTitle"
    And verify menus options
    # below DataTable will be passed to a single test as a List<String>
      | Account |
      | Dashboard |
      | logout    |
      | Settings  |
    And verify sub-menu options
     # below DataTable will be passed to a single test as a List<Map<String, String>>, where 1st row will be key for map
      | menu | subMenu |
      | Account | ProfileSetting |
      | DashBoard | Order Summary |
      | logout    | cancel        |
      | Setting   | General       |

        # If scenarios need to execute for multiple sets of inputs, Use Scenario Outline:
  Scenario Outline: : Check login fuctionality with valid fuctionality
    Given user is on login page
    When user enters credential <username> and <password>
    And click on login button
    Then user is navigated to homePage

    Examples: # Examples: provide inputs to Scenario Outline: . Its like a DataProvider in TestNG
      | username | password |
      | user1 | pass1 |
      | user2 | pass2 |