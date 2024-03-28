package com.example.academiacx.services;

import com.example.academiacx.handlers.exceptions.ParametroInvalidoException;
import com.example.academiacx.models.StudioModel;
import com.example.academiacx.models.UserModel;
import com.example.academiacx.repository.UserRepository;
import com.example.academiacx.services.inter.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class UserServiceImpl implements UserService {

    @Autowired
    private UserRepository userRepository;

    @Override
    public List<UserModel> listUsers() {
        return userRepository.findAll();
    }

    @Override
    public Optional<UserModel> findById(Long id) {
        return userRepository.findById(id);
    }

    @Override
    public Optional<UserModel> findByName(String name) {return Optional.ofNullable(userRepository.findByName(name));}

    @Override
    public Optional<UserModel> findByUsername(String username) {return Optional.ofNullable(userRepository.findByUsername(username));}

    @Override
    public Optional<UserModel> findByEmail(String email) {return Optional.ofNullable(userRepository.findByEmail(email));}

    @Override
    public UserModel create(UserModel userModel) {

        userModel.setId(null);

        return userRepository.save(userModel);
    }

    @Override
    public UserModel update(UserModel userModel) {

        if(userModel.getId() == null || findById(userModel.getId()).isEmpty()) {
            throw new ParametroInvalidoException("Id não encontrado");
        }

        return userRepository.save(userModel);
    }
}
