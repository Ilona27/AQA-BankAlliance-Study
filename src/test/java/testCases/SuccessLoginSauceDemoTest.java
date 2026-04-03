package testCases;

import org.assertj.core.api.Assertions;
import org.testng.annotations.Test;
import pages.SauceDemoLoginPage;
import pages.products.ProductsPage;

public class SuccessLoginSauceDemoTest extends BaseUiTest {

    @Test
    public void verifySuccessLoginSauceDemoTest() {
        SauceDemoLoginPage sauceDemoLoginPage = new SauceDemoLoginPage(page);
        sauceDemoLoginPage
                .openLoginPage()
                .setUserName("standard_user")
                .setPassword("secret_sauce")
                .loginSauceDemo();
        String url = page.url();
        Assertions.assertThat(url)
                .isEqualTo("https://www.saucedemo.com/inventory.html");
    }
}
