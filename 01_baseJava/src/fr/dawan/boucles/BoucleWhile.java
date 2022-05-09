package fr.dawan.boucles;

import java.util.Scanner;

/*
 * Boucle While : 
 * La condition est vérifiée avant, si la condition est fausse, on ne passe pas dans 
 * le bloc d'instruction
 * 
 * IL FAUT FAIRE ATTENTION AUX CONDITIONS DE SORTIE D'UNE BOUCLE AFIN D'EVITER LES 
 * BOUCLES INFINIES QUI FONT L'APPLICATION
 */
public class BoucleWhile {

	public static void main(String[] args) {
		Scanner clavier = new Scanner(System.in);
		int age = 0;
		
		
//		while(age < 0) {
//			System.out.println("Entrer votre age : ");
//			age = clavier.nextInt();
//			if(age <= 0) {
//				System.out.println("L'age doit être positif");
//			}
//		}
		
		//Solution
		while(age <= 0) {
			System.out.println("Entrer votre age : ");
			age = clavier.nextInt();
			if(age <= 0) {
				System.out.println("L'age doit être positif");
			}
		}	
		
	}

}
