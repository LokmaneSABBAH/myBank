package com.sqli.entities;

import jakarta.persistence.*;

import java.io.Serializable;
import java.util.Collection;

@Entity
public class Client implements Serializable {
    @Id @GeneratedValue
    private Long code;
    private String nom;
    private String email;
    @OneToMany(mappedBy = "client", fetch = FetchType.LAZY)
    private Collection<Compte> comptes;

    public Client() {
    }

    public Client(String nom, String email, Collection<Compte> comptes) {
        this.nom = nom;
        this.email = email;
        this.comptes = comptes;
    }

    public Client(String nom, String email) {
        this.nom = nom;
        this.email = email;
    }

    public Long getCode() {
        return code;
    }

    public void setCode(Long code) {
        this.code = code;
    }

    public String getNaom() {
        return nom;
    }

    public void setNaom(String naom) {
        this.nom = naom;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public Collection<Compte> getComptes() {
        return comptes;
    }

    public void setComptes(Collection<Compte> comptes) {
        this.comptes = comptes;
    }
}
