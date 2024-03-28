package com.example.academiacx.services.inter;

import com.example.academiacx.models.StreamingModel;
import com.fasterxml.jackson.annotation.JsonIgnore;

import java.util.List;
import java.util.Optional;

public interface StreamingService {

    @JsonIgnore
    List<StreamingModel> listUsers();

    Optional<StreamingModel> findById(Long id);

    Optional<StreamingModel> findByName(String name);

    Optional<StreamingModel> findByUrl(String url);

    StreamingModel create(StreamingModel streamingModel);

    StreamingModel update(StreamingModel streamingModel);

    boolean delete(Long id);
}
