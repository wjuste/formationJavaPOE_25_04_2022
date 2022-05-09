package fr.dawan.syntaxe_de_base.entree_sortie_standard;

/**
 * 
 * @author Admin stagiaire
 * 
 * Nous allons voir la méthode printf et String.format 
 * Elle nous permette d'afficher, de produire des chaines de caractère formatées
 *
 */
public class FormatageDeChaineDeCaractère {

	public static void main(String[] args) {
		int dividende = 25; 
		int diviseur = 11;
		
		/*
		 * Les sorties formatées : Le format de ce qui va être affiché
		 * 
		 * %s Permet de formater une chaine de caractère
		 * %c Permet de formater un caractère 
		 * %d Permet de formater un entier en base décimale 
		 * %f Permet de formater un réel sous forme decimale
		 * %n ou \n  retour à la ligne
		 */
		
		// 1er solution : utilisation de println ==> [25/11]
		System.out.println("[" + dividende + "/" + diviseur + "]");
		
		//2ème solution : utilisation de la méthode printf
		//Pour utiliser le printf on donne d'abord le format, puis ensuite les 
		//différents arguments
		System.out.printf("[%d/%d]%n", dividende, diviseur);
		
		//3ème solution : Utilisation de String.format
		//Cette solution est identique à System.out.printf
		//La différence étant que String.format renvoie la chaine 
		//de caractères après formatage
		String str = String.format("[%d/%d]%n", dividende, diviseur); //[25/11]
		System.out.println(str);
		
		//Formater la valeur de PI sous forme decimal
		System.out.printf("%f%n", Math.PI);
		
		//Arrondir la valeur de PI avec 2 chiffres après virgule 
		System.out.printf("%.2f\n", Math.PI);

	}

}
