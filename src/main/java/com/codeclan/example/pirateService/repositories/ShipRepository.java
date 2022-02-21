package com.codeclan.example.pirateService.repositories;

import com.codeclan.example.pirateService.models.Ship;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ShipRepository extends JpaRepository<Ship, Long> {
}
