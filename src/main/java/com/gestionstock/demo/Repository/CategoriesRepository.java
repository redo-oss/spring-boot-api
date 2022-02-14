package com.gestionstock.demo.Repository;

import com.gestionstock.demo.Model.Categorie;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface CategoriesRepository extends JpaRepository<Categorie, Integer> {

}