package com.forklovee.dbapp;

import com.forklovee.dbapp.student.Student;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.time.LocalDate;
import java.time.Month;
import java.util.List;

@SpringBootApplication
@RestController
public class DbappApplication {

	public static void main(String[] args) {
		SpringApplication.run(DbappApplication.class, args);
	}

}
