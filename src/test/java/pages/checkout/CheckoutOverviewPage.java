package pages.checkout;

import com.microsoft.playwright.Locator;
import com.microsoft.playwright.Page;
import pages.AbstractPageWithBurgerMenuAndCart;

public class CheckoutOverviewPage extends AbstractPageWithBurgerMenuAndCart<CheckoutOverviewPage> {

    private final String cartItem = "//div[@data-test='cart-list']//div[@data-test='inventory-item']";
    private final String paymentInfoValue = "//div[@data-test='payment-info-value']";
    private final String shippingInfoValue = "//div[@data-test='shipping-info-value']";
    private final String subtotalLabel = "//div[@data-test='subtotal-label']";
    private final String taxLabel = "//div[@data-test='tax-label']";
    private final String totalLabel = "//div[@data-test='total-label']";
    private final String finishButton = "//button[@data-test='finish']";
    private final String cancelButton = "//button[@data-test='cancel']";

    public CheckoutOverviewPage(Page page) {
        super(page);
    }

    @Override
    public String getExpectedPageTitle() {
        return "Checkout: Overview";
    }

    public int getProductsInCheckoutCount() {
        return page.locator(cartItem).count();
    }

    public String getPaymentInfoValue() {
        return page.locator(paymentInfoValue).textContent();
    }

    public String getShippingInfoValue() {
        return page.locator(shippingInfoValue).textContent();
    }

    public double getSubtotalValue() {
        return extractPriceFromLabel(page.locator(subtotalLabel));
    }

    public double getTaxValue() {
        return extractPriceFromLabel(page.locator(taxLabel));
    }

    public double getTotalValue() {
        return extractPriceFromLabel(page.locator(totalLabel));
    }

    public CheckoutOverviewPage clickCancel() {
        page.locator(cancelButton).click();

        return this;
    }

    public CheckoutOverviewPage clickFinish() {
        page.locator(finishButton).click();

        return this;
    }

    private double extractPriceFromLabel(Locator locator) {
        String labelText = locator.textContent();
        String priceValue = labelText.substring(labelText.indexOf("$") + 1).trim();

        return Double.parseDouble(priceValue);
    }
}
