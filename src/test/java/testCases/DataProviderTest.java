package testCases;

import org.assertj.core.api.Assertions;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class DataProviderTest {

    @DataProvider(name = "sumData")
    public Object[][] sumData() {
        return new Object[][] {
                {1, 2, 3},
                {5, 4, 9},
                {10, 20, 30}
        };
    }

    @Test(dataProvider = "sumData")
    public void verifySumData(int firstNum, int secondNum, int expectedSum) {
        int actualSum = firstNum + secondNum;
        Assertions.assertThat(actualSum).isEqualTo(expectedSum);
    }
}
