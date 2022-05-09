package fr.dawan.collections;


import java.util.*;

/*
 * Une collection de type Map est une collection qui fonctionne 
 * avec couple clé-valeur
 * 
 * Ses classes dérivées sont : Hashtable, HashMap, TreeMap
 * 
 * Déclaration et initialisation d'un Map : 
 * Le type de la clé et le type de la valeur sont obligatoire 
 * 
 * 
 */
public class MapTest {

	public static void main(String[] args) {
		
		//Polymorphisme 
		Map<String, String> map = new HashMap<String, String>();
		map.put("1", "Un");
		map.put("2", "Deux");
		map.put("3", "Trois");
		map.put("4", "Quatre");
		map.put("5", "Cinq");
		
		//Affiche les clés du map 
		System.out.println("Clés: " + map.keySet());
		
		//Affiche les valeurs du map 
		System.out.println("Values : " + map.values());
		
		//Afficher chaque clé 
		for (String str : map.keySet()) {
			System.out.println(str + " ");
		}
		
		//Parcourir les éléments du map 
		//L'interface  Entry est imbriqué dans 
		//l'interface Map
		//Elle represente une entrée, c'est une pair clé/valeur 
		//d'un objet Map	
		System.out.println("\nParcourir les éléments : ");
		for (Map.Entry<String, String> mp : map.entrySet()) {
			System.out.println(mp.getKey() + " - " + mp.getValue());
		}
		
		System.out.println("\nméthode remove : ");
		map.remove("1");
		System.out.println("Après la suppression : " + map);
		
	}

}
