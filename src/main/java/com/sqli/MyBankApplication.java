package com.sqli;

import com.sqli.dao.ClientRepository;
import com.sqli.dao.CompteRepository;
import com.sqli.dao.OperationRepository;
import com.sqli.entities.*;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

@SpringBootApplication
public class MyBankApplication implements CommandLineRunner {
    @Autowired
    ClientRepository clientRepository;
    @Autowired
    CompteRepository compteRepository;
    @Autowired
    OperationRepository operationRepository;

    public static void main(String[] args) {
        SpringApplication.run(MyBankApplication.class, args);
 }

    @Override
    public void run(String... args) throws Exception {
        Client c1 = clientRepository.save(new Client("lokmane", "lsabbah@sqli.com"));
        Client c2 = clientRepository.save(new Client("abdeladim", "asabbah@sqli.com"));

        //String codeCompte, Date dateCreation, double solde, Client client, Collection<Operation> operations, String decouver
        Compte cp1 = compteRepository.save(new CompteCourant("cp1", new Date(), 10000, c1, 6000));
        Compte cp2 = compteRepository.save(new CompteEpargne("cp2", new Date(), 10000, c2, 6000));

        //Long numero, Date dateOperation, double montant, Compte compte
        operationRepository.save(new Versement(new Date(), 200, cp1));
        operationRepository.save(new Versement(new Date(), 300, cp2));
    }
}
