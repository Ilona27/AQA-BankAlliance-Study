package pages.products;

import com.microsoft.playwright.Locator;

public class ProductCardItem {

    private final Locator root;

    private String productCardName = "xpath=.//div[@data-test='inventory-item-name']";
    private String productCardDescription = "xpath=.//div[@data-test='inventory-item-desc']";
    private String productCardPrice = "xpath=.//div[@data-test='inventory-item-price']";
    private String addProductToCardButtonLocator = "xpath=.//div[@class='pricebar']//button";

    public ProductCardItem(Locator root) {
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

    public void addProductToCart() {
         root.locator(addProductToCardButtonLocator).click();
    }

    public ProductCardData getProductCardData() {
        return ProductCardData
                .builder()
                .cardTitle(getProductCardName())
                .cardDescription(getProductCardDescription())
                .cardPrice(getProductCardPrice())
                .build();
    }

    public void openProductDetails() {
        root.locator(productCardName).click();
    }
}
