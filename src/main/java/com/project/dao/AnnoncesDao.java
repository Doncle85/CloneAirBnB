package com.project.dao;

import com.project.modele.Annonces;
import org.springframework.data.jpa.repository.JpaRepository;

public interface AnnoncesDao extends JpaRepository<Annonces, Integer> {
}
