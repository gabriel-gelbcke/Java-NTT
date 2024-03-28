package com.example.academiacx.repository;

import com.example.academiacx.models.DirectorModel;
import com.example.academiacx.models.StudioModel;
import org.springframework.data.jpa.repository.JpaRepository;

public interface DirectorRepository extends JpaRepository<DirectorModel, Long> {

    DirectorModel findByName(String name);

}
