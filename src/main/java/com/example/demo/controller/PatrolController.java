package com.example.demo.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;


import com.example.demo.entities.Patrol;
import com.example.demo.service.PatrolService;

import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PatchMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;


@RestController
@RequestMapping("/api/v1")
public class PatrolController {
    @Autowired
    private PatrolService patrolService;

    @PostMapping(value ="/patrols")
    public Patrol findById(@RequestBody Patrol entity){
        return patrolService.save(entity);
    }

    @GetMapping(value ="/patrols/{id}")
    public Patrol findById(@PathVariable("id") Long id) {
        return patrolService.findById(id);
    }
    @GetMapping(value ="/patrols")
    public List<Patrol> findAll(){
        return patrolService.findAll();
    }


     @PutMapping(value ="/")
    public Patrol update(@RequestBody Patrol entity){
        return patrolService.save(entity);
    }

     @DeleteMapping(value ="/patrols/{id}")
    public void delete(@PathVariable("id") Long id){
    patrolService.deleteById(id);
    }
       
    @PatchMapping(value = "/patrols/{id}")
    public ResponseEntity<Patrol>  updateById(@PathVariable("id") Long id, @RequestBody Patrol patrol){
        return  patrolService.updateById(id, patrol);
    }
    
      }





