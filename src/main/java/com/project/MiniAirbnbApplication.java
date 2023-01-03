package com.project;

import com.project.dao.AnnoncesDao;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import com.project.dao.ReservationDao;
import com.project.dao.RoleDao;
import com.project.dao.UsersDao;

import com.project.modele.Role;
import com.project.modele.Users;


@SpringBootApplication
public class MiniAirbnbApplication implements CommandLineRunner {
	@Autowired
	private UsersDao usersDao;
	@Autowired
	private RoleDao roleDao;
	@Autowired
	private ReservationDao resDao;
	
	@Autowired
	private AnnoncesDao annoncesDao;


	public static void main(String[] args) {
		SpringApplication.run(MiniAirbnbApplication.class, args);
	}

	@Override
	public void run(String... args) throws Exception {

		//this.usersDao.save(new Users(0,"MALARME", "Clement", 
		//		"0613899806","Paris12","Test1234", new Role(1)));
		//System.out.println("List of Users  : " + this.usersDao.findAll());
//		System.out.println("List of reservation  : " + this.resDao.findAll());


//		System.out.println("List of Users  : " + this.usersDao.findAll());
//		System.out.println("List of annouce  : " + this.annoncesDao.findAll());

	}
	
}
