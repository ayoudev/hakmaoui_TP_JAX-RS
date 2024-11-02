package ma.emsi.jaxwebservices;

import ma.emsi.jaxwebservices.entity.Compte;
import ma.emsi.jaxwebservices.entity.TypeCompte;
import ma.emsi.jaxwebservices.repository.CompteRepository;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

import java.util.Date;

@SpringBootApplication
public class JaxWebservicesApplication {

    public static void main(String[] args) {
        SpringApplication.run(JaxWebservicesApplication.class, args);
    }


    @Bean
    CommandLineRunner commandLineRunner(CompteRepository compteRepository) {
        return args -> {
            compteRepository.save(Compte.builder().prix(Math.random()*9000).dateCreation(new Date()).type(TypeCompte.COURANT).build());
            compteRepository.save(Compte.builder().prix(Math.random()*9000).dateCreation(new Date()).type(TypeCompte.EPARGNE).build());
            compteRepository.save(Compte.builder().prix(Math.random()*9000).dateCreation(new Date()).type(TypeCompte.COURANT).build());
            compteRepository.save(Compte.builder().prix(Math.random()*9000).dateCreation(new Date()).type(TypeCompte.EPARGNE).build());
            compteRepository.save(Compte.builder().prix(Math.random()*9000).dateCreation(new Date()).type(TypeCompte.COURANT).build());

            compteRepository.findAll().forEach(System.out::println);
        };
    }
}
