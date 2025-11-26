package com.microshop.auth.infrastructure.web.request;

import com.microshop.auth.domain.model.valueobject.Email;
import com.microshop.auth.domain.model.valueobject.Password;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.Pattern;
import jakarta.validation.constraints.Size;

public record RegisterCommandRequest (
        @NotBlank(message = "Email is not provided")
        @Pattern(regexp = "^[A-Za-z0-9+_.-]+@(.+)$")
        Email email,

        @NotBlank(message = "Password is not provided")
        @Size(min = 6, max = 32,message = "Password: Minimum size = 6 the max = 32")
        Password password,

        @NotBlank(message = "Firstname in not provided")
        @Size(min = 2,max = 20, message = "Firstname: Minimum size = 2 the max = 20")
        String firstName,

        @NotBlank(message = "Lastname is not provided")
        @Size(min = 2,max = 32, message = "Lastname: Minimum size = 2 the max = 32")
        String lastName
) {
}
