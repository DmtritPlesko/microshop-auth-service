package com.microshop.auth.infrastructure.adapter.security;

import com.microshop.auth.domain.service.PasswordEncoder;
import org.springframework.stereotype.Component;

@Component
public class BCryptPasswordEncoder implements PasswordEncoder {
    private final org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder delegate;

    public BCryptPasswordEncoder() {
        int STRENGTH = 12;
        this.delegate = new org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder(STRENGTH);
    }

    @Override
    public String encode(String rawPassword) {
        return delegate.encode(rawPassword);
    }

    @Override
    public boolean matches(String rawPassword, String encodedPassword) {
        return delegate.matches(rawPassword, encodedPassword);
    }
}
