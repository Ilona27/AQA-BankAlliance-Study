package testCases;

import helper.EmailValidator;
import org.assertj.core.api.Assertions;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

import static helper.EmailValidator.isValidEmail;
import static org.assertj.core.api.Assertions.assertThat;

public class DemoTest extends BaseUiTest {

    @Test
    public void verifyNumbersSum() {
        int sum = 2 + 3;
        assertThat(sum)
                .as("Сума чисел відрізняється від очікуваної")
                .isEqualTo(5);
    }

    @Test
    public void verifyValidEmail() {
        String email = "a@b";

        boolean result = isValidEmail(email);
        assertThat(result)
                .as("Імейл невалідний")
                .isTrue();
    }

    @Test
    public void verifyMessage() {
        String message = "Payment SUCCESS";

        assertThat(message)
                .contains("Payment")
                .startsWith("Payment")
                .doesNotContain("ERROR");

        assertThat(message)
                .isEqualTo("Payment SUCCESS");
    }

    @Test
    public void verifyListStatuses() {
        List<String> statuses = List.of("SUCCESS", "ERROR", "FAILED");

        assertThat(statuses)
                .hasSize(3)
                .contains("ERROR")
                .containsExactly("SUCCESS", "ERROR", "FAILED");
    }

    @Test
    public void verifyMap() {
        Map<String, Integer> counts = new HashMap<>();
        counts.put("ERROR", 2);
        counts.put("SUCCESS", 3);

        assertThat(counts)
                .containsKey("ERROR");
    }
}
