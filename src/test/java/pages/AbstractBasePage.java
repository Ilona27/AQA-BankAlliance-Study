package pages;

import com.microsoft.playwright.Page;
import interfaces.IExpectedPageValues;

public class AbstractBasePage<T> implements IExpectedPageValues {

    protected final Page page;

    public AbstractBasePage(Page page) {
        this.page = page;
    }

    public T waitForPageOpened() {

        return (T) this;
    }

    public String getPageTitle() {
        return page.locator("//span[@data-test='title']").textContent();
    }
}
