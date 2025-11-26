package com.microshop.auth.infrastructure.web.controller;

import com.microshop.auth.infrastructure.web.request.LoginCommandRequest;
import com.microshop.auth.infrastructure.web.request.RefreshmentsRequest;
import com.microshop.auth.infrastructure.web.request.RegisterCommandRequest;
import com.microshop.auth.infrastructure.web.request.ResetPasswordRequest;
import com.microshop.auth.infrastructure.web.response.AuthResponse;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.validation.Valid;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping(path = "/api/v1/auth")
public class AuthController {

    @PostMapping("/login")
    public ResponseEntity<AuthResponse> login(@RequestBody @Valid LoginCommandRequest request) {
        // Вход, выдача токенов
    }

    @PostMapping("/register")
    public ResponseEntity<AuthResponse> register(@RequestBody @Valid RegisterCommandRequest request) {
        // Регистрация + автоматический вход
    }

    @PostMapping("/refresh")
    public ResponseEntity<AuthResponse> refresh(@RequestBody @Valid RefreshmentsRequest request) {
        // Обновление токенов
    }

    @PostMapping("/logout")
    public ResponseEntity<Void> logout(HttpServletRequest request) {
        // Выход
    }

    @PostMapping("/forgot-password")
    public ResponseEntity<Void> forgotPassword(@RequestParam String email) {
        // Запрос на сброс пароля
    }

    @PostMapping("/reset-password")
    public ResponseEntity<Void> resetPassword(@RequestBody ResetPasswordRequest request) {
        // Сброс пароля по токену
    }
}
