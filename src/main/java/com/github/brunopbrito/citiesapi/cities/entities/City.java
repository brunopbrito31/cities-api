package com.github.brunopbrito.citiesapi.cities.entities;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;
import java.util.Objects;
// Falta fazer a ponte do tipo point para a minha API
@Entity(name="City")
@Table(name="cidade")
public class City {

    @Id
    private Long id;
    @Column(name="nome")
    private String name;
    private Integer uf;
    private String lat_lon;
    Double latitude;
    Double longitude;
    Integer cod_tom;

    public City() {
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Integer getUf() {
        return uf;
    }

    public void setUf(Integer uf) {
        this.uf = uf;
    }

    public String getLat_lon() {
        return lat_lon;
    }

    public void setLat_lon(String lat_lon) {
        this.lat_lon = lat_lon;
    }

    public Double getLatitude() {
        return latitude;
    }

    public void setLatitude(Double latitude) {
        this.latitude = latitude;
    }

    public Double getLongitude() {
        return longitude;
    }

    public void setLongitude(Double longitude) {
        this.longitude = longitude;
    }

    public Integer getCod_tom() {
        return cod_tom;
    }

    public void setCod_tom(Integer cod_tom) {
        this.cod_tom = cod_tom;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        City city = (City) o;
        return Objects.equals(id, city.id);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id);
    }

    @Override
    public String toString() {
        return "City{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", uf=" + uf +
                ", lat_lon='" + lat_lon + '\'' +
                ", latitude=" + latitude +
                ", longitude=" + longitude +
                ", cod_tom=" + cod_tom +
                '}';
    }
}
