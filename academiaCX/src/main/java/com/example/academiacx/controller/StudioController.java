package com.example.academiacx.controller;

import com.fasterxml.jackson.annotation.JsonIgnore;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import com.example.academiacx.models.StudioModel;
import com.example.academiacx.repository.StudioRepository;

import com.example.academiacx.services.inter.StudioService;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping(value = "/studios")
public class StudioController {

    @Autowired
    private StudioService studioService;

    @JsonIgnore
    @GetMapping
    public List<StudioModel> findAll()
    {
        return studioService.listUsers();
    }

    @GetMapping(value = "id/{id}")
    public Optional<StudioModel> findById(@PathVariable Long id)
    {
        return studioService.findById(id);
    }

    @GetMapping(value = "name/{name}")
    public Optional<StudioModel> findByName(@PathVariable String name)
    {
        return studioService.findByName(name);
    }

    @GetMapping(value = "country/{country}")
    public Optional<StudioModel> findByCountry(@PathVariable String country)
    {
        return studioService.findByCountry(country);
    }

    @PostMapping
    public StudioModel save(@RequestBody StudioModel studioModel)
    {
        return studioService.create(studioModel);
    }

    @PutMapping
    public StudioModel update(@RequestBody StudioModel studioModel)
    {
        return studioService.update(studioModel);
    }
}
