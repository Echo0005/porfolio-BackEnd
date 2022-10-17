package com.ap.ap.models;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class Curso
{
    @Id
    @GeneratedValue( strategy = GenerationType.AUTO)
    private Long idCur;
    private String imgCur;
    private String dondeCur;
    private String queCur;
    private String fechaIniCur;
    private String fechaFinCur;

    public Curso() {}

    public Curso(Long idCur, String imgCur, String dondeCur, String queCur, String fechaIniCur, String fechaFinCur) {
        this.idCur = idCur;
        this.imgCur = imgCur;
        this.dondeCur = dondeCur;
        this.queCur = queCur;
        this.fechaIniCur = fechaIniCur;
        this.fechaFinCur = fechaFinCur;
    }

    public Long getIdCur() {
        return idCur;
    }

    public void setIdCur(Long idCur) {
        this.idCur = idCur;
    }

    public String getImgCur() {
        return imgCur;
    }

    public void setImgCur(String imgCur) {
        this.imgCur = imgCur;
    }

    public String getDondeCur() {
        return dondeCur;
    }

    public void setDondeCur(String dondeCur) {
        this.dondeCur = dondeCur;
    }

    public String getQueCur() {
        return queCur;
    }

    public void setQueCur(String queCur) {
        this.queCur = queCur;
    }

    public String getFechaIniCur() {
        return fechaIniCur;
    }

    public void setFechaIniCur(String fechaIniCur) {
        this.fechaIniCur = fechaIniCur;
    }

    public String getFechaFinCur() {
        return fechaFinCur;
    }

    public void setFechaFinCur(String fechaFinCur) {
        this.fechaFinCur = fechaFinCur;
    }
}
