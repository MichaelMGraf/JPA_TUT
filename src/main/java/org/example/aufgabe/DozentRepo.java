package org.example.aufgabe;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import java.util.Optional;

public interface DozentRepo extends JpaRepository<Dozent, Long> {

    @Query("SELECT d from Dozent d LEFT JOIN FETCH d.kurse WHERE d.id = ?1")
    Optional<Dozent> findByIdMitKursen(long id);
}
