package pages.checkout;

import com.microsoft.playwright.Page;
import pages.AbstractPageWithBurgerMenuAndCart;

public class CheckoutInformationPage extends AbstractPageWithBurgerMenuAndCart<CheckoutInformationPage> {

    private final String firstNameInput = "//input[@data-test='firstName']";
    private final String lastNameInput = "//input[@data-test='lastName']";
    private final String postalCodeInput = "//input[@data-test='postalCode']";
    private final String continueButton = "//input[@data-test='continue']";

    public CheckoutInformationPage(Page page) {
        super(page);
    }

    @Override
    public String getExpectedPageTitle() {
        return "Checkout: Your Information";
    }

    public CheckoutInformationPage setFirstName(String firstName) {
        page.locator(firstNameInput).fill(firstName);

        return this;
    }

    public CheckoutInformationPage setLastName(String lastName) {
        page.locator(lastNameInput).fill(lastName);

        return this;
    }

    public CheckoutInformationPage setPostalCode(String postalCode) {
        page.locator(postalCodeInput).fill(postalCode);

        return this;
    }

    public CheckoutOverviewPage clickContinue() {
        page.locator(continueButton).click();

        return new CheckoutOverviewPage(page);
    }
}
