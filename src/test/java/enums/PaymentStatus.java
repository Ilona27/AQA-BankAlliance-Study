package enums;

import lombok.Getter;
import lombok.RequiredArgsConstructor;

@Getter
@RequiredArgsConstructor
public enum PaymentStatus {

    SUCCESS("SUCCESS", "Успішний");

    private final String apiStatus;
    private final String frontStatus;
}
