package pages;

import com.microsoft.playwright.Page;

public class AbstractPageWithBurgerMenuAndCart<T extends AbstractPageWithBurgerMenuAndCart<T>> extends AbstractBasePage<T> {

    private String burgerMenu = "//button[@id='react-burger-menu-btn']";
    private String cartButton = "//a[@data-test='shopping-cart-link']";
    private String countProductsInCart = "//span[@data-test='shopping-cart-badge']";

    public AbstractPageWithBurgerMenuAndCart(Page page) {
        super(page);
    }

    public T openBurgerMenu() {
        page.locator(burgerMenu).click();

        return (T) this;
    }

//    public CartPage openCartPage() {
//        page.locator(cartButton).click();
//
//        return new CartPage();  //TODO uncomment when pageObject CartPage will be added
//    }

    public int getCartProductsCount() {
        String count = page.locator(countProductsInCart).textContent();

        return Integer.parseInt(count);
    }
}
