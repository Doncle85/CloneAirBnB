package com.project.modele;

import jakarta.persistence.*;
@Entity
@Table(name="image")
public class Image {
    @Id
    @GeneratedValue(strategy= GenerationType.IDENTITY)
    public int id_images;

    public String images;

    @ManyToOne
    @JoinColumn(name="id_annonce", nullable = false)
    private Annonces annonce;

    public Image(int id_images, String images, Annonces annonce) {
        this.id_images = id_images;
        this.images = images;
        this.annonce = annonce;
    }

    public Image() {
        super();
    }

    @Override
    public String toString() {
        return "Image{" +
                "id_images=" + id_images +
                ", images='" + images + '\'' +
                ", annonce=" + annonce +
                '}';
    }

    public int getId_images() {
        return id_images;
    }

    public void setId_images(int id_images) {
        this.id_images = id_images;
    }

    public String getImages() {
        return images;
    }

    public void setImages(String images) {
        this.images = images;
    }

    public Annonces getAnnonce() {
        return annonce;
    }

    public void setAnnonce(Annonces annonce) {
        this.annonce = annonce;
    }

    public Image(int id_images) {
        this.id_images = id_images;
    }
}
