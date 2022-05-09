package fr.dawan.tableaux;

public class DeclarationEtInitialisationTableau {

	public static void main(String[] args) {
		
		/*
		 * Méthode 1
		 * Si on connait les differents éléments du tableau
		 */
		int[] tab1;  //declaration du tableau
		int[] tab2 = {12, 38, 4, 98, 78};
		
		System.out.println(tab2[0]);
		System.out.println(tab2[0] + tab2[1]);
		
		System.out.println();
		
		/*
		 * Methode 2 : Déclaration tableau si on connait la taille du tableau
		 */
		int[] tab3 = new int[4]; 
		System.out.println(tab3[1]);
		tab3[0] = 10;
		tab3[1] = 3;
		System.out.println(tab3[0] + tab3[2]); //10
		
	}

}
