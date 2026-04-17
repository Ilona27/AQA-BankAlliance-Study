package enums;

import lombok.Getter;
import lombok.RequiredArgsConstructor;

@Getter
@RequiredArgsConstructor
public enum AuthCreds {

    STANDART_USER("standard_user", "secret_sauce");

    private final String loginUserName;
    private final String password;
}
