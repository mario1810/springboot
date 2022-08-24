package com.generation.learningspringwithspringboot.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import org.springframework.stereotype.Repository;

import com.generation.learningspringwithspringboot.data.Guest;

@Repository
public interface IGuestRepository extends JpaRepository<Guest,Long> {

	
}
