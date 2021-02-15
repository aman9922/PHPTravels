Feature: Add a new hotel and do booking

  @AddHotel
  Scenario: Add a new hotel
    Given User is on admin login page
    When User enters email as "admin@phptravels.com" and password as "demoadmin"
    And User clicks on admin login button
    Then User will be on home page
    When User clicks on Hotel left tab and clicks "Hotels" option
    Then User is on Hotels page
    When User clicks on add button
    And User enters hotel name as "test",hotel description as "test",address on map as "test",latitude as "test" and longitude as "test"
    And User clicks on Facilities tab
    And User selects facilities "Airport Transport|Night Club" for hotel
    And User clicks on meta tab
    And User enters meta title as "test", meta keywords as "test", meta description as "test"
    And User clicks on Policy tab
    And User enters check-in as "02:00 AM",checkout as "02:00 PM", payment option as "Skrill|Paypal",policy and term as "test"
    And User clicks on Contact tab
    And User enters hotel email as "test@test.com", hotel website as "www.test.com", phone as "123455656"
    And User clicks on Translate tab
    And User enters hotel name,hotel description,meta title, meta keywords, meta desc, policy and terms in language
      | hotelName | hotelDesc | metaTitle | metaKeywords | metaDesc | policyAndTerms | language   |
      | kiểm tra  | kiểm tra  | kiểm tra  | kiểm tra     | kiểm tra | kiểm tra       | Vietnamese |
      | тест      | тест      | тест      | тест         | тест     | тест           | Russian    |
    And User enters location "Hilversum"
    And User clicks on submit button in hotels page
    Then User verifies saved changes is displayed

  @AddHotel
  Scenario: Add a new room
    Given User is on admin login page
    When User enters email as "admin@phptravels.com" and password as "demoadmin"
    And User clicks on admin login button
    Then User will be on home page
    When User clicks on Hotel left tab and clicks "Rooms" option
    Then User is on Rooms page
    When User clicks on add button
    And User enters room description as "test room"
    And User enters price as "200", hotel as "test",room type as "One-Bedroom Apartment",quantity as "5", min stay as "1",max adults as "2"
    And User clicks on submit button in hotels page
    Then User verifies saved changes is displayed

  @AddHotel
  Scenario: Book hotel and validate booking in account
    Given User is on homepage page
    When User enters hotel "test" in search box
    Then Links related to "kiểm tra" are shown on the dropdown
    When User clicks on hotel "kiểm tra" from the dropdown list
    And User enters checkin date "15/03/2021" and checkout date "16/03/2021"
    And User click on submit button
    Then User is navigated to hotel "test" page
    When User selects room type "One-Bedroom Apartment"
    And User clicks on book now
    Then User will navigate to personal details
    When User clicks on sign-in tab
    And User enters email "user@phptravels.com" and password "demouser"
    And User clicks on confirm this booking button
    Then Unpaid booking status should displayed
    When User clicks on pay on arrival button
    Then User should able to see reserved booking status



