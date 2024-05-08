package com.example.demo.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;


import com.example.demo.entities.Patrol;
import com.example.demo.service.PatrolService;

import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;


@RestController
@RequestMapping("/api/patrol")
public class PatrolController {
    @Autowired
    private PatrolService patrolService;

    @PostMapping("/patrol")
    public Patrol findById(@RequestBody Patrol entity){
        return patrolService.save(entity);
    }

    @GetMapping("/{id}")
    public Patrol findById(@PathVariable("id") Long id) {
        return patrolService.findById(id);
    }

     @PutMapping("/")
    public Patrol update(@RequestBody Patrol entity){
        return patrolService.save(entity);
    }

     @DeleteMapping("/{id}")
    public void delete(@PathVariable("id") Long id){
    patrolService.deleteById(id);
    }
       
      @GetMapping("/")
    public List<Patrol> findAll(){
        return patrolService.findAll();
    }
    }
    





