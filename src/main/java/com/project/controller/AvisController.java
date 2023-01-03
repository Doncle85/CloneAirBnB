package com.project.controller;

import com.project.dao.AvisDao;
import com.project.modele.Avis;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("airBnB/avis")
    public class AvisController {
        @Autowired
        private AvisDao avisDao;
        // Get List of Avis
        @GetMapping("/avis")
        public List<Avis> findAllAvis() {
            return this.avisDao.findAll();
        }
        //annonces by id
        @GetMapping("/{id}")
        public Optional<Avis> findOneAvisById(@PathVariable int id) {
            return this.avisDao.findById(id);
        }
        // Delete annonces
        @DeleteMapping("/delete/{id}")
        public Boolean deleteAvis(@PathVariable int id) {
            this.avisDao.deleteById(id);
            return true;
        }
        // Insert annonces
        @PostMapping("/add")
        public Avis insertAvis(@RequestBody Avis avis ) {
            return this.avisDao.save(avis);
        }
        // Update annonces
        @PutMapping("/update")
        public Avis updateAvis(@RequestBody Avis avis ) {
            return this.avisDao.save(avis);
        }
    }


