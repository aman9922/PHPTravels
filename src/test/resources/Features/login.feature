Feature: Login functionality tests

  @Login
  Scenario: Check login with valid credentials
    Given User is on login page
    When User enters username as "user@phptravels.com" and password as "demouser"
    And User clicks on login button
    Then User is navigated to the home page

  @Login
  Scenario Outline: Check login with invalid credentials
    Given User is on login page
    When User enters username as "<username>" and password as "<password>"
    And User clicks on login button
    Then Error message should displayed
    Examples:
      | username            | password   |
      | user@phptravels.com | randomtext |
      | aman.gupta124       | @@@***^^^  |

  @Profile
  Scenario: User should able to access his/her profile and should able to do changes
    Given User is on login page
    When User enters username as "user@phptravels.com" and password as "demouser"
    And User clicks on login button
    Then User is navigated to the home page
    When User clicks on my profile tab
    Then Verify profile tab is accessible
    And User updates phone number as "2143657"
    Then User clicks on submit button
    When User clicks on my profile tab
    Then Then user verifies updated phone number as "2143657"



