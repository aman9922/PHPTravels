package stepDefinitions;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import pages.AccountPage;

public class AccountSteps {
    AccountPage accountPage = new AccountPage();

    @Then("User is navigated to the home page")
    public void user_is_navigated_to_the_home_page() {
        accountPage.verifyAccountPageLoaded();
    }

    @When("User clicks on my profile tab")
    public void userClicksOnMyProfileTab() {
        accountPage.clickOnMyProfileLeftTab();
    }

    @Then("Verify profile tab is accessible")
    public void verifyProfileTabIsAccessible() {
        accountPage.verifyAccountPageLoaded();
    }

    @And("User updates phone number as {string}")
    public void userUpdatesPhoneNumberAs(String phone) {
        accountPage.enterPhoneNumber(phone);
    }

    @Then("User clicks on submit button")
    public void userClicksOnSubmitButton() {
        accountPage.clickSubmitButton();
    }

    @Then("Then user verifies updated phone number as {string}")
    public void thenUserVerifiesUpdatedPhoneNumberAs(String number) {
        accountPage.verifyPhoneNumber(number);
    }

}
