package com.project.modele;






import java.util.ArrayList;
import java.util.List;

import jakarta.persistence.CascadeType;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.OneToMany;
import jakarta.persistence.OneToOne;
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
	
	// Role
//	@OneToOne(cascade = CascadeType.ALL)
//    @JoinColumn(name = "id_role", referencedColumnName = "id_role")
//    private Role role;
	@ManyToOne
	@JoinColumn(name="id_role", nullable = false)
	private Role role; 
	
	
	// Reservation
	@OneToMany(targetEntity = Reservation.class, mappedBy="users")
	private List<Reservation> listRes = new ArrayList<Reservation>();
	
	/**
	 * Constructor
	 */
	
	public Users() {
		super();
	}

	public Users(int id_user) {
		super();
		this.id_user = id_user;
	}

	
	public Users(int id_user, String nom_user, String prenom_user, String tel_user, String adresse_user,
			String password, Role role, List<Reservation> listRes) {
		super();
		this.id_user = id_user;
		this.nom_user = nom_user;
		this.prenom_user = prenom_user;
		this.tel_user = tel_user;
		this.adresse_user = adresse_user;
		this.password = password;
		this.role = role;
		this.listRes = listRes;
	}

	public int getId_user() {
		return id_user;
	}

	public void setId_user(int id_user) {
		this.id_user = id_user;
	}

	public String getNom_user() {
		return nom_user;
	}

	public void setNom_user(String nom_user) {
		this.nom_user = nom_user;
	}

	public String getPrenom_user() {
		return prenom_user;
	}

	public void setPrenom_user(String prenom_user) {
		this.prenom_user = prenom_user;
	}

	public String getTel_user() {
		return tel_user;
	}

	public void setTel_user(String tel_user) {
		this.tel_user = tel_user;
	}

	public String getAdresse_user() {
		return adresse_user;
	}

	public void setAdresse_user(String adresse_user) {
		this.adresse_user = adresse_user;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public Role getRole() {
		return role;
	}

	public void setRole(Role role) {
		this.role = role;
	}

	
	public List<Reservation> getListRes() {
		return listRes;
	}

	public void setListRes(List<Reservation> listRes) {
		this.listRes = listRes;
	}

	@Override
	public String toString() {
		return "Users [id_user=" + id_user + ", nom_user=" + nom_user + ", prenom_user=" + prenom_user + ", tel_user="
				+ tel_user + ", adresse_user=" + adresse_user + ", password=" + password + ", role=" + role + "]";
	}

	
	
}
