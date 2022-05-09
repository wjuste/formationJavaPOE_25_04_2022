package fr.dawan.syntaxe_de_base.operateurs;

public class OperateursMathematique {

	public static void main(String[] args) {
		int var1 = 4; 
		int var2;
		//Pour utiliser une variable (locale) il faut d'abord l'initialiser
		//System.out.println("var2 : " + var2);
		
		var2 = 10;
		
		//Addition 
		int somme = var1 + var2;
		System.out.println("Somme = " + somme);
		
		//Soustraction 
		int sub = var1 - var2;
		System.out.println("sub = " + sub);
		
		//Multiplication 
		int mult = var1 * var2;
		System.out.println("resultat = " + mult);
		
		//Division 
		int div = var1 / var2;
		System.out.println(div);
		
		//Modulo permet d'avoir le reste de la division entiére entre 
		//deux nombres
		int modulo = var2 % var1;
		System.out.println("result = " + modulo);
		
	}

}
