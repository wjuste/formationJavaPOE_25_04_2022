package fr.dawan.formation.genericavecheritage;

import java.util.ArrayList;
import java.util.List;

public class Application {

	public static void main(String[] args) {

		Employe employe = new Employe();
		Technicien technicien = new Technicien();

		/*
		 * En applicant le principe de la covariance de variable
		 * On peut créer une nouvelle classe fille et la stocker 
		 * ensuite dans la  classe parente
		 */
		employe = technicien;

		List<Employe> employes = new ArrayList<Employe>();
		List<Technicien> techniciens = new ArrayList<Technicien>();
		List<Voiture> voitures = new ArrayList<Voiture>();
		
		List<Object> objects = new ArrayList<Object>();

		//On va remplacer Employé et technicien par un Wilcard (?)
		//		List<?> employes = new ArrayList<Employe>();
		//		List<?> techniciens = new ArrayList<Technicien>();

		/*
		 * Ca marche pas
		 * Avec la genericité une fois qu'on a donné le type on ne 
		 * peut pas le modifier.
		 * C'est à dire qu'on ne peut pas prendre notre ArrayList techniciens 
		 * et le mettre dans le ArrayList Employes
		 * La covariance des variables n'est pas verifiée avec la généricité
		 */
		//		employes = techniciens;

		employes.add(new Employe());
		employes.add(new Employe());
		employes.add(new Employe());

		techniciens.add(new Technicien());
		techniciens.add(new Technicien());
		techniciens.add(new Technicien());

		voitures.add(new Voiture());
		voitures.add(new Voiture());
		
		objects.add(new Object());


		lister(employes);
		//lister(techniciens);
		lister(objects);

		//lister(voitures);

	}

	//	public static void lister(List<Employe> employes) {
	//		for (Employe employe : employes) {
	//			System.out.println(employe);
	//		}
	//	}
	
	
	//Solution
//	public static void lister(List<? extends Employe> employes) {
//			for (Object employe : employes) {
//				System.out.println(employe);
//			}
//		}

	
	//On va pouvoir parcourir un ArrayList de n'importe quel type
	//	public static void lister(List<? extends IMonInterface> employes) {
	//	for (Object employe : employes) {
	//		System.out.println(employe);
	//	}
	//}

	
	//Le mot clé super : Le mot clé super veut dire qu'on accepte 
	//comme type Employe et toutes classes parents d'Employe
	public static void lister(List<? super Employe> employes) {
		for (Object employe : employes) {
			System.out.println(employe);
		}
	}	

}
