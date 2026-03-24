package testCases;

import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;

public class BaseUiTest {

    @BeforeMethod
    public void setUp() {
        System.out.println("Before Method: setUp");
    }

    @AfterMethod
    public void tearDown() {
        System.out.println("After Method: tearDown");
    }
}
