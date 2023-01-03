package com.project.modele;

import java.util.Date;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.Table;

@Entity
@Table(name="reservation")
public class Reservation {
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private int id_res;
	// Date de reservation debut
	private Date date_debut_res;
	//Date de reservation fin
	private Date date_fin_res;
	// Prix de la reservation
	private double prix;
	
	@ManyToOne
	@JoinColumn(name="id_user", nullable = false)
	private Users users;

	@ManyToOne
	@JoinColumn(name="id_annonce", nullable = false)
	private Annonces annonces;

	@Override
	public String toString() {
		return "Reservation{" +
				"id_res=" + id_res +
				", date_debut_res=" + date_debut_res +
				", date_fin_res=" + date_fin_res +
				", prix=" + prix +
				", users=" + users +
				", annonces=" + annonces +
				'}';
	}

	public int getId_res() {
		return id_res;
	}

	public void setId_res(int id_res) {
		this.id_res = id_res;
	}

	public Date getDate_debut_res() {
		return date_debut_res;
	}

	public void setDate_debut_res(Date date_debut_res) {
		this.date_debut_res = date_debut_res;
	}

	public Date getDate_fin_res() {
		return date_fin_res;
	}

	public void setDate_fin_res(Date date_fin_res) {
		this.date_fin_res = date_fin_res;
	}

	public double getPrix() {
		return prix;
	}

	public void setPrix(double prix) {
		this.prix = prix;
	}

	public Users getUsers() {
		return users;
	}

	public void setUsers(Users users) {
		this.users = users;
	}

	public Annonces getAnnonces() {
		return annonces;
	}

	public void setAnnonces(Annonces annonces) {
		this.annonces = annonces;
	}

	public Reservation(int id_res, Date date_debut_res, Date date_fin_res, double prix, Users users, Annonces annonces) {
		this.id_res = id_res;
		this.date_debut_res = date_debut_res;
		this.date_fin_res = date_fin_res;
		this.prix = prix;
		this.users = users;
		this.annonces = annonces;
	}

	/**
	 * Constructor
	 */
	public Reservation(int id_res) {
		this.id_res = id_res;
	}
}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	


