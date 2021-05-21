package com.github.brunopbrito.citiesapi.cities.repositories;

import com.github.brunopbrito.citiesapi.cities.entities.City;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface CityRepository extends JpaRepository<City, Long> {
}
