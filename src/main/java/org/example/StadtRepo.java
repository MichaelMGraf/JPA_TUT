package org.example;

import org.springframework.data.jpa.repository.JpaRepository;


public interface StadtRepo extends JpaRepository<Stadt, Long> {
}
