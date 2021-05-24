package com.github.brunopbrito.citiesapi.cities.entities;

import org.hibernate.annotations.Type;
import org.hibernate.annotations.TypeDef;
import org.hibernate.annotations.TypeDefs;
import org.springframework.data.geo.Point;


import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;
import java.util.Objects;

@Entity
@Table(name="cidade")
@TypeDefs(value = {
        @TypeDef(name ="point", typeClass = PointType.class)
}
)
public class City {

    @Id
    private Long id;
    @Column(name = "nome")
    private String name;
    private Integer uf;
    private Double latitude;
    private Double longitude;
    private Integer cod_tom;
    private String lat_lon;
    @Type(type = "point")
    @Column(name = "lat_lon", updatable = false, insertable = false)
    private Point location;

    public City() {
    }

    public Long getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public Integer getUf() {
        return uf;
    }

    public Double getLatitude() {
        return latitude;
    }

    public Double getLongitude() {
        return longitude;
    }

    public Integer getCod_tom() {
        return cod_tom;
    }

    public Point getLocation() {
        return location;
    }

    public String getLat_lon() {
        return lat_lon;
    }
}

