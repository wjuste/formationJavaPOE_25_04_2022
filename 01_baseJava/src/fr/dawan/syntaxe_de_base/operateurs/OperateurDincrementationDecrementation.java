package fr.dawan.syntaxe_de_base.operateurs;

public class OperateurDincrementationDecrementation {

	public static void main(String[] args) {
		
		int c = 10;
		c++;  //c = 10 + 1  //Incrementation
		System.out.println(c);
		
		int d = 15;
		d--; //d = d - 1 //decrementation 
		System.out.println(d);
		
		/*
		 * Post-Incrementation et le Pré-Incrementation 
		 * Il y a une grande difference entre ecrire e++ ou ++e
		 * 
		 * Pré-incrementation  ===> ++e : On ajoute d'abord 1 et ensuite on affiche e 
		 * On increment avant d'afficher 
		 * 
		 * Post-incrementation  ===> e++ : On affiche e et après on ajoute 1 
		 * On affiche avant d'incrementer
		 */
		int e = 10;
		System.out.println("Post-incrementation : " + e++); //10
		System.out.println("Pré-incrementation : "+ ++e); //12
		
		int f = 10;
		System.out.println("Pre-incrementation : " + ++f);//11
		System.out.println("Post-incrementation : " + f++);//11	
		
		int m = 7;
		int n = 7; 
		int a = 2* ++m; //16
		int b = 2 * n++; //14
		System.out.println("a = " +a);
		System.out.println("b = " +b);

		
	}

}
