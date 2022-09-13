package com.student.studentapp.student;

import org.springframework.boot.CommandLineRunner;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import java.time.LocalDate;
import java.time.Month;
import java.util.List;

@Configuration
public class StudentConfig {


    @Bean
    CommandLineRunner commandLineRunner(StudentRepository repository){
        return args -> {
            Student chiran = new Student(
                    "Chiran",
                    "chiran@gmail.com",
                    LocalDate.of(2000, Month.JANUARY, 4)

            );
            Student james = new Student(
                    "james",
                    "james@gmail.com",
                    LocalDate.of(2003, Month.JANUARY, 4)

            );
            repository.saveAll(
                    List.of(chiran,james)
            );

        };
    }
}
