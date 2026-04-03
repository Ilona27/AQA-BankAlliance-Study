package pages.products;

import com.microsoft.playwright.Locator;
import com.microsoft.playwright.Page;
import pages.AbstractBasePage;

import java.util.ArrayList;
import java.util.List;
import java.util.NoSuchElementException;

public class ProductsPage extends AbstractBasePage<ProductsPage> {

    private String cartItemCountLocator = "//span[@data-test='shopping-cart-badge']";
    private String openCartLocator = "//a[@data-test='shopping-cart-link']";

    private final Locator itemRoot;

    public ProductsPage(Page page) {
        super(page);
        this.itemRoot = page.locator("//div[@data-test='inventory-item']");
    }

    public int getProductsCount() {
        return itemRoot.count();
    }

    public List<ProductCardItem> getAllProducts() {
        List<ProductCardItem> productCards = new ArrayList<>();
        int count = getProductsCount();

        for (int i = 0; i < count; i++) {
            productCards.add(new ProductCardItem(itemRoot.nth(i)));
        }

        return productCards;
    }

    public ProductCardItem getProductCardByName(String name) {
        int count = getProductsCount();

        for (int i = 0; i < count; i++) {
            ProductCardItem productCardItem = new ProductCardItem(itemRoot.nth(i));

            if (productCardItem.getProductCardData().getCardTitle().equals(name)) {
                return productCardItem;
            }
        }

        throw new NoSuchElementException(String.format("Товар з назвою '%s' відсутній на сторінці", name));
    }

    public int getCartItemCount() {
        String count = page.locator(cartItemCountLocator).textContent();
        return Integer.parseInt(count);
    }

    public void openProductCart() {
        page.locator(openCartLocator).click();
    }
}
