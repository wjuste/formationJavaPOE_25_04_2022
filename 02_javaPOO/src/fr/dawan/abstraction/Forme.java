package fr.dawan.abstraction;

public abstract class Forme {
	
	private String chaine;
	public int prop1 = 5;
	
	public Forme() {
		System.out.println("Je suis un constructeur de la classe Forme");
	}
	
	public Forme(String chaine) {
		this.chaine = chaine;
		System.out.println(this.chaine);
	}
	
	/*
	 * Une méthode abstraite est une méthode, dont il faudra 
	 * redefinir le contenu au niveau des sous - classes (classes
	 * filles)
	 */
	public abstract double aire();
	
	public String decrisToi() {
		return "Je suis la classe abstraite Forme";
	}
	
}
