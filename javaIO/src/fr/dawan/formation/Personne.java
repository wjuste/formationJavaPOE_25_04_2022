package fr.dawan.formation;

import java.util.Scanner;

public class Personne {
	
	private double salaire;
	private String nom;
	private int age;
	private int codeSecret = 540;
	
	public Personne() {
		super();
	}

	public double getSalaire() {
		return salaire;
	}

	public void setSalaire(double salaire) {
		this.salaire = salaire;
	}

	public String getNom() {
		return nom;
	}

	public void setNom(String nom) {
		this.nom = nom;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		if(age < 0) {
			throw new IllegalArgumentException("La valeur ne doit être négative");
		}
		this.age = age;
	}

	public int getCodeSecret() {
		Scanner sc = new Scanner(System.in);
		System.out.println("Saisissez votre code d'accès : ");
		String str = sc.nextLine();
		if(str.contentEquals("10"))
			return codeSecret;
		else 
			return 0;
	}

	public void setCodeSecret(int codeSecret) {
		this.codeSecret = codeSecret;
	}
	
	
	
}
