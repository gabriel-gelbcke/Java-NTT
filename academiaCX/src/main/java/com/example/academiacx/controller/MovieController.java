package com.example.academiacx.controller;

import com.fasterxml.jackson.annotation.JsonIgnore;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import com.example.academiacx.models.MovieModel;
import com.example.academiacx.repository.MovieRepository;

import com.example.academiacx.services.inter.MovieService;

import java.util.List;
import java.util.Optional;



@RestController
@RequestMapping(value = "/movies")
public class MovieController {

//    @JsonIgnore
    @Autowired
    private MovieService movieService;

//    @JsonIgnore
    @GetMapping
    public List<MovieModel> findAll()
    {
        return movieService.listUsers();
    }

    @GetMapping(value = "id/{id}")
    public Optional<MovieModel> findById(@PathVariable Long id)
    {
        return movieService.findById(id);
    }

//    @JsonIgnore
    @GetMapping(value = "title/{title}")
    public Optional<MovieModel> findByName(@PathVariable String title)
    {
        return movieService.findByTitle(title);
    }

    @PostMapping
    public MovieModel save(@RequestBody MovieModel movieModel)
    {
        return movieService.create(movieModel);
    }

    @PutMapping
    public MovieModel update(@RequestBody MovieModel movieModel)
    {
        return movieService.update(movieModel);
    }
}
