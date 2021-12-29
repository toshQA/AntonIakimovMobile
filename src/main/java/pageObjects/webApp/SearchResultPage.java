package pageObjects.webApp;

import io.appium.java_client.AppiumDriver;
import java.util.List;
import java.util.stream.Collectors;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import pageObjects.WebPageObject;

public class SearchResultPage extends WebPageObject {

    @FindBy(xpath = "//div[@role='heading']/div")
    List<WebElement> searchResultHeader;

    @FindBy(xpath = "//div[@data-content-feature='1']//div[contains(text(),'EPAM')]")
    List<WebElement> searchResultDescription;

    public SearchResultPage(AppiumDriver appiumDriver) {
        super(appiumDriver);
    }

    public List<WebElement> getSearchResultHeaderElements() {
        return searchResultHeader;
    }

    public List<WebElement> getSearchResultDescriptionElements() {
        return searchResultDescription;
    }

    public List<String> getSearchResultHeaderStrings(List<WebElement> searchResultHeader) {
        return searchResultHeader.stream().map(WebElement::getText).collect(Collectors.toList());
    }
    public List<String> getSearchResultDescriptionStrings(List<WebElement> searchResultDescription) {
        return searchResultDescription.stream().map(WebElement::getText).collect(Collectors.toList());
    }



}
