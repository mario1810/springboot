package com.generation.learningspringwithspringboot.util;

import org.springframework.boot.context.event.ApplicationReadyEvent;
import org.springframework.context.ApplicationListener;
import org.springframework.stereotype.Component;

import com.generation.learningspringwithspringboot.data.Guest;
import com.generation.learningspringwithspringboot.data.Reservation;
import com.generation.learningspringwithspringboot.data.Room;
import com.generation.learningspringwithspringboot.repository.IGuestRepository;
import com.generation.learningspringwithspringboot.repository.IReservationRepository;
import com.generation.learningspringwithspringboot.repository.IRoomRepository;

@Component
public class AppStartupEvent implements ApplicationListener<ApplicationReadyEvent>{

	private final IRoomRepository roomRepository;
	private final IGuestRepository guestRepository;
	private final IReservationRepository reservationRepository;
	
	
	public AppStartupEvent(IRoomRepository roomRepository, IGuestRepository guestRepository,
			IReservationRepository reservationRepository) {
		this.roomRepository = roomRepository;
		this.guestRepository = guestRepository;
		this.reservationRepository = reservationRepository;
	}



	@Override
	public void onApplicationEvent(ApplicationReadyEvent event) {
		Iterable<Room> rooms= this.roomRepository.findAll();
		rooms.forEach(System.out::println);
		Iterable<Guest> guests = this.guestRepository.findAll();
		guests.forEach(System.out::println);
		Iterable<Reservation> reservations = this.reservationRepository.findAll();
		reservations.forEach(System.out::println);
	}

}
