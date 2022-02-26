package com.api.parkingcontrol.controllers;

import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RestController;

import com.api.parkingcontrol.repositories.ParkingSpotRepository;

@RestController
//Para permitir acessado a partir de qualquer fonte 
@CrossOrigin(origins = "*", maxAge = 3600)
public class ParkingSpotController {
	
	final ParkingSpotRepository parkingSpotRepository;
	
	public ParkingSpotController(ParkingSpotRepository parkingSpotRepository) {
		this.parkingSpotRepository = parkingSpotRepository;
	}
}
