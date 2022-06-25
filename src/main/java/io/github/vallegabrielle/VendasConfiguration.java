package io.github.vallegabrielle;

import org.springframework.boot.CommandLineRunner;
import org.springframework.context.annotation.Bean;

@Development
public class VendasConfiguration {

    @Bean
    public CommandLineRunner executar() {
        return args -> {
            System.out.println("Rodando a configuracao");
        };
    }
}
