package Misc;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.*;
import java.util.*;

public class MovieDB {
	
	public static void main(String args[]) {
		try {
			
			//Establishing connection to MySQL Database
			
			Class.forName("com.mysql.jdbc.Driver");
			Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306","root","root");
			
			Statement st = con.createStatement();
			
			//Creating a database "Movies" with a table "favorites" detailing the film name, main actor, year of release
			//and name of director
			
			st.executeUpdate("CREATE DATABASE Movies");
			st.executeUpdate("USE Movies;");
			st.executeUpdate("CREATE TABLE favorites( movie_name VARCHAR(30), main_actor VARCHAR(25), release_year INT, director VARCHAR(25));"); 
			
			//Inserting 11 entries into the "favorites" table
			
			st.executeUpdate("INSERT INTO favorites VALUES('Inception','DiCaprio','2010','Nolan');");
			st.executeUpdate("INSERT INTO favorites VALUES('Toy Story','Hanks','1995','Lasseter');");
			st.executeUpdate("INSERT INTO favorites VALUES('Your Name','Miyamizu','2016','Shinkai');");
			st.executeUpdate("INSERT INTO favorites VALUES('Apollo 13','Hanks','1995','Howard');");
			st.executeUpdate("INSERT INTO favorites VALUES('The King','Chalamet','2019','Michod');");
			st.executeUpdate("INSERT INTO favorites VALUES('Tick Tick Boom','Garfield','2021','Miranda');");
			st.executeUpdate("INSERT INTO favorites VALUES('Back to the Future','Fox','1985','Zemeckis');");
			st.executeUpdate("INSERT INTO favorites VALUES('Soul','Ayoade','2020','Docter');");
			st.executeUpdate("INSERT INTO favorites VALUES('Kiki Delivery Service','Yakayama','1989','Miyazaki');");
			st.executeUpdate("INSERT INTO favorites VALUES('Star Wars 3','Christensen','2005','Lucas');");
			
			System.out.println("Complete");
			
			con.close();
			
		}
		catch(Exception e) {
			System.out.print(e);
		}
	}

}
