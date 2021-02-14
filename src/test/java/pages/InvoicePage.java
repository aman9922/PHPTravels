package pages;

import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.pagefactory.AjaxElementLocatorFactory;

public class InvoicePage extends Common {

    @FindBy(xpath = "//h4[text()='Your booking status is Unpaid']")
    WebElement unpaidBookingStatus;
    @FindBy(xpath = "//button[text()='Pay on Arrival']")
    WebElement payOnArrival;
    @FindBy(xpath = "//h4[text()='Your booking status is Reserved']")
    WebElement reservedBookingStatus;
    By confirmationMessage = By.xpath("//h4[text()='Your booking status is Reserved']");

    public InvoicePage() {
        PageFactory.initElements(new AjaxElementLocatorFactory(driver, 30), this);
    }

    public void verifyUnpaidBookingStatus() {
        Assert.assertTrue(unpaidBookingStatus.isDisplayed());
    }

    public void clickPayOnArrivalBtn() {
        click(payOnArrival);
        acceptAlert();
    }

    public void verifyReservedBookingStatus() {
        waitForElement(confirmationMessage);
        Assert.assertTrue("Booking not confirmed", reservedBookingStatus.isDisplayed());
    }

}
