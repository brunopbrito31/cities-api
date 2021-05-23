package com.github.brunopbrito.citiesapi.states.entities;

import com.vladmihalcea.hibernate.type.json.JsonBinaryType;
import org.hibernate.annotations.Type;
import org.hibernate.annotations.TypeDef;
import org.hibernate.annotations.TypeDefs;

import javax.persistence.*;
import java.util.List;
import java.util.Objects;


@Entity(name = "State")
@Table(name ="estado")
@TypeDefs({
        @TypeDef(name = "jsonb", typeClass = JsonBinaryType.class)
}
)
public class State {

    @Id
    private long id;
    @Column(name ="nome")
    private String name;
    private String uf;
    private Integer ibge;
    private Integer pais;

    @Type(type ="jsonb")
    @Basic(fetch = FetchType.LAZY)
    @Column(name ="ddd", columnDefinition = "jsonb")
    private List<Integer> ddd;

    public State() {
    }

    public long getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public String getUf() {
        return uf;
    }

    public Integer getIbge() {
        return ibge;
    }

    public Integer getPais() {
        return pais;
    }

    public List<Integer> getDdd() {
        return ddd;
    }

    public void setId(long id) {
        this.id = id;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setUf(String uf) {
        this.uf = uf;
    }

    public void setIbge(Integer ibge) {
        this.ibge = ibge;
    }

    public void setPais(Integer pais) {
        this.pais = pais;
    }

    public void setDdd(List<Integer> ddd) {
        this.ddd = ddd;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        State state = (State) o;
        return id == state.id;
    }

    @Override
    public int hashCode() {
        return Objects.hash(id);
    }

    @Override
    public String toString() {
        return "State{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", uf='" + uf + '\'' +
                ", ibge=" + ibge +
                ", pais=" + pais +
                ", ddd=" + ddd +
                '}';
    }
}
