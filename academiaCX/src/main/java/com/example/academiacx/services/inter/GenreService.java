package com.example.academiacx.services.inter;

import com.example.academiacx.models.ActorModel;
import com.example.academiacx.models.GenreModel;

import java.util.List;
import java.util.Optional;

public interface GenreService {

    List<GenreModel> listUsers();

    Optional<GenreModel> findById(Long id);

    Optional<GenreModel> findByName(String name);

    GenreModel create(GenreModel userModel);

    GenreModel update(GenreModel userModel);
}
