package fr.dawan.methodes;

/*
 * Méthode : Un ensemble d'instruction réutilisable - eviter de repeter du code
 * 
 * Déclarer une méthode : 
 * Visibilité[mot-clé] type-retour nom-methode(param){instructions}
 * 
 * La Surcharge : 
 * La surcharge d'une méthode ou d'un constructeur permet de definir 
 * plusieurs fois une methode/constructeur avec des arguments differents 
 * 
 * Quel est avantage ? 
 * Nous n'avons pas besoin de créer et memoriser des noms differents 
 * pour des méthodes faisant la même chose 
 * Par exemple, dans notre code, si la surcharge n'etait pas prise en 
 * charge par Java, somme1, somme2,... ou somme2Int, ..etc
 */
public class Methodes {

	public static void main(String[] args) {
		int[] tab = {4, 12, 8, 18};
		afficher();
		afficher(tab);
		
		int res = somme(2, 50);
		System.out.println(res);
		
		int resTab = somme(tab);
		System.out.println(resTab);
		
	}
	
	/**
	 * Methode afficher
	 * void  ==> Si aucune valeur n'est retournée, renvoyée
	 * on utilise le pseudo-type void
	 */
	public static void afficher() {
		System.out.println("Methode afficher");
	}
	
	/**
	 * Affiche les éléments d'un tableau
	 * @param tab
	 */
	public static void afficher(int[] tab) {
		for (int item : tab) {
			System.out.println(item);
		}
	}
	
	/**
	 * Methode prend deux paramètres int et retourne un entier
	 * @param val1
	 * @param val2
	 * @return
	 */
	public static int somme(int val1, int val2) {
		int result = 0;
		result = val1 + val2;
		return result;
	}
	

	public static int somme(int[] tab1) {
		int somme = 0;
		for (int item : tab1) {
			somme += item;
		}
		return somme;
	}
	
	

}
