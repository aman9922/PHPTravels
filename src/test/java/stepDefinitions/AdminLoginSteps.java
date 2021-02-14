package stepDefinitions;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import pages.AdminLoginPage;

public class AdminLoginSteps {

    AdminLoginPage adminLoginPage = new AdminLoginPage();

    @Given("User is on admin login page")
    public void user_is_on_admin_login_page() {
        adminLoginPage.navigateTo("https://www.phptravels.net/admin");
        adminLoginPage.verifyAdminLoginPage();
    }

    @When("User enters email as {string} and password as {string}")
    public void User_enters_username_as_something_and_password_as_something(String username, String password) {
        adminLoginPage.enterEmail(username);
        adminLoginPage.enterPassword(password);
    }

    @And("^User clicks on admin login button$")
    public void user_clicks_on_admin_login_button() {
        adminLoginPage.clickLoginBtn();
    }

    @Then("Error message should be displayed")
    public void error_message_should_be_displayed() {
        adminLoginPage.verifyErrorMessage();
    }

}

