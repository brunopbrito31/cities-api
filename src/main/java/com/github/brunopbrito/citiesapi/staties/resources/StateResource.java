package com.github.brunopbrito.citiesapi.staties.resources;

import com.github.brunopbrito.citiesapi.staties.entities.State;
import com.github.brunopbrito.citiesapi.staties.repositories.StateRepository;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/staties")
public class StateResource {

    private final StateRepository repository;

    public StateResource(StateRepository repository) {
        this.repository = repository;
    }

    @GetMapping
    public List<State> findAll(){
        return repository.findAll();
    }
}
