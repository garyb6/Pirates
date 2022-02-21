package com.codeclan.example.pirateService;

import com.codeclan.example.pirateService.models.Pirate;
import com.codeclan.example.pirateService.repositories.PirateRepository;
import com.codeclan.example.pirateService.repositories.ShipRepository;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
class PirateServiceApplicationTests {

	@Autowired
	PirateRepository pirateRepository;

	@Autowired
	ShipRepository shipRepository;

	@Test
	void contextLoads() {
	}

	@Test
	public void createPirate(){
		Pirate jack = new Pirate("Jack", "Sparrow", 32);
		pirateRepository.save(jack);
	}

}
