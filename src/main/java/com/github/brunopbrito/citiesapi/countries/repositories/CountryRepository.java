package com.github.brunopbrito.citiesapi.countries.repositories;

import com.github.brunopbrito.citiesapi.countries.entities.Country;
import org.springframework.data.domain.Example;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.domain.Sort;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;
import java.util.Optional;

public class CountryRepository implements JpaRepository<Country, Long> {

    @Override
    public List<Country> findAll() {
        return null;
    }

    @Override
    public List<Country> findAll(Sort sort) {
        return null;
    }

    @Override
    public Page<Country> findAll(Pageable pageable) {
        return null;
    }

    @Override
    public List<Country> findAllById(Iterable<Long> longs) {
        return null;
    }

    @Override
    public long count() {
        return 0;
    }

    @Override
    public void deleteById(Long aLong) {

    }

    @Override
    public void delete(Country entity) {

    }

    @Override
    public void deleteAll(Iterable<? extends Country> entities) {

    }

    @Override
    public void deleteAll() {

    }

    @Override
    public <S extends Country> S save(S entity) {
        return null;
    }

    @Override
    public <S extends Country> List<S> saveAll(Iterable<S> entities) {
        return null;
    }

    @Override
    public Optional<Country> findById(Long aLong) {
        return Optional.empty();
    }

    @Override
    public boolean existsById(Long aLong) {
        return false;
    }

    @Override
    public void flush() {

    }

    @Override
    public <S extends Country> S saveAndFlush(S entity) {
        return null;
    }

    @Override
    public void deleteInBatch(Iterable<Country> entities) {

    }

    @Override
    public void deleteAllInBatch() {

    }

    @Override
    public Country getOne(Long aLong) {
        return null;
    }

    @Override
    public <S extends Country> Optional<S> findOne(Example<S> example) {
        return Optional.empty();
    }

    @Override
    public <S extends Country> List<S> findAll(Example<S> example) {
        return null;
    }

    @Override
    public <S extends Country> List<S> findAll(Example<S> example, Sort sort) {
        return null;
    }

    @Override
    public <S extends Country> Page<S> findAll(Example<S> example, Pageable pageable) {
        return null;
    }

    @Override
    public <S extends Country> long count(Example<S> example) {
        return 0;
    }

    @Override
    public <S extends Country> boolean exists(Example<S> example) {
        return false;
    }
}
