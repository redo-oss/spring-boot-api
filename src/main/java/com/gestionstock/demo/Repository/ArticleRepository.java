package com.gestionstock.demo.Repository;

import java.util.List;

import com.gestionstock.demo.Model.Article;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;



@Repository
public interface ArticleRepository extends JpaRepository<Article, Integer> {
    List<Article> findByIddes(Integer iddes);
}