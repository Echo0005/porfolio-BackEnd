package com.ap.ap.models;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class SkillSoft
{
    @Id
    @GeneratedValue( strategy = GenerationType.AUTO )
    private Long idSoft;
    private String nombre;

    public SkillSoft() {}
    public SkillSoft(Long idSoft, String nombre)
    {
        this.idSoft = idSoft;
        this.nombre = nombre;
    }

    public Long getIdSoft() {
        return idSoft;
    }

    public void setIdSoft(Long idSoft) {
        this.idSoft = idSoft;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }
}
