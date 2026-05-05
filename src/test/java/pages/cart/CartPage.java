package pages.cart;

import com.microsoft.playwright.Page;
import pages.AbstractPageWithBurgerMenuAndCart;
import pages.checkout.CheckoutInformationPage;

public class CartPage extends AbstractPageWithBurgerMenuAndCart<CartPage> {

    private final String cartItem = "//div[@data-test='cart-list']//div[@data-test='inventory-item']";
    private final String checkoutButton = "//button[@data-test='checkout']";

    public CartPage(Page page) {
        super(page);
    }

    @Override
    public String getExpectedPageTitle() {
        return "Your Cart";
    }

    public int getProductsInCartCount() {
        return page.locator(cartItem).count();
    }

    public CheckoutInformationPage clickCheckout() {
        page.locator(checkoutButton).click();

        return new CheckoutInformationPage(page);
    }
}
