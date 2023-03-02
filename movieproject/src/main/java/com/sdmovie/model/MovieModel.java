package com.sdmovie.model;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name="movies")
public class MovieModel
{
  @Id
  @GeneratedValue(strategy=GenerationType.AUTO)
  @Column(name="movie_id")
  private int movie_id;
  @Column(name="movie_names")
  private String movie_names;
  @Column(name="show_time")
  private String show_time;
  @Column(name="show_time1")
  private String show_time1;
  @Column(name="theater_id")
  private int theater_id;
  
  public MovieModel(int movie_id, String movie_names, String show_time, String show_time1, int theater_id) 
  {
		this.movie_id = movie_id;
		this.movie_names = movie_names;
		this.show_time = show_time;
		this.show_time1 = show_time1;
		this.theater_id = theater_id;
  }

	public int getMovie_id() {
		return movie_id;
	}
	
	public void setMovie_id(int movie_id) {
		this.movie_id = movie_id;
	}
	
	public String getMovie_names() {
		return movie_names;
	}
	
	public void setMovie_names(String movie_names) {
		this.movie_names = movie_names;
	}
	
	public String getShow_time() {
		return show_time;
	}
	
	public void setShow_time(String show_time) {
		this.show_time = show_time;
	}

	public String getShow_time1() {
		return show_time1;
	}
	
	public void setShow_time1(String show_time1) {
		this.show_time1 = show_time1;
	}
	
	public int getTheater_id() {
		return theater_id;
	}
	
	public void setTheater_id(int theater_id) {
		this.theater_id = theater_id;
	}
  
}
