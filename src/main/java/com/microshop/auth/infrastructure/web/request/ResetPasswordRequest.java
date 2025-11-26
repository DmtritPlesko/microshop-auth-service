package com.microshop.auth.infrastructure.web.request;

import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.Size;

public record ResetPasswordRequest(
        @NotBlank
        String token,

        @NotBlank
        @Size(min = 6, max = 32,message = "Password: Minimum size = 6 the max = 32")
        String password
) {
}
