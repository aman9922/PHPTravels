package pages;


import org.junit.Assert;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.pagefactory.AjaxElementLocatorFactory;

public class AccountPage extends Common {

    @FindBy(xpath = "//h3[text()='Hi, Demo User']")
    WebElement userName;
    @FindBy(xpath = "//a[text()='My Profile']")
    WebElement myProfile;
    @FindBy(css = "[name='phone']")
    WebElement phone;
    @FindBy(css = "#profilefrm [type='submit']")
    WebElement submitBtn;

    public AccountPage() {
        PageFactory.initElements(new AjaxElementLocatorFactory(driver, 30), this);
    }

    public void verifyAccountPageLoaded() {
        Assert.assertEquals("Account page is not loaded properly", "Hi, Demo User", getText(userName));
    }

    public void clickOnMyProfileLeftTab() {
        clickByJS(myProfile);
    }

    public void enterPhoneNumber(String number) {
        clearText(phone);
        typeText(phone, number);
    }

    public void verifyPhoneNumber(String number) {
        Assert.assertEquals("Phone number is not updated", number, getAttributeValue(phone, "value"));
    }

    public void clickSubmitButton() {
        click(submitBtn);
    }

}
