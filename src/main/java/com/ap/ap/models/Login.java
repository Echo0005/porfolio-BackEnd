package com.ap.ap.models;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class Login
{
    @Id
    @GeneratedValue( strategy = GenerationType.AUTO)
    private Long idLog;
    private String emailLog;
    private String passwordLog;

    public Login() {}
    public Login(Long idLog, String emailLog, String passwordLog)
    {
        this.idLog = idLog;
        this.emailLog = emailLog;
        this.passwordLog = passwordLog;
    }

    public Long getIdLog() {
        return idLog;
    }

    public void setIdLog(Long idLog) {
        this.idLog = idLog;
    }

    public String getEmailLog() {
        return emailLog;
    }

    public void setEmailLog(String emailLog) {
        this.emailLog = emailLog;
    }

    public String getPasswordLog() {
        return passwordLog;
    }

    public void setPasswordLog(String passwordLog) {
        this.passwordLog = passwordLog;
    }
}
