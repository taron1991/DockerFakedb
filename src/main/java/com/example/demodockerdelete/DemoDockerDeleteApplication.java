package com.example.demodockerdelete;

import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.jdbc.JdbcConnectionDetails;
import org.springframework.context.annotation.Bean;

import static java.lang.StringTemplate.STR;


@SpringBootApplication
public class DemoDockerDeleteApplication {

    public static void main(String[] args) {
        SpringApplication.run(DemoDockerDeleteApplication.class, args);
    }


    /*CommandLineRunner - это функциональный интерфейс Spring, который
    предоставляет способ выполнения дополнительной логики при запуске Spring приложения.*/
    @Bean
    public CommandLineRunner commandLineRunner(JdbcConnectionDetails jdbc){
        return args -> {
            var details = STR."""
                    class: \{jdbc.getClass().getName()}
                    JDBC URl: \{jdbc.getJdbcUrl()}
                    Username: \{jdbc.getUsername()}
                    Password: \{jdbc.getPassword()}
                    """;
            System.out.println(details);
        };
    }

}
