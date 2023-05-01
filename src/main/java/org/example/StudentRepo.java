package org.example;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import java.util.Optional;

public interface StudentRepo extends JpaRepository<Student, Long> {

    Optional<Student> findByMatrikelnummer(long matrikelnummer);

    @Query(value = "SELECT s FROM Student s WHERE s.matrikelnummer = (SELECT MAX(s.matrikelnummer) FROM Student s )")
    Optional<Student> findMatrikelnummerMax();

    @Query(value = "SELECT * FROM Student s WHERE s.matrikelnummer = (SELECT MIN(s.matrikelnummer) FROM Student s )", nativeQuery = true)
    Optional<Student> findMatrikelnummerMin();
}
