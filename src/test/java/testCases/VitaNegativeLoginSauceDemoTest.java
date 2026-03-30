package testCases;

import org.assertj.core.api.Assertions;
import org.testng.annotations.Test;
import pages.SauceDemoLoginPage;

public class VitaNegativeLoginSauceDemoTest extends BaseUiTest {

    @Test
    public void verifyLoginFailsWhenPasswordEnteredWithoutUsername() {
        SauceDemoLoginPage sauceDemoLoginPage = new SauceDemoLoginPage(page);

        sauceDemoLoginPage
                .openLoginPage()
                .setPassword("secret_sauce")
                .loginSauceDemo();

        // When username is empty, SauceDemo shows this validation message.
        String errorMessage = sauceDemoLoginPage.getErrorMessage();
        Assertions.assertThat(errorMessage)
                .isEqualTo("Epic sadface: Username is required");
    }
}

