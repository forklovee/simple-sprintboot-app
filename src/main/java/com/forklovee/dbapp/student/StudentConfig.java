package com.forklovee.dbapp.student;

import org.springframework.boot.CommandLineRunner;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import java.time.LocalDate;
import java.time.Month;
import java.util.List;

import static java.time.Month.*;

@Configuration
public class StudentConfig {

    @Bean
    CommandLineRunner commandLineRunner(StudentRepository studentRepository) {
        return args -> {
            Student thomas = new Student(
                    "Thomas",
                    "Zane",
                    "tom.zane@gmail.com",
                    LocalDate.of(1964, DECEMBER, 15)
            );

            Student barbara = new Student(
                    "Barbara",
                    "Jagger",
                    "barb.jagger@gmail.com",
                    LocalDate.of(1971, JUNE, 29)
            );

            Student alan = new Student(
                    "Alan",
                    "Wake",
                    "alan.wake@gmail.com",
                    LocalDate.of(1989, APRIL, 14)
            );

            studentRepository.saveAll(
                    List.of(thomas, barbara, alan)
            );
        };
    }
}
