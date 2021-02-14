package pages;

import org.openqa.selenium.*;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import stepDefinitions.Hooks;

import java.time.Duration;

public class Common {

    WebDriver driver = Hooks.getBrowser();
    WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));

    public void navigateTo(String url) {
        driver.navigate().to(url);
    }

    public void click(WebElement element) {
        element.click();
    }

    public void clickByJS(WebElement element) {
        ((JavascriptExecutor) driver).executeScript("arguments[0].click();", element);
    }

    public void clearText(WebElement element) {
        element.clear();
    }

    public void typeText(WebElement element, String text) {
        element.sendKeys(text);
    }

    public String getAttributeValue(WebElement element, String attribute) {
        return element.getAttribute(attribute);
    }

    public String getText(WebElement element) {
        return element.getText();
    }

    public void scrollToView(WebElement element) {
        ((JavascriptExecutor) driver).executeScript("arguments[0].scrollIntoView(true);", element);
    }

    public void acceptAlert() {
        Alert alert = driver.switchTo().alert();
        alert.accept();
    }

    public void switchToFrame(WebElement element) {
        driver.switchTo().frame(element);
    }

    public void switchToDefault() {
        driver.switchTo().defaultContent();
    }

    public void waitForElement(By locator) {
        wait.until(ExpectedConditions.visibilityOfElementLocated(locator));
    }

    public void waitForElement(WebElement element) {
        wait.until(ExpectedConditions.visibilityOf(element));
    }

}
