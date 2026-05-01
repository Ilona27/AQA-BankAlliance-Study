package testCases;

import enums.AuthCreds;
import org.testng.annotations.Test;
import pages.SauceDemoLoginPage;
import pages.products.ProductCardData;
import pages.products.ProductsPage;
import pages.products.ShoppingCartPage;

import static org.assertj.core.api.Assertions.assertThat;

public class TestShoppingCart extends BaseUiTest{

    ProductCardData testProductCard = new ProductCardData("Sauce Labs Backpack","carry.allTheThings() with the sleek, streamlined Sly Pack " +
            "that melds uncompromising style with unequaled laptop and tablet protection.", "$29.99","1");

    @Test
    public void verifySuccessLoginSauceDemoTest() {
        SauceDemoLoginPage sauceDemoLoginPage = new SauceDemoLoginPage(page);
        ProductsPage productsPage = sauceDemoLoginPage
                .openLoginPage()
                .setUserName(AuthCreds.STANDART_USER.getLoginUserName())
                .setPassword(AuthCreds.STANDART_USER.getPassword())
                .loginSauceDemo();
        productsPage.addProductbyName(testProductCard.getCardTitle());
        ShoppingCartPage shoppingCartPage = productsPage.OpenShoppingCartPage();
        shoppingCartPage.getShoppingCartPageTitle();

        int numberOfProducts = shoppingCartPage.getAllProducts().size();
        assertThat(numberOfProducts).isEqualTo(1);

        String productName = shoppingCartPage.getAllProducts().get(0).getProductCardName();
        assertThat(productName)
                .isEqualTo(testProductCard.getCardTitle());

        String productDescription = shoppingCartPage.getAllProducts().get(0).getProductCardDescription();
        assertThat(productDescription)
                .isEqualTo(testProductCard.getCardDescription());

        String productPrice = shoppingCartPage.getAllProducts().get(0).getProductCardPrice();
        assertThat(productPrice).isEqualTo(testProductCard.getCardPrice());

        String productCount = shoppingCartPage.getAllProducts().get(0).getProductCardCount();
        assertThat(productCount).isEqualTo(testProductCard.getCardCount());

    }

}
