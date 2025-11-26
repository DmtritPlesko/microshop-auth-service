package com.microshop.auth.infrastructure.adapter.persistence.entity;

import com.microshop.auth.domain.model.Role;
import com.microshop.auth.domain.model.valueobject.Email;
import com.microshop.auth.domain.model.valueobject.Password;
import jakarta.persistence.Embedded;
import org.springframework.data.annotation.Id;

import java.time.LocalDateTime;
import java.util.Set;
import java.util.UUID;

public class UserEntity {

    @Id
    private UUID id;

    @Embedded
    private Email email;

    @Embedded
    private Password password;

    private String firstName;

    private String lastName;

    private Set<Role> roles;

    private boolean enabled;

    private LocalDateTime createdAt;

    private LocalDateTime lastLoginAt;

}
