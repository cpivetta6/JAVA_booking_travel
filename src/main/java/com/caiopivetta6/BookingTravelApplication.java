package com.caiopivetta6;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Arrays;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import com.caiopivetta6.domain.City;
import com.caiopivetta6.domain.Hotel;
import com.caiopivetta6.domain.Ristorant;
import com.caiopivetta6.domain.State;
import com.caiopivetta6.domain.TravelPack;
import com.caiopivetta6.repositories.CityRepository;
import com.caiopivetta6.repositories.HotelRepository;
import com.caiopivetta6.repositories.RistorantRepository;
import com.caiopivetta6.repositories.StateRepository;
import com.caiopivetta6.repositories.TravelPackRepository;

@SpringBootApplication
public class BookingTravelApplication implements CommandLineRunner {

	public static void main(String[] args) {
		SpringApplication.run(BookingTravelApplication.class, args);
	}
	
	
	@Autowired
	private CityRepository cityRepository;
	
	@Autowired
	private StateRepository stateRepository;
	
	@Autowired
	private HotelRepository hotelRepository;
	
	@Autowired
	private RistorantRepository ristorantRepository;
	
	@Autowired
	private TravelPackRepository travelPackRepository;
	
	@Override
	public void run(String... args) throws Exception, ParseException {
		// TODO Auto-generated method stub
		
		SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");
		
		//CITY AND STATE
		
		State state = new State(null, "Veneto");
		City city = new City(null, "Verona", state);
		
		state.getCity().add(city);
		
		stateRepository.saveAll(Arrays.asList(state));
		cityRepository.saveAll(Arrays.asList(city));
		
		//HOTEL
		Hotel hotel = new Hotel(null, "Hotel Firenze", 140.0, city);
		
		hotelRepository.saveAll(Arrays.asList(hotel));
		
		city.getHotels().addAll(Arrays.asList(hotel));
		
		//RISTORANT
		
		Ristorant ristorant = new Ristorant(null, "Pizzeria Napoli", 14.0);
		ristorant.setCity(city);

		ristorantRepository.saveAll(Arrays.asList(ristorant));
		city.getHotels().add(hotel);
		
		//TRAVEL PACK
		
		TravelPack travelPack = new TravelPack(null, sdf.parse("22/09/2023").toInstant(), 5);
		
		travelPack.setCity(city);
		travelPack.setHotel(hotel);
		travelPack.setRistorant(ristorant);
		
		travelPackRepository.save(travelPack);
		
		city.getTravelPacks().add(travelPack);
		hotel.getTravelPack().add(travelPack);
		ristorant.getTravelPacks().add(travelPack);
		
		
		
	}

	
}
