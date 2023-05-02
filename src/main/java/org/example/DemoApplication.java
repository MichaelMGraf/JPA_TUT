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
	CommandLineRunner commandLineRunner (StudentRepo studentRepo, HochschuleRepo hochschuleRepo) {
		return args -> {
			try {
				Hochschule dhbw_ka = new Hochschule("DHBW KA");
				hochschuleRepo.save(dhbw_ka);

				studentRepo.save(new Student("David", "Schulz", dhbw_ka));
				studentRepo.save(new Student("Jens", "Knossalla", dhbw_ka));
				studentRepo.save(new Student("Heinz", "Richard", dhbw_ka));
				studentRepo.save(new Student("Richard", "Heinz", dhbw_ka));

				System.out.println(studentRepo.findMatrikelnummerMax().get());
				System.out.println(studentRepo.findByMatrikelnummer(5291383).get());
				//System.out.println(studentRepo.findMatrikelnummerMin().get());

				System.out.println(hochschuleRepo.findById(1L).get().getStudenten());

			} catch (DataIntegrityViolationException e) {
			}
		};
	}

}
