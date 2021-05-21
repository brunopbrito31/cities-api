package com.github.brunopbrito.citiesapi.countries.resources;

import com.github.brunopbrito.citiesapi.countries.entities.Country;
import com.github.brunopbrito.citiesapi.countries.repositories.CountryRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("/countries")
public class CountryResource {

    @Autowired
    private CountryRepository repository;


    /*public CountryResource(CountryRepository repository) {
        this.repository = repository;
    }*/

    @GetMapping
    public List<Country> countries(){
        return repository.findAll();
    }

    @GetMapping("/{id}")
    public Country getOne(@PathVariable Long id){
        Optional<Country> optional = repository.findById(id);
        return optional.get();
    }
}
