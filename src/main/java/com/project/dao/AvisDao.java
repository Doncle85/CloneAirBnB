package com.project.dao;

import com.project.modele.Avis;
import org.springframework.data.jpa.repository.JpaRepository;

public interface AvisDao extends JpaRepository<Avis, Integer> {

}
