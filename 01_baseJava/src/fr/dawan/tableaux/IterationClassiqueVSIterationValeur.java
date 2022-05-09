package fr.dawan.tableaux;

/*
 * Nous allons voir les avantages et inconvenient entre l'iteration classique 
 * et l'iteration sur un ensemble de valeur
 * 
 * Conclusion : Pour modifier une valeur on va donc utiliser l'iteration classique
 */
public class IterationClassiqueVSIterationValeur {

	public static void main(String[] args) {
		int[] tab = {200, 330, 50};
		System.out.println("*****Iteration classique avec la boucle FOR");
		
		for(int i = 0; i <tab.length; i++) {
			System.out.println(tab[i]);
			//tab[i] = 22;
		}
		
		//System.out.println("tab[2] : " + tab[1]);
		
		
		System.out.println("*****\nIteration par valeur avec la boucle FOREACH");
		for (int element : tab) {
			System.out.println(element);
			element = 22;
		}
		
		System.out.println("tab[2] : " + tab[1]);
	}

}
