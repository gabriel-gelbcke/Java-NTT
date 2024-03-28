package com.example.academiacx.services.inter;

import com.example.academiacx.models.DirectorModel;

import java.util.List;
import java.util.Optional;

public interface DirectorService {

    List<DirectorModel> listUsers();

    Optional<DirectorModel> findById(Long id);

    Optional<DirectorModel> findByName(String name);

    DirectorModel create(DirectorModel directorModel);

    DirectorModel update(DirectorModel directorModel);

    boolean delete(Long id);
}
