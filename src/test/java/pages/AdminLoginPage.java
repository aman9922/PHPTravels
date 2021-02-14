package pages;


import org.junit.Assert;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.pagefactory.AjaxElementLocatorFactory;

public class AdminLoginPage extends Common {
    @FindBy(css = "[name='email']")
    WebElement emailTxtBox;
    @FindBy(css = "[name='password']")
    WebElement passwordTxtBox;
    @FindBy(css = "[type='submit']")
    WebElement loginBtn;
    @FindBy(xpath = "//div[text()='Invalid Login Credentials']")
    WebElement errorMessage;

    public AdminLoginPage() {
        PageFactory.initElements(new AjaxElementLocatorFactory(driver, 30), this);
    }

    public void enterEmail(String email) {
        clearText(emailTxtBox);
        typeText(emailTxtBox, email);
    }

    public void enterPassword(String password) {
        clearText(passwordTxtBox);
        typeText(passwordTxtBox, password);
    }

    public void clickLoginBtn() {
        click(loginBtn);
    }

    public void verifyErrorMessage() {
        waitForElement(errorMessage);
        Assert.assertEquals("Error message not displayed", "Invalid Login Credentials", getText(errorMessage));
    }

    public void verifyAdminLoginPage() {
        waitForElement(loginBtn);
        Assert.assertTrue("User is not in admin login page", loginBtn.isDisplayed());
    }

}
