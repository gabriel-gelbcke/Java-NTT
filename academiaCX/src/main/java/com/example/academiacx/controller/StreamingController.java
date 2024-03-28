package com.example.academiacx.controller;

import com.example.academiacx.models.StreamingModel;
import com.example.academiacx.services.inter.StreamingService;
import com.fasterxml.jackson.annotation.JsonIgnore;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping(value = "/streamings")
public class StreamingController {

    @Autowired
    private StreamingService streamingService;

    @JsonIgnore
    @GetMapping
    public List<StreamingModel> findAll()
    {
        return streamingService.listUsers();
    }

    @GetMapping(value = "id/{id}")
    public Optional<StreamingModel> findById(@PathVariable Long id)
    {
        return streamingService.findById(id);
    }

    @GetMapping(value = "name/{name}")
    public Optional<StreamingModel> findByName(@PathVariable String name)
    {
        return streamingService.findByName(name);
    }

    @GetMapping(value = "url/{url}")
    public Optional<StreamingModel> findByUrl(@PathVariable String url)
    {
        return streamingService.findByUrl(url);
    }

    @PostMapping
    public StreamingModel save(@RequestBody StreamingModel streamingModel)
    {
        return streamingService.create(streamingModel);
    }

    @PutMapping
    public StreamingModel update(@RequestBody StreamingModel streamingModel)
    {
        return streamingService.update(streamingModel);
    }
}
