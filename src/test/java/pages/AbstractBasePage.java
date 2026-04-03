package pages;

import com.microsoft.playwright.Page;

public class AbstractBasePage<T> {

    protected final Page page;

    public AbstractBasePage(Page page) {
        this.page = page;
    }

    public T waitForPageOpened() {

        return (T) this;
    }
}
