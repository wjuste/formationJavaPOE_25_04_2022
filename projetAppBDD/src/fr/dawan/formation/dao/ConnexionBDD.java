package fr.dawan.formation.dao;

import java.io.IOException;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.util.Properties;

public class ConnexionBDD {
	
	private static Connection cnx;
	
	private ConnexionBDD() {
		
	}
	
	static  {
		Properties p = new Properties();
		try {
			p.load(Thread.currentThread().getContextClassLoader()
					.getResourceAsStream("conf.properties"));
			Class.forName(p.getProperty("driver"));
			cnx = DriverManager.getConnection(p.getProperty("url"),
					p.getProperty("user"), p.getProperty("pwd"));
			System.out.println("Connexion reussie");
		} catch (IOException | ClassNotFoundException | SQLException e) {
			System.out.println("Echec de connexion");
			e.printStackTrace();
		} 
	}
	
	public static Connection getConnection() {
		return cnx;
	}
	
}
