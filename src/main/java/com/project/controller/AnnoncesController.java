package com.project.controller;

import com.project.dao.AnnoncesDao;
import com.project.modele.Annonces;
import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
    @RequestMapping("airBnB/annonces")
    public class AnnoncesController {
        @Autowired
        private AnnoncesDao annoncesDao;

        // Get List of annonces
        @GetMapping("")
        public List<Annonces> findAllAnnonces() {
            return this.annoncesDao.findAll();
        }

        //annonces by id
        @GetMapping("/{id}")
        public Optional<Annonces> findOneUserById(@PathVariable int id) {
            return this.annoncesDao.findById(id);
        }

        // Delete annonces
        @DeleteMapping("/delete/{id}")
        public Boolean deleteAnnonces(@PathVariable int id) {
            this.annoncesDao.deleteById(id);
            return true;
        }

        // Insert annonces
        @PostMapping("/add")
        public Annonces insertAnnonces( @RequestBody Annonces annonces  ) {
            return this.annoncesDao.save(annonces);
        }

        // Update annonces
        @PutMapping("/update")
        public Annonces updateAnnonces( @RequestBody Annonces annonces  ) {
            return this.annoncesDao.save(annonces);
        }
    }

