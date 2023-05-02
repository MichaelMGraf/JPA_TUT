package org.example;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import java.util.Optional;


public interface HochschuleRepo extends JpaRepository<Hochschule, Long> {

    @Query("select h from Hochschule h left join fetch h.studenten where h.id = ?1")
    Optional<Hochschule> findByIdMitStudenten(long id);
}
