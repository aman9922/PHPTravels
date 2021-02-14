package stepDefinitions;

import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import pages.AdminHomePage;

public class AdminHomeSteps {
    AdminHomePage adminHomePAge = new AdminHomePage();

    @Then("User will be on home page")
    public void user_Will_Be_On_HomePage() {
        adminHomePAge.verifyHomePage();
    }

    @When("User clicks on Hotel left tab and clicks {string} option")
    public void User_Clicks_On_Hotel_Left_Tab_And_Click_Option(String option) {
        adminHomePAge.clickHotelLeftTab();
        adminHomePAge.clickOnOption(option);
    }

}
