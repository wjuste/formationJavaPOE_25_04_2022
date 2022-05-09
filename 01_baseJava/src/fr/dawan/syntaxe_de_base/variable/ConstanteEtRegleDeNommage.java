package fr.dawan.syntaxe_de_base.variable;

public class ConstanteEtRegleDeNommage {

	public static void main(String[] args) {
		
		System.out.println("***************************CONSTANTES**************************");
		
		/*
		 * Les constantes doivent être en majuscules, pour les différencier des 
		 * autres variables 
		 * final : veut dire que le contenu de ma variable ne va pas changer
		 * Le mot clé final signifie que vous affectez la variable une seule fois, 
		 * et une fois pour toutes. 
		 */
		final int VIES_MAX = 15;
		
		System.out.println("****************REGLES DE NOMMAGE***********************");
		//cf page 17 PDF
		//Les noms des variables peuvent commencer par une lettre 
		int val = 15;
		
		//Les noms des variables peuvent commencer par un underscore
		String _val = "underscore";
		
		//Les noms des variables peuvent commencer par un $ 
		double $val = 5.3;
		
		//Les noms des variables peuvent contenir des chiffres 
		double conv2int = 500;
		
		//Les noms des variables peuvent commencer par un double underscore 
		String __val3 = "doubleUndercore";
		
		//Une variable ne peut pas commencer par un chiffre 
		//int 3nbre = 5;
		
		//Une variable ne peut pas commencer par une opération mathématique 
		//int -nbre = 8;
		
		//Le nom d'une variable ne doit pas être un mot reservé 
		//int doublE = 5;
		
		/*
		 * Les mots omposés
		 */
		//On peut utiliser l'underscore(_)
		int nombre_de_vie = 5;
		
		//On peut utiliser le CamelCase 
		//Chaque nouveau mot commence par une lettre majuscule
		int nombreDeVie = 5;
		
	}

}
  