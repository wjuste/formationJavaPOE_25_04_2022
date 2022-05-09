package fr.dawan.condition;

import java.util.Scanner;

public class InstructionSwitch {

	public static void main(String[] args) {

		Scanner clavier = new Scanner(System.in);
		int jours = 7;

		//Fournir les données d'entrée 
		System.out.print("Saisir le numero du jour : ");
		jours = clavier.nextInt();

		//Solution 1  : Bloc ELse-If 
		//		if(jours == 1) {
		//			System.out.println("Lundi");
		//		}else if (jours == 2) {
		//			System.out.println("Mardi");
		//		}else if (jours == 3) {
		//			System.out.println("Mercredi");
		//		} else if (jours == 4) {
		//			System.out.println("Jeudi");
		//		}else if (jours == 5) {
		//			System.out.println("Vendredi");
		//		}else if (jours == 6) {
		//			System.out.println("Samedi");
		//		}else if (jours == 7) {
		//			System.out.println("Dimanche");
		//		} else {
		//			System.out.println("Entrée invalid : veuillez saisir le numero du jours"
		//					+ "entre 1 et 7" );
		//		}

		/*
		 * 2ème solution : Instruction Switch
		 * Switch est une variante du If/Else 
		 * 
		 * Deux mots clés associés à l'utilisation du switch : break et le default 
		 * Le break indique que l'on doit quitter le bloc quand un des cas est verifié 
		 * Le default permet de préciser le traitement à effectuer dans le cas 
		 * où la variabl n'est égale à aucune valeur repertoriée par les 
		 * directives case. 
		 * L'instruction default est optionnelle et doit être palcée à la fin du switch
		 * 
		 * Avec l'instruction Switch 
		 * Au lieu d'évaleur chaque condition sequentiellement, il suffit de rechercher 
		 * une fois l'expression et de passer directement à la condtion vraie
		 * 
		 * Le switch, peut être utiliser lorsqu'on a des conditions à la carte 
		 * 
		 * Pour une question de rapidité et de performance le switch est préféré
		 */
		//		switch(jours) {
		//		case 1 : 
		//			System.out.println("Lundi");
		//			break;
		//		case 2 : 
		//			System.out.println("Mardi");
		//			break;
		//		case 3 : 
		//			System.out.println("Mercredi");
		//			break;
		//		case 4 : 
		//			System.out.println("Jeudi");
		//			break;
		//		case 5 : 
		//			System.out.println("Vendredi");
		//			break;
		//		case 6 : 
		//			System.out.println("Samedi");
		//			break;
		//		case 7 : 
		//			System.out.println("Dimanche");
		//			break;
		//		default: 
		//			System.out.println("Entrée invalid : veuillez saisir le numero du jours"
		//					+ "entre 1 et 7" );
		//		}

		switch(jours) {
		case 1:
		case 2:
		case 3:
		case 4: 
		case 5:
			System.out.println("Semaine de travail");
			break;
		case 6:
		case 7: 
			System.out.println("Week end");
			break;
		default: 
			System.out.println("Entrée invalid : veuillez saisir le numero du jours"
					+ "entre 1 et 7" );
		}
	}

}
