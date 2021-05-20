package com.github.brunopbrito.citiesapi.countries.repositories;

import com.github.brunopbrito.citiesapi.countries.entities.Country;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;


import java.util.List;
import java.util.Optional;
@Repository
public interface CountryRepository extends JpaRepository<Country, Long> {

}
