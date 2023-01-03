package com.project.dao;

import com.project.modele.Categorie;
import org.springframework.data.jpa.repository.JpaRepository;

public interface CategorieDao extends JpaRepository<Categorie, Integer> {
}
