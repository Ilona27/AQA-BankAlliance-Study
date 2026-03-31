package testCases;

import org.assertj.core.api.Assertions;
import org.testng.annotations.Test;
import pages.SauceDemoLoginPage;

public class WrongLoginSauceDemoTest extends BaseUiTest
{
    @Test
    public void verifyLoginWithoutPasswordTest() {
        SauceDemoLoginPage sauceDemoLoginPage = new SauceDemoLoginPage(page);
        sauceDemoLoginPage
                .openLoginPage()
                .setUserName("standard_user")
                .loginSauceDemo();
        String error = sauceDemoLoginPage.getErrorMessage();
        Assertions.assertThat(error)
                .isEqualTo("Epic sadface: Password is required");
    }
    @Test
    public void verifyLoginWithoutUsernameTest() {
        SauceDemoLoginPage sauceDemoLoginPage = new SauceDemoLoginPage(page);
        sauceDemoLoginPage
                .openLoginPage()
                .setPassword("secret_sauce")
                .loginSauceDemo();
        String error = sauceDemoLoginPage.getErrorMessage();
        Assertions.assertThat(error)
                .isEqualTo("Epic sadface: Username is required");
    }
    @Test
    public void verifyLoginWithWrongCredTest() {
        SauceDemoLoginPage sauceDemoLoginPage = new SauceDemoLoginPage(page);
        sauceDemoLoginPage
                .openLoginPage()
                .setUserName("null")
                .setPassword("null")
                .loginSauceDemo();
        String error = sauceDemoLoginPage.getErrorMessage();
        Assertions.assertThat(error)
                .isEqualTo("Epic sadface: Username and password do not match any user in this service");
    }
    @Test
    public void verifyLoginWithLockedUserTest() {
        SauceDemoLoginPage sauceDemoLoginPage = new SauceDemoLoginPage(page);
        sauceDemoLoginPage
                .openLoginPage()
                .setUserName("locked_out_user")
                .setPassword("secret_sauce")
                .loginSauceDemo();
        String error = sauceDemoLoginPage.getErrorMessage();
        Assertions.assertThat(error)
                .isEqualTo("Epic sadface: Sorry, this user has been locked out.");
    }
}
