package com.github.brunopbrito.citiesapi.states.repositories;

import com.github.brunopbrito.citiesapi.states.entities.State;
import org.springframework.data.jpa.repository.JpaRepository;

public interface StateRepository extends JpaRepository<State, Long> {
}
