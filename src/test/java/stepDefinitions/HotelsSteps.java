package stepDefinitions;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import pages.HotelsPage;

public class HotelsSteps {
    HotelsPage hotelPage = new HotelsPage();

    @Then("User is navigated to hotel {string} page")
    public void user_is_navigated_to_hotel_something_page(String hotelname) {
        hotelPage.verifyHotelPage(hotelname);
    }

    @When("User selects room type {string}")
    public void user_selects_room_type(String roomType) {
        hotelPage.selectRoom(roomType);
    }

    @And("User clicks on book now")
    public void user_clicks_on_book_now() {
        hotelPage.clickBookNowBtn();
    }

    @Then("User will navigate to personal details")
    public void user_Will_Navigate_To_PersonalDetails() {
        hotelPage.verifyPersonalDetailsText();
    }

    @When("User clicks on sign-in tab")
    public void user_Clicks_On_SignInTab() {
        hotelPage.clickSignInTab();
    }

    @And("User enters email {string} and password {string}")
    public void user_Enters_Email_And_Password(String email, String password) {
        hotelPage.enterUserDetails(email, password);
    }

    @And("User clicks on confirm this booking button")
    public void clicks_on_confirm_this_booking_button() {
        hotelPage.clickOnConfirmThisBooking();
    }

}
