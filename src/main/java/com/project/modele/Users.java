package com.project.modele;


import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name="users")
public class Users {
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private int id_user;
	
	private String nom_user;
	private String prenom_user;
	private String tel_user;
	private String adresse_user;
	private String password;
	
	/**
	 * Constructor
	 */
	public Users() {
		super();
	}

	/**
	 * Constructor using fields
	 * @param id_user
	 * @param nom_user
	 * @param prenom_user
	 * @param tel_user
	 * @param adresse_user
	 * @param password
	 */
	public Users(int id_user, String nom_user, String prenom_user, String tel_user, String adresse_user,
			String password) {
		super();
		this.id_user = id_user;
		this.nom_user = nom_user;
		this.prenom_user = prenom_user;
		this.tel_user = tel_user;
		this.adresse_user = adresse_user;
		this.password = password;
	}

	/**
	 * Getter and Setter for Id
	 * @return
	 */
	public int getId_user() {
		return id_user;
	}

	public void setId_user(int id_user) {
		this.id_user = id_user;
	}

	/**
	 * Getter and setter for nom
	 * @return
	 */
	public String getNom_user() {
		return nom_user;
	}

	public void setNom_user(String nom_user) {
		this.nom_user = nom_user;
	}

	/**
	 * Getters and setters for Prenom
	 * @return
	 */
	public String getPrenom_user() {
		return prenom_user;
	}

	public void setPrenom_user(String prenom_user) {
		this.prenom_user = prenom_user;
	}

	/**
	 * Getters and setters for telephone
	 * @return
	 */
	public String getTel_user() {
		return tel_user;
	}

	public void setTel_user(String tel_user) {
		this.tel_user = tel_user;
	}
	
	/**
	 * Getters and setter for adresse
	 * @return
	 */

	public String getAdresse_user() {
		return adresse_user;
	}

	public void setAdresse_user(String adresse_user) {
		this.adresse_user = adresse_user;
	}

	/**
	 * Getters and setters for Password
	 * @return
	 */
	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	/**
	 * ToString method
	 */
	@Override
	public String toString() {
		return "Users [id_user=" + id_user + ", nom_user=" + nom_user + ", prenom_user=" + prenom_user + ", tel_user="
				+ tel_user + ", adresse_user=" + adresse_user + ", password=" + password + "]";
	}
	
	
	
}
