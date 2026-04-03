package pages.products;

import com.microsoft.playwright.Page;
import pages.AbstractBasePage;

public class ProductDetailsPage extends AbstractBasePage {

    private String productTitleLocator = "//div[@data-test='inventory-item-name']";
    private String productDescriptionLocator = "//div[@data-test='inventory-item-desc']";
    private String productPriceLocator = "//div[@data-test='inventory-item-price']";

    public ProductDetailsPage(Page page) {
        super(page);
    }

    public String getProductTitle() {
        return page.locator(productTitleLocator).textContent();
    }

    public String getProductDescription() {
        return page.locator(productDescriptionLocator).textContent();
    }

    public String getProductPrice() {
        return page.locator(productPriceLocator).textContent();
    }

    public ProductCardData getProductCardData() {
        return ProductCardData
                .builder()
                .cardTitle(getProductTitle())
                .cardDescription(getProductDescription())
                .cardPrice(getProductPrice())
                .build();
    }
}
