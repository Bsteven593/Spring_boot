package com.example.demo.repository;

import java.util.List;
import org.springframework.data.repository.CrudRepository;
import com.example.demo.entities.Police;

public interface PoliceRepository extends CrudRepository<Police, Long> {
    List<Police> findAll();
}
