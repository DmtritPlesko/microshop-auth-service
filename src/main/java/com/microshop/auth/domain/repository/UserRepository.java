package com.microshop.auth.domain.repository;

import com.microshop.auth.domain.model.User;
import java.util.List;

import java.util.UUID;

public interface UserRepository {

    User save(UUID uuid,User user);

    User updateUser(UUID uuid,User user);

    User patchUpdateUser(UUID uuid, User user);

    List<User> findAllUsers();

    void deleteByUUUID(UUID uuid);
}
