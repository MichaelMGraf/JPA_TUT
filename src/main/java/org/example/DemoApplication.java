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
	CommandLineRunner commandLineRunner (StudentRepo studentRepo, HochschuleRepo hochschuleRepo, StadtRepo stadtRepo) {
		return args -> {
			try {
				Stadt ka = new Stadt("Karlsruhe");
				stadtRepo.save(ka);

				Hochschule dhbw_ka = new Hochschule("DHBW KA");
				dhbw_ka.setStadt(ka);
				hochschuleRepo.save(dhbw_ka);

				studentRepo.save(new Student("David", "Schulz", dhbw_ka));
				studentRepo.save(new Student("Jens", "Knossalla", dhbw_ka));
				studentRepo.save(new Student("Heinz", "Richard", dhbw_ka));
				studentRepo.save(new Student("Richard", "Heinz", dhbw_ka));

				System.out.println(studentRepo.findMatrikelnummerMax().get());
				System.out.println(studentRepo.findByMatrikelnummer(5291383).get());
				//System.out.println(studentRepo.findMatrikelnummerMin().get());

				System.out.println(hochschuleRepo.findByIdMitStudenten(1L).get().getStudenten());

				System.out.println(hochschuleRepo.findById(1L).get());

				Stadt mannheim = new Stadt("Mannheim");
				stadtRepo.save(mannheim);
				Hochschule dhbw_ma = new Hochschule("DHBW MA");
				dhbw_ma.setStadt(mannheim);
				hochschuleRepo.save(dhbw_ma);

			} catch (DataIntegrityViolationException e) {
				e.printStackTrace();
			}
		};
	}

}
