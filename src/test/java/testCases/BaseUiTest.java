package testCases;

import com.microsoft.playwright.*;
import org.assertj.core.api.Assertions;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import pages.AbstractBasePage;

import java.util.Collections;

public class BaseUiTest {

    protected Playwright playwright;
    protected Browser browser;
    protected BrowserContext browserContext;
    protected Page page;

    @BeforeMethod
    public void setUp() {
        playwright = Playwright.create();

        browser = playwright
                .chromium()
                .launch(new BrowserType.LaunchOptions().setHeadless(false));

        browserContext = browser.newContext(new Browser.NewContextOptions()
                .setAcceptDownloads(true)
                .setJavaScriptEnabled(true)
                .setPermissions(Collections.singletonList("notifications")));

        page = browserContext.newPage();
    }

    @AfterMethod
    public void tearDown() {
        if (browserContext != null) {
            browserContext.close();
        }

        if (browser != null) {
            browser.close();
        }

        if (playwright != null) {
            playwright.close();
        }
    }

    public <T extends AbstractBasePage<T>> void verifyPageTitle(T page) {
        Assertions.assertThat(page.getPageTitle())
                .as("Заголовок сторінки не співпадає з очікуваним")
                .isEqualTo(page.getExpectedPageTitle());
    }
}
