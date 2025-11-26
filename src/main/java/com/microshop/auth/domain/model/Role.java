package com.microshop.auth.domain.model;

import java.util.Arrays;
import java.util.Set;

public enum Role {
    USER("ROLE_USER", Set.of("READ_PROFILE")),
    ADMIN("ROLE_ADMIN", Set.of("READ_PROFILE", "MANAGE_USERS")),
    MODERATOR("ROLE_MODERATOR", Set.of("READ_PROFILE", "MANAGE_CONTENT"));

    private final String authority;
    private final Set<String> permissions;

    Role(String authority, Set<String> permissions) {
        this.authority = authority;
        this.permissions = permissions;
    }

    public static Role fromAuthority(String authority) {
        return Arrays.stream(values())
                .filter(role -> role.authority.equals(authority))
                .findFirst()
                .orElseThrow(() -> new IllegalArgumentException("Unknown role: " + authority));
    }
}
