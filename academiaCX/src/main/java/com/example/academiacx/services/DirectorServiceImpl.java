package com.example.academiacx.services;

import com.example.academiacx.handlers.exceptions.ParametroInvalidoException;
import com.example.academiacx.handlers.exceptions.RecursoNaoEntradoException;
import com.example.academiacx.models.DirectorModel;
import com.example.academiacx.repository.DirectorRepository;
import com.example.academiacx.services.inter.DirectorService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class DirectorServiceImpl implements DirectorService {

    @Autowired
    private DirectorRepository directorRepository;

    @Override
    public List<DirectorModel> listUsers() {
        return directorRepository.findAll();
    }

    @Override
    public Optional<DirectorModel> findById(Long id) {
        return directorRepository.findById(id);
    }

    @Override
    public Optional<DirectorModel> findByName(String name) {

        return Optional.ofNullable(directorRepository.findByName(name));
    }

    @Override
    public DirectorModel create(DirectorModel studioModel) {
        studioModel.setId(null);

        return directorRepository.save(studioModel);
    }

    @Override
    public DirectorModel update(DirectorModel studioModel) {

        if(studioModel.getId() == null || findById(studioModel.getId()).isEmpty()) {
            throw new ParametroInvalidoException("Id não encontrado");
        }

        return directorRepository.save(studioModel);
    }

    @Override
    public boolean delete(Long id) { findById(id);

        try{
            directorRepository.deleteById(id);
            return true;
        } catch (Exception e) {
            throw new RecursoNaoEntradoException("id informado não encontrado!");
        }
    }
}
