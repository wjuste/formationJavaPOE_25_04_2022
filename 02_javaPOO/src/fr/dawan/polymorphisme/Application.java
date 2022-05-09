package fr.dawan.polymorphisme;

import java.util.ArrayList;

public class Application {

	public static void main(String[] args) {
		
		//Création d'un tableau dynamique d'être humain
		ArrayList<EtreHumain> tab = new ArrayList<EtreHumain>();
		
		tab.add(new Homme());
		tab.add(new Femme());
		tab.add(new Femme());
		tab.add(new Homme());
		
		//1- etreHumain = new Homme()   
		//2- etreHumain = new Femme()  
		for (EtreHumain etreHumain : tab) {
			etreHumain.uriner();
		}
		
		EtreHumain etreHumain = new Femme();
		etreHumain.uriner();
	}

}
