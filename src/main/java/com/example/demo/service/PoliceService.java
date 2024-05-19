package com.example.demo.service;

import org.springframework.stereotype.Service;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import java.util.List;

import com.example.demo.repository.PoliceRepository;
import com.example.demo.entities.Police;

@Service
public class PoliceService {
    @Autowired
    private PoliceRepository policeRepository;

    //crear
    public Police save(Police entity){
        return policeRepository.save(entity);
    }
    //Llamar por id
    public Police findById(Long id){
        return policeRepository.findById(id).orElse(null);
    }

    
    //llamar a todos
    public List<Police> findAll(){
        return policeRepository.findAll();
    }

    //actualizada parcial
    public ResponseEntity<Police> updateById(Long id, Police policeUpdate){
        try{
            Police policeExist = findById(id);
            if(policeExist == null) return ResponseEntity.notFound().build();

            if (policeUpdate.getName() != null) policeExist.setName(policeUpdate.getName());
            if (policeUpdate.getLastname() != null) policeExist.setLastname(policeUpdate.getLastname());
            if (policeUpdate.getCharge() != null) policeExist.setCharge(policeUpdate.getCharge());
            Police policeSave = save(policeExist);
            return ResponseEntity.ok(policeSave);
         }catch (Exception e){
            return ResponseEntity.internalServerError().build();
         }
    }
    //eliminar
    public void deleteById(Long id){
        policeRepository.deleteById(id);
    }



    
}
