package com.example.academiacx.repository;

import com.example.academiacx.models.StudioModel;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

public interface StudioRepository extends JpaRepository<StudioModel, Long> {

    StudioModel findByName(String name);

    StudioModel findByCountry(String country);

}
