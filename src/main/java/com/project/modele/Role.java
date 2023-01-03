package com.project.modele;

import java.util.ArrayList;
import java.util.List;


import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.OneToMany;
import jakarta.persistence.OneToOne;
import jakarta.persistence.Table;

@Entity
@Table(name="role")
public class Role {
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private int id_role;
	
	private String roles;
	
//	@OneToOne(mappedBy = "role")
//	private Users users;
	
	@OneToMany(targetEntity = Users.class, mappedBy="role")
	private List<Users> listUsers = new ArrayList<Users>();

	/**
	 * Constructors
	 */
	public Role() {
		super();
	}
	

	public Role(int id_role) {
		super();
		this.id_role = id_role;
	}


	public Role(int id_role, String roles, List<Users> listUsers ) {
		super();
		this.id_role = id_role;
		this.roles = roles;
		this.listUsers = listUsers;
	}

	/**
	 * Getters and Setters
	 * @return
	 */
	public int getId_role() {
		return id_role;
	}

	public void setId_role(int id_role) {
		this.id_role = id_role;
	}

	public String getRoles() {
		return roles;
	}

	public void setRoles(String roles) {
		this.roles = roles;
	}

	public List<Users> getListUsers() {
		return listUsers;
	}

	public void setUsers(List<Users> listUsers ) {
		this.listUsers = listUsers;
	}

	/**
	 * ToString
	 */
	@Override
	public String toString() {
		return "Role [id_role=" + id_role + ", roles=" + roles + ", listUsers =" + listUsers + "]";
	}
	
	
	 
	

}
