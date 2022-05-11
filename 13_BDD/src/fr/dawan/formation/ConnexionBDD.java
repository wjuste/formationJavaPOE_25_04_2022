package fr.dawan.formation;

import java.io.IOException;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.util.Properties;

public class ConnexionBDD {

	private static Connection cnx;

	private ConnexionBDD() {

	}

	static {
		try {
			//Objet Properties pour récuperer les valeurs du fichier 
			//conf.properties 
			Properties p = new Properties();

			//Etablir la connexion 
			p.load(Thread.currentThread().getContextClassLoader()
					.getResourceAsStream("conf.properties"));
			
			/*
			 * Class.forName permet de charger une class dynamiquement
			 * ici il va venir charger mon driver mysql de type jdbc
			 * Le pilote JDBC, est une bibliotheque, un ensemble de classe 
			 * qui vont être chargé en mémoire, et qui vont permettre 
			 * à l'application Java de communiquer avec le système 
			 * de gestion de base de données
			 */
			Class.forName(p.getProperty("driver"));
			
			//Créer la connexion 
			cnx = DriverManager.getConnection(p.getProperty("url"), 
					p.getProperty("user"), p.getProperty("pwd"));
			
			System.out.println("Création d'une connexion");
		} catch (IOException | SQLException | ClassNotFoundException e) {
			System.out.println("Echec de connexion");
			e.printStackTrace();
		} 
	}
	
	public static Connection getConnection() {
		return cnx;
	}
}
