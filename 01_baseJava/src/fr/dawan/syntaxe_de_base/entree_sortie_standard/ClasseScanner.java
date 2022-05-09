package fr.dawan.syntaxe_de_base.entree_sortie_standard;

import java.util.Scanner;

public class ClasseScanner {

	public static void main(String[] args) {
		//Pour instancier une classe il faut le mot le clé new + constructeur;
		Scanner clavier = new Scanner(System.in);
		int n = 0; 
		double var1 = 0.0;
		
		System.out.print("Entrer un nombre : ");
		n = clavier.nextInt();
		System.out.println("Le carré de " + n + " est " + n*n);
		
		System.out.print("Entrer un nombre réel : ");
		var1 = clavier.nextDouble();
		System.out.println("Vous avez entré : " + var1);
		
	}

}
