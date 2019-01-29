package com.car.pooling.surcharge.controller;

import java.text.DecimalFormat;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.http.HttpEntity;
import org.springframework.http.HttpMethod;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

import com.car.pooling.surcharge.config.ApplicationProperties;
import com.car.pooling.surcharge.controller.model.CarPriceDetails;
import com.car.pooling.surcharge.controller.model.PriceDetails;


	//    _
	//.__(.)< (Quack--Geschafft--Quack)
	// \___)


@RestController
public class SurchargeController {
	
	/**
	 * Die Properties
	 * Ruft die properties von application.yml auf
	 */
	
	@Autowired
	private ApplicationProperties properties;
	
	/**
	 * Hier ist das RestTemplate
	 * Das ist so wie ich es verstanden habe die libary die von Spring Boot bereitgestellt wird, um mit den anderen rest services zu kommunizieren
	 */
	
	@Autowired
	private RestTemplate restTemplate;
	
	/**
	 * Die car URL.
	 * Die Value wird genutzt, um die details von der yml Datei zu holen.
	 * Die URL wird da angegeben
	 */
	
	@Value("${car.details.url}")
	private String carDetailsUrl;
	
	/** 
	 * Holt die price details
	 * noOfDays und FIN werden als Input eingegeben
	 * Return wird die Price details wie basePrice, surchargePrice und totalprice
	 * Test --> http://localhost:8083/car/pooling/surcharge?noOfDays=7&FIN=9753198
	 */
	
	@GetMapping(value = "/car/pooling/surcharge", produces = MediaType.APPLICATION_JSON_VALUE)
	public PriceDetails getPriceDetails(@RequestParam int noOfDays,
			@RequestParam String FIN) {
		
		
		// Erstellung der httpEntity, die für die Rest Kommunikation notwendig ist
		 
		
		HttpEntity<String> httpEntity = new HttpEntity<>(null);
		
		// Rest Kommunikation mit den anderen MS mithilfe von restTemplate
		// und das Abrufen der erforderlichen Fahrzeugdaten basierend auf FIN
		
		ResponseEntity<CarPriceDetails> carEntity = restTemplate.exchange(carDetailsUrl, HttpMethod.GET, httpEntity,
				CarPriceDetails.class, FIN);
		
	    // Abrufen der Carprice Details von der response entity von oben
		
		CarPriceDetails carPriceDetails = carEntity.getBody();
		
		// Aufruf der getSurcharge Methode, um den % Surcharge mit den oben abgerufenen price details abzurufen
		
		int surcharge = this.getSurcharge(carPriceDetails.getEnginePower(), carPriceDetails.getLocation());
		
		// Den baseprice per day holen
		
		double basePrice = carPriceDetails.getBasePrice();
		
		// Hier kommt dann die Formel rein für die Berechnung surchage pro Tag
		
		double surchargePerDay = (surcharge * basePrice) / 100;
		
		// Berechnung für den totalprice
		
		double totalPrice = noOfDays * (basePrice + surchargePerDay);
		
		// Format für die Nachkommastellen .00
		
		DecimalFormat numberFormat = new DecimalFormat("#.00");
		
		// Erstellt ein PriceDetails Objekt und returnt es als output
		
		return new PriceDetails(basePrice, Double.parseDouble(numberFormat.format(surchargePerDay)),
				Double.parseDouble(numberFormat.format(totalPrice)));
	}
	
	/**
	 * Die Methode, um die % von surcharge zubekommen basierend auf die engine power und location
	 * Hier wird dann der Vergleich gemacht mit der engine power
	 */
	
	private int getSurcharge(short enginePower, String country) {
		if (enginePower <= 140) {
			return properties.getLessThan140Map().get(country);
			
		} else if (enginePower > 140 && enginePower <= 200) {
			return properties.getLessThan200Map().get(country);
			
		} else if (enginePower > 200 && enginePower <= 320) {
			return properties.getLessThan320Map().get(country);
			
		} else if (enginePower > 320 && enginePower <= 400) {
			return properties.getLessThan400Map().get(country);
			
		} else {
			return properties.getGreaterThan400Map().get(country);
		}
	}
}
