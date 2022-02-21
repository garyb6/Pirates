package com.codeclan.example.pirateService.repositories;

import com.codeclan.example.pirateService.models.Pirate;
import org.springframework.data.jpa.repository.JpaRepository;

public interface PirateRepository extends JpaRepository<Pirate, Long> {

}
