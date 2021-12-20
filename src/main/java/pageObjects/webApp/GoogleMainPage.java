package pageObjects.webApp;

import io.appium.java_client.AppiumDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import pageObjects.WebPageObject;

public class GoogleMainPage extends WebPageObject {

    @FindBy(xpath = "//input[@name='q']")
    WebElement searchField;

    public GoogleMainPage(AppiumDriver appiumDriver) {
        super(appiumDriver);
    }

    public void searchEPAM(String request) {
        searchField.sendKeys(request);
    }
}
