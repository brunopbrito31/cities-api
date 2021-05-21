package com.github.brunopbrito.citiesapi.cities.resources;

import com.github.brunopbrito.citiesapi.cities.entities.City;
import com.github.brunopbrito.citiesapi.cities.services.CityService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("/cities")
public class CityResource {

    @Autowired
    private CityService service;

    @GetMapping
    public List<City> getAll(){
        return service.getAll();
    }

    @GetMapping("/{id}")
    public Optional<City> getOne(@PathVariable Long id){
        return service.getOne(id);
    }

}
