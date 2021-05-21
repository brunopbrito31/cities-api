package com.github.brunopbrito.citiesapi.cities.services;

import com.github.brunopbrito.citiesapi.cities.entities.City;
import com.github.brunopbrito.citiesapi.cities.repositories.CityRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class CityService {

    @Autowired
    private CityRepository repository;

    public List<City> getAll(){
        return repository.findAll();
    }
    public Optional<City> getOne(Long id){
        return repository.findById(id);
    }



}
