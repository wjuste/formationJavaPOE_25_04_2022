package fr.dawan.tableaux;

import java.util.ArrayList;

/*
 * L'objectif des tableaux dynamique dite collections est de pouvoir créer 
 * des tableaux qu'on pourra facilement modifier; la taille peut augmenter 
 * ou diminuer 
 * 
 * Nous allons utiliser la classe ArrayList pour créer nos tableaux dynamique
 * 		o C'est un objet qui n'a pas de taille limite comme les tableaux 
 * 		  statiques 
 * 
 * La classe ArrayList est utilisée pour les types evoluée (complexe)
 * non pour le types primitifs
 * 
 * On peut lui affecter entre chevron le type de donnée qu'il va stocker
 */
public class ArrayListTest {

	public static void main(String[] args) {
		
		//Tableau d'entier 
		ArrayList<Integer> tab1 = new ArrayList<Integer>();
		
		//Ajouter un element dans le tableau 
		tab1.add(20);
		
		//On peut modifier un element dans le tableau 
		tab1.set(0, 60);
		System.out.println(tab1.get(0));
		
		tab1.add(350);
		tab1.add(980);
		
		System.out.println("Element à la position 3 : " + tab1.get(2));
		
		if(tab1.contains(50)) {
			System.out.println("L'élement 50 est présent dans mon tableau");
		} else {
			System.out.println("L'élement 50 n'est pas présent dans mon tableau");
		}
		
		//Taille 
		System.out.println("Taille avant supression : " + tab1.size());
		
		//suppression d'un element 
		tab1.remove(1);
		
		System.out.println("Taille après supression : " + tab1.size());

	}

}
