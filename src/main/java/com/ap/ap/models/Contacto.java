package com.ap.ap.models;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class Contacto
{
    @Id
    @GeneratedValue( strategy = GenerationType.AUTO)
    private Long idCon;
    private String githubLinkCon;
    private String linkedinLinkCon;

    public Contacto() {}
    public Contacto(Long idCon, String githubLinkCon, String linkedinLinkCon)
    {
        this.idCon = idCon;
        this.githubLinkCon = githubLinkCon;
        this.linkedinLinkCon = linkedinLinkCon;
    }

    public Long getIdCon() {
        return idCon;
    }

    public void setIdCon(Long idCon) {
        this.idCon = idCon;
    }

    public String getGithubLinkCon() {
        return githubLinkCon;
    }

    public void setGithubLinkCon(String githubLinkCon) {
        this.githubLinkCon = githubLinkCon;
    }

    public String getLinkedinLinkCon() {
        return linkedinLinkCon;
    }

    public void setLinkedinLinkCon(String linkedinLinkCon) {
        this.linkedinLinkCon = linkedinLinkCon;
    }
}
