package com.github.brunopbrito.citiesapi.cities.resources;

import com.github.brunopbrito.citiesapi.cities.entities.City;
import com.github.brunopbrito.citiesapi.cities.repositories.CityRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.Optional;

@RestController
@RequestMapping("/cities")
public class CityResource {

    @Autowired
    private final CityRepository repository;

    public CityResource(CityRepository repository) {
        this.repository = repository;
    }

    @GetMapping
    public Page<City> getAll(final Pageable page){
        return repository.findAll(page);
    }

    /*@GetMapping("/{id}")
    public Optional<City> getOne(@PathVariable Long id){
        return repository.findById(id);
    }*/

    @GetMapping("/{id}")
    public ResponseEntity<Optional<City>> getOne(@PathVariable Long id){
        Optional<City> optional = repository.findById(id);
        if(optional.isPresent()){
            return ResponseEntity.ok().body(optional);
        }else {
            return ResponseEntity.notFound().build();
        }
    }

}
