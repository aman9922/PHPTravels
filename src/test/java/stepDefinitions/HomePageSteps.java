package stepDefinitions;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import pages.HomePage;

public class HomePageSteps {
    HomePage homePage = new HomePage();

    @Given("User is on login page")
    public void user_is_on_login_page() {
        homePage.navigateToHomepage();
        homePage.clickOnMyAccount();
        homePage.clickOnLogin();
    }

    @Given("User is on homepage page")
    public void user_is_on_homepage_page() {
        homePage.navigateToHomepage();
        homePage.verifyHomepage();
    }

    @When("User enters hotel {string} in search box")
    public void user_enters_hotel_something_in_search_box(String hotelname) {
        homePage.enterTextInSearchBox(hotelname);
    }

    @When("User clicks on hotel {string} from the dropdown list")
    public void user_clicks_on_hotel_from_the_dropdown_list(String hotelname) {
        homePage.clickOnDropdownList(hotelname);
    }

    @Then("Links related to {string} are shown on the dropdown")
    public void links_related_to_something_are_shown_on_the_dropdown(String hotelName) {
        homePage.verifyHotelNameIsVisibleInList(hotelName);
    }


    @And("User enters checkin date {string} and checkout date {string}")
    public void user_enters_checkin_date_something_and_checkout_date_something(String checkInDate, String checkOutDate) {
        homePage.enterCheckInAndCheckoutDate(checkInDate, checkOutDate);
    }

    @And("User click on submit button")
    public void user_click_on_submit_button() {
        homePage.clickOnSubmitBtn();
    }

}
