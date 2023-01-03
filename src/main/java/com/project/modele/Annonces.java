package com.project.modele;

import jakarta.persistence.*;

import java.util.ArrayList;
import java.util.List;

@Entity
@Table(name="annonces")
public class Annonces {

    @Id
    @GeneratedValue(strategy= GenerationType.IDENTITY)
    private int id_annonce;

    private String localite;

    private String Nom;

    private String Description;

    private String images;

    @ManyToOne
    @JoinColumn(name = "id_categorie", nullable =false)
    private Categorie categorie;

    @OneToMany(targetEntity =Avis.class, mappedBy="annonces")
    private List<Avis> listAvis = new ArrayList<Avis>();

    public Annonces(Categorie categorie) {
        this.categorie = categorie;
    }

    @Override
    public String toString() {
        return "Annonces{" +
                "id_annonce=" + id_annonce +
                ", localite='" + localite + '\'' +
                ", Nom='" + Nom + '\'' +
                ", Description='" + Description + '\'' +
                ", images='" + images + '\'' +
                ", categorie=" + categorie +
                '}';
    }

    public Categorie getCategorie() {
        return categorie;
    }

    public void setCategorie(Categorie categorie) {
        this.categorie = categorie;
    }

    public Annonces(int id_annonce, String localite, String nom, String description, String images) {
        this.id_annonce = id_annonce;
        this.localite = localite;
        Nom = nom;
        Description = description;
        this.images = images;
    }

    public Annonces() {
        super();
    }

    public int getId_annonce() {
        return id_annonce;
    }

    public void setId_annonce(int id_annonce) {
        this.id_annonce = id_annonce;
    }

    public String getLocalite() {
        return localite;
    }

    public void setLocalite(String localite) {
        this.localite = localite;
    }

    public String getNom() {
        return Nom;
    }

    public void setNom(String nom) {
        Nom = nom;
    }

    public String getDescription() {
        return Description;
    }

    public void setDescription(String description) {
        Description = description;
    }

    public String getImages() {
        return images;
    }

    public void setImages(String images) {
        this.images = images;
    }

}
