package com.sdmovie.model;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name="orders")
	public class OrderModel 
	{
	  @Id
	  @GeneratedValue(strategy=GenerationType.AUTO)
	  @Column(name="order_id")
	  private int order_id;
	  @Column(name="ticket_count")
	  private int ticket_count;
	  @Column(name="amount")
	  private int amount;
	  @Column(name="payment_via")
	  private String payment_via;
	  @Column(name="booking_date")
	  private int booking_date;
	  @Column(name="movie_id")
	  private int movie_id;
	  @Column(name="customer_id")
	  private int customer_id;
	  @Column(name="theater_id")
	  private int theater_id;
	public OrderModel(int order_id, int ticket_count, int amount, String payment_via, int booking_date, int movie_id,
			int customer_id, int theater_id) 
	{
		this.order_id = order_id;
		this.ticket_count = ticket_count;
		this.amount = amount;
		this.payment_via = payment_via;
		this.booking_date = booking_date;
		this.movie_id = movie_id;
		this.customer_id = customer_id;
		this.theater_id = theater_id;
	}
	public int getOrder_id() {
		return order_id;
	}
	public void setOrder_id(int order_id) {
		this.order_id = order_id;
	}
	public int getTicket_count() {
		return ticket_count;
	}
	public void setTicket_count(int ticket_count) {
		this.ticket_count = ticket_count;
	}
	public int getAmount() {
		return amount;
	}
	public void setAmount(int amount) {
		this.amount = amount;
	}
	public String getPayment_via() {
		return payment_via;
	}
	public void setPayment_via(String payment_via) {
		this.payment_via = payment_via;
	}
	public int getBooking_date() {
		return booking_date;
	}
	public void setBooking_date(int booking_date) {
		this.booking_date = booking_date;
	}
	public int getMovie_id() {
		return movie_id;
	}
	public void setMovie_id(int movie_id) {
		this.movie_id = movie_id;
	}
	public int getCustomer_id() {
		return customer_id;
	}
	public void setCustomer_id(int customer_id) {
		this.customer_id = customer_id;
	}
	public int getTheater_id() {
		return theater_id;
	}
	public void setTheater_id(int theater_id) {
		this.theater_id = theater_id;
	}
		
}
