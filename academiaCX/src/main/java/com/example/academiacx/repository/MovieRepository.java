package com.example.academiacx.repository;

import com.example.academiacx.models.MovieModel;
import com.fasterxml.jackson.annotation.JsonIgnore;
import org.springframework.data.jpa.repository.JpaRepository;

public interface MovieRepository extends JpaRepository<MovieModel, Long> {

//    @JsonIgnore
    MovieModel findByTitle(String title);
}
