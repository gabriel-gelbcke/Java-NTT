package com.example.academiacx.controller;

import com.example.academiacx.models.DirectorModel;
import com.example.academiacx.services.inter.DirectorService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping(value = "/directors")
public class DirectorController {

    @Autowired
    private DirectorService directorService;

    @GetMapping
    public List<DirectorModel> findAll()
    {
        return directorService.listUsers();
    }

    @GetMapping(value = "id/{id}")
    public Optional<DirectorModel> findById(@PathVariable Long id)
    {
        return directorService.findById(id);
    }

    @GetMapping(value = "name/{name}")
    public Optional<DirectorModel> findByName(@PathVariable String name)
    {
        return directorService.findByName(name);
    }

    @PostMapping
    public DirectorModel save(@RequestBody DirectorModel studioModel)
    {
        return directorService.create(studioModel);
    }

    @PutMapping
    public DirectorModel update(@RequestBody DirectorModel studioModel)
    {
        return directorService.update(studioModel);
    }
}
