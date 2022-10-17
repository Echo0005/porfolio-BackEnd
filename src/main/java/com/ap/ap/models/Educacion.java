package com.ap.ap.models;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class Educacion
{
    @Id
    @GeneratedValue ( strategy = GenerationType.AUTO )
    private Long idEdu;

    private String institucionEdu;
    private String tituloEdu;
    private String fechaEdu;
    private String descripEdu;
    private String imagenEdu;

    public Educacion() {}

    public Educacion(Long idEdu, String institucionEdu, String tituloEdu, String fechaEdu, String descripEdu, String imagenEdu) {
        this.idEdu = idEdu;
        this.institucionEdu = institucionEdu;
        this.tituloEdu = tituloEdu;
        this.fechaEdu = fechaEdu;
        this.descripEdu = descripEdu;
        this.imagenEdu = imagenEdu;
    }

    public Long getIdEdu()
    {
        return idEdu;
    }

    public void setIdEdu(Long idEdu)
    {
        this.idEdu = idEdu;
    }

    public String getInstitucionEdu() {
        return institucionEdu;
    }

    public void setInstitucionEdu(String institucionEdu) {
        this.institucionEdu = institucionEdu;
    }

    public String getTituloEdu()
    {
        return tituloEdu;
    }

    public void setTituloEdu(String tituloEdu)
    {
        this.tituloEdu = tituloEdu;
    }

    public String getFechaEdu()
    {
        return fechaEdu;
    }


    public void setFechaEdu(String fechaEdu)
    {
        this.fechaEdu = fechaEdu;
    }

    public String getDescripEdu() {
        return descripEdu;
    }

    public void setDescripEdu(String descripEdu)
    {
        this.descripEdu = descripEdu;
    }

    public String getImagenEdu() {
        return imagenEdu;
    }

    public void setImagenEdu(String imagenEdu)
    {
        this.imagenEdu = imagenEdu;
    }
}
