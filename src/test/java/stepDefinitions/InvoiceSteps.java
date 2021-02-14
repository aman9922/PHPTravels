package stepDefinitions;

import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import pages.InvoicePage;

public class InvoiceSteps {
    InvoicePage invoicePage = new InvoicePage();

    @Then("Unpaid booking status should displayed")
    public void unpaid_Booking_Status_Should_Displayed() {
        invoicePage.verifyUnpaidBookingStatus();
    }

    @When("User clicks on pay on arrival button")
    public void user_Clicks_On_Pay_On_Arrival_Button() {
        invoicePage.clickPayOnArrivalBtn();
    }

    @Then("User should able to see reserved booking status")
    public void user_Should_Able_To_See_Reserved_Booking_Status() {
        invoicePage.verifyReservedBookingStatus();
    }

}
