package testCases;

import org.assertj.core.api.Assertions;
import org.testng.annotations.Test;
import pages.SauceDemoLoginPage;
import pages.products.ProductCardData;
import pages.products.ProductDetailsPage;
import pages.products.ProductsPage;

public class VitaProductDetailsTest extends BaseUiTest {

    @Test
    public void verifyProductDetailsMatchesProductCardData() {
        String productName = "Sauce Labs Backpack";

        ProductsPage productsPage = new SauceDemoLoginPage(page)
                .openLoginPage()
                .setUserName("standard_user")
                .setPassword("secret_sauce")
                .loginSauceDemo();

        ProductCardData expectedProductData = productsPage
                .getProductCardByName(productName)
                .getProductCardData();

        ProductDetailsPage productDetailsPage = productsPage.openProductDetailsByName(productName);
        ProductCardData actualProductData = productDetailsPage.getProductCardData();

        Assertions.assertThat(actualProductData)
                .usingRecursiveComparison()
                .isEqualTo(expectedProductData);
    }
}
