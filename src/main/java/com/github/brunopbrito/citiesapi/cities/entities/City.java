package com.github.brunopbrito.citiesapi.cities.entities;

import com.fasterxml.jackson.annotation.JsonSubTypes;
import org.hibernate.annotations.Type;
import org.hibernate.annotations.TypeDef;
import org.hibernate.annotations.TypeDefs;
import org.springframework.data.geo.Point;
import sun.jvm.hotspot.types.PointerType;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;
import java.util.Objects;
// Falta fazer a ponte do tipo point para a minha API
@Entity(name="City")
@Table(name="cidade")
@TypeDefs(value = {
        @TypeDef(name ="point", typeClass = PointType.class)
}
)
public class City {

    @Id
    private Long id;
    @Column(name="nome")
    private String name;
    private Integer uf;
    private String lat_lon;
    private Double latitude;
    private Double longitude;
    private Integer cod_tom;
    @Type(type="point")
    @Column(name = "lat_lon", updatable = false, insertable = false)
    private Point location;

    public City(Long id, String name, Integer uf, String lat_lon, Double latitude, Double longitude, Integer cod_tom, Point location) {
        this.id = id;
        this.name = name;
        this.uf = uf;
        this.lat_lon = lat_lon;
        this.latitude = latitude;
        this.longitude = longitude;
        this.cod_tom = cod_tom;
        this.location = location;
    }

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

    public Point getLocation() {
        return location;
    }

    public void setLocation(Point location) {
        this.location = location;
    }
}
