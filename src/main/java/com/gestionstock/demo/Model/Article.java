package com.gestionstock.demo.Model;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name = "Article")
public class Article {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private int id;
    @Column(name = "label")
    private String label;
    @Column(name = "pu")
    private int pu;
    @Column(name = "iddes")
    private int iddes;
    
    public Article(String label, int pu, int iddes) {
        this.setLabel(label);
        this.setPu(pu);
        this.setIddes(iddes);
    }
    public Article() {

    }
    public Article(int id, String label, int pu, int iddes) {
        this.setId(id);
        this.setLabel(label);
        this.setPu(pu);
        this.setIddes(iddes);
    }
    public int getIddes() {
        return iddes;
    }
    public void setIddes(int iddes) {
        this.iddes = iddes;
    }
    public int getPu() {
        return pu;
    }
    public void setPu(int pu) {
        this.pu = pu;
    }
    public String getLabel() {
        return label;
    }
    public void setLabel(String label) {
        this.label = label;
    }
    public int getId() {
        return id;
    }
    public void setId(int id) {
        this.id = id;
    }
    
}
