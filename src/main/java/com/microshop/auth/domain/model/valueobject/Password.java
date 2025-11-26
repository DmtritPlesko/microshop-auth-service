package com.microshop.auth.domain.model.valueobject;

import com.microshop.auth.domain.exception.InvalidPasswordException;
import com.microshop.auth.domain.service.PasswordEncoder;

public record Password(String hash) {
    public Password {
        if (hash == null || hash.isBlank()) {
            throw new InvalidPasswordException("Password cannot be empty");
        }
    }

    // хэширование пароля
    public static Password fromPlainText(String plainText, PasswordEncoder encoder) {
        return new Password(encoder.encode(plainText));
    }

    //проверка пароля
    public boolean matches(String plainText, PasswordEncoder encoder) {
        return encoder.matches(plainText, this.hash);
    }
}
