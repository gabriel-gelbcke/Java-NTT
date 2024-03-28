package com.example.academiacx.services;

import com.example.academiacx.handlers.exceptions.ParametroInvalidoException;
import com.example.academiacx.handlers.exceptions.RecursoNaoEntradoException;
import com.example.academiacx.models.StreamingModel;
import com.example.academiacx.repository.StreamingRepository;
import com.example.academiacx.services.inter.StreamingService;
import com.fasterxml.jackson.annotation.JsonIgnore;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class StreamingServiceImpl implements StreamingService {

    @Autowired
    private StreamingRepository streamingRepository;

    @JsonIgnore
    @Override
    public List<StreamingModel> listUsers() {
        return streamingRepository.findAll();
    }

    @Override
    public Optional<StreamingModel> findById(Long id) {
        return streamingRepository.findById(id);
    }

    @Override
    public Optional<StreamingModel> findByName(String name) {

        return Optional.ofNullable(streamingRepository.findByName(name));
    }

    @Override
    public Optional<StreamingModel> findByUrl(String url) {

        return Optional.ofNullable(streamingRepository.findByUrl(url));
    }

    @Override
    public StreamingModel create(StreamingModel streamingModel) {
        streamingModel.setId(null);

        return streamingRepository.save(streamingModel);
    }

    @Override
    public StreamingModel update(StreamingModel streamingModel) {

        if(streamingModel.getId() == null || findById(streamingModel.getId()).isEmpty()) {
            throw new ParametroInvalidoException("Id não encontrado");
        }

        return streamingRepository.save(streamingModel);
    }


    @Override
    public boolean delete(Long id) { findById(id);

        try{
            streamingRepository.deleteById(id);
            return true;
        } catch (Exception e) {
            throw new RecursoNaoEntradoException("id informado não encontrado!");
        }
    }
}
