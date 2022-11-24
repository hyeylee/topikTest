package org.zerock.topik;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Scope;


import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;


@Configuration
public class ApplicationConfig {
    @Bean @Scope("singleton")
    public EntityManagerFactory getEmf(){
        return Persistence.createEntityManagerFactory("test");
    }
}
