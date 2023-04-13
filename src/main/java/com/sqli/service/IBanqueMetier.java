package com.sqli.service;

import com.sqli.entities.Compte;
import com.sqli.entities.Operation;
import org.springframework.data.domain.Page;

public interface IBanqueMetier {
    public Compte consulterCompte(String codeCompte);
    public void verser(String codeCompte, double montant);
    public void retirer(String codeCompte, double montant);
    public void vierment(String codeCompte1, String codeCompte2, double montant);
    public Page<Operation> listOperation(String codeCompte, int page, int size);

}
