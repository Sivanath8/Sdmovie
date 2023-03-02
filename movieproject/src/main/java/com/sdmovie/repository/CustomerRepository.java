package com.sdmovie.repository;

import java.sql.*;

public class CustomerRepository 
{

	public boolean checkUser(long num) throws Exception
	{
		   Class.forName("com.mysql.cj.jdbc.Driver");  
	       Connection con =  DriverManager.getConnection("jdbc:mysql://localhost:3306/movie_siva","root","tiger");
		   Statement stmt=con.createStatement();
	       ResultSet rs =stmt.executeQuery("select phone_number from customers where phone_number ='"  +num+  "';");
	       boolean has_result=rs.next();
	       System.out.println(has_result);
	       if(has_result)
	       {
	    	   return has_result;
	       }
	       else
	       {
	    	   return has_result;
	       }
	}
}
