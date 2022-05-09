package fr.dawan.boucles;

public class BoucleFor {

	public static void main(String[] args) {
		/*
		 * Exemple 1 : Utilité des boucles *
		 * On constate que l'écrityre est fastidieuse et longue
		 * c'est du copier coller
		 * Solution : Utiliser les boucles (for - while - do-while)
		 * 
		 */
//		System.out.println("Le double de 1 est : " + 1*2);
//		System.out.println("Le double de 2 est : " + 2*2);
//		System.out.println("Le double de 3 est : " + 3*2);
//		System.out.println("Le double de 4 est : " + 4*2);
//		System.out.println("Le double de 5 est : " + 5*2);
//		System.out.println("Le double de 6 est : " + 6*2);
//		System.out.println("Le double de 7 est : " + 7*2);
//		System.out.println("Le double de 8 est : " + 8*2);
//		System.out.println("Le double de 9 est : " + 9*2);
//		System.out.println("Le double de 10 est : " + 10*2);
		
		/*
		 * SOlution 1 : Utilisation de la boucle FOR
		 * On utilise la boucle for pour repeter des instructions tant qu'une condition 
		 * est vraie, les éléments de la condition changent à chaque iteration
		 * La boucle FOR s'utilise quand on connait le nombre d'itération 
		 * (le nombre de fois qu'on execute une instruction)
		 */
		for(int i = 1; i <= 10; i++) {
			System.out.println("Le double de " + i + " est " + i*2);
		}
		
	}

}
