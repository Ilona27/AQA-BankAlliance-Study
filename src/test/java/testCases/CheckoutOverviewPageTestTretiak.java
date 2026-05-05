package testCases;

import enums.AuthCreds;
import org.assertj.core.api.Assertions;
import org.testng.annotations.Test;
import pages.SauceDemoLoginPage;
import pages.cart.CartPage;
import pages.checkout.CheckoutInformationPage;
import pages.checkout.CheckoutOverviewPage;
import pages.products.ProductsPage;

public class CheckoutOverviewPageTestTretiak extends BaseUiTest {

    @Test
    public void verifyCheckoutOverviewPageAfterFillingCheckoutForm() {
        SauceDemoLoginPage sauceDemoLoginPage = new SauceDemoLoginPage(page);

        ProductsPage productsPage = sauceDemoLoginPage
                .openLoginPage()
                .setUserName(AuthCreds.STANDART_USER.getLoginUserName())
                .setPassword(AuthCreds.STANDART_USER.getPassword())
                .loginSauceDemo();
        verifyPageTitle(productsPage);

        productsPage.getProductCardByName("Sauce Labs Backpack").addProductToCart();
        Assertions.assertThat(productsPage.getCartProductsCount())
                .as("Кількість товарів у кошику повинна бути 1")
                .isEqualTo(1);

        CartPage cartPage = productsPage.openCartPage();
        verifyPageTitle(cartPage);
        Assertions.assertThat(cartPage.getProductsInCartCount())
                .as("Кількість товарів на сторінці cart повинна бути 1")
                .isEqualTo(1);

        CheckoutInformationPage checkoutInformationPage = cartPage.clickCheckout();
        verifyPageTitle(checkoutInformationPage);

        CheckoutOverviewPage checkoutOverviewPage = checkoutInformationPage
                .setFirstName("Kolya")
                .setLastName("Tretiak")
                .setPostalCode("01001")
                .clickContinue();

        verifyPageTitle(checkoutOverviewPage);
        Assertions.assertThat(checkoutOverviewPage.getProductsInCheckoutCount())
                .as("Кількість товарів на сторінці checkout overview повинна бути 1")
                .isEqualTo(1);
        Assertions.assertThat(checkoutOverviewPage.getPaymentInfoValue())
                .as("Блок Payment Information не повинен бути порожнім")
                .isNotBlank();
        Assertions.assertThat(checkoutOverviewPage.getShippingInfoValue())
                .as("Блок Shipping Information не повинен бути порожнім")
                .isNotBlank();
        Assertions.assertThat(checkoutOverviewPage.getTotalValue())
                .as("Total має бути більшим за 0")
                .isGreaterThan(0.0);
    }
}
