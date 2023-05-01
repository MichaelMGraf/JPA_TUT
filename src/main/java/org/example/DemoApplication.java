package org.example;

import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;
import org.springframework.dao.DataIntegrityViolationException;

import java.util.Optional;

@SpringBootApplication
public class DemoApplication {

	public static void main(String[] args) {
		SpringApplication.run(DemoApplication.class, args);
	}


	@Bean
	CommandLineRunner commandLineRunner (StudentRepo studentRepo) {
		return args -> {
			try {
				studentRepo.save(new Student(5291382, "David", "Schulz"));
				studentRepo.save(new Student(5291383, "Jens", "Knossalla"));
				studentRepo.save(new Student(5291384, "Heinz", "Richard"));
				studentRepo.save(new Student(5291385, "Richard", "Heinz"));

				System.out.println(studentRepo.findMatrikelnummerMax().get());
				System.out.println(studentRepo.findByMatrikelnummer(5291383).get());
				System.out.println(studentRepo.findMatrikelnummerMin().get());
			} catch (DataIntegrityViolationException e) {
			}
		};
	}

}
