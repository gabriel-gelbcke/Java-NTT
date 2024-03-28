package com.example.academiacx.repository;

import com.example.academiacx.models.StreamingModel;
import com.example.academiacx.models.StudioModel;
import org.springframework.data.jpa.repository.JpaRepository;

public interface StreamingRepository extends JpaRepository<StreamingModel, Long> {

    StreamingModel findByName(String name);

    StreamingModel findByUrl(String url);

}
