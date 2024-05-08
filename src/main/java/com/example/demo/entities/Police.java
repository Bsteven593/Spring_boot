package com.example.demo.entities;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.Table;
import lombok.Data;

@Data
@Entity
@Table(name = "polices")
public class Police {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id")
    private Long id;
    @Column(name = "name")
    public String name;
    @Column(name = "lastname")
    public String lastname;
    @Column(name = "charge")
    public String charge;

    @ManyToOne
    @JoinColumn(name ="patrol_id",referencedColumnName = "id")
    private Patrol patrol;
    @ManyToOne
    @JoinColumn(name ="weapon_id",referencedColumnName = "id")
    private Weapon weapon;

    
}




