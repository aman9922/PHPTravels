package stepDefinitions;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import pages.LoginPage;

public class LoginSteps {

    LoginPage loginPage = new LoginPage();

    @Given("User calculated {int}\\/{int}")
    public void user_calculated(Integer int1, Integer int2) {
        System.out.println("  I am inside given");
    }


    @When("User enters username as {string} and password as {string}")
    public void user_enters_valid_username_and_password(String userName, String password) {
        loginPage.enterEmail(userName);
        loginPage.enterPassword(password);
    }

    @When("User clicks on login button")
    public void clicks_on_login_button() {
        loginPage.clickLoginBtn();
    }

    @Then("Error message should displayed")
    public void error_message_should_displayed() {
        loginPage.verifyErrorMessage();
    }

}
