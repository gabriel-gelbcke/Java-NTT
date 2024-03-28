package com.example.academiacx.services.inter;

import com.example.academiacx.models.MovieModel;
import com.fasterxml.jackson.annotation.JsonIgnore;

import java.util.List;
import java.util.Optional;

public interface MovieService {

//    @JsonIgnore
    List<MovieModel> listUsers();

    Optional<MovieModel> findById(Long id);

    Optional<MovieModel> findByTitle(String title);

    MovieModel create(MovieModel movieModel);

    MovieModel update(MovieModel movieModel);

    boolean delete(Long id);
}
