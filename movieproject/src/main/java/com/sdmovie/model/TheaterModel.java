package com.sdmovie.model;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

	@Entity
	@Table(name="theaters")
	public class TheaterModel 
	{
	   @Id
	   @GeneratedValue(strategy=GenerationType.AUTO)
	   @Column(name="theater_id")
	   private int theater_id;
	   @Column(name="Theater_name")
	   private String Theater_name;
	   @Column(name="seats")
	   private int seats;
	   @Column(name="price")
	   private int price;
   
     public TheaterModel(int theater_id, String theater_name, int seats, int price) 
		{

			this.theater_id = theater_id;
			this.Theater_name = theater_name;
			this.seats = seats;
			this.price = price;
		}

	public int getTheater_id() {
		return theater_id;
	}

	public void setTheater_id(int theater_id) {
		this.theater_id = theater_id;
	}

	public String getTheater_name() {
		return Theater_name;
	}

	public void setTheater_name(String theater_name) {
		Theater_name = theater_name;
	}

	public int getSeats() {
		return seats;
	}

	public void setSeats(int seats) {
		this.seats = seats;
	}

	public int getPrice() {
		return price;
	}

	public void setPrice(int price) {
		this.price = price;
	} 
}
