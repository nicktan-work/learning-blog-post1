package com.nickblog.demo.student;


import org.springframework.boot.CommandLineRunner;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import java.time.LocalDate;
import java.time.Month;
import java.util.List;

@Configuration
public class StudentConfig {

    @Bean
    CommandLineRunner commandLineRunner(
            StudentRepository repository) {
        return args -> {
            Student nick = new Student(
                    "Nick",
                    22,
                    LocalDate.of(2000, Month.JANUARY, 1),
                    "email@email.com"
            );

            Student jane = new Student(
                    "Jane",
                    21,
                    LocalDate.of(1999, Month.JANUARY, 1),
                    "email@email.com"
            );

            repository.saveAll(
                    List.of(nick, jane)
            );
        };
    }
}