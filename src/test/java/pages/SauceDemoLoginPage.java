package pages;

import com.microsoft.playwright.Locator;
import com.microsoft.playwright.Page;
import com.microsoft.playwright.options.WaitForSelectorState;

public class SauceDemoLoginPage {

    private final Page page;

    private String logoPageLocator = "//div[@class='login_logo']";
    private String userNameLocator = "//input[@data-test='username']";
    private String passwordLocator = "//input[@data-test='password']";
    private String loginButtonLocator = "//input[@data-test='login-button']";

    private String errorTextLocator = "//h3[@data-test='error']";


    public SauceDemoLoginPage(Page page) {
        this.page = page;
    }

    public SauceDemoLoginPage openLoginPage() {
        page.navigate("https://www.saucedemo.com/");

        return this;
    }

    public SauceDemoLoginPage setUserName(String userName) {
        page.locator(userNameLocator).fill(userName);

        return this;
    }

    public SauceDemoLoginPage setPassword(String password) {
        page.locator(passwordLocator).fill(password);

        return this;
    }

    public void loginSauceDemo() {
        page.locator(loginButtonLocator).click();
    }

    public String getErrorMessage()
    {
        page.locator(errorTextLocator)
                .waitFor(new Locator.WaitForOptions().setState(WaitForSelectorState.VISIBLE));
        return page.locator(errorTextLocator).textContent();
    }
}
