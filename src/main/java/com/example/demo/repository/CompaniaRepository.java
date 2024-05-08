package com.example.demo.repository;


import java.util.List;

import org.springframework.data.repository.CrudRepository;

import com.example.demo.entities.Compania;

public interface CompaniaRepository extends CrudRepository<Compania,Long> {
   List<Compania> findAll();
}
