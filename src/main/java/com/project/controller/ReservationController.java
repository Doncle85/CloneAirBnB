package com.project.controller;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import com.project.dao.ReservationDao;
import com.project.modele.Reservation;
import com.project.modele.Role;

@RestController
@RequestMapping("airBnB/reservation")
public class ReservationController {
	@Autowired
	private ReservationDao reservationDao;
	
	
	// Get List of Reservation
	@GetMapping("/reservation")
	public List<Reservation> findAllReservations() {
		return this.reservationDao.findAll();
	}
	
	// Get One  Reservation by id
	@GetMapping("/{id}")
	public Optional<Reservation> findOneResById(@PathVariable int id) {
		return this.reservationDao.findById(id);
	}
	
	// Delete Reservation
	@DeleteMapping("/delete/{id}")
	public Boolean deleteRes(@PathVariable int id) {
		this.reservationDao.deleteById(id);
		return true;
	}
	
	// Insert Reservation
	@PostMapping("/add")
	@ResponseBody
	public Reservation insertRes( @RequestBody Reservation res  ) {
		return this.reservationDao.save(res);
	}
	
	// Update Reservation
	@PutMapping("/update")
	public Reservation updateRole( @RequestBody Reservation res ) {
		return this.reservationDao.save(res);
	}

}
