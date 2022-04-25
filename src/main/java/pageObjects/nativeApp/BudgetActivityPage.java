package pageObjects.nativeApp;

import static org.testng.Assert.assertTrue;

import io.appium.java_client.AppiumDriver;
import io.appium.java_client.pagefactory.AndroidFindBy;
import io.appium.java_client.pagefactory.AppiumFieldDecorator;
import io.appium.java_client.pagefactory.iOSXCUITFindBy;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.PageFactory;
import pageObjects.BaseNativePageObject;

public class BudgetActivityPage extends BaseNativePageObject {

    @AndroidFindBy(xpath = "//android.widget.TextView[@text='BudgetActivity']")
    @iOSXCUITFindBy(xpath = "//XCUIElementTypeStaticText[@label='Budget']")
    WebElement budgetActivityPageTitle;

    public BudgetActivityPage(AppiumDriver appiumDriver) {
        super(appiumDriver);
        PageFactory.initElements( new AppiumFieldDecorator(appiumDriver), this);
    }

    public void assertBudgetActivityPageTitle() {
        assertTrue(budgetActivityPageTitle.isDisplayed());
    }
}
