package fr.dawan.wrapper;

import java.util.ArrayList;

public class WrapperTest {

	public static void main(String[] args) {
		
		ArrayList<Integer> listElmt = new ArrayList<>();
		
		//Parser une chaine de caractère en entier 
		String str1 = "20";
		int k = Integer.parseInt(str1);
		System.out.println(k);
		
		
		//Convertir une de caractère en un entier de type wrapper 
		Integer i = Integer.valueOf("210");
		
		//Convertir une chaine de caractère en doube de type wrapper 
		Double d = Double.valueOf("35.14");
		
		//auto-boxing : Convertir les types de données primitifs en leur 
		//objet de classe wrapper 
		int a = 56;
		Integer i1 = a; //autoboxing
		
		//Utilisation de l'autoboxing dans les tableaux dynamique
		int a1 = 45;
		listElmt.add(a1);
		
		//Unboxing : Convertit l'objet de la classe Wrapper vers son type primitif
		Integer i2 = 45;
		int a2 = i2;
		
		Integer i3 = 5;
		int a3 = listElmt.get(i3);  //Unboxing
		
	}

}
