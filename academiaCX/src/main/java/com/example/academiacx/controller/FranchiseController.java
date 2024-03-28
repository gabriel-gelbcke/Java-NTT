package com.example.academiacx.controller;

import com.example.academiacx.models.FranchiseModel;
import com.example.academiacx.services.inter.FranchiseService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping(value = "/franchises")
public class FranchiseController {

    @Autowired
    private FranchiseService franchiseService;

    @GetMapping
    public List<FranchiseModel> findAll()
    {
        return franchiseService.listUsers();
    }

    @GetMapping(value = "id/{id}")
    public Optional<FranchiseModel> findById(@PathVariable Long id)
    {
        return franchiseService.findById(id);
    }

    @GetMapping(value = "name/{name}")
    public Optional<FranchiseModel> findByName(@PathVariable String name)
    {
        return franchiseService.findByName(name);
    }

    @PostMapping
    public FranchiseModel save(@RequestBody FranchiseModel franchiseModel)
    {
        return franchiseService.create(franchiseModel);
    }

    @PutMapping
    public FranchiseModel update(@RequestBody FranchiseModel franchiseModel)
    {
        return franchiseService.update(franchiseModel);
    }
}
