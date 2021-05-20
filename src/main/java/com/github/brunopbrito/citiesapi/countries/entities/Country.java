package com.github.brunopbrito.citiesapi.countries.entities;


import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;
import java.util.Objects;

@Entity(name ="Country")
@Table(name="pais")
public class Country {
    @Id
    private long id;
    @Column(name="nome")
    private String name;
    @Column(name="nome_pt")
    private String namePortuguese;
    private String sigla;
    private Integer bacen;

    public Country(){
    }

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getNamePortuguese() {
        return namePortuguese;
    }

    public void setNamePortuguese(String namePortuguese) {
        this.namePortuguese = namePortuguese;
    }

    public String getSigla() {
        return sigla;
    }

    public void setSigla(String sigla) {
        this.sigla = sigla;
    }

    public Integer getBacen() {
        return bacen;
    }

    public void setBacen(Integer bacen) {
        this.bacen = bacen;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Country country = (Country) o;
        return id == country.id;
    }

    @Override
    public int hashCode() {
        return Objects.hash(id);
    }

    @Override
    public String toString() {
        return "Country{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", namePortuguese='" + namePortuguese + '\'' +
                ", sigla='" + sigla + '\'' +
                ", bacen=" + bacen +
                '}';
    }
}
