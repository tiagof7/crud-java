package config;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;

@Configuration
//Procura por componentes a partir desse pacote.
@ComponentScan(basePackages = "entity")
//Ativa o Spring Data JPA
@EnableJpaRepositories
public class Config {

}