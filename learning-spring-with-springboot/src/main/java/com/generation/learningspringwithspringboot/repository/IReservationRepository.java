package com.generation.learningspringwithspringboot.repository;

import java.sql.Date;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.generation.learningspringwithspringboot.data.Reservation;

@Repository
public interface IReservationRepository extends JpaRepository<Reservation, Long> {
	
	Iterable<Reservation> findReservationByReservationDate(Date date);
	
}
