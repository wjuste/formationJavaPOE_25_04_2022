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
			//Objet Properties pour r�cuperer les valeurs du fichier 
			//conf.properties 
			Properties p = new Properties();

			//Etablir la connexion 
			p.load(Thread.currentThread().getContextClassLoader()
					.getResourceAsStream("conf.properties"));
			
			/*
			 * Class.forName permet de charger une class dynamiquement
			 * ici il va venir charger mon driver mysql de type jdbc
			 * Le pilote JDBC, est une bibliotheque, un ensemble de classe 
			 * qui vont �tre charg� en m�moire, et qui vont permettre 
			 * � l'application Java de communiquer avec le syst�me 
			 * de gestion de base de donn�es
			 */
			Class.forName(p.getProperty("driver"));
			
			//Cr�er la connexion 
			cnx = DriverManager.getConnection(p.getProperty("url"), 
					p.getProperty("user"), p.getProperty("pwd"));
			
			System.out.println("Cr�ation d'une connexion");
		} catch (IOException | SQLException | ClassNotFoundException e) {
			System.out.println("Echec de connexion");
			e.printStackTrace();
		} 
	}
	
	public static Connection getConnection() {
		return cnx;
	}
}
