package com.example.pp_ren_rithysak_jpa_hibernate_homework001;

import io.swagger.v3.oas.annotations.OpenAPIDefinition;
import io.swagger.v3.oas.annotations.info.Info;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
@OpenAPIDefinition(info = @Info(title = "JPA/Hibernate01", version = "1.0"))

public class PpRenRithysakJpaHibernateHomework001Application {

    public static void main(String[] args) {
        SpringApplication.run(PpRenRithysakJpaHibernateHomework001Application.class, args);
    }

}
