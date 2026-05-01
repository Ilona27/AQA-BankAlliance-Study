package pages.products;

import com.microsoft.playwright.Locator;

public class ShoppingCartItem {

    private final Locator root;

    private String productCardName = "xpath=.//div[@data-test='inventory-item-name']";
    private String productCardDescription = "xpath=.//div[@data-test='inventory-item-desc']";
    private String productCardPrice = "xpath=.//div[@data-test='inventory-item-price']";
    private String productCardCount = "xpath=.//div[@data-test='item-quantity']";
    private String removeProductFromBucketButton = "xpath=.//div[@data-test='remove-sauce-labs-backpack']//button";

    public ShoppingCartItem(Locator root) {
        this.root = root;
    }

    public String getProductCardName() {
        return root.locator(productCardName).textContent();
    }

    public String getProductCardDescription() {
        return root.locator(productCardDescription).textContent();
    }

    public String getProductCardPrice() {
        return root.locator(productCardPrice).textContent();
    }

    public String getProductCardCount() {
        return root.locator(productCardCount).textContent();
    }

    public void removeProductFromBucket() {
        root.locator(removeProductFromBucketButton).click();
    }

    public ProductCardData getProductCardData() {
        return ProductCardData
                .builder()
                .cardTitle(getProductCardName())
                .cardDescription(getProductCardDescription())
                .cardPrice(getProductCardPrice())
                .cardCount(getProductCardCount())
                .build();
    }
}
