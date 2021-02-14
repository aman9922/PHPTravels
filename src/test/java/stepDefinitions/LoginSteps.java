package stepDefinitions;

import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import pages.LoginPage;

public class LoginSteps {

    LoginPage loginPage = new LoginPage();

    @When("User enters username as {string} and password as {string}")
    public void user_Enters_Valid_Username_And_Password(String userName, String password) {
        loginPage.enterEmail(userName);
        loginPage.enterPassword(password);
    }

    @When("User clicks on login button")
    public void clicks_On_Login_Button() {
        loginPage.clickLoginBtn();
    }

    @Then("Error message should displayed")
    public void error_Message_Should_Displayed() {
        loginPage.verifyErrorMessage();
    }

}
