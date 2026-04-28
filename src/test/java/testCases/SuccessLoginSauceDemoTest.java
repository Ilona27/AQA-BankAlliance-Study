package testCases;

import enums.AuthCreds;
import org.assertj.core.api.Assertions;
import org.testng.annotations.Test;
import pages.SauceDemoLoginPage;
import pages.products.ProductsPage;

public class SuccessLoginSauceDemoTest extends BaseUiTest {

    @Test
    public void verifySuccessLoginSauceDemoTest() {
        SauceDemoLoginPage sauceDemoLoginPage = new SauceDemoLoginPage(page);
        ProductsPage productsPage = sauceDemoLoginPage
                .openLoginPage()
                .setUserName(AuthCreds.STANDART_USER.getLoginUserName())
                .setPassword(AuthCreds.STANDART_USER.getPassword())
                .loginSauceDemo();
        String url = page.url();
        Assertions.assertThat(url)
                .isEqualTo("https://www.saucedemo.com/inventory.html");

        verifyPageTitle(productsPage);
    }
}
