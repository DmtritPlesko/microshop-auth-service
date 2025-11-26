package com.microshop.auth.infrastructure.web.response;

import java.time.LocalDateTime;
import java.util.Set;

public record UserResponse(
        String id,
        String email,
        String firstName,
        String lastName,
        Set<String> roles,
        boolean enabled,
        LocalDateTime createdAt,
        LocalDateTime lastLoginAt
) {}
