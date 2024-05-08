package com.example.demo.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import java.util.List;
import com.example.demo.entities.Compania;
import com.example.demo.service.CompaniaService;
import org.springframework.web.bind.annotation.PutMapping;


@RestController
@RequestMapping("/api/compania")
public class CompaniaController {
    @Autowired
    private CompaniaService companiaService;

    @PostMapping("/save")
    public Compania save(@RequestBody Compania entity) {
        return companiaService.save(entity);
    }

    @GetMapping("/{id}")
    public Compania findById(@PathVariable("id") Long id) {
        return companiaService.findById(id);
    }

    @PutMapping("/")
    public Compania update(@RequestBody Compania entity){
        return companiaService.save(entity);
    }

    @DeleteMapping("/{id}")
    public void delete(@PathVariable("id") Long id){
        companiaService.deleteById(id);
    }

    @GetMapping("/")
    public List<Compania> findAll(){
        return companiaService.findAll();
    }

}
