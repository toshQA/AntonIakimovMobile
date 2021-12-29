package pageObjects.nativeApp;

import io.appium.java_client.AppiumDriver;
import io.appium.java_client.pagefactory.AndroidFindBy;
import io.appium.java_client.pagefactory.AppiumFieldDecorator;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.PageFactory;
import pageObjects.BaseNativePageObject;

public class LoginPage extends BaseNativePageObject {

    @AndroidFindBy(id = "platkovsky.alexey.epamtestapp:id/login_email")
    WebElement loginField;

    @AndroidFindBy(id = "platkovsky.alexey.epamtestapp:id/login_pwd")
    WebElement passwordField;

    @AndroidFindBy(id = "platkovsky.alexey.epamtestapp:id/email_sign_in_button")
    WebElement signInBtn;

    @AndroidFindBy(id = "platkovsky.alexey.epamtestapp:id/register_button")
    WebElement registerBtn;

    public LoginPage(AppiumDriver appiumDriver) {
        super(appiumDriver);
        PageFactory.initElements( new AppiumFieldDecorator(appiumDriver), this);
    }

    public void openRegistrationPage() {
        registerBtn.click();
    }

    public void login(String login, String password) {
        loginField.sendKeys(login);
        passwordField.sendKeys(password);
        signInBtn.click();
    }



}
