package com.microshop.auth.domain.model.valueobject;

import com.microshop.auth.domain.exception.InvalidEmailException;

public record Email(String value) {
    public Email {
        if (!isValid(value)) {
            throw new InvalidEmailException(value);
        }
    }

    private boolean isValid(String email) {
        return email.matches("^[A-Za-z0-9+_.-]+@(.+)$");
    }
}