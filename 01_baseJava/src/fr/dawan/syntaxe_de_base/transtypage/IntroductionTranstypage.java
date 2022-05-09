package fr.dawan.syntaxe_de_base.transtypage;

public class IntroductionTranstypage {

	public static void main(String[] args) {
		int var1 = 4;
		int var2 = 10;
		
		double quotient = var1 / var2;
		System.out.println("quotient = " + quotient); 
		
		/*
		 * Solution 1 : Transformons les var1 et var2 en type double
		 */
		double _var1 = 4;
		double _var2 = 10; 
		double quotient2 = _var1 / _var2;
		System.out.println("quotient2 = " + quotient2); 
		
		/*
		 * Solution 2 : On veut garder var1 et var2 comme des entiers 
		 * Solution : Les types var1 et var2 peuvent être converti en double 
		 * en utilisant le casting (Transtypage explicite)
		 */
		double quotient3 = (double) var1 / var2;
		System.out.println("quotient3 = " + quotient3); 


	}

}
