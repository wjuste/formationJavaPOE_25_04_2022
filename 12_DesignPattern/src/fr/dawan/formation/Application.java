package fr.dawan.formation;

import java.util.Iterator;

import com.sun.corba.se.internal.corba.ORBSingleton;

public class Application {

	public static void main(String[] args) {
		
		/*
		 * On n'a pas le droit de créer un singleton
		 */
		//Singleton s = new Singleton();
		
		
		/*
		 * Pour chaque iteration on va venir recuperer l'instance du 
		 * Singleton et j'appelle une méthode trainter
		 */
		for (int i = 0; i < 5; i++) {
			Singleton s = Singleton.getInstance();
			System.out.println(s); //verification de la reference
			s.traiter("T" + i);
		}
	}

}
