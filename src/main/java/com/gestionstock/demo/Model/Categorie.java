package com.gestionstock.demo.Model;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name="categories")
public class Categorie {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Integer id;
    @Column(name = "designation")
    private String designation;
    
    public Categorie() {
    }
    public Categorie(Integer id, String designation) {
        this.id = id;
        this.designation = designation;
    }
    public Categorie(String designation) {
        this.designation = designation;
    }
    public String getDesignation() {
        return designation;
    }
    public Integer getId() {
        return id;
    }
    public void setId(int id) {
        this.id = id;
    }
    public void setDesignation(String designation) {
        this.designation = designation;
    }
}
