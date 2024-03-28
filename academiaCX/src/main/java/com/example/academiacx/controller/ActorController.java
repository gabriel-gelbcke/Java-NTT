package com.example.academiacx.controller;

import com.example.academiacx.models.ActorModel;
import com.example.academiacx.services.inter.ActorService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping(value = "/actors")
public class ActorController {

    @Autowired
    private ActorService actorService;

    @GetMapping
    public List<ActorModel> findAll()
    {
        return actorService.listUsers();
    }

    @GetMapping(value = "id/{id}")
    public Optional<ActorModel> findById(@PathVariable Long id)
    {
        return actorService.findById(id);
    }

    @GetMapping(value = "name/{name}")
    public Optional<ActorModel> findByName(@PathVariable String name)
    {
        return actorService.findByName(name);
    }

    @PostMapping
    public ActorModel save(@RequestBody ActorModel actorModel)
    {
        return actorService.create(actorModel);
    }

    @PutMapping
    public ActorModel update(@RequestBody ActorModel actorModel)
    {
        return actorService.update(actorModel);
    }
}
