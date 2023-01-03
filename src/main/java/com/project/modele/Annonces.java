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

    @OneToMany(targetEntity =Image.class, mappedBy="annonce")
    private List<Image> listImage = new ArrayList<Image>();

    @OneToMany(targetEntity =Reservation.class, mappedBy="annonces")
    private List<Reservation> listReservation = new ArrayList<Reservation>();

    public Annonces(int id_annonce) {
        this.id_annonce = id_annonce;
    }

    public Annonces(int id_annonce, String localite, String nom, String description, Categorie categorie, List<Avis> listAvis, List<Image> listImage, List<Reservation> listReservation) {
        this.id_annonce = id_annonce;
        this.localite = localite;
        Nom = nom;
        Description = description;
        this.categorie = categorie;
        this.listAvis = listAvis;
        this.listImage = listImage;
        this.listReservation = listReservation;
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

    public Categorie getCategorie() {
        return categorie;
    }

    public void setCategorie(Categorie categorie) {
        this.categorie = categorie;
    }

    public List<Avis> getListAvis() {
        return listAvis;
    }

    public void setListAvis(List<Avis> listAvis) {
        this.listAvis = listAvis;
    }

    public List<Image> getListImage() {
        return listImage;
    }

    public void setListImage(List<Image> listImage) {
        this.listImage = listImage;
    }

    public List<Reservation> getListReservation() {
        return listReservation;
    }

    public void setListReservation(List<Reservation> listReservation) {
        this.listReservation = listReservation;
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
                ", listReservation=" + listReservation +
                '}';
    }
}
