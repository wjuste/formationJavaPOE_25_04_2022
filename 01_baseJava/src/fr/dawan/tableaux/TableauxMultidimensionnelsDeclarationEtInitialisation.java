package fr.dawan.tableaux;

public class TableauxMultidimensionnelsDeclarationEtInitialisation {

	public static void main(String[] args) {
		/*
		 * Joueur1 [10, 20, 30]  ----------	ligne1 (indice 0)
		 * Joueur2 [80, 40, 45, 60]  -------ligne2  (indice 1)       
		 */
		
		//Création d'un tableau à deux dimension 
		int[][] scores1 = new int[2][3];
		int[][] scores2 = {{10, 20, 30},{80, 40, 45, 60}};
		
		System.out.println(scores2[0][1]);
		System.out.println(scores2[1][2]);
	} 

}
