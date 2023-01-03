package com.project.modele;

import jakarta.persistence.*;

import java.util.ArrayList;
import java.util.List;

@Entity
@Table(name="categorie")
public class Categorie {

    @Id
    @GeneratedValue(strategy= GenerationType.IDENTITY)
    public int id_categorie;

    public String type;

    @OneToMany(targetEntity =Annonces.class, mappedBy="categorie")
    private List<Annonces> listAnnonce = new ArrayList<Annonces>();

    public String prestation;
    public Categorie(int id_categorie) {
        this.id_categorie = id_categorie;
    }

    public Categorie(int id_categorie, String type, String prestation) {
        this.id_categorie = id_categorie;
        this.type = type;
        this.prestation = prestation;
    }

    public Categorie() {

    }

    public int getId_categorie() {
        return id_categorie;
    }

    public void setId_categorie(int id_categorie) {
        this.id_categorie = id_categorie;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public String getPrestation() {
        return prestation;
    }

    public void setPrestation(String prestation) {
        this.prestation = prestation;
    }

    @Override
    public String toString() {
        return "Categorie{" +
                "id_categorie=" + id_categorie +
                ", type='" + type + '\'' +
                ", prestation='" + prestation + '\'' +
                '}';
    }
}
