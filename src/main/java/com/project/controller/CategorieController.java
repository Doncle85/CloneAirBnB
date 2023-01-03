package com.project.controller;

import com.project.dao.AvisDao;
import com.project.dao.CategorieDao;
import com.project.modele.Avis;
import com.project.modele.Categorie;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("airBnB/categorie")
public class CategorieController {
    @Autowired
    private CategorieDao categorieDao;
    // Get List of Avis
    @GetMapping("")
    public List<Categorie> findAllAvis() {
        return this.categorieDao.findAll();
    }
    //annonces by id
    @GetMapping("/{id}")
    public Optional<Categorie> findOneAvisById(@PathVariable int id) {
        return this.categorieDao.findById(id);
    }
    // Delete annonces
    @DeleteMapping("/delete/{id}")
    public Boolean deleteAvis(@PathVariable int id) {
        this.categorieDao.deleteById(id);
        return true;
    }
    // Insert annonces
    @PostMapping("/add")
    public Categorie insertAvis(@RequestBody Categorie categorie ) {
        return this.categorieDao.save(categorie);
    }
    // Update annonces
    @PutMapping("/update")
    public Categorie updateAvis(@RequestBody Categorie categorie ) {
        return this.categorieDao.save(categorie);
    }
}


