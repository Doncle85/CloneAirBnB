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



    @ManyToOne
    @JoinColumn(name = "id_categorie", nullable =false)
    private Categorie categorie;

    @OneToMany(targetEntity =Avis.class, mappedBy="annonces")
    private List<Avis> listAvis = new ArrayList<Avis>();

    public List<Image> getListImage() {
        return listImage;
    }

    public void setListImage(List<Image> listImage) {
        this.listImage = listImage;
    }

    @OneToMany(targetEntity =Image.class, mappedBy="annonces")
    private List<Image> listImage = new ArrayList<Image>();

    public Annonces(List<Image> listImage) {
        this.listImage = listImage;
    }

    public Annonces(Categorie categorie) {
        this.categorie = categorie;
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
        Description = description;;
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

    @Override
    public String toString() {
        return "Annonces{" +
                "id_annonce=" + id_annonce +
                ", localite='" + localite + '\'' +
                ", Nom='" + Nom + '\'' +
                ", Description='" + Description + '\'' +
                ", categorie=" + categorie +
                ", listAvis=" + listAvis +
                ", listImage=" + listImage +
                '}';
    }
}
