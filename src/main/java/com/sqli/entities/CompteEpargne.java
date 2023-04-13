package com.sqli.entities;

import jakarta.persistence.DiscriminatorValue;
import jakarta.persistence.Entity;

import java.util.Collection;
import java.util.Date;

@Entity
@DiscriminatorValue("CE")
public class CompteEpargne extends Compte{
    private double taux;

    public CompteEpargne() {
    }

    public CompteEpargne(String codeCompte, Date dateCreation, double solde, Client client, Collection<Operation> operations, double taux) {
        super(codeCompte, dateCreation, solde, client, operations);
        this.taux = taux;
    }

    public CompteEpargne(String codeCompte, Date dateCreation, double solde, Client client, double taux) {
        super(codeCompte, dateCreation, solde, client);
        this.taux = taux;
    }

    public double getTaux() {
        return taux;
    }

    public void setTaux(double taux) {
        this.taux = taux;
    }
}
