package fr.dawan.tableaux;

import java.util.Scanner;

/*
 * Nous verrons les tableaux statiques et les tableaux dynamiques (collections)
 * 	- Un tableau statique à une taille fixe. 
 * On ne peut pas la modifié une fois déclarée. 
 * - Un tableau dynamique nous permet de créer des tabeaux de taille dynamique
 * 		o Nous pouvons augmenter et diminuer la taille 
 * 		o Ces tableaux ne peuvent contenir que des references vers des objets 
 * 
 */
public class TableauUtilite {

	public static void main(String[] args) {
		Scanner clavier = new Scanner(System.in);
		int age1, age2;
		double moyenne;
		
		System.out.println("Entrer l'age de l'utilisateur1 :");
		age1 = clavier.nextInt();
		
		System.out.println("Entrer l'age de l'utilisateur2 :");
		age2 = clavier.nextInt();
		
		moyenne = (age1 + age2) / 2;
		System.out.println("La moyennes des ages est : " + moyenne);
		
		/*
		 * Conclusion : 
		 * Si on a une quantité importante de donnée de même type (par exemple 27 
		 * utilisateurs). Il falloir déclaré 27 variable, ce qui est trop long, 
		 * illisible et une perte de temps pour le programmeur. 
		 * Pour resoudre ce problème, on va utiliser les tableaux qui permettent 
		 * de stocker des éléments de mêmes types
		 * Par exemple on peut stocker un tableau d'entier, un tableau de chaine de 
		 * caractères
		 */
	}

}
