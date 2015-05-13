package com;

import areaTrabajo.wsdl.AreaTrabajoResponse;
import com.cliente.AreaTrabajoCliente;
import com.configuracion.ConfiguracionServiciosSOAP;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.ComponentScan;

@ComponentScan
@EnableAutoConfiguration
public class PruebaApplication {

    public static void main(String[] args) {
        SpringApplication.run(PruebaApplication.class, args);
    }
}
