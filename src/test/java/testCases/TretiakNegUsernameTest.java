package testCases;

import org.assertj.core.api.Assertions;
import org.testng.annotations.Test;
import pages.SauceDemoLoginPage;

public class TretiakNegUsernameTest extends BaseUiTest {
    @Test
    public void loginWithBlockedUser() {
        SauceDemoLoginPage sauceDemoLoginPage = new SauceDemoLoginPage(page);

        sauceDemoLoginPage
                .openLoginPage()
                .setUserName("locked_out_user")
                .setPassword("secret_sauce")
                .loginSauceDemo();

        // Если использовать логин "locked_out_user" - ошибка валидаци, что юзер заблочен.
        String errorMessage = sauceDemoLoginPage.getErrorMessage();
        Assertions.assertThat(errorMessage)
                .isNotBlank()
                .contains("Epic sadface: Sorry, this user has been locked out.");
    }
}

