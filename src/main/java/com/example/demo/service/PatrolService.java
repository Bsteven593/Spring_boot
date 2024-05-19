package com.example.demo.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;
import com.example.demo.entities.Patrol;
import com.example.demo.repository.PatrolRepository;

@Service
public class PatrolService {
    @Autowired
    private PatrolRepository patrolRepository;

    //crear
    public Patrol save(Patrol entity){
        return patrolRepository.save(entity);
    }
    //Llamar por id
    public Patrol findById(Long id){
        return patrolRepository.findById(id).orElse(null);
    }

    //llamar a todos
    public List<Patrol> findAll(){
        return patrolRepository.findAll();
    }

    //actualizada parcial

    public ResponseEntity<Patrol> updateById(Long id, Patrol patrolUpdate){
        try{
            Patrol patrolExist = findById(id);
            if(patrolExist == null) return ResponseEntity.notFound().build();

            if (patrolUpdate.getPlate() != null) patrolExist.setPlate(patrolUpdate.getPlate());
            if (patrolUpdate.getCategory() != null) patrolExist.setCategory(patrolUpdate.getCategory());

            Patrol patrolSave = save(patrolExist);
            return ResponseEntity.ok(patrolSave);
         }catch (Exception e){
            return ResponseEntity.internalServerError().build();
         }
    }
    //eliminar
    public void deleteById(Long id){
        patrolRepository.deleteById(id);
    }
}
