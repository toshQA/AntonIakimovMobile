package scenarios;

import static data.UserData.getEmail;
import static data.UserData.getPassword;
import static data.UserData.getUsername;

import org.testng.annotations.Test;
import pageObjects.nativeApp.BudgetActivityPage;
import pageObjects.nativeApp.LoginPage;
import pageObjects.nativeApp.RegistrationPage;
import setup.BaseTest;

public class nativeMobileTests extends BaseTest {

    @Test(groups = {"native"}, description = "Register new user and sign in")
    public void budgetActivityPageTest() throws IllegalAccessException, NoSuchFieldException, InstantiationException {
        BudgetActivityPage budgetActivityPage = new BudgetActivityPage(getDriver());
        LoginPage loginPage = new LoginPage(getDriver());
        RegistrationPage registrationPage = new RegistrationPage(getDriver());
        loginPage.openRegistrationPage();
        registrationPage.registerUser(getEmail(), getUsername(), getPassword());
        loginPage.login(getEmail(), getPassword());
        budgetActivityPage.assertBudgetActivityPageTitle();
        System.out.println("BudgetActivity page is opened");
    }

}
