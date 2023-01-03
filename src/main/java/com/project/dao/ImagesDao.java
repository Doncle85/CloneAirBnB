package com.project.dao;

import com.project.modele.Annonces;
import com.project.modele.Image;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ImagesDao extends JpaRepository<Image, Integer> {

}
