package com.sqli.entities;

import jakarta.persistence.DiscriminatorValue;
import jakarta.persistence.Entity;

import java.util.Collection;
import java.util.Date;

@Entity
@DiscriminatorValue("CC")
public class CompteCourant extends Compte{
    private String decouvert;

    public CompteCourant() {
    }


    public CompteCourant(String codeCompte, Date dateCreation, double solde, Client client, Collection<Operation> operations, String decouvert) {
        super(codeCompte, dateCreation, solde, client, operations);
        this.decouvert = decouvert;
    }

    public String getDecouvert() {
        return decouvert;
    }

    public void setDecouvert(String decouvert) {
        this.decouvert = decouvert;
    }
}
