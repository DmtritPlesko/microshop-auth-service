package com.microshop.auth.infrastructure.web.request;

import jakarta.validation.constraints.NotBlank;

public record UpdateProfileRequest(
    @NotBlank
    String firstName,

    @NotBlank
    String lastName,

    String phoneNumber
) {}