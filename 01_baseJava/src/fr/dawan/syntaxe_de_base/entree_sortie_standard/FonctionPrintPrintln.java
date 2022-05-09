package fr.dawan.syntaxe_de_base.entree_sortie_standard;

public class FonctionPrintPrintln {

	public static void main(String[] args) {
		/*
		 * Afficher : 
		 * Polymorphisme 
		 * veut 
		 * dire
		 * plusieurs
		 * formes
		 */
		//Chaque System.out.println affiche une ligne 
		//Mauvaise façon : on fait du copier-coller
//		System.out.println("Polymorphisme");
//		System.out.println("veut");
//		System.out.println("dire");
//		System.out.println("plusieurs");
//		System.out.println("formes");
		
		//\n est un retour à la ligne
		System.out.println("Polymorphisme\nveut\ndire\nplusieurs\nformes");
		
		//print : Pas de retour à la ligne après l'affichage 
		//println : Retour à la ligne après l'affichage 
		System.out.print("Polymorphisme veut dire plusieurs formes : ");
		System.out.print("Heritage");

	}

}
