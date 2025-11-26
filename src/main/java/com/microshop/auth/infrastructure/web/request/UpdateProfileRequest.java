package com.microshop.auth.infrastructure.web.request;

import com.microshop.auth.domain.model.valueobject.Password;


public record UpdateProfileRequest(

        String token,

        String email,

        Password password,

        String firstName,

        String lastName
) {}