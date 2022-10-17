package com.ap.ap.models;

import javax.persistence.*;

@Entity
public class Proyecto
{
    @Id
    @GeneratedValue( strategy = GenerationType.AUTO)
    @Column( nullable = false, updatable = false )
    private Long idPro;
    private String nombrePro;
    private String linkPro;

    public Proyecto() {}
    public Proyecto(Long idPro, String nombrePro, String linkPro) {
        this.idPro = idPro;
        this.nombrePro = nombrePro;
        this.linkPro = linkPro;
    }

    public Long getIdPro() {
        return idPro;
    }

    public void setIdPro(Long idPro) {
        this.idPro = idPro;
    }

    public String getNombrePro() {
        return nombrePro;
    }

    public void setNombrePro(String nombrePro) {
        this.nombrePro = nombrePro;
    }

    public String getLinkPro() {
        return linkPro;
    }

    public void setLinkPro(String linkPro) {
        this.linkPro = linkPro;
    }
}
