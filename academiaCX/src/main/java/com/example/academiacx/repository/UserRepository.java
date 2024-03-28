package com.example.academiacx.repository;

import com.example.academiacx.models.UserModel;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UserRepository extends JpaRepository<UserModel, Long> {

    UserModel findByName(String name);

    UserModel findByUsername(String username);

    UserModel findByEmail(String email);

}
