package pages;

import com.microsoft.playwright.Page;

public class AbstractBasePage {

    protected final Page page;

    public AbstractBasePage(Page page) {
        this.page = page;
    }
}
