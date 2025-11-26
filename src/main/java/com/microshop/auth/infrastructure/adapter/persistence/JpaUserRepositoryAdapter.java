package com.microshop.auth.infrastructure.adapter.persistence;

import com.microshop.auth.application.service.mapper.UserMapper;
import com.microshop.auth.domain.model.User;
import com.microshop.auth.domain.repository.UserRepository;
import com.microshop.auth.infrastructure.adapter.persistence.repository.SpringDataUserRepository;
import org.springframework.stereotype.Component;

import java.util.List;
import java.util.UUID;

@Component
public class JpaUserRepositoryAdapter implements UserRepository {

    SpringDataUserRepository springDataUserRepository;
    UserMapper userMapper;

    @Override
    public User save(UUID uuid, User user) {
        return null;
    }

    @Override
    public User updateUser(UUID uuid, User user) {
        return null;
    }

    @Override
    public User patchUpdateUser(UUID uuid, User user) {
        return null;
    }

    @Override
    public List<User> findAllUsers() {
        return List.of();
    }

    @Override
    public void deleteByUUUID(UUID uuid) {

    }
}
