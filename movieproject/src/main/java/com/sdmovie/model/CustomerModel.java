package com.sdmovie.model;
import jakarta.annotation.Nonnull;
import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name="customers")
public class CustomerModel 
{
  @Id
  @GeneratedValue(strategy=GenerationType.AUTO)
  @Column(name = "customer_id")
  private int customer_id;
  @Column(name="user_name")
  private String user_name;
  @Id
  @Column(name="phone_number")
  private long phone_number;

  
  CustomerModel(int customer_id,String user_name ,long phone_number )
  {
	  this.customer_id=customer_id;
	  this.user_name=user_name;
	  this.phone_number=phone_number;
	  
  }

		public int getCustomer_id() {
			return customer_id;
		}		
		public void setCustomer_id(int customer_id) {
			this.customer_id = customer_id;
		}		
		public String getUser_name() {
			return user_name;
		}		
		public void setUser_name(String user_name) {
			this.user_name = user_name;
		}		
		public long getPhone_number() {
			return phone_number;
		}				
		public void setPhone_number(long phone_number) {
			this.phone_number = phone_number;
		}
		
		
}
