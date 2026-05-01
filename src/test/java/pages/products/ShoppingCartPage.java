package pages.products;

import com.microsoft.playwright.Locator;
import com.microsoft.playwright.Page;
import pages.AbstractBasePage;

import java.util.ArrayList;
import java.util.List;
import java.util.NoSuchElementException;

public class ShoppingCartPage extends AbstractBasePage<ShoppingCartPage>
{
    private String ContinueButton = "//button[@data-test='continue-shopping']";
    private String CheckoutButton = "//button[@data-test='checkout']";
    private String ShoppingCartTitle = "//span[@data-test='title']";
    private String CartQuantityLabel = "//span[@data-test='cart-quantity-label']";
    private String CartCartDescLabel = "//span[@data-test='cart-desc-label']";
    private String expectedShoppingCartPageTitle = "Your Cart";
    private String expectedCartQuantityLabel = "QTY";
    private String expectedCartDescLabel = "Description";

    private final Locator itemRoot;

    public ShoppingCartPage(Page page) {
        super(page);
        this.itemRoot = page.locator("//div[@data-test='inventory-item']");
    }


    public int getProductsCount() {
        return itemRoot.count();
    }

    public String getShoppingCartPageTitle() {
        return page.locator(ShoppingCartTitle).textContent();
    }
    public String getCartQuantityLabel() {
        return page.locator(CartQuantityLabel).textContent();
    }
    public String getCartDescLabel() {
        return page.locator(CartCartDescLabel).textContent();
    }

    public List<ShoppingCartItem> getAllProducts() {
        List<ShoppingCartItem> productCards = new ArrayList<>();
        int count = getProductsCount();

        for (int i = 0; i < count; i++) {
            productCards.add(new ShoppingCartItem(itemRoot.nth(i)));
        }

        return productCards;
    }

    public ShoppingCartItem getProductCardByName(String name) {
        int count = getProductsCount();

        for (int i = 0; i < count; i++) {
            ShoppingCartItem shoppingCartItem = new ShoppingCartItem(itemRoot.nth(i));

            if (shoppingCartItem.getProductCardData().getCardTitle().equals(name)) {
                return shoppingCartItem;
            }
        }

        throw new NoSuchElementException(String.format("Товар з назвою '%s' відсутній у кошику", name));
    }

}
