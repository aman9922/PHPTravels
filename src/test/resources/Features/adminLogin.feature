Feature: login functionality test based on role

  @AdminLogin
  Scenario Outline: Check login with invalid role
    Given User is on admin login page
    When User enters email as "<username>" and password as "<password>"
    And User clicks on admin login button
    Then Error message should be displayed
    Examples:
      | username              | password   |
      | user@phptravels.com   | randomtext |
      | amangupta123@test.com | @@$$%%     |

  @AdminLogin
  Scenario: Check login with valid role
    Given User is on admin login page
    When User enters email as "admin@phptravels.com" and password as "demoadmin"
    And User clicks on admin login button
    Then User will be on home page
