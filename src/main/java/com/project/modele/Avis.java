package com.project.modele;

import jakarta.persistence.*;

@Entity
@Table(name="avis")
public class Avis {

    @Id
    @GeneratedValue(strategy= GenerationType.IDENTITY)
    public int id_avis;

    public String avis;

    @ManyToOne
    @JoinColumn(name="id_annonce",referencedColumnName = "id_annonce")
    private Annonces annonces;

    public Avis() {
        super();
    }

    @Override
    public String toString() {
        return "Avis{" +
                "id_avis=" + id_avis +
                ", avis='" + avis + '\'' +
                '}';
    }

    public int getId_avis() {
        return id_avis;
    }

    public void setId_avis(int id_avis) {
        this.id_avis = id_avis;
    }

    public String getAvis() {
        return avis;
    }

    public void setAvis(String avis) {
        this.avis = avis;
    }

    public Avis(int id_avis, String avis) {
        this.id_avis = id_avis;
        this.avis = avis;
    }
}
