package com.microshop.auth.infrastructure.web.controller;

import com.microshop.auth.infrastructure.web.request.ChangePasswordRequest;
import com.microshop.auth.infrastructure.web.request.UpdateProfileRequest;
import com.microshop.auth.infrastructure.web.response.UserResponse;
import jakarta.validation.Valid;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.security.Principal;

@RestController
@RequestMapping(path = "/api/v1/users")
public class UserController {

    @GetMapping("/me")
    public ResponseEntity<UserResponse> getCurrentUser(Principal principal) {
        // Получить текущего пользователя

        return
    }

    @PutMapping("/profile")
    public ResponseEntity<UserResponse> updateProfile(@RequestBody @Valid UpdateProfileRequest request,
                                                      Principal principal) {
        // Обновить профиль (firstName, lastName)
        return
    }

    @PatchMapping("/profile")
    public ResponseEntity<UserResponse> patchUpdateProfile() {

    }

    @PostMapping("/change-password")
    public ResponseEntity<Void> changePassword(@RequestBody @Valid ChangePasswordRequest request,
                                               Principal principal) {
        // Смена пароля (требует старый пароль)
        return
    }

    @PostMapping("/verify-email")
    public ResponseEntity<Void> verifyEmail(@RequestParam String token) {
        // Подтверждение email
        return
    }

    @DeleteMapping("/account")
    public ResponseEntity<Void> deleteAccount(Principal principal) {
        // Удаление аккаунта
        return
    }
}
