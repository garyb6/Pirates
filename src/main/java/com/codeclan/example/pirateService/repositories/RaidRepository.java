package com.codeclan.example.pirateService.repositories;

import com.codeclan.example.pirateService.models.Raid;
import org.springframework.data.jpa.repository.JpaRepository;

public interface RaidRepository extends JpaRepository<Raid, Long> {
}
