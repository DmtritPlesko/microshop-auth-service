package com.microshop.auth.domain.model.valueobject;

import com.microshop.auth.domain.exception.InvalidEmailException;
import jakarta.persistence.Column;
import jakarta.persistence.Embeddable;

@Embeddable
public record Email(
        @Column(name = "email",unique = true)
        String value
) {
    public Email {
        if (!isValid(value)) {
            throw new InvalidEmailException(value);
        }
    }

    private boolean isValid(String email) {
        return email.matches("^[A-Za-z0-9+_.-]+@(.+)$");
    }
}