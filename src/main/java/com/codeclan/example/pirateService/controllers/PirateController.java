package com.codeclan.example.pirateService.controllers;

import com.codeclan.example.pirateService.models.Pirate;
import com.codeclan.example.pirateService.repositories.PirateRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;
import java.util.Optional;

@RestController
public class PirateController {

    @Autowired
    PirateRepository pirateRepository;
    //need autowired for each repo you bring in.

    @GetMapping(value = "/pirates")
    public List<Pirate> getAllPirates(){
        return pirateRepository.findAll();
    }
    //requestMapping and passing in get, post etc. Its easier using the specific mapping annotation.

    @GetMapping(value = "/pirates/{id}")
    public Optional<Pirate> getPirate(@PathVariable Long id){
        return pirateRepository.findById(id);
    }
    //optional allows us to pass in a null value - either null or pirate.
}
