package scenarios;

import static data.SearchRequest.getRequest;
import static org.testng.Assert.assertTrue;

import com.google.common.collect.ImmutableMap;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.Test;
import pageObjects.webApp.GoogleMainPage;
import pageObjects.webApp.SearchResultPage;
import setup.BaseTest;

public class webMobileTests extends BaseTest {

    @Test(groups = {"web"}, description = "EPAM search results in Google")
    public void findEpamInGoogleTest() throws InterruptedException {
        GoogleMainPage googleMainPage = new GoogleMainPage(getDriver());
        SearchResultPage searchResultPage = new SearchResultPage(getDriver());
        getDriver().get("https://www.google.com/");

        new WebDriverWait(getDriver(), 10).until(
            wd -> ((JavascriptExecutor) wd).executeScript("return document.readyState").equals("complete")
        );
        googleMainPage.searchRequest(getRequest());
        getDriver().executeScript("mobile: performEditorAction", ImmutableMap.of("action", "search"));
        assertTrue(searchResultPage.getSearchResultHeaderStrings(searchResultPage.getSearchResultHeaderElements())
                                   .stream().allMatch(s -> s.contains(getRequest())));

        assertTrue(searchResultPage
            .getSearchResultDescriptionStrings(searchResultPage.getSearchResultDescriptionElements())
            .stream().allMatch(s -> s.contains(getRequest())));
    }
}
