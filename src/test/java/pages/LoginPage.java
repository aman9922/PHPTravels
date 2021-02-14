package pages;


import org.junit.Assert;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.pagefactory.AjaxElementLocatorFactory;

public class LoginPage extends Common {

    @FindBy(css = "[name='username']")
    WebElement emailTxtBox;
    @FindBy(css = "[name='password']")
    WebElement passwordTxtBox;
    @FindBy(xpath = "//button[text()='Login']")
    WebElement loginBtn;
    @FindBy(xpath = "//div[text()='Invalid Email or Password']")
    WebElement errorMessage;

    public LoginPage() {
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
        Assert.assertEquals("Invalid credentials error message not displayed", getText(errorMessage), "Invalid Email or Password");
    }

}
