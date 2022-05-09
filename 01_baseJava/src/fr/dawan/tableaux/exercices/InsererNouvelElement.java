package fr.dawan.tableaux.exercices;

import java.util.Iterator;
import java.util.Scanner;

public class InsererNouvelElement {

	public static void main(String[] args) {
		Scanner clavier = new Scanner(System.in);
		double[] liste_notes; //Pour initialser la taille du tableau
		double note;  //Note à inserer 
		//pos: position d'insertion de la note
		//n : Nombre de notes dans le tableau
		int n, pos;
		String result = "";
		
		System.out.print("Saisir le nombre de notes : ");
		n = clavier.nextInt();
		
		//Initialiser la taille du tableau 
		liste_notes = new double[n + 1];
		
		/*
		 * Boucle d'initialisation
		 * Saisir les notes dans le  
		 */
		for(int i = 0; i < n; i++) {
			System.out.print("Note " + (i + 1) + " : ");
			liste_notes[i] = clavier.nextDouble();
		}
		
		
		//Saisir une note et sa position d'insertion 
		System.out.println("Note à inserer : ");
		note = clavier.nextDouble();
		System.out.println("Position : ");
		pos = clavier.nextInt();  //ex pos = 3 (indice = 2)
		int numCase = pos - 1; //numCase = indice
		
		//Si la position est non valide
		if(pos <= 0 || pos > n+1) {
			System.out.println("Position invalide ! Veuillez saisir une position"
					+ "entre 1 et " + n);
		} else {
			//Décalage des cases : On part de la fin pour remonter vers la position 
			//d'insertion (numCase)
			for (int i = n; i > numCase; i--) {
				liste_notes[i] = liste_notes[i-1];
			}
			//Inserer la note à la position donnée et incrementer n
			liste_notes[numCase] = note;
			n++;
		}
		
		
		//Boucle d'affichage
		result = "[";
		for (int i = 0; i < n-1; i++) {
			result +=liste_notes[i] + ",";
		}
		result += liste_notes[liste_notes.length - 1] + "]";
		System.out.println(result);
		
	}

}
