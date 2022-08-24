package com.generation.learningspringwithspringboot.repository;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.generation.learningspringwithspringboot.data.Room;

@Repository
public interface IRoomRepository extends CrudRepository<Room,Long>{

}
