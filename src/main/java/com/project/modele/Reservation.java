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

	/**
	 * Constructor
	 */
	public Reservation() {
		super();
	}
	/**
	 * Constructor with id
	 * @param id_res
	 */
	public Reservation(int id_res) {
		super();
		this.id_res = id_res;
	}
	
	/**
	 * Constructor with all fields
	 * @param id_res
	 * @param date_debut_res
	 * @param date_fin_res
	 * @param prix
	 * @param users
	 */
	public Reservation(int id_res, Date date_debut_res, Date date_fin_res, double prix, Users users) {
		super();
		this.id_res = id_res;
		this.date_debut_res = date_debut_res;
		this.date_fin_res = date_fin_res;
		this.prix = prix;
		this.users = users;
	}
	
	
	/**
	 * Getters and setters
	 * @return
	 */
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
	@Override
	public String toString() {
		return "Reservation [id_res=" + id_res + ", date_debut_res=" + date_debut_res + ", date_fin_res=" + date_fin_res
				+ ", prix=" + prix + ", users=" + users.getNom_user() + "]";
	} 
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	

}
