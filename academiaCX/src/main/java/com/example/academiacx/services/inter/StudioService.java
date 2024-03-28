package com.example.academiacx.services.inter;

import com.example.academiacx.models.StudioModel;
import com.fasterxml.jackson.annotation.JsonIgnore;

import java.util.List;
import java.util.Optional;

public interface StudioService {

    @JsonIgnore
    List<StudioModel> listUsers();

    Optional<StudioModel> findById(Long id);

    Optional<StudioModel> findByName(String name);

    Optional<StudioModel> findByCountry(String country);

    StudioModel create(StudioModel studioModel);

    StudioModel update(StudioModel studioModel);

    boolean delete(Long id);
}
