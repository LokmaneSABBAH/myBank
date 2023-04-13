package com.sqli.service;

import com.sqli.entities.Compte;
import com.sqli.entities.Operation;
import org.springframework.data.domain.Page;

public class BanqueMetierImpl implements IBanqueMetier{
    @Override
    public Compte consulterCompte(String codeCompte) {
        return null;
    }

    @Override
    public void verser(String codeCompte, double montant) {

    }

    @Override
    public void retirer(String codeCompte, double montant) {

    }

    @Override
    public void vierment(String codeCompte1, String codeCompte2, double montant) {

    }

    @Override
    public Page<Operation> listOperation(String codeCompte, int page, int size) {
        return null;
    }
}
