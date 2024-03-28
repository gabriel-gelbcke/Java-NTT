package com.example.academiacx.repository;

import com.example.academiacx.models.ActorModel;
import com.example.academiacx.models.GenreModel;
import org.springframework.data.jpa.repository.JpaRepository;

public interface GenreRepository extends JpaRepository<GenreModel, Long> {

    GenreModel findByName(String name);

}
