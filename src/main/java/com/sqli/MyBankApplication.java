package com.sqli;

import com.sqli.dao.ClientRepository;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

@SpringBootApplication
public class MyBankApplication {

    public static void main(String[] args) {
        ApplicationContext ctx =  SpringApplication.run(MyBankApplication.class, args);
        ClientRepository clientRepository = ctx.getBean(ClientRepository.class);
        clientRepository.save()
    }

}
