package com.example.academiacx.services.inter;

import com.example.academiacx.models.FranchiseModel;

import java.util.List;
import java.util.Optional;

public interface FranchiseService {

    List<FranchiseModel> listUsers();

    Optional<FranchiseModel> findById(Long id);

    Optional<FranchiseModel> findByName(String name);

    FranchiseModel create(FranchiseModel franchiseModel);

    FranchiseModel update(FranchiseModel franchiseModel);

    boolean delete(Long id);
}
