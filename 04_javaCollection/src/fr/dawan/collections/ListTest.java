package fr.dawan.collections;

import java.util.ArrayList;
import java.util.List;

/*
 * L'interface List represente une collection ordonnées de donnée
 * qui peuvent être des doublons(données identiques)
 * 
 * Elle apparait comme un tableau qui n'aurait pas de contrainte 
 * de taille lorsqu'on ajoute ou efface des éléments
 */
public class ListTest {

	public static void main(String[] args) {
		
		//utilisation du polymorphisme
		List<String> list = new ArrayList<String>();
		
		list.add("a");
		list.add("b");
		list.add("c");
		list.add("d");
		list.add("e");
		list.add("f");
		
		System.out.println("*****Boucle for classique*******");
		for (int i = 0; i < list.size(); i++) {
			System.out.println(list.get(i));
		}
		
		System.out.println("\n***********FOREACH***************");
		for (String element : list) {
			System.out.println(element);
		}
	
	}

}
