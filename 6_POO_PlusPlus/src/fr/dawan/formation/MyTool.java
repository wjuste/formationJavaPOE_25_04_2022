package fr.dawan.formation;

public class MyTool {
	
	/*
	 * Les var-args (liste d'arguments variables) existe depuis Java 5
	 * Var-args : arguments variables 
	 * 1 seul var-arg par méthode qui doit être positionnée à la fin
	 */
	public static int somme(int... tab) {
		int s = 0;
		for (int i = 0; i < tab.length; i++) {
			s+=tab[i];
		}
		return s;
	}
}
