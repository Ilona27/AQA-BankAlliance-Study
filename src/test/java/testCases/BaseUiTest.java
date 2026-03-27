package testCases;

import com.microsoft.playwright.*;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;

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
}
