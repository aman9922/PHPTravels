package pages;

import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.pagefactory.AjaxElementLocatorFactory;

public class AdminHotels extends Common {


    @FindBy(xpath = "//div[text()='Hotels Management']")
    WebElement hotelsManagement;
    @FindBy(css = "[type='submit']")
    WebElement add;
    @FindBy(css = "[name='hotelname']")
    WebElement hotelName;
    @FindBy(id = "mapaddress")
    WebElement mapaddress;
    @FindBy(id = "latitude")
    WebElement latitude;
    @FindBy(id = "longitude")
    WebElement longitude;
    @FindBy(id = "add")
    WebElement submit;
    @FindBy(css = "[href='#FACILITIES']")
    WebElement facilitiesTab;
    @FindBy(css = "[name='checkintime']")
    WebElement checkIntime;
    @FindBy(css = "[name='checkouttime']")
    WebElement checkOutTime;
    @FindBy(id = "s2id_autogen2")
    WebElement paymentOptions;
    @FindBy(css = "[href='#POLICY']")
    WebElement policyTab;
    @FindBy(css = "[name='hotelpolicy']")
    WebElement policy;
    @FindBy(css = "[href='#CONTACT']")
    WebElement contactTab;
    @FindBy(css = "[name='hotelemail']")
    WebElement hotelEmail;
    @FindBy(css = "[name='hotelwebsite']")
    WebElement hotelWebsite;
    @FindBy(css = "[name='hotelphone']")
    WebElement hotelPhone;
    @FindBy(css = "[href='#TRANSLATE']")
    WebElement translateTab;
    @FindBy(css = "#cke_1_contents iframe")
    WebElement descFrame;
    @FindBy(tagName = "body")
    WebElement body;
    @FindBy(css = "[href='#META_INFO']")
    WebElement metaInfoTab;
    @FindBy(css = "[name='hotelmetatitle']")
    WebElement metaTitle;
    @FindBy(css = "[name='hotelkeywords']")
    WebElement metaKeywords;
    @FindBy(css = "[name='hotelmetadesc']")
    WebElement metaDesc;
    @FindBy(xpath = "//span[text()='Enter Location']")
    WebElement location;
    @FindBy(css = "#select2-drop input")
    WebElement locationTextBox;
    @FindBy(xpath = "//div[text()='Rooms Management']")
    WebElement roomsManagement;
    @FindBy(css = "[placeholder='Price']")
    WebElement priceEle;
    @FindBy(xpath = "//span[text()='Room Type']")
    WebElement roomTypeDD;
    @FindBy(css = "[placeholder='Quantity']")
    WebElement quantityTxtBox;
    @FindBy(css = "[name='minstay']")
    WebElement minStayTxtBox;
    @FindBy(css = "[name='adults']")
    WebElement adultsTxtBox;//
    @FindBy(id = "s2id_autogen3")
    WebElement hotelDD;
    @FindBy(xpath = "//h4[contains(text(),'Changes Saved!')]")
    WebElement changesSaved;
    By changesSavedBanner = By.xpath("//h4[contains(text(),'Changes Saved!')]");
    String facilities = "//*[contains(text(),'%s')]";
    String paymentOption = "//*[contains(text(),'%s')]";
    String languageLocator = "//div[contains(text(),'%s')]/..";
    String hotelNameLocator = "//input[@placeholder='Hotel Name']";
    String iframeLocator = "//iframe";
    String titleLocator = "//input[@placeholder='Title']";
    String keywordsLocator = "//*[@placeholder='Keywords']";
    String descLocator = "//*[@placeholder='Description']";
    String policyLocator = "//*[@placeholder='Policy...']";
    String hotelLocation = "//span[text()='%s']";
    String hotelRoomType = "//div[text()='%s']";
    String hotelNameLoc = "//div[contains(text(),'%s')]";

    public AdminHotels() {
        PageFactory.initElements(new AjaxElementLocatorFactory(driver, 30), this);
    }

    public void verifyHotelsPage() {
        Assert.assertTrue(hotelsManagement.isDisplayed());
    }

    public void clickAddBtn() {
        clickByJS(add);
    }

    public void enterHotelName(String hotelname) {
        clearText(hotelName);
        typeText(hotelName, hotelname);
    }

    public void enterHotelDescription(String hotelDesc) {
        switchToFrame(descFrame);
        clearText(body);
        typeText(body, hotelDesc);
        switchToDefault();
    }

    public void enterAddressOnMap(String address) {
        clearText(mapaddress);
        typeText(mapaddress, address);
    }

    public void enterLatitude(String lat) {
        clearText(latitude);
        typeText(latitude, lat);
    }

    public void enterLongitude(String longi) {
        clearText(longitude);
        typeText(longitude, longi);
    }

    public void clickFacilitiesTab() {
        clickByJS(facilitiesTab);
    }

    public void selectFacilities(String facilityNames) {
        String[] facilityNameArr = facilityNames.split("\\|");
        for (String name :
                facilityNameArr) {
            clickByJS(driver.findElement(By.xpath(String.format(facilities, name))));
        }
    }

    public void clickPolicyTab() {
        click(policyTab);
    }

    public void enterCheckIn(String checkInTime) {
        clearText(checkIntime);
        typeText(checkIntime, checkInTime);
    }

    public void enterCheckout(String checkoutTime) {
        clearText(checkOutTime);
        typeText(checkOutTime, checkoutTime);
    }

    public void selectPaymentOptions(String options) {

        String[] optionArr = options.split("\\|");
        for (String option :
                optionArr) {
            click(paymentOptions);
            click(driver.findElement(By.xpath(String.format(paymentOption, option))));
        }
    }

    public void enterPolicy(String policyText) {
        clearText(policy);
        typeText(policy, policyText);
    }

    public void clickContactTab() {
        click(contactTab);
    }

    public void enterHotelEmail(String email) {
        clearText(hotelEmail);
        typeText(hotelEmail, email);
    }

    public void enterHotelWebsite(String website) {
        clearText(hotelWebsite);
        typeText(hotelWebsite, website);
    }

    public void enterHotelPhone(String phone) {
        clearText(hotelPhone);
        typeText(hotelPhone, phone);
    }

    public void clickTranslationTab() {
        click(translateTab);
    }

    public void clickOnMetaTab() {
        clickByJS(metaInfoTab);
    }

    public void enterMeteTitle(String title) {
        clearText(metaTitle);
        typeText(metaTitle, title);
    }

    public void enterMeteKeywords(String keywords) {
        clearText(metaKeywords);
        typeText(metaKeywords, keywords);
    }

    public void enterMeteDesc(String desc) {
        clearText(metaDesc);
        typeText(metaDesc, desc);
    }

    public void handleTranslationTab(String hotelName, String hotelDesc, String metaTitle, String metaKeywords, String metaDesc, String policyAndTerms, String language) {
        String languageToSelect = String.format(languageLocator, language);
        WebElement tr_hotelName = driver.findElement(By.xpath(languageToSelect + hotelNameLocator));
        WebElement tr_iframe = driver.findElement(By.xpath(languageToSelect + iframeLocator));
        WebElement tr_title = driver.findElement(By.xpath(languageToSelect + titleLocator));
        WebElement tr_keywords = driver.findElement(By.xpath(languageToSelect + keywordsLocator));
        WebElement tr_desc = driver.findElement(By.xpath(languageToSelect + descLocator));
        WebElement tr_policy = driver.findElement(By.xpath(languageToSelect + policyLocator));
        clearText(tr_hotelName);
        typeText(tr_hotelName, hotelName);
        switchToFrame(tr_iframe);
        typeText(driver.findElement(By.xpath("//body")), hotelDesc);
        switchToDefault();
        clearText(tr_title);
        typeText(tr_title, metaTitle);
        clearText(tr_keywords);
        typeText(tr_keywords, metaKeywords);
        clearText(tr_desc);
        typeText(tr_desc, metaDesc);
        clearText(tr_policy);
        typeText(tr_policy, policyAndTerms);
    }

    public void clickSubmitButton() {
        clickByJS(submit);
    }

    public void verifySavedChanges() {
        waitForElement(changesSavedBanner);
        Assert.assertTrue("Changes are not saved properly", changesSaved.isDisplayed());
    }


    public void enterLocation(String loc) {
        click(location);
        typeText(locationTextBox, loc);
        click(driver.findElement(By.xpath(String.format(hotelLocation, loc))));
    }

    public void verifyRoomsPage() {
        click(roomsManagement);
    }

    public void enterRoomDesc(String RoomDesc) {
        switchToFrame(descFrame);
        clearText(body);
        typeText(body, RoomDesc);
        switchToDefault();
    }

    public void enterPrice(String price) {
        typeText(priceEle, price);
    }

    public void enterRoomType(String roomType) {

        click(roomTypeDD);
        click(driver.findElement(By.xpath(String.format(hotelRoomType, roomType))));
    }

    public void enterQuantity(String quantity) {
        typeText(quantityTxtBox, quantity);
    }

    public void enterMinStay(String minStay) {
        typeText(minStayTxtBox, minStay);
    }

    public void enterMaximumAdults(String maxAdults) {
        typeText(adultsTxtBox, maxAdults);
    }

    public void selectHotel(String hotelName) {
        click(hotelDD);
        click(driver.findElement(By.xpath(String.format(hotelNameLoc, hotelName))));
    }

}



