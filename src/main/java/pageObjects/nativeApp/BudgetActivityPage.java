package pageObjects.nativeApp;

import static org.testng.Assert.assertTrue;

import io.appium.java_client.AppiumDriver;
import io.appium.java_client.pagefactory.AndroidFindBy;
import io.appium.java_client.pagefactory.AppiumFieldDecorator;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.PageFactory;
import pageObjects.BaseNativePageObject;

public class BudgetActivityPage extends BaseNativePageObject {

    @AndroidFindBy(xpath = "//android.widget.TextView[@text='BudgetActivity']")
    WebElement budgetActivityPageTitle;

    public BudgetActivityPage(AppiumDriver appiumDriver) {
        super(appiumDriver);
        PageFactory.initElements( new AppiumFieldDecorator(appiumDriver), this);
    }

    public void assertBudgetActivityPageTitle() {
        assertTrue(budgetActivityPageTitle.isDisplayed());
    }
}
