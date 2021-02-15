Feature: booking functionality tests

  @Booking
  Scenario: book hotel and validate booking in account
    Given User is on homepage page
    When User enters hotel "Oasis Beach Tower" in search box
    Then Links related to "Oasis Beach Tower" are shown on the dropdown
    When User clicks on hotel "Oasis Beach Tower" from the dropdown list
    And User enters checkin date "22/03/2021" and checkout date "23/03/2021"
    And User click on submit button
    Then User is navigated to hotel "Oasis Beach Tower" page
    When User selects room type "Superior Single View"
    And User clicks on book now
    Then User will navigate to personal details
    When User clicks on sign-in tab
    And User enters email "user@phptravels.com" and password "demouser"
    And User clicks on confirm this booking button
    Then Unpaid booking status should displayed
    When User clicks on pay on arrival button
    Then User should able to see reserved booking status
