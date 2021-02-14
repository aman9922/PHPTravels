package stepDefinitions;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import pages.AccountPage;

public class AccountSteps {
    AccountPage accountPage = new AccountPage();

    @Then("User is navigated to the home page")
    public void user_Is_Navigated_To_The_Home_Page() {
        accountPage.verifyAccountPageLoaded();
    }

    @When("User clicks on my profile tab")
    public void user_Clicks_On_MyProfile_Tab() {
        accountPage.clickOnMyProfileLeftTab();
    }

    @Then("Verify profile tab is accessible")
    public void verify_Profile_Tab_Is_Accessible() {
        accountPage.verifyAccountPageLoaded();
    }

    @And("User updates phone number as {string}")
    public void user_Updates_Phone_Number_As(String phone) {
        accountPage.enterPhoneNumber(phone);
    }

    @Then("User clicks on submit button")
    public void user_Clicks_On_Submit_Button() {
        accountPage.clickSubmitButton();
    }

    @Then("User verifies updated phone number as {string}")
    public void user_Verifies_Updated_Phone_Number_As(String number) {
        accountPage.verifyPhoneNumber(number);
    }

}
