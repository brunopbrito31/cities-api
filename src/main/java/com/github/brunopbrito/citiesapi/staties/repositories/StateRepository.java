package com.github.brunopbrito.citiesapi.staties.repositories;

import com.github.brunopbrito.citiesapi.staties.entities.State;
import org.springframework.data.jpa.repository.JpaRepository;

public interface StateRepository extends JpaRepository<State, Long> {
}
