package stepDefinitions;

import io.cucumber.datatable.DataTable;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import pages.AdminHotels;

import java.util.List;
import java.util.Map;

public class AdminHotelsStep {

    AdminHotels adminHotelsPage = new AdminHotels();

    @Then("User is on Hotels page")
    public void User_Is_On_Hotels_Page() {
        adminHotelsPage.verifyHotelsPage();
    }

    @When("User clicks on add button")
    public void user_Clicks_On_Add_Button() {
        adminHotelsPage.clickAddBtn();
    }

    @And("User enters hotel name as {string},hotel description as {string},address on map as {string},latitude as {string} and longitude as {string}")
    public void user_Enters_Hotel_Name_As_Hotel_Description_As_Address_On_Map_As_Latitude_As_And_Longitude_As(String hotelName, String hotelDesc, String mapAddress, String latitude, String longitude) {
        adminHotelsPage.enterHotelName(hotelName);
        adminHotelsPage.enterHotelDescription(hotelDesc);
        adminHotelsPage.enterAddressOnMap(mapAddress);
        adminHotelsPage.enterLatitude(latitude);
        adminHotelsPage.enterLongitude(longitude);
    }

    @And("User clicks on Facilities tab")
    public void user_Clicks_On_Facilitis_Tab() {
        adminHotelsPage.clickFacilitiesTab();
    }

    @And("User selects facilities {string} for hotel")
    public void user_Selects_Facilities_For_Hotel(String facilityNames) {
        adminHotelsPage.selectFacilities(facilityNames);
    }

    @And("User clicks on Policy tab")
    public void user_Clicks_On_Policy_Tab() {
        adminHotelsPage.clickPolicyTab();
    }

    @And("User enters check-in as {string},checkout as {string}, payment option as {string},policy and term as {string}")
    public void user_Enters_CheckIn_As_Checkout_As_Payment_Option_As_Policy_And_Term_As(String checkin, String checkout, String payment, String policy) {
        adminHotelsPage.enterCheckIn(checkin);
        adminHotelsPage.enterCheckout(checkout);
        adminHotelsPage.selectPaymentOptions(payment);
        adminHotelsPage.enterPolicy(policy);
    }

    @And("User clicks on Contact tab")
    public void user_Clicks_On_Contact_Tab() {
        adminHotelsPage.clickContactTab();
    }

    @And("User enters hotel email as {string}, hotel website as {string}, phone as {string}")
    public void user_Enters_Hotel_Email_As_Hotel_Website_As_Phone_As(String email, String website, String phone) {
        adminHotelsPage.enterHotelEmail(email);
        adminHotelsPage.enterHotelWebsite(website);
        adminHotelsPage.enterHotelPhone(phone);
    }

    @And("User clicks on Translate tab")
    public void user_Clicks_On_Translate_Tab() {
        adminHotelsPage.clickTranslationTab();
    }

    @And("User clicks on meta tab")
    public void user_Clicks_On_Meta_Tab() {
        adminHotelsPage.clickOnMetaTab();
    }

    @And("User enters meta title as {string}, meta keywords as {string}, meta description as {string}")
    public void user_Enters_Meta_Title_As_Meta_Keywords_As_Meta_Description_As(String title, String keywords, String desc) {
        adminHotelsPage.enterMeteTitle(title);
        adminHotelsPage.enterMeteKeywords(keywords);
        adminHotelsPage.enterMeteDesc(desc);
    }

    @And("User enters hotel name,hotel description,meta title, meta keywords, meta desc, policy and terms in language")
    public void user_Enters_Hotel_Name_Hotel_Description_Meta_Title_Meta_Keywords_Meta_Desc_Policy_And_Terms_In_Language(DataTable dataTable) {
        List<Map<String, String>> list = dataTable.asMaps(String.class, String.class);
        System.out.println(list.size());
        for (int i = 0; i < list.size(); i++) {
            adminHotelsPage.handleTranslationTab(list.get(i).get("hotelName"), list.get(i).get("hotelDesc"), list.get(i).get("metaTitle"), list.get(i).get("metaKeywords"), list.get(i).get("metaDesc"), list.get(i).get("policyAndTerms"), list.get(i).get("language"));
        }
    }

    @And("User clicks on submit button in hotels page")
    public void user_Clicks_On_Submit_Button() {
        adminHotelsPage.clickSubmitButton();
    }

    @And("User enters location {string}")
    public void user_Enters_Location(String location) {
        adminHotelsPage.enterLocation(location);
    }

    @Then("User is on Rooms page")
    public void user_Is_On_Rooms_Page() {
        adminHotelsPage.verifyRoomsPage();
    }


    @And("User enters room description as {string}")
    public void user_Enters_Room_Description_As(String roomDesc) {
        adminHotelsPage.enterRoomDesc(roomDesc);
    }

    @And("User enters price as {string}, room type as {string},quantity as {string}, min stay as {string},max adults as {string}")
    public void user_Enters_Price_As_RoomType_As_Quantity_As_MinStay_As_MaxAdultsAs(String price, String roomType, String quantity, String minStay, String adults) {
        adminHotelsPage.enterPrice(price);
        adminHotelsPage.enterRoomType(roomType);
        adminHotelsPage.enterQuantity(quantity);
        adminHotelsPage.enterMinStay(minStay);
        adminHotelsPage.enterMaximumAdults(adults);
    }

    @And("User enters price as {string}, hotel as {string},room type as {string},quantity as {string}, min stay as {string},max adults as {string}")
    public void userEntersPriceAsHotelAsRoomTypeAsQuantityAsMinStayAsMaxAdultsAs(String price, String hotelName, String roomType, String quantity, String minStay, String adults) {
        adminHotelsPage.enterPrice(price);
        adminHotelsPage.selectHotel(hotelName);
        adminHotelsPage.enterRoomType(roomType);
        adminHotelsPage.enterQuantity(quantity);
        adminHotelsPage.enterMinStay(minStay);
        adminHotelsPage.enterMaximumAdults(adults);
    }

    @Then("User verifies saved changes is displayed")
    public void user_Verifies_Saved_Changes_Is_Displayed() {
        adminHotelsPage.verifySavedChanges();
    }

}
