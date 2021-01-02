package com.concepto.unmsm.microservicios.app.usuarios;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;

@SpringBootApplication
@EnableEurekaClient
public class MicroserviciosUnmsmUsuariosApplication {

    public static void main(String[] args) {
        SpringApplication.run(MicroserviciosUnmsmUsuariosApplication.class, args);
    }

}
