package com.example.demo.repository;

import java.util.List;
import org.springframework.data.repository.CrudRepository;
import com.example.demo.entities.Patrol;

public interface PatrolRepository extends CrudRepository<Patrol, Long> {

    List<Patrol> findAll();
    
}
