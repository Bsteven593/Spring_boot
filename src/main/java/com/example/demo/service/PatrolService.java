package com.example.demo.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.example.demo.entities.Patrol;
import com.example.demo.repository.PatrolRepository;

@Service
public class PatrolService {
    @Autowired
    private PatrolRepository patrolRepository;


    public Patrol save(Patrol entity){
        return patrolRepository.save(entity);
    }

    public Patrol findById(Long id){
        return patrolRepository.findById(id).orElse(null);
    }

    public void deleteById(Long id){
        patrolRepository.deleteById(id);
    }

    public List<Patrol> findAll(){
        return patrolRepository.findAll();
    }
}
