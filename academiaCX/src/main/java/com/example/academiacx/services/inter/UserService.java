package com.example.academiacx.services.inter;

import com.example.academiacx.models.UserModel;

import java.util.List;
import java.util.Optional;

public interface UserService {

    List<UserModel> listUsers();

    Optional<UserModel> findById(Long id);

    Optional<UserModel> findByName(String name);

    Optional<UserModel> findByUsername(String username);

    Optional<UserModel> findByEmail(String email);

    UserModel create(UserModel userModel);

    UserModel update(UserModel userModel);
}
