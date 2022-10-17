package com.ap.ap.models;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class Experiencia 
{
    @Id
    @GeneratedValue( strategy = GenerationType.AUTO )
    private Long idExp;
    private String logoLinkExp;
    private String empresaExp;
    private String tipoEmpleoExp;
    private String puestoExp;
    private Boolean esTrabajoActualExp;
    private String fechaInicioExp;
    private String fechaFinExp;

    public Experiencia() {}
    public Experiencia(Long idExp, String logoLinkExp, String empresaExp, String tipoEmpleoExp, String puestoExp, Boolean esTrabajoActualExp, String fechaInicioExp, String fechaFinExp) {
        this.idExp = idExp;
        this.logoLinkExp = logoLinkExp;
        this.empresaExp = empresaExp;
        this.tipoEmpleoExp = tipoEmpleoExp;
        this.puestoExp = puestoExp;
        this.esTrabajoActualExp = esTrabajoActualExp;
        this.fechaInicioExp = fechaInicioExp;
        this.fechaFinExp = fechaFinExp;
    }

    public Long getIdExp() {
        return idExp;
    }

    public void setIdExp(Long idExp) {
        this.idExp = idExp;
    }

    public String getLogoLinkExp() {
        return logoLinkExp;
    }

    public void setLogoLinkExp(String logoLinkExp) {
        this.logoLinkExp = logoLinkExp;
    }

    public String getEmpresaExp() {
        return empresaExp;
    }

    public void setEmpresaExp(String empresaExp) {
        this.empresaExp = empresaExp;
    }

    public String getTipoEmpleoExp() {
        return tipoEmpleoExp;
    }

    public void setTipoEmpleoExp(String tipoEmpleoExp) {
        this.tipoEmpleoExp = tipoEmpleoExp;
    }

    public String getPuestoExp() {
        return puestoExp;
    }

    public void setPuestoExp(String puestoExp) {
        this.puestoExp = puestoExp;
    }

    public Boolean getEsTrabajoActualExp() {
        return esTrabajoActualExp;
    }

    public void setEsTrabajoActualExp(Boolean esTrabajoActualExp) {
        this.esTrabajoActualExp = esTrabajoActualExp;
    }

    public String getFechaInicioExp() {
        return fechaInicioExp;
    }

    public void setFechaInicioExp(String fechaInicioExp) {
        this.fechaInicioExp = fechaInicioExp;
    }

    public String getFechaFinExp() {
        return fechaFinExp;
    }

    public void setFechaFinExp(String fechaFinExp) {
        this.fechaFinExp = fechaFinExp;
    }
}
