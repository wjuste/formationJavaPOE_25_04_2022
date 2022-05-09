package fr.dawan.exception_;

public class UtilisateurTest {

	public static void main(String[] args) {
		
		int nbre = 7;
		Utilisateur user1 = new Utilisateur("Rudd", "Emily", 18);
		
		/*
		 * Le bloc try-catch permet de traiter les exceptions 
		 * le bloc try permet de definir un ensemble d'instructions
		 * à surveiller (ex :nbre / 0) susception de lever une 
		 * exception. 
		 * Le bloc Catch va intercepter les exceptions  générées par 
		 * les instructions du bloc try 
		 * Le bloc Finally est executé qu'une exception intervienne ou pas 
		 */
		try {
			System.out.println(nbre / 0);
		} catch(ArithmeticException e) {
			System.out.println(e.getMessage());
		}finally {
			System.out.println("Bloc Finally");
		}
		
		try {
			user1.setAge(12);
		} catch (IllegalArgumentException e) {
			System.out.println(e.getMessage());
		}
		
		System.out.println("Continue...");
		 
	}

}
