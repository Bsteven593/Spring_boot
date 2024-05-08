package com.example.demo.service;


import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.example.demo.entities.Compania;
import com.example.demo.repository.CompaniaRepository;


@Service
public class CompaniaService {
    @Autowired
    private CompaniaRepository companiaRepository;


    public Compania save(Compania entity){
        return companiaRepository.save(entity);
    }

    public Compania findById(Long id) {
       return companiaRepository.findById(id).orElse(null);
    }

    public void deleteById(Long id)
    {
         companiaRepository.deleteById(id);
    }

    
    public List<Compania> findAll(){
        return companiaRepository.findAll();
    }
    
}
