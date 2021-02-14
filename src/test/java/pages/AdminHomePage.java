package pages;

import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.pagefactory.AjaxElementLocatorFactory;

public class AdminHomePage extends Common {

    @FindBy(css = "[href='#Hotels']")
    WebElement hotelsLeftTab;
    @FindBy(xpath = "//p[text()='DASHBOARD']")
    WebElement dashboardText;
    String hotelOptions = "//*[@id='Hotels']//a[text()='%s']";

    public AdminHomePage() {
        PageFactory.initElements(new AjaxElementLocatorFactory(driver, 30), this);
    }

    public void verifyHomePage() {
        waitForElement(dashboardText);
        Assert.assertTrue("Dashboard is not loaded properly", dashboardText.isDisplayed());
    }

    public void clickHotelLeftTab() {
        click(hotelsLeftTab);
    }

    public void clickOnOption(String option) {
        click(driver.findElement(By.xpath(String.format(hotelOptions, option))));
    }

}
