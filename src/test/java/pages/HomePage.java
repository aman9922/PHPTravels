package pages;


import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.pagefactory.AjaxElementLocatorFactory;

public class HomePage extends Common {

    @FindBy(xpath = "(//a[@id='dropdownCurrency'])[2]")
    WebElement myAccount;
    @FindBy(xpath = "//a[text()='Login']")
    WebElement login;
    @FindBy(xpath = "//div[@id='select2-drop']//input")
    WebElement searchBox;
    @FindBy(id = "checkin")
    WebElement checkInTxtBox;
    @FindBy(id = "checkout")
    WebElement checkOutTxtBox;
    @FindBy(css = "#hotels [type='submit']")
    WebElement submit;
    @FindBy(xpath = "//span[text()='Search by Hotel or City Name']")
    WebElement searchBoxText;
    String hotelNameLocator = "//li//*[contains(text(),'%s')]";

    public HomePage() {
        PageFactory.initElements(new AjaxElementLocatorFactory(driver, 30), this);
    }

    public void navigateToHomepage() {
        navigateTo("https://www.phptravels.net/");
    }

    public void clickOnMyAccount() {
        click(myAccount);
    }

    public void clickOnLogin() {
        click(login);
    }

    public void enterTextInSearchBox(String hotelName) {
        click(searchBoxText);
        typeText(searchBox, hotelName);
    }

    public void clickOnDropdownList(String hotelName) {
        WebElement option = driver.findElement(By.xpath(String.format(hotelNameLocator, hotelName)));
        click(option);
    }

    public void verifyHotelNameIsVisibleInList(String hotelName) {
        WebElement option = driver.findElement(By.xpath(String.format(hotelNameLocator, hotelName)));
        Assert.assertTrue("Hotel name not present in the list", option.isDisplayed());
    }

    public void clickOnSubmitBtn() {
        clickByJS(submit);
    }

    public void enterCheckInAndCheckoutDate(String checkin, String checkout) {
        clearText(checkInTxtBox);
        typeText(checkInTxtBox, checkin);
        clearText(checkOutTxtBox);
        typeText(checkOutTxtBox, checkout);
    }

    public void verifyHomepage() {
        Assert.assertTrue("User is not in homepage", submit.isDisplayed());
    }

}
