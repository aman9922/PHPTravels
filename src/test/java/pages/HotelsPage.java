package pages;

import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.pagefactory.AjaxElementLocatorFactory;

public class HotelsPage extends Common {

    @FindBy(css = "#detail-content-sticky-nav-02 [type='submit']")
    WebElement bookNow;
    @FindBy(xpath = "//span[text()='Personal Details']")
    WebElement personalDetails;
    @FindBy(id = "signintab")
    WebElement signintab;
    @FindBy(css = "[name='username']")
    WebElement email;
    @FindBy(css = "[name='password']")
    WebElement password;//[name="login"]
    @FindBy(css = "[name='login']")
    WebElement confirmThisBooking;
    String hotelLocator = "//h2[text()='%s']";
    String roomTypeTextBox = "//a[text()='%s']/ancestor::div[@class='room-item']//input";

    public HotelsPage() {
        PageFactory.initElements(new AjaxElementLocatorFactory(driver, 30), this);
    }

    public void verifyHotelPage(String hotelName) {
        WebElement hotel = driver.findElement(By.xpath(String.format(hotelLocator, hotelName)));
        Assert.assertTrue(hotel.isDisplayed());
    }

    public void selectRoom(String roomType) {
        WebElement select = driver.findElement(By.xpath(String.format(roomTypeTextBox, roomType)));
        scrollToView(select);
        clickByJS(select);
    }

    public void clickBookNowBtn() {
        click(bookNow);
    }

    public void verifyPersonalDetailsText() {
        Assert.assertTrue("Personal details not displayed", personalDetails.isDisplayed());
    }

    public void clickSignInTab() {
        clickByJS(signintab);
    }

    public void enterUserDetails(String emailId, String pwd) {
        typeText(email, emailId);
        typeText(password, pwd);
    }

    public void clickOnConfirmThisBooking() {
        scrollToView(confirmThisBooking);
        click(confirmThisBooking);
    }

}
